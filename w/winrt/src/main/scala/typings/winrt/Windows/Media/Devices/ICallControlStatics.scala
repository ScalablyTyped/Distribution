package typings.winrt.Windows.Media.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICallControlStatics extends js.Object {
  
  def fromId(deviceInterfaceId: String): CallControl = js.native
  
  def getDefault(): CallControl = js.native
}
object ICallControlStatics {
  
  @scala.inline
  def apply(fromId: String => CallControl, getDefault: () => CallControl): ICallControlStatics = {
    val __obj = js.Dynamic.literal(fromId = js.Any.fromFunction1(fromId), getDefault = js.Any.fromFunction0(getDefault))
    __obj.asInstanceOf[ICallControlStatics]
  }
  
  @scala.inline
  implicit class ICallControlStaticsOps[Self <: ICallControlStatics] (val x: Self) extends AnyVal {
    
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
    def setFromId(value: String => CallControl): Self = this.set("fromId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDefault(value: () => CallControl): Self = this.set("getDefault", js.Any.fromFunction0(value))
  }
}
