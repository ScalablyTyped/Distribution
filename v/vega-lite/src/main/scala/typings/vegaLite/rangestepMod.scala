package typings.vegaLite

import typings.vegaLite.encodingMod.Encoding
import typings.vegaLite.normalizeBaseMod.ExtraNormalizer
import typings.vegaLite.specLayerMod.GenericLayerSpec
import typings.vegaLite.specLayerMod.NormalizedLayerSpec
import typings.vegaLite.specMod.GenericSpec
import typings.vegaLite.specUnitMod.GenericUnitSpec
import typings.vegaLite.specUnitMod.NormalizedUnitSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rangestepMod {
  
  @JSImport("vega-lite/build/src/normalize/rangestep", "RangeStepNormalizer")
  @js.native
  class RangeStepNormalizer ()
    extends ExtraNormalizer[
          UnitSpecWithRangeStep, 
          NormalizedUnitSpec | NormalizedLayerSpec, 
          (GenericUnitSpec[js.Any, js.Any]) | GenericLayerSpec[js.Any]
        ] {
    
    def hasMatchingType(spec: GenericSpec[_, _, _, _]): /* is vega-lite.vega-lite/build/src/normalize/rangestep.UnitSpecWithRangeStep */ Boolean = js.native
    
    def run(spec: UnitSpecWithRangeStep): NormalizedUnitSpec = js.native
  }
  
  type UnitSpecWithRangeStep = GenericUnitSpec[Encoding[String], js.Any]
}
