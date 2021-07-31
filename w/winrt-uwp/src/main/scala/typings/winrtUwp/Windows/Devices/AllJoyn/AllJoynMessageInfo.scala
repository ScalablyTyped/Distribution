package typings.winrtUwp.Windows.Devices.AllJoyn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Exposes information about the sender of a message being processed. */
trait AllJoynMessageInfo extends StObject {
  
  /** The unique bus name of the message sender. */
  var senderUniqueName: String
}
object AllJoynMessageInfo {
  
  @scala.inline
  def apply(senderUniqueName: String): AllJoynMessageInfo = {
    val __obj = js.Dynamic.literal(senderUniqueName = senderUniqueName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllJoynMessageInfo]
  }
  
  @scala.inline
  implicit class AllJoynMessageInfoMutableBuilder[Self <: AllJoynMessageInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSenderUniqueName(value: String): Self = StObject.set(x, "senderUniqueName", value.asInstanceOf[js.Any])
  }
}
