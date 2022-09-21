package typings.webscreensWindowPlacement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// enhance window.Window with getScreenDetails method.
trait Window extends StObject {
  
  def getScreenDetails(): js.Promise[ScreenDetails]
}
object Window {
  
  inline def apply(getScreenDetails: () => js.Promise[ScreenDetails]): Window = {
    val __obj = js.Dynamic.literal(getScreenDetails = js.Any.fromFunction0(getScreenDetails))
    __obj.asInstanceOf[Window]
  }
  
  extension [Self <: Window](x: Self) {
    
    inline def setGetScreenDetails(value: () => js.Promise[ScreenDetails]): Self = StObject.set(x, "getScreenDetails", js.Any.fromFunction0(value))
  }
}
