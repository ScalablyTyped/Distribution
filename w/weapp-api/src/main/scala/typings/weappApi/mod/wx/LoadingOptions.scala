package typings.weappApi.mod.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadingOptions
  extends StObject
     with CommonCallbackOptions {
  
  //  默认false。是否显示透明蒙层，防止触摸穿透
  var mask: Boolean
  
  // must，提示的内容
  var title: String
}
object LoadingOptions {
  
  inline def apply(mask: Boolean, title: String): LoadingOptions = {
    val __obj = js.Dynamic.literal(mask = mask.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadingOptions]
  }
  
  extension [Self <: LoadingOptions](x: Self) {
    
    inline def setMask(value: Boolean): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
