package typings.winrtUwp.Windows.Devices.AllJoyn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Exposes unique name and transport information for an advertising app. */
@js.native
trait AllJoynServiceInfo extends js.Object {
  
  /** The path to the service object. This path is used to match communications with service objects connected to the session. */
  var objectPath: String = js.native
  
  /** The port used to connect to the session. */
  var sessionPort: Double = js.native
  
  /** The unique bus name associated with the advertising app. */
  var uniqueName: String = js.native
}
object AllJoynServiceInfo {
  
  @scala.inline
  def apply(objectPath: String, sessionPort: Double, uniqueName: String): AllJoynServiceInfo = {
    val __obj = js.Dynamic.literal(objectPath = objectPath.asInstanceOf[js.Any], sessionPort = sessionPort.asInstanceOf[js.Any], uniqueName = uniqueName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllJoynServiceInfo]
  }
  
  @scala.inline
  implicit class AllJoynServiceInfoOps[Self <: AllJoynServiceInfo] (val x: Self) extends AnyVal {
    
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
    def setObjectPath(value: String): Self = this.set("objectPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionPort(value: Double): Self = this.set("sessionPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueName(value: String): Self = this.set("uniqueName", value.asInstanceOf[js.Any])
  }
}
