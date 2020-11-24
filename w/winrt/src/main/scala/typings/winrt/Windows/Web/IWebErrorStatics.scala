package typings.winrt.Windows.Web

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWebErrorStatics extends js.Object {
  
  def getStatus(hresult: Double): WebErrorStatus = js.native
}
object IWebErrorStatics {
  
  @scala.inline
  def apply(getStatus: Double => WebErrorStatus): IWebErrorStatics = {
    val __obj = js.Dynamic.literal(getStatus = js.Any.fromFunction1(getStatus))
    __obj.asInstanceOf[IWebErrorStatics]
  }
  
  @scala.inline
  implicit class IWebErrorStaticsOps[Self <: IWebErrorStatics] (val x: Self) extends AnyVal {
    
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
    def setGetStatus(value: Double => WebErrorStatus): Self = this.set("getStatus", js.Any.fromFunction1(value))
  }
}
