package typings.webpackPluginServe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Apply extends js.Object {
  @JSName("apply")
  def apply(
    compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Compiler */ js.Any
  ): Unit = js.native
}

object Apply {
  @scala.inline
  def apply(
    apply: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Compiler */ js.Any => Unit
  ): Apply = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply))
    __obj.asInstanceOf[Apply]
  }
  @scala.inline
  implicit class ApplyOps[Self <: Apply] (val x: Self) extends AnyVal {
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
    def setApply(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Compiler */ js.Any => Unit
    ): Self = this.set("apply", js.Any.fromFunction1(value))
  }
  
}

