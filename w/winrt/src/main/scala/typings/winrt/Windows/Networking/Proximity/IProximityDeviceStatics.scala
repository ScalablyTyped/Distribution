package typings.winrt.Windows.Networking.Proximity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IProximityDeviceStatics extends js.Object {
  
  def fromId(deviceInterfaceId: String): ProximityDevice = js.native
  
  def getDefault(): ProximityDevice = js.native
  
  def getDeviceSelector(): String = js.native
}
object IProximityDeviceStatics {
  
  @scala.inline
  def apply(
    fromId: String => ProximityDevice,
    getDefault: () => ProximityDevice,
    getDeviceSelector: () => String
  ): IProximityDeviceStatics = {
    val __obj = js.Dynamic.literal(fromId = js.Any.fromFunction1(fromId), getDefault = js.Any.fromFunction0(getDefault), getDeviceSelector = js.Any.fromFunction0(getDeviceSelector))
    __obj.asInstanceOf[IProximityDeviceStatics]
  }
  
  @scala.inline
  implicit class IProximityDeviceStaticsOps[Self <: IProximityDeviceStatics] (val x: Self) extends AnyVal {
    
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
    def setFromId(value: String => ProximityDevice): Self = this.set("fromId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDefault(value: () => ProximityDevice): Self = this.set("getDefault", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDeviceSelector(value: () => String): Self = this.set("getDeviceSelector", js.Any.fromFunction0(value))
  }
}
