package typings.vegaTypings.encodeMod

import typings.vegaTypings.anon.Test
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PathEncodeEntry extends EncodeEntry {
  
  var angle: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
  
  var path: js.UndefOr[ProductionRule[StringValueRef]] = js.native
  
  var scaleX: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
  
  var scaleY: js.UndefOr[ProductionRule[NumericValueRef]] = js.native
}
object PathEncodeEntry {
  
  @scala.inline
  def apply(): PathEncodeEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathEncodeEntry]
  }
  
  @scala.inline
  implicit class PathEncodeEntryMutableBuilder[Self <: PathEncodeEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAngle(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    @scala.inline
    def setAngleVarargs(value: (Test with NumericValueRef)*): Self = StObject.set(x, "angle", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: ProductionRule[StringValueRef]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setPathVarargs(value: (Test with StringValueRef)*): Self = StObject.set(x, "path", js.Array(value :_*))
    
    @scala.inline
    def setScaleX(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleXUndefined: Self = StObject.set(x, "scaleX", js.undefined)
    
    @scala.inline
    def setScaleXVarargs(value: (Test with NumericValueRef)*): Self = StObject.set(x, "scaleX", js.Array(value :_*))
    
    @scala.inline
    def setScaleY(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleYUndefined: Self = StObject.set(x, "scaleY", js.undefined)
    
    @scala.inline
    def setScaleYVarargs(value: (Test with NumericValueRef)*): Self = StObject.set(x, "scaleY", js.Array(value :_*))
  }
}
