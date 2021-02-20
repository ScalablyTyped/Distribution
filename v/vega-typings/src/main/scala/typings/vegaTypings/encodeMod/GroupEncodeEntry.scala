package typings.vegaTypings.encodeMod

import typings.vegaTypings.anon.Test
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupEncodeEntry extends RectEncodeEntry {
  
  var clip: js.UndefOr[ProductionRule[BooleanValueRef]] = js.native
  
  var strokeForeground: js.UndefOr[ProductionRule[BooleanValueRef]] = js.native
  
  var strokeOffset: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
}
object GroupEncodeEntry {
  
  @scala.inline
  def apply(): GroupEncodeEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupEncodeEntry]
  }
  
  @scala.inline
  implicit class GroupEncodeEntryMutableBuilder[Self <: GroupEncodeEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClip(value: ProductionRule[BooleanValueRef]): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
    
    @scala.inline
    def setClipVarargs(value: (Test with BooleanValueRef)*): Self = StObject.set(x, "clip", js.Array(value :_*))
    
    @scala.inline
    def setStrokeForeground(value: ProductionRule[BooleanValueRef]): Self = StObject.set(x, "strokeForeground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeForegroundUndefined: Self = StObject.set(x, "strokeForeground", js.undefined)
    
    @scala.inline
    def setStrokeForegroundVarargs(value: (Test with BooleanValueRef)*): Self = StObject.set(x, "strokeForeground", js.Array(value :_*))
    
    @scala.inline
    def setStrokeOffset(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "strokeOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeOffsetUndefined: Self = StObject.set(x, "strokeOffset", js.undefined)
    
    @scala.inline
    def setStrokeOffsetVarargs(value: (Test with NumericValueRef)*): Self = StObject.set(x, "strokeOffset", js.Array(value :_*))
  }
}
