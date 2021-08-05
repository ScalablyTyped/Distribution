package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtraRightPx extends StObject {
  
  var extraLeftPx: Double
  
  var extraRightPx: Double
  
  var notePx: Double
  
  var width: Double
}
object ExtraRightPx {
  
  inline def apply(extraLeftPx: Double, extraRightPx: Double, notePx: Double, width: Double): ExtraRightPx = {
    val __obj = js.Dynamic.literal(extraLeftPx = extraLeftPx.asInstanceOf[js.Any], extraRightPx = extraRightPx.asInstanceOf[js.Any], notePx = notePx.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtraRightPx]
  }
  
  extension [Self <: ExtraRightPx](x: Self) {
    
    inline def setExtraLeftPx(value: Double): Self = StObject.set(x, "extraLeftPx", value.asInstanceOf[js.Any])
    
    inline def setExtraRightPx(value: Double): Self = StObject.set(x, "extraRightPx", value.asInstanceOf[js.Any])
    
    inline def setNotePx(value: Double): Self = StObject.set(x, "notePx", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
