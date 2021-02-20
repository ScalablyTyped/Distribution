package typings.vegaLite

import typings.vegaLite.channeldefMod.FieldName
import typings.vegaLite.encodingMod.Encoding
import typings.vegaLite.normalizeBaseMod.ExtraNormalizer
import typings.vegaLite.normalizeBaseMod.Normalize
import typings.vegaLite.normalizeBaseMod.NormalizerParams
import typings.vegaLite.specLayerMod.GenericLayerSpec
import typings.vegaLite.specLayerMod.NormalizedLayerSpec
import typings.vegaLite.specMod.GenericSpec
import typings.vegaLite.specUnitMod.GenericUnitSpec
import typings.vegaLite.specUnitMod.NormalizedUnitSpec
import typings.vegaLite.srcMarkMod.GenericMarkDef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compositemarkBaseMod {
  
  @JSImport("vega-lite/build/src/compositemark/base", "CompositeMarkNormalizer")
  @js.native
  class CompositeMarkNormalizer[M /* <: String */] protected ()
    extends ExtraNormalizer[
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
              (GenericUnitSpec[Encoding[FieldName], M]) | GenericLayerSpec[_], 
              NormalizedLayerSpec | NormalizedUnitSpec
            ], 
            NormalizedLayerSpec | NormalizedUnitSpec
          ]
    ) = this()
    
    def hasMatchingType(spec: GenericSpec[_, _, _, _]): /* is vega-lite.vega-lite/build/src/compositemark/base.CompositeMarkUnitSpec<M> */ Boolean = js.native
  }
  
  type CompositeMarkUnitSpec[M /* <: String */] = GenericUnitSpec[js.Any, M | GenericMarkDef[M]]
}
