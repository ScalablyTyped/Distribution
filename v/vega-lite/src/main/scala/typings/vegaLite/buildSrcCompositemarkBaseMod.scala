package typings.vegaLite

import typings.vegaLite.buildSrcChanneldefMod.FieldName
import typings.vegaLite.buildSrcConfigMod.Config
import typings.vegaLite.buildSrcEncodingMod.Encoding
import typings.vegaLite.buildSrcExprMod.ExprRef
import typings.vegaLite.buildSrcMarkMod.GenericMarkDef
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
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompositemarkBaseMod {
  
  @JSImport("vega-lite/build/src/compositemark/base", "CompositeMarkNormalizer")
  @js.native
  open class CompositeMarkNormalizer[M /* <: String */] protected ()
    extends StObject
       with ExtraNormalizer[
          CompositeMarkUnitSpec[M], 
          NormalizedUnitSpec | NormalizedLayerSpec, 
          (GenericUnitSpec[Any, Any, SelectionParameter[SelectionType]]) | GenericLayerSpec[Any]
        ] {
    def this(
      name: String,
      run: js.Function3[
            /* spec */ CompositeMarkUnitSpec[M], 
            /* params */ NormalizerParams, 
            /* normalize */ Normalize[
              (GenericUnitSpec[Encoding[FieldName], M, SelectionParameter[SelectionType]]) | GenericLayerSpec[Any], 
              NormalizedLayerSpec | NormalizedUnitSpec
            ], 
            NormalizedLayerSpec | NormalizedUnitSpec
          ]
    ) = this()
    
    def hasMatchingType(spec: GenericSpec[Any, Any, Any, Any]): /* is vega-lite.vega-lite/build/src/compositemark/base.CompositeMarkUnitSpec<M> */ Boolean = js.native
    /* CompleteClass */
    override def hasMatchingType(spec: GenericSpec[Any, Any, Any, Any], config: Config[ExprRef | SignalRef]): /* is S */ Boolean = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    override def run(
      spec: CompositeMarkUnitSpec[M],
      params: NormalizerParams,
      normalize: Normalize[
          (GenericUnitSpec[Any, Any, SelectionParameter[SelectionType]]) | GenericLayerSpec[Any], 
          NormalizedUnitSpec | NormalizedLayerSpec
        ]
    ): NormalizedUnitSpec | NormalizedLayerSpec = js.native
  }
  
  type CompositeMarkUnitSpec[M /* <: String */] = GenericUnitSpec[Any, M | GenericMarkDef[M], SelectionParameter[SelectionType]]
}
