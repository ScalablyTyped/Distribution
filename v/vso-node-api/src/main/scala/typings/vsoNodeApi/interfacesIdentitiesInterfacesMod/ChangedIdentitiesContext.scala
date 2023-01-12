package typings.vsoNodeApi.interfacesIdentitiesInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangedIdentitiesContext extends StObject {
  
  /**
    * Last Group SequenceId
    */
  var groupSequenceId: Double
  
  /**
    * Last Identity SequenceId
    */
  var identitySequenceId: Double
}
object ChangedIdentitiesContext {
  
  inline def apply(groupSequenceId: Double, identitySequenceId: Double): ChangedIdentitiesContext = {
    val __obj = js.Dynamic.literal(groupSequenceId = groupSequenceId.asInstanceOf[js.Any], identitySequenceId = identitySequenceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangedIdentitiesContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChangedIdentitiesContext] (val x: Self) extends AnyVal {
    
    inline def setGroupSequenceId(value: Double): Self = StObject.set(x, "groupSequenceId", value.asInstanceOf[js.Any])
    
    inline def setIdentitySequenceId(value: Double): Self = StObject.set(x, "identitySequenceId", value.asInstanceOf[js.Any])
  }
}
