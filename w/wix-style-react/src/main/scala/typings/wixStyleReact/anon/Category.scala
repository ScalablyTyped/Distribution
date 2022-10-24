package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Category extends StObject {
  
  var category: Any
  
  var rtl: Any
  
  var storyName: Any
  
  var testName: Any
}
object Category {
  
  inline def apply(category: Any, rtl: Any, storyName: Any, testName: Any): Category = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], rtl = rtl.asInstanceOf[js.Any], storyName = storyName.asInstanceOf[js.Any], testName = testName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Category]
  }
  
  extension [Self <: Category](x: Self) {
    
    inline def setCategory(value: Any): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setRtl(value: Any): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
    
    inline def setStoryName(value: Any): Self = StObject.set(x, "storyName", value.asInstanceOf[js.Any])
    
    inline def setTestName(value: Any): Self = StObject.set(x, "testName", value.asInstanceOf[js.Any])
  }
}
