package typings.winrtUwp.Windows.Gaming

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Preview {
  
  object GamesEnumeration {
    
    trait GameList extends StObject
    
    trait GameListEntry extends StObject {
      
      var category: js.Any
      
      /* unmapped type */
      var displayInfo: js.Any
      
      /* unmapped type */
      var launchAsync: js.Any
      
      /* unmapped type */
      var properties: js.Any
      
      /* unmapped type */
      var setCategoryAsync: js.Any
    }
    object GameListEntry {
      
      @scala.inline
      def apply(
        category: js.Any,
        displayInfo: js.Any,
        launchAsync: js.Any,
        properties: js.Any,
        setCategoryAsync: js.Any
      ): GameListEntry = {
        val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], displayInfo = displayInfo.asInstanceOf[js.Any], launchAsync = launchAsync.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], setCategoryAsync = setCategoryAsync.asInstanceOf[js.Any])
        __obj.asInstanceOf[GameListEntry]
      }
      
      @scala.inline
      implicit class GameListEntryMutableBuilder[Self <: GameListEntry] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCategory(value: js.Any): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDisplayInfo(value: js.Any): Self = StObject.set(x, "displayInfo", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLaunchAsync(value: js.Any): Self = StObject.set(x, "launchAsync", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProperties(value: js.Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSetCategoryAsync(value: js.Any): Self = StObject.set(x, "setCategoryAsync", value.asInstanceOf[js.Any])
      }
    }
  }
}
