package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RepositoryWebhook extends StObject {
  
  /**
    * The friendly name of the repository.
    */
  var name: String = js.native
  
  /**
    * The type of the webhook.
    */
  var `type`: String = js.native
  
  /**
    * The URL of the repository.
    */
  var url: String = js.native
}
object RepositoryWebhook {
  
  @scala.inline
  def apply(name: String, `type`: String, url: String): RepositoryWebhook = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoryWebhook]
  }
  
  @scala.inline
  implicit class RepositoryWebhookMutableBuilder[Self <: RepositoryWebhook] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
