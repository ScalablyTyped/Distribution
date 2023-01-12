package typings.victoryBrushLine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrushBoolean extends StObject {
  
  var brush: Boolean
}
object BrushBoolean {
  
  inline def apply(brush: Boolean): BrushBoolean = {
    val __obj = js.Dynamic.literal(brush = brush.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrushBoolean]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BrushBoolean] (val x: Self) extends AnyVal {
    
    inline def setBrush(value: Boolean): Self = StObject.set(x, "brush", value.asInstanceOf[js.Any])
  }
}
