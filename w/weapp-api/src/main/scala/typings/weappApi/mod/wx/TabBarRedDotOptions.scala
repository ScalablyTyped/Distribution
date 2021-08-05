package typings.weappApi.mod.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabBarRedDotOptions
  extends StObject
     with CommonCallbackOptions {
  
  //  tabBar 的哪一项，从左边算起
  var index: Double
}
object TabBarRedDotOptions {
  
  inline def apply(index: Double): TabBarRedDotOptions = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabBarRedDotOptions]
  }
  
  extension [Self <: TabBarRedDotOptions](x: Self) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
