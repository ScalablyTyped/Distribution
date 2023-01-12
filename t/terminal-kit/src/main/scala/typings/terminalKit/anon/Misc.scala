package typings.terminalKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Misc extends StObject {
  
  var attr: Double
  
  var misc: Any
  
  var offset: Double
  
  var text: String
  
  var x: Double
  
  var y: Double
}
object Misc {
  
  inline def apply(attr: Double, misc: Any, offset: Double, text: String, x: Double, y: Double): Misc = {
    val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any], misc = misc.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Misc]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Misc] (val x: Self) extends AnyVal {
    
    inline def setAttr(value: Double): Self = StObject.set(x, "attr", value.asInstanceOf[js.Any])
    
    inline def setMisc(value: Any): Self = StObject.set(x, "misc", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
