package typings.tizenCommonWeb.applicationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationContext extends js.Object {
  
  /**
    * An attribute to store the ID of an installed application.
    */
  val appId: ApplicationId = js.native
  
  /**
    * An attribute to store the ID of a running application.
    */
  val id: ApplicationContextId = js.native
}
object ApplicationContext {
  
  @scala.inline
  def apply(appId: ApplicationId, id: ApplicationContextId): ApplicationContext = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationContext]
  }
  
  @scala.inline
  implicit class ApplicationContextOps[Self <: ApplicationContext] (val x: Self) extends AnyVal {
    
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
    def setAppId(value: ApplicationId): Self = this.set("appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: ApplicationContextId): Self = this.set("id", value.asInstanceOf[js.Any])
  }
}
