package typings.voximplantWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *    Participant info
  */
trait ParticipantInfo extends StObject {
  
  /**
    * The participant's affiliation with the room
    */
  var affiliation: Double
  
  /**
    * Indicate conditions like: user has been kicked or banned from the room
    */
  var flags: Double
  
  /**
    * User id
    */
  var id: String
  
  /**
    * Reason
    */
  var reason: String
  
  /**
    * Resource name
    */
  var resource: String
  
  /**
    * The participant's role with the room
    */
  var role: Double
}
object ParticipantInfo {
  
  inline def apply(affiliation: Double, flags: Double, id: String, reason: String, resource: String, role: Double): ParticipantInfo = {
    val __obj = js.Dynamic.literal(affiliation = affiliation.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParticipantInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParticipantInfo] (val x: Self) extends AnyVal {
    
    inline def setAffiliation(value: Double): Self = StObject.set(x, "affiliation", value.asInstanceOf[js.Any])
    
    inline def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setRole(value: Double): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
  }
}
