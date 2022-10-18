package typings.vegaLite

import typings.vegaLite.buildSrcConfigMod.Config
import typings.vegaLite.buildSrcEncodingMod.Encoding
import typings.vegaLite.buildSrcExprMod.ExprRef
import typings.vegaLite.buildSrcMarkMod.Mark
import typings.vegaLite.buildSrcMarkMod.MarkDef
import typings.vegaLite.buildSrcNormalizeBaseMod.ExtraNormalizer
import typings.vegaLite.buildSrcNormalizeBaseMod.Normalize
import typings.vegaLite.buildSrcNormalizeBaseMod.NormalizerParams
import typings.vegaLite.buildSrcSelectionMod.SelectionParameter
import typings.vegaLite.buildSrcSelectionMod.SelectionType
import typings.vegaLite.buildSrcSpecLayerMod.GenericLayerSpec
import typings.vegaLite.buildSrcSpecLayerMod.NormalizedLayerSpec
import typings.vegaLite.buildSrcSpecMod.GenericSpec
import typings.vegaLite.buildSrcSpecUnitMod.GenericUnitSpec
import typings.vegaLite.buildSrcSpecUnitMod.NormalizedUnitSpec
import typings.vegaLite.vegaLiteStrings.area
import typings.vegaLite.vegaLiteStrings.line
import typings.vegaLite.vegaLiteStrings.rule
import typings.vegaLite.vegaLiteStrings.trail
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcNormalizePathoverlayMod {
  
  @JSImport("vega-lite/build/src/normalize/pathoverlay", "PathOverlayNormalizer")
  @js.native
  open class PathOverlayNormalizer ()
    extends StObject
       with ExtraNormalizer[
          UnitSpecWithPathOverlay, 
          NormalizedUnitSpec | NormalizedLayerSpec, 
          (GenericUnitSpec[Any, Any, SelectionParameter[SelectionType]]) | GenericLayerSpec[Any]
        ] {
    
    /* CompleteClass */
    override def hasMatchingType(spec: GenericSpec[Any, Any, Any, Any], config: Config[ExprRef | SignalRef]): /* is S */ Boolean = js.native
    def hasMatchingType(
      spec: GenericUnitSpec[Any, Mark | (MarkDef[Mark, ExprRef | SignalRef]), SelectionParameter[SelectionType]],
      config: Config[ExprRef | SignalRef]
    ): /* is vega-lite.vega-lite/build/src/normalize/pathoverlay.UnitSpecWithPathOverlay */ Boolean = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    override def run(
      spec: UnitSpecWithPathOverlay,
      params: NormalizerParams,
      normalize: Normalize[
          (GenericUnitSpec[Any, Any, SelectionParameter[SelectionType]]) | GenericLayerSpec[Any], 
          NormalizedUnitSpec | NormalizedLayerSpec
        ]
    ): NormalizedUnitSpec | NormalizedLayerSpec = js.native
  }
  
  type UnitSpecWithPathOverlay = GenericUnitSpec[
    Encoding[String], 
    Mark | (MarkDef[line | area | rule | trail, ExprRef | SignalRef]), 
    SelectionParameter[SelectionType]
  ]
}
