package typings.vegaLite

import typings.vegaLite.channeldefMod.Field
import typings.vegaLite.channeldefMod.Position2Def
import typings.vegaLite.encodingMod.Encoding
import typings.vegaLite.normalizeBaseMod.ExtraNormalizer
import typings.vegaLite.specLayerMod.GenericLayerSpec
import typings.vegaLite.specLayerMod.NormalizedLayerSpec
import typings.vegaLite.specMod.GenericSpec
import typings.vegaLite.specUnitMod.GenericUnitSpec
import typings.vegaLite.specUnitMod.NormalizedUnitSpec
import typings.vegaLite.vegaLiteStrings.line
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ruleforrangedlineMod {
  
  @JSImport("vega-lite/build/src/normalize/ruleforrangedline", "RuleForRangedLineNormalizer")
  @js.native
  class RuleForRangedLineNormalizer ()
    extends ExtraNormalizer[
          RangedLineSpec, 
          NormalizedUnitSpec | NormalizedLayerSpec, 
          (GenericUnitSpec[js.Any, js.Any]) | GenericLayerSpec[js.Any]
        ] {
    
    def hasMatchingType(spec: GenericSpec[_, _, _, _]): /* is vega-lite.vega-lite/build/src/normalize/ruleforrangedline.RangedLineSpec */ Boolean = js.native
  }
  
  @js.native
  trait EncodingX2Mixins extends StObject {
    
    var x2: js.UndefOr[Position2Def[Field]] = js.native
  }
  object EncodingX2Mixins {
    
    @scala.inline
    def apply(): EncodingX2Mixins = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EncodingX2Mixins]
    }
    
    @scala.inline
    implicit class EncodingX2MixinsMutableBuilder[Self <: EncodingX2Mixins] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX2(value: Position2Def[Field]): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX2Undefined: Self = StObject.set(x, "x2", js.undefined)
    }
  }
  
  @js.native
  trait EncodingY2Mixins extends StObject {
    
    var y2: js.UndefOr[Position2Def[Field]] = js.native
  }
  object EncodingY2Mixins {
    
    @scala.inline
    def apply(): EncodingY2Mixins = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EncodingY2Mixins]
    }
    
    @scala.inline
    implicit class EncodingY2MixinsMutableBuilder[Self <: EncodingY2Mixins] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setY2(value: Position2Def[Field]): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY2Undefined: Self = StObject.set(x, "y2", js.undefined)
    }
  }
  
  type RangedLineSpec = GenericUnitSpec[Encoding[Field] with (EncodingX2Mixins | EncodingY2Mixins), line]
}
