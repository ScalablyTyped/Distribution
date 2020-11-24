package typings.winrtUwp.Windows.Media.Protection.PlayReady

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains the custom data for one of the following PlayReady-ND messages: Registration Challenge, Registration Response, License Fetch Challenge, or License Fetch Response. */
@js.native
trait INDCustomData extends js.Object {
  
  /** Gets the custom data. */
  var customData: Double = js.native
  
  /** Gets the 16-byte type identifier for the custom data. */
  var customDataTypeID: Double = js.native
}
object INDCustomData {
  
  @scala.inline
  def apply(customData: Double, customDataTypeID: Double): INDCustomData = {
    val __obj = js.Dynamic.literal(customData = customData.asInstanceOf[js.Any], customDataTypeID = customDataTypeID.asInstanceOf[js.Any])
    __obj.asInstanceOf[INDCustomData]
  }
  
  @scala.inline
  implicit class INDCustomDataOps[Self <: INDCustomData] (val x: Self) extends AnyVal {
    
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
    def setCustomData(value: Double): Self = this.set("customData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomDataTypeID(value: Double): Self = this.set("customDataTypeID", value.asInstanceOf[js.Any])
  }
}
