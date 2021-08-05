package typings.wechatMiniprogram.anon

import typings.wechatMiniprogram.wechatMiniprogramStrings.horizontal
import typings.wechatMiniprogram.wechatMiniprogramStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FullScreen extends StObject {
  
  var direction: vertical | horizontal
  
  var fullScreen: Boolean
}
object FullScreen {
  
  inline def apply(direction: vertical | horizontal, fullScreen: Boolean): FullScreen = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], fullScreen = fullScreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullScreen]
  }
  
  extension [Self <: FullScreen](x: Self) {
    
    inline def setDirection(value: vertical | horizontal): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setFullScreen(value: Boolean): Self = StObject.set(x, "fullScreen", value.asInstanceOf[js.Any])
  }
}
