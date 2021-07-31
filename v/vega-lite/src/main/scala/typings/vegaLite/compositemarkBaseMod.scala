package typings.vegaLite

import typings.vegaLite.channeldefMod.FieldName
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
import typings.vegaLite.srcMarkMod.GenericMarkDef
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compositemarkBaseMod {
  
  @JSImport("vega-lite/build/src/compositemark/base", "CompositeMarkNormalizer")
  @js.native
  class CompositeMarkNormalizer[M /* <: String */] protected ()
    extends StObject
       with ExtraNormalizer[
          CompositeMarkUnitSpec[M], 
          NormalizedUnitSpec | NormalizedLayerSpec, 
          (GenericUnitSpec[js.Any, js.Any]) | GenericLayerSpec[js.Any]
        ] {
    def this(
      name: String,
      run: js.Function3[
            /* spec */ CompositeMarkUnitSpec[M], 
            /* params */ NormalizerParams, 
            /* normalize */ Normalize[
              (GenericUnitSpec[Encoding[FieldName], M]) | GenericLayerSpec[js.Any], 
              NormalizedLayerSpec | NormalizedUnitSpec
            ], 
            NormalizedLayerSpec | NormalizedUnitSpec
          ]
    ) = this()
    
    def hasMatchingType(spec: GenericSpec[js.Any, js.Any, js.Any, js.Any]): /* is vega-lite.vega-lite/build/src/compositemark/base.CompositeMarkUnitSpec<M> */ Boolean = js.native
    /* CompleteClass */
    override def hasMatchingType(spec: GenericSpec[js.Any, js.Any, js.Any, js.Any], config: Config[ExprRef | SignalRef]): /* is S */ Boolean = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    override def run(
      spec: CompositeMarkUnitSpec[M],
      params: NormalizerParams,
      normalize: Normalize[
          (GenericUnitSpec[js.Any, js.Any]) | GenericLayerSpec[js.Any], 
          NormalizedUnitSpec | NormalizedLayerSpec
        ]
    ): NormalizedUnitSpec | NormalizedLayerSpec = js.native
  }
  
  type CompositeMarkUnitSpec[M /* <: String */] = GenericUnitSpec[js.Any, M | GenericMarkDef[M]]
}
