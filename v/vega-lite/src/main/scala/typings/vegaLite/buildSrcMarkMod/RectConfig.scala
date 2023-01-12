package typings.vegaLite.buildSrcMarkMod

import typings.vegaLite.buildSrcExprMod.ExprRef
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.vegaLite.buildSrcMarkMod.AnyMarkConfig because Already inherited */ trait RectConfig[ES /* <: ExprRef | SignalRef */]
  extends StObject
     with RectBinSpacingMixins
     with MarkConfig[ES] {
  
  /**
    * The default size of the bars on continuous scales.
    *
    * __Default value:__ `5`
    *
    * @minimum 0
    */
  var continuousBandSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The default size of the bars with discrete dimensions. If unspecified, the default size is  `step-2`, which provides 2 pixel offset between bars.
    * @minimum 0
    */
  var discreteBandSize: js.UndefOr[Double | RelativeBandSize] = js.undefined
}
object RectConfig {
  
  inline def apply[ES /* <: ExprRef | SignalRef */](): RectConfig[ES] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RectConfig[ES]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RectConfig[?], ES /* <: ExprRef | SignalRef */] (val x: Self & RectConfig[ES]) extends AnyVal {
    
    inline def setContinuousBandSize(value: Double): Self = StObject.set(x, "continuousBandSize", value.asInstanceOf[js.Any])
    
    inline def setContinuousBandSizeUndefined: Self = StObject.set(x, "continuousBandSize", js.undefined)
    
    inline def setDiscreteBandSize(value: Double | RelativeBandSize): Self = StObject.set(x, "discreteBandSize", value.asInstanceOf[js.Any])
    
    inline def setDiscreteBandSizeUndefined: Self = StObject.set(x, "discreteBandSize", js.undefined)
  }
}
