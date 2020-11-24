package typings.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecreateSubscriptionResult extends js.Object {
  
  var eventType: String = js.native
  
  var repositoryType: String = js.native
}
object RecreateSubscriptionResult {
  
  @scala.inline
  def apply(eventType: String, repositoryType: String): RecreateSubscriptionResult = {
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any], repositoryType = repositoryType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecreateSubscriptionResult]
  }
  
  @scala.inline
  implicit class RecreateSubscriptionResultOps[Self <: RecreateSubscriptionResult] (val x: Self) extends AnyVal {
    
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
    def setEventType(value: String): Self = this.set("eventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryType(value: String): Self = this.set("repositoryType", value.asInstanceOf[js.Any])
  }
}
