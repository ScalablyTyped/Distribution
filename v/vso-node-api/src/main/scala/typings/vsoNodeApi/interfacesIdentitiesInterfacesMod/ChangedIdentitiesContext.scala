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
  
  extension [Self <: ChangedIdentitiesContext](x: Self) {
    
    inline def setGroupSequenceId(value: Double): Self = StObject.set(x, "groupSequenceId", value.asInstanceOf[js.Any])
    
    inline def setIdentitySequenceId(value: Double): Self = StObject.set(x, "identitySequenceId", value.asInstanceOf[js.Any])
  }
}
