package typings.webscreensWindowPlacement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// enhance element.requestFullScreen(options)
trait FullscreenOptions extends StObject {
  
  var screen: js.UndefOr[ScreenDetailed] = js.undefined
}
object FullscreenOptions {
  
  inline def apply(): FullscreenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FullscreenOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FullscreenOptions] (val x: Self) extends AnyVal {
    
    inline def setScreen(value: ScreenDetailed): Self = StObject.set(x, "screen", value.asInstanceOf[js.Any])
    
    inline def setScreenUndefined: Self = StObject.set(x, "screen", js.undefined)
  }
}
