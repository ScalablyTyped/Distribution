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
import typings.vegaLite.srcPredicateMod.ParameterPredicate
import typings.vegaLite.srcSelectionMod.SelectionParameter
import typings.vegaLite.srcSelectionMod.SelectionType
import typings.vegaLite.srcSelectionMod.TopLevelSelectionParameter
import typings.vegaLite.utilMod.Dict
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object normalizeBaseMod {
  
  trait ExtraNormalizer[S /* <: GenericSpec[Any, Any, Any, FieldName] */, // Input type
  O /* <: NormalizedSpec */, // Output Type
  SN /* <: GenericSpec[Any, Any, Any, FieldName] */] extends StObject {
    
    def hasMatchingType(spec: GenericSpec[Any, Any, Any, Any], config: Config[ExprRef | SignalRef]): /* is S */ Boolean
    
    var name: String
    
    def run(spec: S, params: NormalizerParams, normalize: Normalize[SN, O]): O
  }
  object ExtraNormalizer {
    
    inline def apply[S /* <: GenericSpec[Any, Any, Any, FieldName] */, // Input type
    O /* <: NormalizedSpec */, // Output Type
    SN /* <: GenericSpec[Any, Any, Any, FieldName] */](
      hasMatchingType: (GenericSpec[Any, Any, Any, Any], Config[ExprRef | SignalRef]) => /* is S */ Boolean,
      name: String,
      run: (S, NormalizerParams, Normalize[SN, O]) => O
    ): ExtraNormalizer[S, O, SN] = {
      val __obj = js.Dynamic.literal(hasMatchingType = js.Any.fromFunction2(hasMatchingType), name = name.asInstanceOf[js.Any], run = js.Any.fromFunction3(run))
      __obj.asInstanceOf[ExtraNormalizer[S, O, SN]]
    }
    
    extension [Self <: ExtraNormalizer[?, ?, ?], S /* <: GenericSpec[Any, Any, Any, FieldName] */, // Input type
    O /* <: NormalizedSpec */, // Output Type
    SN /* <: GenericSpec[Any, Any, Any, FieldName] */](x: Self & (ExtraNormalizer[S, O, SN])) {
      
      inline def setHasMatchingType(value: (GenericSpec[Any, Any, Any, Any], Config[ExprRef | SignalRef]) => /* is S */ Boolean): Self = StObject.set(x, "hasMatchingType", js.Any.fromFunction2(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRun(value: (S, NormalizerParams, Normalize[SN, O]) => O): Self = StObject.set(x, "run", js.Any.fromFunction3(value))
    }
  }
  
  type NonFacetUnitNormalizer[S /* <: GenericUnitSpec[Any, Any, SelectionParameter[SelectionType]] */] = ExtraNormalizer[
    S, 
    NormalizedUnitSpec | NormalizedLayerSpec, 
    (GenericUnitSpec[Any, Any, SelectionParameter[SelectionType]]) | GenericLayerSpec[Any]
  ]
  
  type Normalize[S /* <: GenericSpec[Any, Any, Any, Any] */, NS /* <: NormalizedSpec */] = js.Function2[/* spec */ S, /* params */ NormalizerParams, NS]
  
  type NormalizeLayerOrUnit = Normalize[
    (GenericUnitSpec[Any, Any, SelectionParameter[SelectionType]]) | GenericLayerSpec[Any], 
    NormalizedUnitSpec | NormalizedLayerSpec
  ]
  
  trait NormalizerParams extends StObject {
    
    var config: Config[SignalRef]
    
    var emptySelections: js.UndefOr[Dict[Boolean]] = js.undefined
    
    var parentEncoding: js.UndefOr[Encoding[FieldName]] = js.undefined
    
    var parentProjection: js.UndefOr[Projection[ExprRef]] = js.undefined
    
    var path: js.UndefOr[js.Array[String]] = js.undefined
    
    var repeater: js.UndefOr[RepeaterValue] = js.undefined
    
    var repeaterPrefix: js.UndefOr[String] = js.undefined
    
    var selectionPredicates: js.UndefOr[Dict[js.Array[ParameterPredicate]]] = js.undefined
    
    var selections: js.UndefOr[js.Array[TopLevelSelectionParameter]] = js.undefined
  }
  object NormalizerParams {
    
    inline def apply(config: Config[SignalRef]): NormalizerParams = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
      __obj.asInstanceOf[NormalizerParams]
    }
    
    extension [Self <: NormalizerParams](x: Self) {
      
      inline def setConfig(value: Config[SignalRef]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setEmptySelections(value: Dict[Boolean]): Self = StObject.set(x, "emptySelections", value.asInstanceOf[js.Any])
      
      inline def setEmptySelectionsUndefined: Self = StObject.set(x, "emptySelections", js.undefined)
      
      inline def setParentEncoding(value: Encoding[FieldName]): Self = StObject.set(x, "parentEncoding", value.asInstanceOf[js.Any])
      
      inline def setParentEncodingUndefined: Self = StObject.set(x, "parentEncoding", js.undefined)
      
      inline def setParentProjection(value: Projection[ExprRef]): Self = StObject.set(x, "parentProjection", value.asInstanceOf[js.Any])
      
      inline def setParentProjectionUndefined: Self = StObject.set(x, "parentProjection", js.undefined)
      
      inline def setPath(value: js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setRepeater(value: RepeaterValue): Self = StObject.set(x, "repeater", value.asInstanceOf[js.Any])
      
      inline def setRepeaterPrefix(value: String): Self = StObject.set(x, "repeaterPrefix", value.asInstanceOf[js.Any])
      
      inline def setRepeaterPrefixUndefined: Self = StObject.set(x, "repeaterPrefix", js.undefined)
      
      inline def setRepeaterUndefined: Self = StObject.set(x, "repeater", js.undefined)
      
      inline def setSelectionPredicates(value: Dict[js.Array[ParameterPredicate]]): Self = StObject.set(x, "selectionPredicates", value.asInstanceOf[js.Any])
      
      inline def setSelectionPredicatesUndefined: Self = StObject.set(x, "selectionPredicates", js.undefined)
      
      inline def setSelections(value: js.Array[TopLevelSelectionParameter]): Self = StObject.set(x, "selections", value.asInstanceOf[js.Any])
      
      inline def setSelectionsUndefined: Self = StObject.set(x, "selections", js.undefined)
      
      inline def setSelectionsVarargs(value: TopLevelSelectionParameter*): Self = StObject.set(x, "selections", js.Array(value*))
    }
  }
}
