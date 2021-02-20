package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtraRightPx extends StObject {
  
  var extraLeftPx: Double = js.native
  
  var extraRightPx: Double = js.native
  
  var notePx: Double = js.native
  
  var width: Double = js.native
}
object ExtraRightPx {
  
  @scala.inline
  def apply(extraLeftPx: Double, extraRightPx: Double, notePx: Double, width: Double): ExtraRightPx = {
    val __obj = js.Dynamic.literal(extraLeftPx = extraLeftPx.asInstanceOf[js.Any], extraRightPx = extraRightPx.asInstanceOf[js.Any], notePx = notePx.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtraRightPx]
  }
  
  @scala.inline
  implicit class ExtraRightPxMutableBuilder[Self <: ExtraRightPx] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtraLeftPx(value: Double): Self = StObject.set(x, "extraLeftPx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraRightPx(value: Double): Self = StObject.set(x, "extraRightPx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotePx(value: Double): Self = StObject.set(x, "notePx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
