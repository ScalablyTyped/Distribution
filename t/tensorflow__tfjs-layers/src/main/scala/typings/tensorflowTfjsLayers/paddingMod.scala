package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.DataFormat
import typings.tensorflowTfjsLayers.topologyMod.Layer
import typings.tensorflowTfjsLayers.topologyMod.LayerArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paddingMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/padding", "ZeroPadding2D")
  @js.native
  class ZeroPadding2D () extends Layer {
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
    @scala.inline
    def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/padding", "spatial2dPadding")
  @js.native
  def spatial2dPadding(x: Tensor[Rank]): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/padding", "spatial2dPadding")
  @js.native
  def spatial2dPadding(x: Tensor[Rank], padding: js.UndefOr[scala.Nothing], dataFormat: DataFormat): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/padding", "spatial2dPadding")
  @js.native
  def spatial2dPadding(x: Tensor[Rank], padding: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/padding", "spatial2dPadding")
  @js.native
  def spatial2dPadding(
    x: Tensor[Rank],
    padding: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]],
    dataFormat: DataFormat
  ): Tensor[Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/padding", "temporalPadding")
  @js.native
  def temporalPadding(x: Tensor[Rank]): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/padding", "temporalPadding")
  @js.native
  def temporalPadding(x: Tensor[Rank], padding: js.Tuple2[Double, Double]): Tensor[Rank] = js.native
  
  @js.native
  trait ZeroPadding2DLayerArgs extends LayerArgs {
    
    /**
      * One of `'channelsLast'` (default) and `'channelsFirst'`.
      *
      * The ordering of the dimensions in the inputs.
      * `channelsLast` corresponds to inputs with shape
      * `[batch, height, width, channels]` while `channelsFirst`
      * corresponds to inputs with shape
      * `[batch, channels, height, width]`.
      */
    var dataFormat: js.UndefOr[DataFormat] = js.native
    
    /**
      * Integer, or `Array` of 2 integers, or `Array` of 2 `Array`s, each of
      * which is an `Array` of 2 integers.
      * - If integer, the same symmetric padding is applied to width and height.
      * - If Array` of 2 integers, interpreted as two different symmetric values
      *   for height and width:
      *   `[symmetricHeightPad, symmetricWidthPad]`.
      * - If `Array` of 2 `Array`s, interpreted as:
      *   `[[topPad, bottomPad], [leftPad, rightPad]]`.
      */
    var padding: js.UndefOr[
        Double | (js.Tuple2[Double | (js.Tuple2[Double, Double]), Double | (js.Tuple2[Double, Double])])
      ] = js.native
  }
  object ZeroPadding2DLayerArgs {
    
    @scala.inline
    def apply(): ZeroPadding2DLayerArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ZeroPadding2DLayerArgs]
    }
    
    @scala.inline
    implicit class ZeroPadding2DLayerArgsMutableBuilder[Self <: ZeroPadding2DLayerArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataFormat(value: DataFormat): Self = StObject.set(x, "dataFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataFormatUndefined: Self = StObject.set(x, "dataFormat", js.undefined)
      
      @scala.inline
      def setPadding(
        value: Double | (js.Tuple2[Double | (js.Tuple2[Double, Double]), Double | (js.Tuple2[Double, Double])])
      ): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    }
  }
}
