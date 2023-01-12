package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtraLeftPx_ extends StObject {
  
  var extraLeftPx: Double
  
  var extraRightPx: Double
  
  var left_shift: Double
  
  var modLeftPx: Double
  
  var modRightPx: Double
  
  var noteWidth: Double
  
  var width: Double
}
object ExtraLeftPx_ {
  
  inline def apply(
    extraLeftPx: Double,
    extraRightPx: Double,
    left_shift: Double,
    modLeftPx: Double,
    modRightPx: Double,
    noteWidth: Double,
    width: Double
  ): ExtraLeftPx_ = {
    val __obj = js.Dynamic.literal(extraLeftPx = extraLeftPx.asInstanceOf[js.Any], extraRightPx = extraRightPx.asInstanceOf[js.Any], left_shift = left_shift.asInstanceOf[js.Any], modLeftPx = modLeftPx.asInstanceOf[js.Any], modRightPx = modRightPx.asInstanceOf[js.Any], noteWidth = noteWidth.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtraLeftPx_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExtraLeftPx_] (val x: Self) extends AnyVal {
    
    inline def setExtraLeftPx(value: Double): Self = StObject.set(x, "extraLeftPx", value.asInstanceOf[js.Any])
    
    inline def setExtraRightPx(value: Double): Self = StObject.set(x, "extraRightPx", value.asInstanceOf[js.Any])
    
    inline def setLeft_shift(value: Double): Self = StObject.set(x, "left_shift", value.asInstanceOf[js.Any])
    
    inline def setModLeftPx(value: Double): Self = StObject.set(x, "modLeftPx", value.asInstanceOf[js.Any])
    
    inline def setModRightPx(value: Double): Self = StObject.set(x, "modRightPx", value.asInstanceOf[js.Any])
    
    inline def setNoteWidth(value: Double): Self = StObject.set(x, "noteWidth", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
