package typings.vsoNodeApi.coreInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebApiTagDefinition extends StObject {
  
  /**
    * Whether or not the tag definition is active.
    */
  var active: Boolean = js.native
  
  /**
    * ID of the tag definition.
    */
  var id: String = js.native
  
  /**
    * The name of the tag definition.
    */
  var name: String = js.native
  
  /**
    * Resource URL for the Tag Definition.
    */
  var url: String = js.native
}
object WebApiTagDefinition {
  
  @scala.inline
  def apply(active: Boolean, id: String, name: String, url: String): WebApiTagDefinition = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebApiTagDefinition]
  }
  
  @scala.inline
  implicit class WebApiTagDefinitionMutableBuilder[Self <: WebApiTagDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
