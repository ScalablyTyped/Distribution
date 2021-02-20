package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtraLeftPx_ extends StObject {
  
  var extraLeftPx: Double = js.native
  
  var extraRightPx: Double = js.native
  
  var left_shift: Double = js.native
  
  var modLeftPx: Double = js.native
  
  var modRightPx: Double = js.native
  
  var noteWidth: Double = js.native
  
  var width: Double = js.native
}
object ExtraLeftPx_ {
  
  @scala.inline
  def apply(
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
  implicit class ExtraLeftPx_MutableBuilder[Self <: ExtraLeftPx_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtraLeftPx(value: Double): Self = StObject.set(x, "extraLeftPx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraRightPx(value: Double): Self = StObject.set(x, "extraRightPx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft_shift(value: Double): Self = StObject.set(x, "left_shift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModLeftPx(value: Double): Self = StObject.set(x, "modLeftPx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModRightPx(value: Double): Self = StObject.set(x, "modRightPx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteWidth(value: Double): Self = StObject.set(x, "noteWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
