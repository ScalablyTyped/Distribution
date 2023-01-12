package typings.vsoNodeApi.interfacesTestInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShallowReference extends StObject {
  
  /**
    * Id of the resource
    */
  var id: String
  
  /**
    * Name of the linked resource (definition name, controller name, etc.)
    */
  var name: String
  
  /**
    * Full http link to the resource
    */
  var url: String
}
object ShallowReference {
  
  inline def apply(id: String, name: String, url: String): ShallowReference = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShallowReference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShallowReference] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
