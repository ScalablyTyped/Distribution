package typings.voximplantWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *    Participant info
  */
@js.native
trait ParticipantInfo extends StObject {
  
  /**
    * The participant's affiliation with the room
    */
  var affiliation: Double = js.native
  
  /**
    * Indicate conditions like: user has been kicked or banned from the room
    */
  var flags: Double = js.native
  
  /**
    * User id
    */
  var id: String = js.native
  
  /**
    * Reason
    */
  var reason: String = js.native
  
  /**
    * Resource name
    */
  var resource: String = js.native
  
  /**
    * The participant's role with the room
    */
  var role: Double = js.native
}
object ParticipantInfo {
  
  @scala.inline
  def apply(affiliation: Double, flags: Double, id: String, reason: String, resource: String, role: Double): ParticipantInfo = {
    val __obj = js.Dynamic.literal(affiliation = affiliation.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParticipantInfo]
  }
  
  @scala.inline
  implicit class ParticipantInfoMutableBuilder[Self <: ParticipantInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAffiliation(value: Double): Self = StObject.set(x, "affiliation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRole(value: Double): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
  }
}
