package typings.vsoNodeApi.identitiesInterfacesMod

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
  
  @scala.inline
  def apply(identities: js.Array[Identity], sequenceContext: ChangedIdentitiesContext): ChangedIdentities = {
    val __obj = js.Dynamic.literal(identities = identities.asInstanceOf[js.Any], sequenceContext = sequenceContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangedIdentities]
  }
  
  @scala.inline
  implicit class ChangedIdentitiesMutableBuilder[Self <: ChangedIdentities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentities(value: js.Array[Identity]): Self = StObject.set(x, "identities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentitiesVarargs(value: Identity*): Self = StObject.set(x, "identities", js.Array(value :_*))
    
    @scala.inline
    def setSequenceContext(value: ChangedIdentitiesContext): Self = StObject.set(x, "sequenceContext", value.asInstanceOf[js.Any])
  }
}
