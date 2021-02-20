package typings.vsoNodeApi.identitiesInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangedIdentitiesContext extends StObject {
  
  /**
    * Last Group SequenceId
    */
  var groupSequenceId: Double = js.native
  
  /**
    * Last Identity SequenceId
    */
  var identitySequenceId: Double = js.native
}
object ChangedIdentitiesContext {
  
  @scala.inline
  def apply(groupSequenceId: Double, identitySequenceId: Double): ChangedIdentitiesContext = {
    val __obj = js.Dynamic.literal(groupSequenceId = groupSequenceId.asInstanceOf[js.Any], identitySequenceId = identitySequenceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangedIdentitiesContext]
  }
  
  @scala.inline
  implicit class ChangedIdentitiesContextMutableBuilder[Self <: ChangedIdentitiesContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupSequenceId(value: Double): Self = StObject.set(x, "groupSequenceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentitySequenceId(value: Double): Self = StObject.set(x, "identitySequenceId", value.asInstanceOf[js.Any])
  }
}
