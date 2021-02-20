package typings.tizenCommonWeb.applicationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationContext extends StObject {
  
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
  implicit class ApplicationContextMutableBuilder[Self <: ApplicationContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppId(value: ApplicationId): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: ApplicationContextId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
