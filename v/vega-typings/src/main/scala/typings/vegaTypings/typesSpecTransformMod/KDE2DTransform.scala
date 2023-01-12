package typings.vegaTypings.typesSpecTransformMod

import typings.vegaTypings.typesSpecSignalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.kde2d
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KDE2DTransform
  extends StObject
     with Transforms {
  
  var as: js.UndefOr[String | SignalRef] = js.undefined
  
  var bandwidth: js.UndefOr[(js.Array[Double | SignalRef]) | SignalRef] = js.undefined
  
  var cellSize: js.UndefOr[Double | SignalRef] = js.undefined
  
  // TODO: change to Vector2<number | SignalRef> after https://github.com/Microsoft/TypeScript/issues/28017 has been fixed
  var counts: js.UndefOr[Boolean | SignalRef] = js.undefined
  
  var groupby: js.UndefOr[(js.Array[String | TransformField]) | SignalRef] = js.undefined
  
  var size: (js.Array[Double | SignalRef]) | SignalRef
  
  var `type`: kde2d
  
  var weight: js.UndefOr[String | TransformField] = js.undefined
  
  // TODO: change to Vector2<number | SignalRef> after https://github.com/Microsoft/TypeScript/issues/28017 has been fixed
  var x: String | TransformField
  
  var y: String | TransformField
}
object KDE2DTransform {
  
  inline def apply(
    size: (js.Array[Double | SignalRef]) | SignalRef,
    x: String | TransformField,
    y: String | TransformField
  ): KDE2DTransform = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("kde2d")
    __obj.asInstanceOf[KDE2DTransform]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KDE2DTransform] (val x: Self) extends AnyVal {
    
    inline def setAs(value: String | SignalRef): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    inline def setBandwidth(value: (js.Array[Double | SignalRef]) | SignalRef): Self = StObject.set(x, "bandwidth", value.asInstanceOf[js.Any])
    
    inline def setBandwidthUndefined: Self = StObject.set(x, "bandwidth", js.undefined)
    
    inline def setBandwidthVarargs(value: (Double | SignalRef)*): Self = StObject.set(x, "bandwidth", js.Array(value*))
    
    inline def setCellSize(value: Double | SignalRef): Self = StObject.set(x, "cellSize", value.asInstanceOf[js.Any])
    
    inline def setCellSizeUndefined: Self = StObject.set(x, "cellSize", js.undefined)
    
    inline def setCounts(value: Boolean | SignalRef): Self = StObject.set(x, "counts", value.asInstanceOf[js.Any])
    
    inline def setCountsUndefined: Self = StObject.set(x, "counts", js.undefined)
    
    inline def setGroupby(value: (js.Array[String | TransformField]) | SignalRef): Self = StObject.set(x, "groupby", value.asInstanceOf[js.Any])
    
    inline def setGroupbyUndefined: Self = StObject.set(x, "groupby", js.undefined)
    
    inline def setGroupbyVarargs(value: (String | TransformField)*): Self = StObject.set(x, "groupby", js.Array(value*))
    
    inline def setSize(value: (js.Array[Double | SignalRef]) | SignalRef): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeVarargs(value: (Double | SignalRef)*): Self = StObject.set(x, "size", js.Array(value*))
    
    inline def setType(value: kde2d): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWeight(value: String | TransformField): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
    
    inline def setX(value: String | TransformField): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: String | TransformField): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
