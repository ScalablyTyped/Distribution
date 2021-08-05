package typings.tabris.anon

import typings.tabris.tabrisStrings.auto
import typings.tabris.tabrisStrings.off
import typings.tabris.tabrisStrings.on
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Flash extends StObject {
  
  var flash: js.UndefOr[auto | on | off] = js.undefined
}
object Flash {
  
  inline def apply(): Flash = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Flash]
  }
  
  extension [Self <: Flash](x: Self) {
    
    inline def setFlash(value: auto | on | off): Self = StObject.set(x, "flash", value.asInstanceOf[js.Any])
    
    inline def setFlashUndefined: Self = StObject.set(x, "flash", js.undefined)
  }
}
