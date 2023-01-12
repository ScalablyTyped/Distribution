package typings.vimeoPlayer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FullScreenChangeEvent extends StObject {
  
  var fullscreen: Boolean
}
object FullScreenChangeEvent {
  
  inline def apply(fullscreen: Boolean): FullScreenChangeEvent = {
    val __obj = js.Dynamic.literal(fullscreen = fullscreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullScreenChangeEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FullScreenChangeEvent] (val x: Self) extends AnyVal {
    
    inline def setFullscreen(value: Boolean): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
  }
}
