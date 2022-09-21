package typings.webostvjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  trait Window extends StObject {
    
    var webOS: WebOS
    
    var webOSDev: WebOSDev
  }
  object Window {
    
    inline def apply(webOS: WebOS, webOSDev: WebOSDev): Window = {
      val __obj = js.Dynamic.literal(webOS = webOS.asInstanceOf[js.Any], webOSDev = webOSDev.asInstanceOf[js.Any])
      __obj.asInstanceOf[Window]
    }
    
    extension [Self <: Window](x: Self) {
      
      inline def setWebOS(value: WebOS): Self = StObject.set(x, "webOS", value.asInstanceOf[js.Any])
      
      inline def setWebOSDev(value: WebOSDev): Self = StObject.set(x, "webOSDev", value.asInstanceOf[js.Any])
    }
  }
}
