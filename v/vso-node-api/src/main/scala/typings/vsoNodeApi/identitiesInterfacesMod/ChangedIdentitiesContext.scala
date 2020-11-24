package typings.vsoNodeApi.identitiesInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangedIdentitiesContext extends js.Object {
  
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
  implicit class ChangedIdentitiesContextOps[Self <: ChangedIdentitiesContext] (val x: Self) extends AnyVal {
    
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
    def setGroupSequenceId(value: Double): Self = this.set("groupSequenceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentitySequenceId(value: Double): Self = this.set("identitySequenceId", value.asInstanceOf[js.Any])
  }
}
