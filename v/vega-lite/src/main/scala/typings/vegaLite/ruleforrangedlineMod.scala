package typings.vegaLite

import typings.vegaLite.channeldefMod.Field
import typings.vegaLite.channeldefMod.Position2Def
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
import typings.vegaLite.vegaLiteStrings.line
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ruleforrangedlineMod {
  
  @JSImport("vega-lite/build/src/normalize/ruleforrangedline", "RuleForRangedLineNormalizer")
  @js.native
  class RuleForRangedLineNormalizer ()
    extends StObject
       with ExtraNormalizer[
          RangedLineSpec, 
          NormalizedUnitSpec | NormalizedLayerSpec, 
          (GenericUnitSpec[js.Any, js.Any]) | GenericLayerSpec[js.Any]
        ] {
    
    def hasMatchingType(spec: GenericSpec[js.Any, js.Any, js.Any, js.Any]): /* is vega-lite.vega-lite/build/src/normalize/ruleforrangedline.RangedLineSpec */ Boolean = js.native
    /* CompleteClass */
    override def hasMatchingType(spec: GenericSpec[js.Any, js.Any, js.Any, js.Any], config: Config[ExprRef | SignalRef]): /* is S */ Boolean = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    override def run(
      spec: RangedLineSpec,
      params: NormalizerParams,
      normalize: Normalize[
          (GenericUnitSpec[js.Any, js.Any]) | GenericLayerSpec[js.Any], 
          NormalizedUnitSpec | NormalizedLayerSpec
        ]
    ): NormalizedUnitSpec | NormalizedLayerSpec = js.native
  }
  
  trait EncodingX2Mixins extends StObject {
    
    var x2: js.UndefOr[Position2Def[Field]] = js.undefined
  }
  object EncodingX2Mixins {
    
    inline def apply(): EncodingX2Mixins = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EncodingX2Mixins]
    }
    
    extension [Self <: EncodingX2Mixins](x: Self) {
      
      inline def setX2(value: Position2Def[Field]): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
      
      inline def setX2Undefined: Self = StObject.set(x, "x2", js.undefined)
    }
  }
  
  trait EncodingY2Mixins extends StObject {
    
    var y2: js.UndefOr[Position2Def[Field]] = js.undefined
  }
  object EncodingY2Mixins {
    
    inline def apply(): EncodingY2Mixins = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EncodingY2Mixins]
    }
    
    extension [Self <: EncodingY2Mixins](x: Self) {
      
      inline def setY2(value: Position2Def[Field]): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
      
      inline def setY2Undefined: Self = StObject.set(x, "y2", js.undefined)
    }
  }
  
  type RangedLineSpec = GenericUnitSpec[Encoding[Field] & (EncodingX2Mixins | EncodingY2Mixins), line]
}
