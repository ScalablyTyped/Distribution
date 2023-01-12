package typings.vsoNodeApi.interfacesIdentitiesInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangedIdentities extends StObject {
  
  /**
    * Changed Identities
    */
  var identities: js.Array[Identity]
  
  /**
    * Last Identity SequenceId
    */
  var sequenceContext: ChangedIdentitiesContext
}
object ChangedIdentities {
  
  inline def apply(identities: js.Array[Identity], sequenceContext: ChangedIdentitiesContext): ChangedIdentities = {
    val __obj = js.Dynamic.literal(identities = identities.asInstanceOf[js.Any], sequenceContext = sequenceContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangedIdentities]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChangedIdentities] (val x: Self) extends AnyVal {
    
    inline def setIdentities(value: js.Array[Identity]): Self = StObject.set(x, "identities", value.asInstanceOf[js.Any])
    
    inline def setIdentitiesVarargs(value: Identity*): Self = StObject.set(x, "identities", js.Array(value*))
    
    inline def setSequenceContext(value: ChangedIdentitiesContext): Self = StObject.set(x, "sequenceContext", value.asInstanceOf[js.Any])
  }
}
