package typings.vegaTypings.anon

import typings.vegaTypings.streamMod.WindowEventType
import typings.vegaTypings.vegaTypingsStrings.window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type extends StObject {
  
  var source: window
  
  var `type`: WindowEventType
}
object Type {
  
  inline def apply(`type`: WindowEventType): Type = {
    val __obj = js.Dynamic.literal(source = "window")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  
  extension [Self <: Type](x: Self) {
    
    inline def setSource(value: window): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setType(value: WindowEventType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
