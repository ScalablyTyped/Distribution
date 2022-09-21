package typings.tizenTvWebapis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("webapis")
  @js.native
  val webapis: Webapis = js.native
  
  trait Window extends StObject {
    
    var webapis: Webapis
  }
  object Window {
    
    inline def apply(webapis: Webapis): Window = {
      val __obj = js.Dynamic.literal(webapis = webapis.asInstanceOf[js.Any])
      __obj.asInstanceOf[Window]
    }
    
    extension [Self <: Window](x: Self) {
      
      inline def setWebapis(value: Webapis): Self = StObject.set(x, "webapis", value.asInstanceOf[js.Any])
    }
  }
}
