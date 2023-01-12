package typings.useGestureCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Record<@use-gesture/core.@use-gesture/core/dist/declarations/src/types/utils.PointerType, number>> */
trait PartialRecordPointerTypen extends StObject {
  
  var mouse: js.UndefOr[Double] = js.undefined
  
  var pen: js.UndefOr[Double] = js.undefined
  
  var touch: js.UndefOr[Double] = js.undefined
}
object PartialRecordPointerTypen {
  
  inline def apply(): PartialRecordPointerTypen = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRecordPointerTypen]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialRecordPointerTypen] (val x: Self) extends AnyVal {
    
    inline def setMouse(value: Double): Self = StObject.set(x, "mouse", value.asInstanceOf[js.Any])
    
    inline def setMouseUndefined: Self = StObject.set(x, "mouse", js.undefined)
    
    inline def setPen(value: Double): Self = StObject.set(x, "pen", value.asInstanceOf[js.Any])
    
    inline def setPenUndefined: Self = StObject.set(x, "pen", js.undefined)
    
    inline def setTouch(value: Double): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
    
    inline def setTouchUndefined: Self = StObject.set(x, "touch", js.undefined)
  }
}
