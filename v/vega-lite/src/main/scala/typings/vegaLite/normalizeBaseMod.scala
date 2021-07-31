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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object normalizeBaseMod {
  
  trait ExtraNormalizer[S /* <: GenericSpec[js.Any, js.Any, js.Any, FieldName] */, // Input type
  O /* <: NormalizedSpec */, // Output Type
  SN /* <: GenericSpec[js.Any, js.Any, js.Any, FieldName] */] extends StObject {
    
    def hasMatchingType(spec: GenericSpec[js.Any, js.Any, js.Any, js.Any], config: Config[ExprRef | SignalRef]): /* is S */ Boolean
    
    var name: String
    
    def run(spec: S, params: NormalizerParams, normalize: Normalize[SN, O]): O
  }
  object ExtraNormalizer {
    
    @scala.inline
    def apply[S /* <: GenericSpec[js.Any, js.Any, js.Any, FieldName] */, // Input type
    O /* <: NormalizedSpec */, // Output Type
    SN /* <: GenericSpec[js.Any, js.Any, js.Any, FieldName] */](
      hasMatchingType: (GenericSpec[js.Any, js.Any, js.Any, js.Any], Config[ExprRef | SignalRef]) => /* is S */ Boolean,
      name: String,
      run: (S, NormalizerParams, Normalize[SN, O]) => O
    ): ExtraNormalizer[S, O, SN] = {
      val __obj = js.Dynamic.literal(hasMatchingType = js.Any.fromFunction2(hasMatchingType), name = name.asInstanceOf[js.Any], run = js.Any.fromFunction3(run))
      __obj.asInstanceOf[ExtraNormalizer[S, O, SN]]
    }
    
    @scala.inline
    implicit class ExtraNormalizerMutableBuilder[Self <: ExtraNormalizer[?, ?, ?], S /* <: GenericSpec[js.Any, js.Any, js.Any, FieldName] */, // Input type
    O /* <: NormalizedSpec */, // Output Type
    SN /* <: GenericSpec[js.Any, js.Any, js.Any, FieldName] */] (val x: Self & (ExtraNormalizer[S, O, SN])) extends AnyVal {
      
      @scala.inline
      def setHasMatchingType(
        value: (GenericSpec[js.Any, js.Any, js.Any, js.Any], Config[ExprRef | SignalRef]) => /* is S */ Boolean
      ): Self = StObject.set(x, "hasMatchingType", js.Any.fromFunction2(value))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRun(value: (S, NormalizerParams, Normalize[SN, O]) => O): Self = StObject.set(x, "run", js.Any.fromFunction3(value))
    }
  }
  
  type NonFacetUnitNormalizer[S /* <: GenericUnitSpec[js.Any, js.Any] */] = ExtraNormalizer[
    S, 
    NormalizedUnitSpec | NormalizedLayerSpec, 
    (GenericUnitSpec[js.Any, js.Any]) | GenericLayerSpec[js.Any]
  ]
  
  type Normalize[S /* <: GenericSpec[js.Any, js.Any, js.Any, js.Any] */, NS /* <: NormalizedSpec */] = js.Function2[/* spec */ S, /* params */ NormalizerParams, NS]
  
  type NormalizeLayerOrUnit = Normalize[
    (GenericUnitSpec[js.Any, js.Any]) | GenericLayerSpec[js.Any], 
    NormalizedUnitSpec | NormalizedLayerSpec
  ]
  
  trait NormalizerParams extends StObject {
    
    var config: Config[SignalRef]
    
    var parentEncoding: js.UndefOr[Encoding[FieldName]] = js.undefined
    
    var parentProjection: js.UndefOr[Projection] = js.undefined
    
    var repeater: js.UndefOr[RepeaterValue] = js.undefined
    
    var repeaterPrefix: js.UndefOr[String] = js.undefined
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
