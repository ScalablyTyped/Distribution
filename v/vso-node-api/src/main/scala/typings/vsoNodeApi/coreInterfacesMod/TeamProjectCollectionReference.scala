package typings.vsoNodeApi.coreInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamProjectCollectionReference extends StObject {
  
  /**
    * Collection Id.
    */
  var id: String
  
  /**
    * Collection Name.
    */
  var name: String
  
  /**
    * Collection REST Url.
    */
  var url: String
}
object TeamProjectCollectionReference {
  
  inline def apply(id: String, name: String, url: String): TeamProjectCollectionReference = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamProjectCollectionReference]
  }
  
  extension [Self <: TeamProjectCollectionReference](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
