package typings.vegaLite

import typings.vegaLite.buildSrcChanneldefMod.Field
import typings.vegaLite.buildSrcCompositemarkMod.SharedCompositeEncoding
import typings.vegaLite.buildSrcExprMod.ExprRef
import typings.vegaLite.buildSrcProjectionMod.Projection
import typings.vegaLite.buildSrcSelectionMod.SelectionParameter
import typings.vegaLite.buildSrcSelectionMod.SelectionType
import typings.vegaLite.buildSrcSpecBaseMod.BaseSpec
import typings.vegaLite.buildSrcSpecBaseMod.FrameMixins
import typings.vegaLite.buildSrcSpecBaseMod.ResolveMixins
import typings.vegaLite.buildSrcSpecUnitMod.GenericUnitSpec
import typings.vegaLite.buildSrcSpecUnitMod.NormalizedUnitSpec
import typings.vegaLite.buildSrcSpecUnitMod.UnitSpec
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcSpecLayerMod {
  
  @JSImport("vega-lite/build/src/spec/layer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isLayerSpec(spec: BaseSpec): /* is vega-lite.vega-lite/build/src/spec/layer.GenericLayerSpec<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLayerSpec")(spec.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/spec/layer.GenericLayerSpec<any> */ Boolean]
  
  trait GenericLayerSpec[U /* <: GenericUnitSpec[Any, Any, SelectionParameter[SelectionType]] */]
    extends StObject
       with BaseSpec
       with FrameMixins[ExprRef | SignalRef]
       with ResolveMixins {
    
    /**
      * Layer or single view specifications to be layered.
      *
      * __Note__: Specifications inside `layer` cannot use `row` and `column` channels as layering facet specifications is not allowed. Instead, use the [facet operator](https://vega.github.io/vega-lite/docs/facet.html) and place a layer inside a facet.
      */
    var layer: js.Array[GenericLayerSpec[U] | U]
  }
  object GenericLayerSpec {
    
    inline def apply[U /* <: GenericUnitSpec[Any, Any, SelectionParameter[SelectionType]] */](layer: js.Array[GenericLayerSpec[U] | U]): GenericLayerSpec[U] = {
      val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenericLayerSpec[U]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GenericLayerSpec[?], U /* <: GenericUnitSpec[Any, Any, SelectionParameter[SelectionType]] */] (val x: Self & GenericLayerSpec[U]) extends AnyVal {
      
      inline def setLayer(value: js.Array[GenericLayerSpec[U] | U]): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
      
      inline def setLayerVarargs(value: (GenericLayerSpec[U] | U)*): Self = StObject.set(x, "layer", js.Array(value*))
    }
  }
  
  trait LayerSpec[F /* <: Field */]
    extends StObject
       with BaseSpec
       with FrameMixins[ExprRef | SignalRef]
       with ResolveMixins {
    
    /**
      * A shared key-value mapping between encoding channels and definition of fields in the underlying layers.
      */
    var encoding: js.UndefOr[SharedCompositeEncoding[F]] = js.undefined
    
    /**
      * Layer or single view specifications to be layered.
      *
      * __Note__: Specifications inside `layer` cannot use `row` and `column` channels as layering facet specifications is not allowed. Instead, use the [facet operator](https://vega.github.io/vega-lite/docs/facet.html) and place a layer inside a facet.
      */
    var layer: js.Array[LayerSpec[F] | UnitSpec[F]]
    
    /**
      * An object defining properties of the geographic projection shared by underlying layers.
      */
    var projection: js.UndefOr[Projection[ExprRef]] = js.undefined
  }
  object LayerSpec {
    
    inline def apply[F /* <: Field */](layer: js.Array[LayerSpec[F] | UnitSpec[F]]): LayerSpec[F] = {
      val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any])
      __obj.asInstanceOf[LayerSpec[F]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LayerSpec[?], F /* <: Field */] (val x: Self & LayerSpec[F]) extends AnyVal {
      
      inline def setEncoding(value: SharedCompositeEncoding[F]): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setLayer(value: js.Array[LayerSpec[F] | UnitSpec[F]]): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
      
      inline def setLayerVarargs(value: (LayerSpec[F] | UnitSpec[F])*): Self = StObject.set(x, "layer", js.Array(value*))
      
      inline def setProjection(value: Projection[ExprRef]): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    }
  }
  
  type NormalizedLayerSpec = GenericLayerSpec[NormalizedUnitSpec]
}
