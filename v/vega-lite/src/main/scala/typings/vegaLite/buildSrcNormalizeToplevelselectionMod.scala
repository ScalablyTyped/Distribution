package typings.vegaLite

import typings.vegaLite.buildSrcChanneldefMod.FieldName
import typings.vegaLite.buildSrcNormalizeBaseMod.NormalizerParams
import typings.vegaLite.buildSrcSpecLayerMod.GenericLayerSpec
import typings.vegaLite.buildSrcSpecMapMod.SpecMapper
import typings.vegaLite.buildSrcSpecMod.NormalizedSpec
import typings.vegaLite.buildSrcSpecToplevelMod.TopLevel
import typings.vegaLite.buildSrcSpecUnitMod.NormalizedUnitSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcNormalizeToplevelselectionMod {
  
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
