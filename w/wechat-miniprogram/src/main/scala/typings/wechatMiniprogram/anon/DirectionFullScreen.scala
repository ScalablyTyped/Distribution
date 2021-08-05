package typings.wechatMiniprogram.anon

import typings.wechatMiniprogram.wechatMiniprogramStrings.horizontal
import typings.wechatMiniprogram.wechatMiniprogramStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectionFullScreen extends StObject {
  
  var direction: vertical | horizontal
  
  var fullScreen: Boolean
}
object DirectionFullScreen {
  
  inline def apply(direction: vertical | horizontal, fullScreen: Boolean): DirectionFullScreen = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], fullScreen = fullScreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionFullScreen]
  }
  
  extension [Self <: DirectionFullScreen](x: Self) {
    
    inline def setDirection(value: vertical | horizontal): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setFullScreen(value: Boolean): Self = StObject.set(x, "fullScreen", value.asInstanceOf[js.Any])
  }
}
