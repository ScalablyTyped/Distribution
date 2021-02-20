package typings.vegaTypings.encodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Record<vega-typings.vega-typings/types/spec/encode.EncodeEntryName, T>> */
@js.native
trait Encode[T] extends StObject {
  
  var enter: js.UndefOr[T] = js.native
  
  var exit: js.UndefOr[T] = js.native
  
  var hover: js.UndefOr[T] = js.native
  
  var leave: js.UndefOr[T] = js.native
  
  var release: js.UndefOr[T] = js.native
  
  var select: js.UndefOr[T] = js.native
  
  var update: js.UndefOr[T] = js.native
}
object Encode {
  
  @scala.inline
  def apply[T](): Encode[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Encode[T]]
  }
  
  @scala.inline
  implicit class EncodeMutableBuilder[Self <: Encode[_], T] (val x: Self with Encode[T]) extends AnyVal {
    
    @scala.inline
    def setEnter(value: T): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: T): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
    
    @scala.inline
    def setHover(value: T): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    
    @scala.inline
    def setLeave(value: T): Self = StObject.set(x, "leave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeaveUndefined: Self = StObject.set(x, "leave", js.undefined)
    
    @scala.inline
    def setRelease(value: T): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseUndefined: Self = StObject.set(x, "release", js.undefined)
    
    @scala.inline
    def setSelect(value: T): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    @scala.inline
    def setUpdate(value: T): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
