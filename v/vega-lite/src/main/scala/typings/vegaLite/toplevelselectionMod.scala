package typings.vegaLite

import typings.vegaLite.channeldefMod.FieldName
import typings.vegaLite.mapMod.SpecMapper
import typings.vegaLite.normalizeBaseMod.NormalizerParams
import typings.vegaLite.specLayerMod.GenericLayerSpec
import typings.vegaLite.specMod.NormalizedSpec
import typings.vegaLite.specUnitMod.NormalizedUnitSpec
import typings.vegaLite.toplevelMod.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toplevelselectionMod {
  
  @JSImport("vega-lite/build/src/normalize/toplevelselection", "TopLevelSelectionsNormalizer")
  @js.native
  open class TopLevelSelectionsNormalizer ()
    extends SpecMapper[
          NormalizerParams, 
          NormalizedUnitSpec, 
          GenericLayerSpec[NormalizedUnitSpec], 
          NormalizedUnitSpec, 
          scala.Nothing, 
          FieldName
        ] {
    
    def map(spec: TopLevel[NormalizedSpec], normParams: NormalizerParams): TopLevel[NormalizedSpec] = js.native
  }
}
