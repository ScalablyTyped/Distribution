package typings.webdriverio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommandsBrowserGetWindowSizeMod {
  
  @JSImport("webdriverio/build/commands/browser/getWindowSize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Promise[BrowserSize] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Promise[BrowserSize]]
  
  trait BrowserSize extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object BrowserSize {
    
    inline def apply(height: Double, width: Double): BrowserSize = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[BrowserSize]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BrowserSize] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
