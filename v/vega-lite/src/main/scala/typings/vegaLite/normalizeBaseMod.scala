package typings.vegaLite

import typings.vegaLite.channeldefMod.FieldName
import typings.vegaLite.encodingMod.Encoding
import typings.vegaLite.exprMod.ExprRef
import typings.vegaLite.projectionMod.Projection
import typings.vegaLite.repeaterMod.RepeaterValue
import typings.vegaLite.specLayerMod.GenericLayerSpec
import typings.vegaLite.specLayerMod.NormalizedLayerSpec
import typings.vegaLite.specMod.GenericSpec
import typings.vegaLite.specMod.NormalizedSpec
import typings.vegaLite.specUnitMod.GenericUnitSpec
import typings.vegaLite.specUnitMod.NormalizedUnitSpec
import typings.vegaLite.srcConfigMod.Config
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object normalizeBaseMod {
  
  @js.native
  trait ExtraNormalizer[S /* <: GenericSpec[_, _, _, FieldName] */, // Input type
  O /* <: NormalizedSpec */, // Output Type
  SN /* <: GenericSpec[_, _, _, FieldName] */] extends StObject {
    
    def hasMatchingType(spec: GenericSpec[_, _, _, _], config: Config[ExprRef | SignalRef]): /* is S */ Boolean = js.native
    
    var name: String = js.native
    
    def run(spec: S, params: NormalizerParams, normalize: Normalize[SN, O]): O = js.native
  }
  object ExtraNormalizer {
    
    @scala.inline
    def apply[S /* <: GenericSpec[_, _, _, FieldName] */, // Input type
    O /* <: NormalizedSpec */, // Output Type
    SN /* <: GenericSpec[_, _, _, FieldName] */](
      hasMatchingType: (GenericSpec[_, _, _, _], Config[ExprRef | SignalRef]) => /* is S */ Boolean,
      name: String,
      run: (S, NormalizerParams, Normalize[SN, O]) => O
    ): ExtraNormalizer[S, O, SN] = {
      val __obj = js.Dynamic.literal(hasMatchingType = js.Any.fromFunction2(hasMatchingType), name = name.asInstanceOf[js.Any], run = js.Any.fromFunction3(run))
      __obj.asInstanceOf[ExtraNormalizer[S, O, SN]]
    }
    
    @scala.inline
    implicit class ExtraNormalizerMutableBuilder[Self <: ExtraNormalizer[_, _, _], S /* <: GenericSpec[_, _, _, FieldName] */, // Input type
    O /* <: NormalizedSpec */, // Output Type
    SN /* <: GenericSpec[_, _, _, FieldName] */] (val x: Self with (ExtraNormalizer[S, O, SN])) extends AnyVal {
      
      @scala.inline
      def setHasMatchingType(value: (GenericSpec[_, _, _, _], Config[ExprRef | SignalRef]) => /* is S */ Boolean): Self = StObject.set(x, "hasMatchingType", js.Any.fromFunction2(value))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRun(value: (S, NormalizerParams, Normalize[SN, O]) => O): Self = StObject.set(x, "run", js.Any.fromFunction3(value))
    }
  }
  
  type NonFacetUnitNormalizer[S /* <: GenericUnitSpec[_, _] */] = ExtraNormalizer[
    S, 
    NormalizedUnitSpec | NormalizedLayerSpec, 
    (GenericUnitSpec[js.Any, js.Any]) | GenericLayerSpec[js.Any]
  ]
  
  type Normalize[S /* <: GenericSpec[_, _, _, _] */, NS /* <: NormalizedSpec */] = js.Function2[/* spec */ S, /* params */ NormalizerParams, NS]
  
  type NormalizeLayerOrUnit = Normalize[
    (GenericUnitSpec[js.Any, js.Any]) | GenericLayerSpec[js.Any], 
    NormalizedUnitSpec | NormalizedLayerSpec
  ]
  
  @js.native
  trait NormalizerParams extends StObject {
    
    var config: Config[SignalRef] = js.native
    
    var parentEncoding: js.UndefOr[Encoding[FieldName]] = js.native
    
    var parentProjection: js.UndefOr[Projection] = js.native
    
    var repeater: js.UndefOr[RepeaterValue] = js.native
    
    var repeaterPrefix: js.UndefOr[String] = js.native
  }
  object NormalizerParams {
    
    @scala.inline
    def apply(config: Config[SignalRef]): NormalizerParams = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
      __obj.asInstanceOf[NormalizerParams]
    }
    
    @scala.inline
    implicit class NormalizerParamsMutableBuilder[Self <: NormalizerParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfig(value: Config[SignalRef]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentEncoding(value: Encoding[FieldName]): Self = StObject.set(x, "parentEncoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentEncodingUndefined: Self = StObject.set(x, "parentEncoding", js.undefined)
      
      @scala.inline
      def setParentProjection(value: Projection): Self = StObject.set(x, "parentProjection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentProjectionUndefined: Self = StObject.set(x, "parentProjection", js.undefined)
      
      @scala.inline
      def setRepeater(value: RepeaterValue): Self = StObject.set(x, "repeater", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepeaterPrefix(value: String): Self = StObject.set(x, "repeaterPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepeaterPrefixUndefined: Self = StObject.set(x, "repeaterPrefix", js.undefined)
      
      @scala.inline
      def setRepeaterUndefined: Self = StObject.set(x, "repeater", js.undefined)
    }
  }
}
