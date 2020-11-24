package typings.webpackPluginServe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Apply[Compiler] extends js.Object {
  
  @JSName("apply")
  def apply(compiler: Compiler): Unit = js.native
}
object Apply {
  
  @scala.inline
  def apply[Compiler](apply: Compiler => Unit): Apply[Compiler] = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply))
    __obj.asInstanceOf[Apply[Compiler]]
  }
  
  @scala.inline
  implicit class ApplyOps[Self <: Apply[_], Compiler] (val x: Self with Apply[Compiler]) extends AnyVal {
    
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
    def setApply(value: Compiler => Unit): Self = this.set("apply", js.Any.fromFunction1(value))
  }
}
