package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationContext extends StObject {
  
  /**
    * An attribute to store the ID of an installed application.
    */
  val appId: ApplicationId
  
  /**
    * An attribute to store the ID of a running application.
    */
  val id: ApplicationContextId
}
object ApplicationContext {
  
  inline def apply(appId: ApplicationId, id: ApplicationContextId): ApplicationContext = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationContext] (val x: Self) extends AnyVal {
    
    inline def setAppId(value: ApplicationId): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setId(value: ApplicationContextId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
