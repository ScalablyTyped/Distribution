package typings.winrtUwp.Windows.Media.DialProtocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the state of the DIAL app. */
@js.native
trait DialAppStateDetails extends js.Object {
  
  /** Gets the entire XML response that is provided by the app when state of the app was requested. */
  var fullXml: String = js.native
  
  /** Gets the state of the application at the time the GetAppStateAsync was completed. */
  var state: DialAppState = js.native
}
object DialAppStateDetails {
  
  @scala.inline
  def apply(fullXml: String, state: DialAppState): DialAppStateDetails = {
    val __obj = js.Dynamic.literal(fullXml = fullXml.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialAppStateDetails]
  }
  
  @scala.inline
  implicit class DialAppStateDetailsOps[Self <: DialAppStateDetails] (val x: Self) extends AnyVal {
    
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
    def setFullXml(value: String): Self = this.set("fullXml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: DialAppState): Self = this.set("state", value.asInstanceOf[js.Any])
  }
}
