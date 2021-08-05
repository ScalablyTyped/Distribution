package typings.wixUiCore.storiesUtilsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StorySettings extends StObject {
  
  var category: Category
  
  /** data-hook for the AutoExample */
  var dataHook: js.UndefOr[String] = js.undefined
  
  var storyName: String
}
object StorySettings {
  
  inline def apply(category: Category, storyName: String): StorySettings = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], storyName = storyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorySettings]
  }
  
  extension [Self <: StorySettings](x: Self) {
    
    inline def setCategory(value: Category): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
    
    inline def setStoryName(value: String): Self = StObject.set(x, "storyName", value.asInstanceOf[js.Any])
  }
}
