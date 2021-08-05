package typings.winrt.anon

import typings.winrt.Windows.Foundation.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hit extends StObject {
  
  var hit: Double
  
  var rect: Rect
}
object Hit {
  
  inline def apply(hit: Double, rect: Rect): Hit = {
    val __obj = js.Dynamic.literal(hit = hit.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hit]
  }
  
  extension [Self <: Hit](x: Self) {
    
    inline def setHit(value: Double): Self = StObject.set(x, "hit", value.asInstanceOf[js.Any])
    
    inline def setRect(value: Rect): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
  }
}
