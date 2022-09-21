package typings.winrtUwp.Windows.Gaming

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Preview {
  
  object GamesEnumeration {
    
    trait GameList extends StObject
    
    trait GameListEntry extends StObject {
      
      var category: Any
      
      /* unmapped type */
      var displayInfo: Any
      
      /* unmapped type */
      var launchAsync: Any
      
      /* unmapped type */
      var properties: Any
      
      /* unmapped type */
      var setCategoryAsync: Any
    }
    object GameListEntry {
      
      inline def apply(category: Any, displayInfo: Any, launchAsync: Any, properties: Any, setCategoryAsync: Any): GameListEntry = {
        val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], displayInfo = displayInfo.asInstanceOf[js.Any], launchAsync = launchAsync.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], setCategoryAsync = setCategoryAsync.asInstanceOf[js.Any])
        __obj.asInstanceOf[GameListEntry]
      }
      
      extension [Self <: GameListEntry](x: Self) {
        
        inline def setCategory(value: Any): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
        
        inline def setDisplayInfo(value: Any): Self = StObject.set(x, "displayInfo", value.asInstanceOf[js.Any])
        
        inline def setLaunchAsync(value: Any): Self = StObject.set(x, "launchAsync", value.asInstanceOf[js.Any])
        
        inline def setProperties(value: Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
        
        inline def setSetCategoryAsync(value: Any): Self = StObject.set(x, "setCategoryAsync", value.asInstanceOf[js.Any])
      }
    }
  }
}
