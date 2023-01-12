package typings.vegaTypings.typesSpecEncodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Record<vega-typings.vega-typings/types/spec/encode.EncodeEntryName, T>> */
trait Encode[T] extends StObject {
  
  var enter: js.UndefOr[T] = js.undefined
  
  var exit: js.UndefOr[T] = js.undefined
  
  var hover: js.UndefOr[T] = js.undefined
  
  var leave: js.UndefOr[T] = js.undefined
  
  var release: js.UndefOr[T] = js.undefined
  
  var select: js.UndefOr[T] = js.undefined
  
  var update: js.UndefOr[T] = js.undefined
}
object Encode {
  
  inline def apply[T](): Encode[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Encode[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Encode[?], T] (val x: Self & Encode[T]) extends AnyVal {
    
    inline def setEnter(value: T): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: T): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
    
    inline def setHover(value: T): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    
    inline def setLeave(value: T): Self = StObject.set(x, "leave", value.asInstanceOf[js.Any])
    
    inline def setLeaveUndefined: Self = StObject.set(x, "leave", js.undefined)
    
    inline def setRelease(value: T): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
    
    inline def setReleaseUndefined: Self = StObject.set(x, "release", js.undefined)
    
    inline def setSelect(value: T): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    inline def setUpdate(value: T): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
