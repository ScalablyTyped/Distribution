package typings.webpackBlocksWebpack.mod

import typings.std.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptimizationOptions extends js.Object {
  var minimize: js.UndefOr[Boolean] = js.native
  var minimizer: js.UndefOr[js.Array[Plugin] | PluginFunction] = js.native
}

object OptimizationOptions {
  @scala.inline
  def apply(): OptimizationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptimizationOptions]
  }
  @scala.inline
  implicit class OptimizationOptionsOps[Self <: OptimizationOptions] (val x: Self) extends AnyVal {
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
    def setMinimize(value: Boolean): Self = this.set("minimize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimize: Self = this.set("minimize", js.undefined)
    @scala.inline
    def setMinimizerVarargs(value: Plugin*): Self = this.set("minimizer", js.Array(value :_*))
    @scala.inline
    def setMinimizerFunction1(value: /* compiler */ js.Any => Plugin): Self = this.set("minimizer", js.Any.fromFunction1(value))
    @scala.inline
    def setMinimizer(value: js.Array[Plugin] | PluginFunction): Self = this.set("minimizer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimizer: Self = this.set("minimizer", js.undefined)
  }
  
}

