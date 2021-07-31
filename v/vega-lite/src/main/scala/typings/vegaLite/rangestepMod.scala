package typings.vegaLite

import typings.vegaLite.encodingMod.Encoding
import typings.vegaLite.exprMod.ExprRef
import typings.vegaLite.normalizeBaseMod.ExtraNormalizer
import typings.vegaLite.normalizeBaseMod.Normalize
import typings.vegaLite.normalizeBaseMod.NormalizerParams
import typings.vegaLite.specLayerMod.GenericLayerSpec
import typings.vegaLite.specLayerMod.NormalizedLayerSpec
import typings.vegaLite.specMod.GenericSpec
import typings.vegaLite.specUnitMod.GenericUnitSpec
import typings.vegaLite.specUnitMod.NormalizedUnitSpec
import typings.vegaLite.srcConfigMod.Config
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rangestepMod {
  
  @JSImport("vega-lite/build/src/normalize/rangestep", "RangeStepNormalizer")
  @js.native
  class RangeStepNormalizer ()
    extends StObject
       with ExtraNormalizer[
          UnitSpecWithRangeStep, 
          NormalizedUnitSpec | NormalizedLayerSpec, 
          (GenericUnitSpec[js.Any, js.Any]) | GenericLayerSpec[js.Any]
        ] {
    
    def hasMatchingType(spec: GenericSpec[js.Any, js.Any, js.Any, js.Any]): /* is vega-lite.vega-lite/build/src/normalize/rangestep.UnitSpecWithRangeStep */ Boolean = js.native
    /* CompleteClass */
    override def hasMatchingType(spec: GenericSpec[js.Any, js.Any, js.Any, js.Any], config: Config[ExprRef | SignalRef]): /* is S */ Boolean = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    def run(spec: UnitSpecWithRangeStep): NormalizedUnitSpec = js.native
    /* CompleteClass */
    override def run(
      spec: UnitSpecWithRangeStep,
      params: NormalizerParams,
      normalize: Normalize[
          (GenericUnitSpec[js.Any, js.Any]) | GenericLayerSpec[js.Any], 
          NormalizedUnitSpec | NormalizedLayerSpec
        ]
    ): NormalizedUnitSpec | NormalizedLayerSpec = js.native
  }
  
  type UnitSpecWithRangeStep = GenericUnitSpec[Encoding[String], js.Any]
}
