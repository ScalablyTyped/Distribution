package typings.vsoNodeApi.interfacesCoreInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamProjectCollection
  extends StObject
     with TeamProjectCollectionReference {
  
  /**
    * The links to other objects related to this object.
    */
  var _links: Any
  
  /**
    * Project collection description.
    */
  var description: String
  
  /**
    * Project collection state.
    */
  var state: String
}
object TeamProjectCollection {
  
  inline def apply(_links: Any, description: String, id: String, name: String, state: String, url: String): TeamProjectCollection = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamProjectCollection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TeamProjectCollection] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def set_links(value: Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
