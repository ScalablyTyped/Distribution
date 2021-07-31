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
import typings.vegaLite.srcMarkMod.Mark
import typings.vegaLite.srcMarkMod.MarkDef
import typings.vegaLite.vegaLiteStrings.area
import typings.vegaLite.vegaLiteStrings.line
import typings.vegaLite.vegaLiteStrings.rule
import typings.vegaLite.vegaLiteStrings.trail
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathoverlayMod {
  
  @JSImport("vega-lite/build/src/normalize/pathoverlay", "PathOverlayNormalizer")
  @js.native
  class PathOverlayNormalizer ()
    extends StObject
       with ExtraNormalizer[
          UnitSpecWithPathOverlay, 
          NormalizedUnitSpec | NormalizedLayerSpec, 
          (GenericUnitSpec[js.Any, js.Any]) | GenericLayerSpec[js.Any]
        ] {
    
    /* CompleteClass */
    override def hasMatchingType(spec: GenericSpec[js.Any, js.Any, js.Any, js.Any], config: Config[ExprRef | SignalRef]): /* is S */ Boolean = js.native
    def hasMatchingType(
      spec: GenericUnitSpec[js.Any, Mark | (MarkDef[Mark, ExprRef | SignalRef])],
      config: Config[ExprRef | SignalRef]
    ): /* is vega-lite.vega-lite/build/src/normalize/pathoverlay.UnitSpecWithPathOverlay */ Boolean = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    override def run(
      spec: UnitSpecWithPathOverlay,
      params: NormalizerParams,
      normalize: Normalize[
          (GenericUnitSpec[js.Any, js.Any]) | GenericLayerSpec[js.Any], 
          NormalizedUnitSpec | NormalizedLayerSpec
        ]
    ): NormalizedUnitSpec | NormalizedLayerSpec = js.native
  }
  
  type UnitSpecWithPathOverlay = GenericUnitSpec[
    Encoding[String], 
    Mark | (MarkDef[line | area | rule | trail, ExprRef | SignalRef])
  ]
}
