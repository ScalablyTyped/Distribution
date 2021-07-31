package typings.vegaTypings.encodeMod

import typings.vegaTypings.anon.Test
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathEncodeEntry
  extends StObject
     with EncodeEntry {
  
  var angle: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  
  var path: js.UndefOr[ProductionRule[StringValueRef]] = js.undefined
  
  var scaleX: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
  
  var scaleY: js.UndefOr[ProductionRule[NumericValueRef]] = js.undefined
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
    def setAngleVarargs(value: (Test & NumericValueRef)*): Self = StObject.set(x, "angle", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: ProductionRule[StringValueRef]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setPathVarargs(value: (Test & StringValueRef)*): Self = StObject.set(x, "path", js.Array(value :_*))
    
    @scala.inline
    def setScaleX(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleXUndefined: Self = StObject.set(x, "scaleX", js.undefined)
    
    @scala.inline
    def setScaleXVarargs(value: (Test & NumericValueRef)*): Self = StObject.set(x, "scaleX", js.Array(value :_*))
    
    @scala.inline
    def setScaleY(value: ProductionRule[NumericValueRef]): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleYUndefined: Self = StObject.set(x, "scaleY", js.undefined)
    
    @scala.inline
    def setScaleYVarargs(value: (Test & NumericValueRef)*): Self = StObject.set(x, "scaleY", js.Array(value :_*))
  }
}
