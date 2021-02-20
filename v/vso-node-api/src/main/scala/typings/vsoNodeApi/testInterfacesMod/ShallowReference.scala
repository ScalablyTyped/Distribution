package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShallowReference extends StObject {
  
  /**
    * Id of the resource
    */
  var id: String = js.native
  
  /**
    * Name of the linked resource (definition name, controller name, etc.)
    */
  var name: String = js.native
  
  /**
    * Full http link to the resource
    */
  var url: String = js.native
}
object ShallowReference {
  
  @scala.inline
  def apply(id: String, name: String, url: String): ShallowReference = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShallowReference]
  }
  
  @scala.inline
  implicit class ShallowReferenceMutableBuilder[Self <: ShallowReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
