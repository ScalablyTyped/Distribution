package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsLayers.distEngineTopologyMod.Layer
import typings.tensorflowTfjsLayers.distEngineTopologyMod.LayerArgs
import typings.tensorflowTfjsLayers.distKerasFormatCommonMod.DataFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLayersPaddingMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/padding", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/padding", "ZeroPadding2D")
  @js.native
  open class ZeroPadding2D () extends Layer {
    def this(args: ZeroPadding2DLayerArgs) = this()
    
    val dataFormat: DataFormat = js.native
    
    val padding: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]] = js.native
  }
  /* static members */
  object ZeroPadding2D {
    
    @JSImport("@tensorflow/tfjs-layers/dist/layers/padding", "ZeroPadding2D")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/layers/padding", "ZeroPadding2D.className")
    @js.native
    def className: String = js.native
    inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  inline def spatial2dPadding(x: Tensor[Rank]): Tensor[Rank] = ^.asInstanceOf[js.Dynamic].applyDynamic("spatial2dPadding")(x.asInstanceOf[js.Any]).asInstanceOf[Tensor[Rank]]
  inline def spatial2dPadding(x: Tensor[Rank], padding: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("spatial2dPadding")(x.asInstanceOf[js.Any], padding.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def spatial2dPadding(
    x: Tensor[Rank],
    padding: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]],
    dataFormat: DataFormat
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("spatial2dPadding")(x.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def spatial2dPadding(x: Tensor[Rank], padding: Unit, dataFormat: DataFormat): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("spatial2dPadding")(x.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  
  inline def temporalPadding(x: Tensor[Rank]): Tensor[Rank] = ^.asInstanceOf[js.Dynamic].applyDynamic("temporalPadding")(x.asInstanceOf[js.Any]).asInstanceOf[Tensor[Rank]]
  inline def temporalPadding(x: Tensor[Rank], padding: js.Tuple2[Double, Double]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("temporalPadding")(x.asInstanceOf[js.Any], padding.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  
  trait ZeroPadding2DLayerArgs
    extends StObject
       with LayerArgs {
    
    /**
      * One of `'channelsLast'` (default) and `'channelsFirst'`.
      *
      * The ordering of the dimensions in the inputs.
      * `channelsLast` corresponds to inputs with shape
      * `[batch, height, width, channels]` while `channelsFirst`
      * corresponds to inputs with shape
      * `[batch, channels, height, width]`.
      */
    var dataFormat: js.UndefOr[DataFormat] = js.undefined
    
    /**
      * Integer, or `Array` of 2 integers, or `Array` of 2 `Array`s, each of
      * which is an `Array` of 2 integers.
      * - If integer, the same symmetric padding is applied to width and height.
      * - If `Array` of 2 integers, interpreted as two different symmetric values
      *   for height and width:
      *   `[symmetricHeightPad, symmetricWidthPad]`.
      * - If `Array` of 2 `Array`s, interpreted as:
      *   `[[topPad, bottomPad], [leftPad, rightPad]]`.
      */
    var padding: js.UndefOr[
        Double | (js.Tuple2[Double | (js.Tuple2[Double, Double]), Double | (js.Tuple2[Double, Double])])
      ] = js.undefined
  }
  object ZeroPadding2DLayerArgs {
    
    inline def apply(): ZeroPadding2DLayerArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ZeroPadding2DLayerArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ZeroPadding2DLayerArgs] (val x: Self) extends AnyVal {
      
      inline def setDataFormat(value: DataFormat): Self = StObject.set(x, "dataFormat", value.asInstanceOf[js.Any])
      
      inline def setDataFormatUndefined: Self = StObject.set(x, "dataFormat", js.undefined)
      
      inline def setPadding(
        value: Double | (js.Tuple2[Double | (js.Tuple2[Double, Double]), Double | (js.Tuple2[Double, Double])])
      ): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    }
  }
}
