package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mode extends StObject {
  
  var mode: String
  
  var open: Any
}
object Mode {
  
  inline def apply(mode: String, open: Any): Mode = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mode]
  }
  
  extension [Self <: Mode](x: Self) {
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setOpen(value: Any): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
  }
}
