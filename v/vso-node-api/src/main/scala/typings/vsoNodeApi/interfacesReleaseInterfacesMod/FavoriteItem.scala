package typings.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FavoriteItem extends StObject {
  
  /**
    * Application specific data for the entry
    */
  var data: String
  
  /**
    * Unique Id of the the entry
    */
  var id: String
  
  /**
    * Display text for favorite entry
    */
  var name: String
  
  /**
    * Application specific favorite entry type. Empty or Null represents that Favorite item is a Folder
    */
  var `type`: String
}
object FavoriteItem {
  
  inline def apply(data: String, id: String, name: String, `type`: String): FavoriteItem = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FavoriteItem]
  }
  
  extension [Self <: FavoriteItem](x: Self) {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
