package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTensorMod.Tensor5D
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.DataFormat
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.PaddingMode
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.PoolMode
import typings.tensorflowTfjsLayers.topologyMod.Layer
import typings.tensorflowTfjsLayers.topologyMod.LayerArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object poolingMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/pooling", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/pooling", "AveragePooling1D")
  @js.native
  class AveragePooling1D protected () extends Pooling1D {
    def this(args: Pooling1DLayerArgs) = this()
  }
  /* static members */
  object AveragePooling1D {
    
    @JSImport("@tensorflow/tfjs-layers/dist/layers/pooling", "AveragePooling1D")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/layers/pooling", "AveragePooling1D.className")
    @js.native
    def className: String = js.native
    @scala.inline
    def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/pooling", "AveragePooling2D")
  @js.native
  class AveragePooling2D protected () extends Pooling2D {
    def this(args: Pooling2DLayerArgs) = this()
  }
  /* static members */
  object AveragePooling2D {
    
    @JSImport("@tensorflow/tfjs-layers/dist/layers/pooling", "AveragePooling2D")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/layers/pooling", "AveragePooling2D.className")
    @js.native
    def className: String = js.native
    @scala.inline
    def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/pooling", "AveragePooling3D")
  @js.native
  class AveragePooling3D protected () extends Pooling3D {
    def this(args: Pooling3DLayerArgs) = this()
  }
  /* static members */
  object AveragePooling3D {
    
    @JSImport("@tensorflow/tfjs-layers/dist/layers/pooling", "AveragePooling3D")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/layers/pooling", "AveragePooling3D.className")
    @js.native
    def className: String = js.native
    @scala.inline
    def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/pooling", "GlobalAveragePooling1D")
  @js.native
  class GlobalAveragePooling1D () extends GlobalPooling1D {
    def this(args: LayerArgs) = this()
  }
  /* static members */
  object GlobalAveragePooling1D {
    
    @JSImport("@tensorflow/tfjs-layers/dist/layers/pooling", "GlobalAveragePooling1D")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/layers/pooling", "GlobalAveragePooling1D.className")
    @js.native
    def className: String = js.native
    @scala.inline
    def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/pooling", "GlobalAveragePooling2D")
  @js.native
  class GlobalAveragePooling2D protected () extends GlobalPooling2D {
    def this(args: GlobalPooling2DLayerArgs) = this()
  }
  /* static members */
  object GlobalAveragePooling2D {
    
    @JSImport("@tensorflow/tfjs-layers/dist/layers/pooling", "GlobalAveragePooling2D")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/layers/pooling", "GlobalAveragePooling2D.className")
    @js.native
    def className: String = js.native
    @scala.inline
    def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/pooling", "GlobalMaxPooling1D")
  @js.native
  class GlobalMaxPooling1D protected () extends GlobalPooling1D {
    def this(args: LayerArgs) = this()
  }
  /* static members */
  object GlobalMaxPooling1D {
    
    @JSImport("@tensorflow/tfjs-layers/dist/layers/pooling", "GlobalMaxPooling1D")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/layers/pooling", "GlobalMaxPooling1D.className")
    @js.native
    def className: String = js.native
    @scala.inline
    def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/pooling", "GlobalMaxPooling2D")
  @js.native
  class GlobalMaxPooling2D protected () extends GlobalPooling2D {
    def this(args: GlobalPooling2DLayerArgs) = this()
  }
  /* static members */
  object GlobalMaxPooling2D {
    
    @JSImport("@tensorflow/tfjs-layers/dist/layers/pooling", "GlobalMaxPooling2D")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/layers/pooling", "GlobalMaxPooling2D.className")
    @js.native
    def className: String = js.native
    @scala.inline
    def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/pooling", "GlobalPooling1D")
  @js.native
  abstract class GlobalPooling1D protected () extends Layer {
    def this(args: LayerArgs) = this()
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/pooling", "GlobalPooling2D")
  @js.native
  abstract class GlobalPooling2D protected () extends Layer {
    def this(args: GlobalPooling2DLayerArgs) = this()
    
    var dataFormat: DataFormat = js.native
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/pooling", "MaxPooling1D")
  @js.native
  class MaxPooling1D protected () extends Pooling1D {
    def this(args: Pooling1DLayerArgs) = this()
  }
  /* static members */
  object MaxPooling1D {
    
    @JSImport("@tensorflow/tfjs-layers/dist/layers/pooling", "MaxPooling1D")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/layers/pooling", "MaxPooling1D.className")
    @js.native
    def className: String = js.native
    @scala.inline
    def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/pooling", "MaxPooling2D")
  @js.native
  class MaxPooling2D protected () extends Pooling2D {
    def this(args: Pooling2DLayerArgs) = this()
  }
  /* static members */
  object MaxPooling2D {
    
    @JSImport("@tensorflow/tfjs-layers/dist/layers/pooling", "MaxPooling2D")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/layers/pooling", "MaxPooling2D.className")
    @js.native
    def className: String = js.native
    @scala.inline
    def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/pooling", "MaxPooling3D")
  @js.native
  class MaxPooling3D protected () extends Pooling3D {
    def this(args: Pooling3DLayerArgs) = this()
  }
  /* static members */
  object MaxPooling3D {
    
    @JSImport("@tensorflow/tfjs-layers/dist/layers/pooling", "MaxPooling3D")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/layers/pooling", "MaxPooling3D.className")
    @js.native
    def className: String = js.native
    @scala.inline
    def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/pooling", "Pooling1D")
  @js.native
  abstract class Pooling1D protected () extends Layer {
    /**
      *
      * @param args Parameters for the Pooling layer.
      *
      * config.poolSize defaults to 2.
      */
    def this(args: Pooling1DLayerArgs) = this()
    
    val padding: PaddingMode = js.native
    
    val poolSize: js.Array[Double] = js.native
    
    /* protected */ def poolingFunction(
      inputs: Tensor[Rank],
      poolSize: js.Tuple2[Double, Double],
      strides: js.Tuple2[Double, Double],
      padding: PaddingMode,
      dataFormat: DataFormat
    ): Tensor[Rank] = js.native
    
    val strides: js.Array[Double] = js.native
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/pooling", "Pooling2D")
  @js.native
  abstract class Pooling2D protected () extends Layer {
    def this(args: Pooling2DLayerArgs) = this()
    
    val dataFormat: DataFormat = js.native
    
    val padding: PaddingMode = js.native
    
    val poolSize: js.Tuple2[Double, Double] = js.native
    
    /* protected */ def poolingFunction(
      inputs: Tensor[Rank],
      poolSize: js.Tuple2[Double, Double],
      strides: js.Tuple2[Double, Double],
      padding: PaddingMode,
      dataFormat: DataFormat
    ): Tensor[Rank] = js.native
    
    val strides: js.Tuple2[Double, Double] = js.native
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/pooling", "Pooling3D")
  @js.native
  abstract class Pooling3D protected () extends Layer {
    def this(args: Pooling3DLayerArgs) = this()
    
    val dataFormat: DataFormat = js.native
    
    val padding: PaddingMode = js.native
    
    val poolSize: js.Tuple3[Double, Double, Double] = js.native
    
    /* protected */ def poolingFunction(
      inputs: Tensor[Rank],
      poolSize: js.Tuple3[Double, Double, Double],
      strides: js.Tuple3[Double, Double, Double],
      padding: PaddingMode,
      dataFormat: DataFormat
    ): Tensor[Rank] = js.native
    
    val strides: js.Tuple3[Double, Double, Double] = js.native
  }
  
  @scala.inline
  def pool2d(x: Tensor[Rank], poolSize: js.Tuple2[Double, Double]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("pool2d")(x.asInstanceOf[js.Any], poolSize.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  @scala.inline
  def pool2d(x: Tensor[Rank], poolSize: js.Tuple2[Double, Double], strides: js.Tuple2[Double, Double]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("pool2d")(x.asInstanceOf[js.Any], poolSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  @scala.inline
  def pool2d(
    x: Tensor[Rank],
    poolSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    padding: Unit,
    dataFormat: Unit,
    poolMode: PoolMode
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("pool2d")(x.asInstanceOf[js.Any], poolSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], poolMode.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  @scala.inline
  def pool2d(
    x: Tensor[Rank],
    poolSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    padding: Unit,
    dataFormat: DataFormat
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("pool2d")(x.asInstanceOf[js.Any], poolSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  @scala.inline
  def pool2d(
    x: Tensor[Rank],
    poolSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    padding: Unit,
    dataFormat: DataFormat,
    poolMode: PoolMode
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("pool2d")(x.asInstanceOf[js.Any], poolSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], poolMode.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  @scala.inline
  def pool2d(
    x: Tensor[Rank],
    poolSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    padding: PaddingMode
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("pool2d")(x.asInstanceOf[js.Any], poolSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  @scala.inline
  def pool2d(
    x: Tensor[Rank],
    poolSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    padding: PaddingMode,
    dataFormat: Unit,
    poolMode: PoolMode
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("pool2d")(x.asInstanceOf[js.Any], poolSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], poolMode.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  @scala.inline
  def pool2d(
    x: Tensor[Rank],
    poolSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    padding: PaddingMode,
    dataFormat: DataFormat
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("pool2d")(x.asInstanceOf[js.Any], poolSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  @scala.inline
  def pool2d(
    x: Tensor[Rank],
    poolSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    padding: PaddingMode,
    dataFormat: DataFormat,
    poolMode: PoolMode
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("pool2d")(x.asInstanceOf[js.Any], poolSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], poolMode.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  @scala.inline
  def pool2d(
    x: Tensor[Rank],
    poolSize: js.Tuple2[Double, Double],
    strides: Unit,
    padding: Unit,
    dataFormat: Unit,
    poolMode: PoolMode
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("pool2d")(x.asInstanceOf[js.Any], poolSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], poolMode.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  @scala.inline
  def pool2d(
    x: Tensor[Rank],
    poolSize: js.Tuple2[Double, Double],
    strides: Unit,
    padding: Unit,
    dataFormat: DataFormat
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("pool2d")(x.asInstanceOf[js.Any], poolSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  @scala.inline
  def pool2d(
    x: Tensor[Rank],
    poolSize: js.Tuple2[Double, Double],
    strides: Unit,
    padding: Unit,
    dataFormat: DataFormat,
    poolMode: PoolMode
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("pool2d")(x.asInstanceOf[js.Any], poolSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], poolMode.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  @scala.inline
  def pool2d(x: Tensor[Rank], poolSize: js.Tuple2[Double, Double], strides: Unit, padding: PaddingMode): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("pool2d")(x.asInstanceOf[js.Any], poolSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  @scala.inline
  def pool2d(
    x: Tensor[Rank],
    poolSize: js.Tuple2[Double, Double],
    strides: Unit,
    padding: PaddingMode,
    dataFormat: Unit,
    poolMode: PoolMode
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("pool2d")(x.asInstanceOf[js.Any], poolSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], poolMode.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  @scala.inline
  def pool2d(
    x: Tensor[Rank],
    poolSize: js.Tuple2[Double, Double],
    strides: Unit,
    padding: PaddingMode,
    dataFormat: DataFormat
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("pool2d")(x.asInstanceOf[js.Any], poolSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  @scala.inline
  def pool2d(
    x: Tensor[Rank],
    poolSize: js.Tuple2[Double, Double],
    strides: Unit,
    padding: PaddingMode,
    dataFormat: DataFormat,
    poolMode: PoolMode
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("pool2d")(x.asInstanceOf[js.Any], poolSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], poolMode.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  
  @scala.inline
  def pool3d(x: Tensor5D, poolSize: js.Tuple3[Double, Double, Double]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("pool3d")(x.asInstanceOf[js.Any], poolSize.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  @scala.inline
  def pool3d(
    x: Tensor5D,
    poolSize: js.Tuple3[Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double]
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("pool3d")(x.asInstanceOf[js.Any], poolSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  @scala.inline
  def pool3d(
    x: Tensor5D,
    poolSize: js.Tuple3[Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    padding: Unit,
    dataFormat: Unit,
    poolMode: PoolMode
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("pool3d")(x.asInstanceOf[js.Any], poolSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], poolMode.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  @scala.inline
  def pool3d(
    x: Tensor5D,
    poolSize: js.Tuple3[Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    padding: Unit,
    dataFormat: DataFormat
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("pool3d")(x.asInstanceOf[js.Any], poolSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  @scala.inline
  def pool3d(
    x: Tensor5D,
    poolSize: js.Tuple3[Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    padding: Unit,
    dataFormat: DataFormat,
    poolMode: PoolMode
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("pool3d")(x.asInstanceOf[js.Any], poolSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], poolMode.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  @scala.inline
  def pool3d(
    x: Tensor5D,
    poolSize: js.Tuple3[Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    padding: PaddingMode
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("pool3d")(x.asInstanceOf[js.Any], poolSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  @scala.inline
  def pool3d(
    x: Tensor5D,
    poolSize: js.Tuple3[Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    padding: PaddingMode,
    dataFormat: Unit,
    poolMode: PoolMode
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("pool3d")(x.asInstanceOf[js.Any], poolSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], poolMode.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  @scala.inline
  def pool3d(
    x: Tensor5D,
    poolSize: js.Tuple3[Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    padding: PaddingMode,
    dataFormat: DataFormat
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("pool3d")(x.asInstanceOf[js.Any], poolSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  @scala.inline
  def pool3d(
    x: Tensor5D,
    poolSize: js.Tuple3[Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    padding: PaddingMode,
    dataFormat: DataFormat,
    poolMode: PoolMode
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("pool3d")(x.asInstanceOf[js.Any], poolSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], poolMode.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  @scala.inline
  def pool3d(
    x: Tensor5D,
    poolSize: js.Tuple3[Double, Double, Double],
    strides: Unit,
    padding: Unit,
    dataFormat: Unit,
    poolMode: PoolMode
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("pool3d")(x.asInstanceOf[js.Any], poolSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], poolMode.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  @scala.inline
  def pool3d(
    x: Tensor5D,
    poolSize: js.Tuple3[Double, Double, Double],
    strides: Unit,
    padding: Unit,
    dataFormat: DataFormat
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("pool3d")(x.asInstanceOf[js.Any], poolSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  @scala.inline
  def pool3d(
    x: Tensor5D,
    poolSize: js.Tuple3[Double, Double, Double],
    strides: Unit,
    padding: Unit,
    dataFormat: DataFormat,
    poolMode: PoolMode
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("pool3d")(x.asInstanceOf[js.Any], poolSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], poolMode.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  @scala.inline
  def pool3d(x: Tensor5D, poolSize: js.Tuple3[Double, Double, Double], strides: Unit, padding: PaddingMode): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("pool3d")(x.asInstanceOf[js.Any], poolSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  @scala.inline
  def pool3d(
    x: Tensor5D,
    poolSize: js.Tuple3[Double, Double, Double],
    strides: Unit,
    padding: PaddingMode,
    dataFormat: Unit,
    poolMode: PoolMode
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("pool3d")(x.asInstanceOf[js.Any], poolSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], poolMode.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  @scala.inline
  def pool3d(
    x: Tensor5D,
    poolSize: js.Tuple3[Double, Double, Double],
    strides: Unit,
    padding: PaddingMode,
    dataFormat: DataFormat
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("pool3d")(x.asInstanceOf[js.Any], poolSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  @scala.inline
  def pool3d(
    x: Tensor5D,
    poolSize: js.Tuple3[Double, Double, Double],
    strides: Unit,
    padding: PaddingMode,
    dataFormat: DataFormat,
    poolMode: PoolMode
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("pool3d")(x.asInstanceOf[js.Any], poolSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], poolMode.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  
  trait GlobalPooling2DLayerArgs
    extends StObject
       with LayerArgs {
    
    /**
      * One of `CHANNEL_LAST` (default) or `CHANNEL_FIRST`.
      *
      * The ordering of the dimensions in the inputs. `CHANNEL_LAST` corresponds
      * to inputs with shape `[batch, height, width, channels[` while
      * `CHANNEL_FIRST` corresponds to inputs with shape
      * `[batch, channels, height, width]`.
      */
    var dataFormat: js.UndefOr[DataFormat] = js.undefined
  }
  object GlobalPooling2DLayerArgs {
    
    @scala.inline
    def apply(): GlobalPooling2DLayerArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlobalPooling2DLayerArgs]
    }
    
    @scala.inline
    implicit class GlobalPooling2DLayerArgsMutableBuilder[Self <: GlobalPooling2DLayerArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataFormat(value: DataFormat): Self = StObject.set(x, "dataFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataFormatUndefined: Self = StObject.set(x, "dataFormat", js.undefined)
    }
  }
  
  trait Pooling1DLayerArgs
    extends StObject
       with LayerArgs {
    
    /** How to fill in data that's not an integer multiple of poolSize. */
    var padding: js.UndefOr[PaddingMode] = js.undefined
    
    /**
      * Size of the window to pool over, should be an integer.
      */
    var poolSize: js.UndefOr[Double | js.Array[Double]] = js.undefined
    
    /**
      * Period at which to sample the pooled values.
      *
      * If `null`, defaults to `poolSize`.
      */
    var strides: js.UndefOr[Double | js.Array[Double]] = js.undefined
  }
  object Pooling1DLayerArgs {
    
    @scala.inline
    def apply(): Pooling1DLayerArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Pooling1DLayerArgs]
    }
    
    @scala.inline
    implicit class Pooling1DLayerArgsMutableBuilder[Self <: Pooling1DLayerArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPadding(value: PaddingMode): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setPoolSize(value: Double | js.Array[Double]): Self = StObject.set(x, "poolSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPoolSizeUndefined: Self = StObject.set(x, "poolSize", js.undefined)
      
      @scala.inline
      def setPoolSizeVarargs(value: Double*): Self = StObject.set(x, "poolSize", js.Array(value :_*))
      
      @scala.inline
      def setStrides(value: Double | js.Array[Double]): Self = StObject.set(x, "strides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStridesUndefined: Self = StObject.set(x, "strides", js.undefined)
      
      @scala.inline
      def setStridesVarargs(value: Double*): Self = StObject.set(x, "strides", js.Array(value :_*))
    }
  }
  
  trait Pooling2DLayerArgs
    extends StObject
       with LayerArgs {
    
    /** The data format to use for the pooling layer. */
    var dataFormat: js.UndefOr[DataFormat] = js.undefined
    
    /** The padding type to use for the pooling layer. */
    var padding: js.UndefOr[PaddingMode] = js.undefined
    
    /**
      * Factors by which to downscale in each dimension [vertical, horizontal].
      * Expects an integer or an array of 2 integers.
      *
      * For example, `[2, 2]` will halve the input in both spatial dimension.
      * If only one integer is specified, the same window length
      * will be used for both dimensions.
      */
    var poolSize: js.UndefOr[Double | (js.Tuple2[Double, Double])] = js.undefined
    
    /**
      * The size of the stride in each dimension of the pooling window. Expects
      * an integer or an array of 2 integers. Integer, tuple of 2 integers, or
      * None.
      *
      * If `null`, defaults to `poolSize`.
      */
    var strides: js.UndefOr[Double | (js.Tuple2[Double, Double])] = js.undefined
  }
  object Pooling2DLayerArgs {
    
    @scala.inline
    def apply(): Pooling2DLayerArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Pooling2DLayerArgs]
    }
    
    @scala.inline
    implicit class Pooling2DLayerArgsMutableBuilder[Self <: Pooling2DLayerArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataFormat(value: DataFormat): Self = StObject.set(x, "dataFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataFormatUndefined: Self = StObject.set(x, "dataFormat", js.undefined)
      
      @scala.inline
      def setPadding(value: PaddingMode): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setPoolSize(value: Double | (js.Tuple2[Double, Double])): Self = StObject.set(x, "poolSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPoolSizeUndefined: Self = StObject.set(x, "poolSize", js.undefined)
      
      @scala.inline
      def setStrides(value: Double | (js.Tuple2[Double, Double])): Self = StObject.set(x, "strides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStridesUndefined: Self = StObject.set(x, "strides", js.undefined)
    }
  }
  
  trait Pooling3DLayerArgs
    extends StObject
       with LayerArgs {
    
    /** The data format to use for the pooling layer. */
    var dataFormat: js.UndefOr[DataFormat] = js.undefined
    
    /** The padding type to use for the pooling layer. */
    var padding: js.UndefOr[PaddingMode] = js.undefined
    
    /**
      * Factors by which to downscale in each dimension [depth, height, width].
      * Expects an integer or an array of 3 integers.
      *
      * For example, `[2, 2, 2]` will halve the input in three dimensions.
      * If only one integer is specified, the same window length
      * will be used for all dimensions.
      */
    var poolSize: js.UndefOr[Double | (js.Tuple3[Double, Double, Double])] = js.undefined
    
    /**
      * The size of the stride in each dimension of the pooling window. Expects
      * an integer or an array of 3 integers. Integer, tuple of 3 integers, or
      * None.
      *
      * If `null`, defaults to `poolSize`.
      */
    var strides: js.UndefOr[Double | (js.Tuple3[Double, Double, Double])] = js.undefined
  }
  object Pooling3DLayerArgs {
    
    @scala.inline
    def apply(): Pooling3DLayerArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Pooling3DLayerArgs]
    }
    
    @scala.inline
    implicit class Pooling3DLayerArgsMutableBuilder[Self <: Pooling3DLayerArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataFormat(value: DataFormat): Self = StObject.set(x, "dataFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataFormatUndefined: Self = StObject.set(x, "dataFormat", js.undefined)
      
      @scala.inline
      def setPadding(value: PaddingMode): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setPoolSize(value: Double | (js.Tuple3[Double, Double, Double])): Self = StObject.set(x, "poolSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPoolSizeUndefined: Self = StObject.set(x, "poolSize", js.undefined)
      
      @scala.inline
      def setStrides(value: Double | (js.Tuple3[Double, Double, Double])): Self = StObject.set(x, "strides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStridesUndefined: Self = StObject.set(x, "strides", js.undefined)
    }
  }
}
