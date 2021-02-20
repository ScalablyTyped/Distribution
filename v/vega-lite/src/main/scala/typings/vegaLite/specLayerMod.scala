package typings.vegaLite

import typings.vegaLite.channeldefMod.Field
import typings.vegaLite.compositemarkMod.SharedCompositeEncoding
import typings.vegaLite.exprMod.ExprRef
import typings.vegaLite.projectionMod.Projection
import typings.vegaLite.specBaseMod.BaseSpec
import typings.vegaLite.specBaseMod.FrameMixins
import typings.vegaLite.specBaseMod.ResolveMixins
import typings.vegaLite.specUnitMod.GenericUnitSpec
import typings.vegaLite.specUnitMod.NormalizedUnitSpec
import typings.vegaLite.specUnitMod.UnitSpec
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object specLayerMod {
  
  @JSImport("vega-lite/build/src/spec/layer", "isLayerSpec")
  @js.native
  def isLayerSpec(spec: BaseSpec): /* is vega-lite.vega-lite/build/src/spec/layer.GenericLayerSpec<any> */ Boolean = js.native
  
  @js.native
  trait GenericLayerSpec[U /* <: GenericUnitSpec[_, _] */]
    extends FrameMixins[ExprRef | SignalRef]
       with BaseSpec
       with ResolveMixins {
    
    /**
      * Layer or single view specifications to be layered.
      *
      * __Note__: Specifications inside `layer` cannot use `row` and `column` channels as layering facet specifications is not allowed. Instead, use the [facet operator](https://vega.github.io/vega-lite/docs/facet.html) and place a layer inside a facet.
      */
    var layer: js.Array[GenericLayerSpec[U] | U] = js.native
  }
  object GenericLayerSpec {
    
    @scala.inline
    def apply[U /* <: GenericUnitSpec[_, _] */](layer: js.Array[GenericLayerSpec[U] | U]): GenericLayerSpec[U] = {
      val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenericLayerSpec[U]]
    }
    
    @scala.inline
    implicit class GenericLayerSpecMutableBuilder[Self <: GenericLayerSpec[_], U /* <: GenericUnitSpec[_, _] */] (val x: Self with GenericLayerSpec[U]) extends AnyVal {
      
      @scala.inline
      def setLayer(value: js.Array[GenericLayerSpec[U] | U]): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayerVarargs(value: (GenericLayerSpec[U] | U)*): Self = StObject.set(x, "layer", js.Array(value :_*))
    }
  }
  
  @js.native
  trait LayerSpec
    extends FrameMixins[ExprRef | SignalRef]
       with BaseSpec
       with ResolveMixins {
    
    /**
      * A shared key-value mapping between encoding channels and definition of fields in the underlying layers.
      */
    var encoding: js.UndefOr[SharedCompositeEncoding[Field]] = js.native
    
    /**
      * Layer or single view specifications to be layered.
      *
      * __Note__: Specifications inside `layer` cannot use `row` and `column` channels as layering facet specifications is not allowed. Instead, use the [facet operator](https://vega.github.io/vega-lite/docs/facet.html) and place a layer inside a facet.
      */
    var layer: js.Array[LayerSpec | UnitSpec] = js.native
    
    /**
      * An object defining properties of the geographic projection shared by underlying layers.
      */
    var projection: js.UndefOr[Projection] = js.native
  }
  object LayerSpec {
    
    @scala.inline
    def apply(layer: js.Array[LayerSpec | UnitSpec]): LayerSpec = {
      val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any])
      __obj.asInstanceOf[LayerSpec]
    }
    
    @scala.inline
    implicit class LayerSpecMutableBuilder[Self <: LayerSpec] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: SharedCompositeEncoding[Field]): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setLayer(value: js.Array[LayerSpec | UnitSpec]): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayerVarargs(value: (LayerSpec | UnitSpec)*): Self = StObject.set(x, "layer", js.Array(value :_*))
      
      @scala.inline
      def setProjection(value: Projection): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    }
  }
  
  type NormalizedLayerSpec = GenericLayerSpec[NormalizedUnitSpec]
}
