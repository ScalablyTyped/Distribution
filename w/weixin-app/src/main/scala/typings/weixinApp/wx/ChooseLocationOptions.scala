package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChooseLocationOptions
  extends BaseOptions[js.Any, js.Any] {
  
  @JSName("success")
  def success_MChooseLocationOptions(res: ChooseLocationData): Unit = js.native
}
object ChooseLocationOptions {
  
  @scala.inline
  def apply(success: ChooseLocationData => Unit): ChooseLocationOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[ChooseLocationOptions]
  }
  
  @scala.inline
  implicit class ChooseLocationOptionsOps[Self <: ChooseLocationOptions] (val x: Self) extends AnyVal {
    
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
    def setSuccess(value: ChooseLocationData => Unit): Self = this.set("success", js.Any.fromFunction1(value))
  }
}
