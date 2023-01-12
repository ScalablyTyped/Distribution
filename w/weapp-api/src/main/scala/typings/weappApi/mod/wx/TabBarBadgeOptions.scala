package typings.weappApi.mod.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabBarBadgeOptions
  extends StObject
     with CommonCallbackOptions {
  
  //  tabBar 的哪一项，从左边算起
  var index: Double
  
  //  显示的文本，超过 4 个字符则显示成 ...
  var text: String
}
object TabBarBadgeOptions {
  
  inline def apply(index: Double, text: String): TabBarBadgeOptions = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabBarBadgeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TabBarBadgeOptions] (val x: Self) extends AnyVal {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
