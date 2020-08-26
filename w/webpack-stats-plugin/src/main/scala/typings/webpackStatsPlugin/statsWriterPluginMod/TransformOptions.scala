package typings.webpackStatsPlugin.statsWriterPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransformOptions extends js.Object {
  /** Current compiler instance */
  var compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Compilation */ js.Any = js.native
}

object TransformOptions {
  @scala.inline
  def apply(
    compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Compilation */ js.Any
  ): TransformOptions = {
    val __obj = js.Dynamic.literal(compiler = compiler.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformOptions]
  }
  @scala.inline
  implicit class TransformOptionsOps[Self <: TransformOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCompiler(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Compilation */ js.Any
    ): Self = this.set("compiler", value.asInstanceOf[js.Any])
  }
  
}

