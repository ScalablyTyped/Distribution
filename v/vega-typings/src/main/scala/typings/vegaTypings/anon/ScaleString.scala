package typings.vegaTypings.anon

import typings.vegaTypings.onEventsMod._EventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScaleString
  extends StObject
     with _EventListener {
  
  var scale: String
}
object ScaleString {
  
  inline def apply(scale: String): ScaleString = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleString]
  }
  
  extension [Self <: ScaleString](x: Self) {
    
    inline def setScale(value: String): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
  }
}
