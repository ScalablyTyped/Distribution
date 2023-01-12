package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTensorMod.Tensor5D
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsLayers.distEngineTopologyMod.Layer
import typings.tensorflowTfjsLayers.distEngineTopologyMod.LayerArgs
import typings.tensorflowTfjsLayers.distKerasFormatCommonMod.DataFormat
import typings.tensorflowTfjsLayers.distKerasFormatCommonMod.PaddingMode
import typings.tensorflowTfjsLayers.distKerasFormatCommonMod.PoolMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLayersPoolingMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/pooling", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/pooling", "AveragePooling1D")
  @js.native
  open class AveragePooling1D protected () extends Pooling1D {
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
    inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/pooling", "AveragePooling2D")
  @js.native
  open class AveragePooling2D protected () extends Pooling2D {
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
    inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/pooling", "AveragePooling3D")
  @js.native
  open class AveragePooling3D protected () extends Pooling3D {
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
    inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/pooling", "GlobalAveragePooling1D")
  @js.native
  open class GlobalAveragePooling1D () extends GlobalPooling1D {
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
    inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/pooling", "GlobalAveragePooling2D")
  @js.native
  open class GlobalAveragePooling2D protected () extends GlobalPooling2D {
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
    inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/pooling", "GlobalMaxPooling1D")
  @js.native
  open class GlobalMaxPooling1D protected () extends GlobalPooling1D {
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
    inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/pooling", "GlobalMaxPooling2D")
  @js.native
  open class GlobalMaxPooling2D protected () extends GlobalPooling2D {
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
    inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  /* note: abstract class */ @JSImport("@tensorflow/tfjs-layers/dist/layers/pooling", "GlobalPooling1D")
  @js.native
  open class GlobalPooling1D protected () extends Layer {
    def this(args: LayerArgs) = this()
  }
  
  /* note: abstract class */ @JSImport("@tensorflow/tfjs-layers/dist/layers/pooling", "GlobalPooling2D")
  @js.native
  open class GlobalPooling2D protected () extends Layer {
    def this(args: GlobalPooling2DLayerArgs) = this()
    
    /* protected */ var dataFormat: DataFormat = js.native
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/pooling", "MaxPooling1D")
  @js.native
  open class MaxPooling1D protected () extends Pooling1D {
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
    inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/pooling", "MaxPooling2D")
  @js.native
  open class MaxPooling2D protected () extends Pooling2D {
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
    inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/pooling", "MaxPooling3D")
  @js.native
  open class MaxPooling3D protected () extends Pooling3D {
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
    inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  /* note: abstract class */ @JSImport("@tensorflow/tfjs-layers/dist/layers/pooling", "Pooling1D")
  @js.native
  open class Pooling1D protected () extends Layer {
    /**
      *
      * @param args Parameters for the Pooling layer.
      *
      * config.poolSize defaults to 2.
      */
    def this(args: Pooling1DLayerArgs) = this()
    
    /* protected */ val padding: PaddingMode = js.native
    
    /* protected */ val poolSize: js.Array[Double] = js.native
    
    /* protected */ def poolingFunction(
      inputs: Tensor[Rank],
      poolSize: js.Tuple2[Double, Double],
      strides: js.Tuple2[Double, Double],
      padding: PaddingMode,
      dataFormat: DataFormat
    ): Tensor[Rank] = js.native
    
    /* protected */ val strides: js.Array[Double] = js.native
  }
  
  /* note: abstract class */ @JSImport("@tensorflow/tfjs-layers/dist/layers/pooling", "Pooling2D")
  @js.native
  open class Pooling2D protected () extends Layer {
    def this(args: Pooling2DLayerArgs) = this()
    
    /* protected */ val dataFormat: DataFormat = js.native
    
    /* protected */ val padding: PaddingMode = js.native
    
    /* protected */ val poolSize: js.Tuple2[Double, Double] = js.native
    
    /* protected */ def poolingFunction(
      inputs: Tensor[Rank],
      poolSize: js.Tuple2[Double, Double],
      strides: js.Tuple2[Double, Double],
      padding: PaddingMode,
      dataFormat: DataFormat
    ): Tensor[Rank] = js.native
    
    /* protected */ val strides: js.Tuple2[Double, Double] = js.native
  }
  
  /* note: abstract class */ @JSImport("@tensorflow/tfjs-layers/dist/layers/pooling", "Pooling3D")
  @js.native
  open class Pooling3D protected () extends Layer {
    def this(args: Pooling3DLayerArgs) = this()
    
    /* protected */ val dataFormat: DataFormat = js.native
    
    /* protected */ val padding: PaddingMode = js.native
    
    /* protected */ val poolSize: js.Tuple3[Double, Double, Double] = js.native
    
    /* protected */ def poolingFunction(
      inputs: Tensor[Rank],
      poolSize: js.Tuple3[Double, Double, Double],
      strides: js.Tuple3[Double, Double, Double],
      padding: PaddingMode,
      dataFormat: DataFormat
    ): Tensor[Rank] = js.native
    
    /* protected */ val strides: js.Tuple3[Double, Double, Double] = js.native
  }
  
  inline def pool2d(x: Tensor[Rank], poolSize: js.Tuple2[Double, Double]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("pool2d")(x.asInstanceOf[js.Any], poolSize.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def pool2d(x: Tensor[Rank], poolSize: js.Tuple2[Double, Double], strides: js.Tuple2[Double, Double]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("pool2d")(x.asInstanceOf[js.Any], poolSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def pool2d(
    x: Tensor[Rank],
    poolSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    padding: Unit,
    dataFormat: Unit,
    poolMode: PoolMode
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("pool2d")(x.asInstanceOf[js.Any], poolSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], poolMode.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def pool2d(
    x: Tensor[Rank],
    poolSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    padding: Unit,
    dataFormat: DataFormat
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("pool2d")(x.asInstanceOf[js.Any], poolSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def pool2d(
    x: Tensor[Rank],
    poolSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    padding: Unit,
    dataFormat: DataFormat,
    poolMode: PoolMode
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("pool2d")(x.asInstanceOf[js.Any], poolSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], poolMode.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def pool2d(
    x: Tensor[Rank],
    poolSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    padding: PaddingMode
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("pool2d")(x.asInstanceOf[js.Any], poolSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def pool2d(
    x: Tensor[Rank],
    poolSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    padding: PaddingMode,
    dataFormat: Unit,
    poolMode: PoolMode
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("pool2d")(x.asInstanceOf[js.Any], poolSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], poolMode.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def pool2d(
    x: Tensor[Rank],
    poolSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    padding: PaddingMode,
    dataFormat: DataFormat
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("pool2d")(x.asInstanceOf[js.Any], poolSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def pool2d(
    x: Tensor[Rank],
    poolSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    padding: PaddingMode,
    dataFormat: DataFormat,
    poolMode: PoolMode
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("pool2d")(x.asInstanceOf[js.Any], poolSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], poolMode.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def pool2d(
    x: Tensor[Rank],
    poolSize: js.Tuple2[Double, Double],
    strides: Unit,
    padding: Unit,
    dataFormat: Unit,
    poolMode: PoolMode
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("pool2d")(x.asInstanceOf[js.Any], poolSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], poolMode.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def pool2d(
    x: Tensor[Rank],
    poolSize: js.Tuple2[Double, Double],
    strides: Unit,
    padding: Unit,
    dataFormat: DataFormat
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("pool2d")(x.asInstanceOf[js.Any], poolSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def pool2d(
    x: Tensor[Rank],
    poolSize: js.Tuple2[Double, Double],
    strides: Unit,
    padding: Unit,
    dataFormat: DataFormat,
    poolMode: PoolMode
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("pool2d")(x.asInstanceOf[js.Any], poolSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], poolMode.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def pool2d(x: Tensor[Rank], poolSize: js.Tuple2[Double, Double], strides: Unit, padding: PaddingMode): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("pool2d")(x.asInstanceOf[js.Any], poolSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def pool2d(
    x: Tensor[Rank],
    poolSize: js.Tuple2[Double, Double],
    strides: Unit,
    padding: PaddingMode,
    dataFormat: Unit,
    poolMode: PoolMode
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("pool2d")(x.asInstanceOf[js.Any], poolSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], poolMode.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def pool2d(
    x: Tensor[Rank],
    poolSize: js.Tuple2[Double, Double],
    strides: Unit,
    padding: PaddingMode,
    dataFormat: DataFormat
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("pool2d")(x.asInstanceOf[js.Any], poolSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def pool2d(
    x: Tensor[Rank],
    poolSize: js.Tuple2[Double, Double],
    strides: Unit,
    padding: PaddingMode,
    dataFormat: DataFormat,
    poolMode: PoolMode
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("pool2d")(x.asInstanceOf[js.Any], poolSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], poolMode.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  
  inline def pool3d(x: Tensor5D, poolSize: js.Tuple3[Double, Double, Double]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("pool3d")(x.asInstanceOf[js.Any], poolSize.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def pool3d(
    x: Tensor5D,
    poolSize: js.Tuple3[Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double]
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("pool3d")(x.asInstanceOf[js.Any], poolSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def pool3d(
    x: Tensor5D,
    poolSize: js.Tuple3[Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    padding: Unit,
    dataFormat: Unit,
    poolMode: PoolMode
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("pool3d")(x.asInstanceOf[js.Any], poolSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], poolMode.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def pool3d(
    x: Tensor5D,
    poolSize: js.Tuple3[Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    padding: Unit,
    dataFormat: DataFormat
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("pool3d")(x.asInstanceOf[js.Any], poolSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def pool3d(
    x: Tensor5D,
    poolSize: js.Tuple3[Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    padding: Unit,
    dataFormat: DataFormat,
    poolMode: PoolMode
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("pool3d")(x.asInstanceOf[js.Any], poolSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], poolMode.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def pool3d(
    x: Tensor5D,
    poolSize: js.Tuple3[Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    padding: PaddingMode
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("pool3d")(x.asInstanceOf[js.Any], poolSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def pool3d(
    x: Tensor5D,
    poolSize: js.Tuple3[Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    padding: PaddingMode,
    dataFormat: Unit,
    poolMode: PoolMode
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("pool3d")(x.asInstanceOf[js.Any], poolSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], poolMode.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def pool3d(
    x: Tensor5D,
    poolSize: js.Tuple3[Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    padding: PaddingMode,
    dataFormat: DataFormat
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("pool3d")(x.asInstanceOf[js.Any], poolSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def pool3d(
    x: Tensor5D,
    poolSize: js.Tuple3[Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    padding: PaddingMode,
    dataFormat: DataFormat,
    poolMode: PoolMode
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("pool3d")(x.asInstanceOf[js.Any], poolSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], poolMode.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def pool3d(
    x: Tensor5D,
    poolSize: js.Tuple3[Double, Double, Double],
    strides: Unit,
    padding: Unit,
    dataFormat: Unit,
    poolMode: PoolMode
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("pool3d")(x.asInstanceOf[js.Any], poolSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], poolMode.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def pool3d(
    x: Tensor5D,
    poolSize: js.Tuple3[Double, Double, Double],
    strides: Unit,
    padding: Unit,
    dataFormat: DataFormat
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("pool3d")(x.asInstanceOf[js.Any], poolSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def pool3d(
    x: Tensor5D,
    poolSize: js.Tuple3[Double, Double, Double],
    strides: Unit,
    padding: Unit,
    dataFormat: DataFormat,
    poolMode: PoolMode
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("pool3d")(x.asInstanceOf[js.Any], poolSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], poolMode.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def pool3d(x: Tensor5D, poolSize: js.Tuple3[Double, Double, Double], strides: Unit, padding: PaddingMode): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("pool3d")(x.asInstanceOf[js.Any], poolSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def pool3d(
    x: Tensor5D,
    poolSize: js.Tuple3[Double, Double, Double],
    strides: Unit,
    padding: PaddingMode,
    dataFormat: Unit,
    poolMode: PoolMode
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("pool3d")(x.asInstanceOf[js.Any], poolSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], poolMode.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def pool3d(
    x: Tensor5D,
    poolSize: js.Tuple3[Double, Double, Double],
    strides: Unit,
    padding: PaddingMode,
    dataFormat: DataFormat
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("pool3d")(x.asInstanceOf[js.Any], poolSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def pool3d(
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
      * to inputs with shape `[batch, height, width, channels]` while
      * `CHANNEL_FIRST` corresponds to inputs with shape
      * `[batch, channels, height, width]`.
      */
    var dataFormat: js.UndefOr[DataFormat] = js.undefined
  }
  object GlobalPooling2DLayerArgs {
    
    inline def apply(): GlobalPooling2DLayerArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlobalPooling2DLayerArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GlobalPooling2DLayerArgs] (val x: Self) extends AnyVal {
      
      inline def setDataFormat(value: DataFormat): Self = StObject.set(x, "dataFormat", value.asInstanceOf[js.Any])
      
      inline def setDataFormatUndefined: Self = StObject.set(x, "dataFormat", js.undefined)
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
    
    inline def apply(): Pooling1DLayerArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Pooling1DLayerArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Pooling1DLayerArgs] (val x: Self) extends AnyVal {
      
      inline def setPadding(value: PaddingMode): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setPoolSize(value: Double | js.Array[Double]): Self = StObject.set(x, "poolSize", value.asInstanceOf[js.Any])
      
      inline def setPoolSizeUndefined: Self = StObject.set(x, "poolSize", js.undefined)
      
      inline def setPoolSizeVarargs(value: Double*): Self = StObject.set(x, "poolSize", js.Array(value*))
      
      inline def setStrides(value: Double | js.Array[Double]): Self = StObject.set(x, "strides", value.asInstanceOf[js.Any])
      
      inline def setStridesUndefined: Self = StObject.set(x, "strides", js.undefined)
      
      inline def setStridesVarargs(value: Double*): Self = StObject.set(x, "strides", js.Array(value*))
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
      * For example, `[2, 2]` will halve the input in both spatial dimensions.
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
    
    inline def apply(): Pooling2DLayerArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Pooling2DLayerArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Pooling2DLayerArgs] (val x: Self) extends AnyVal {
      
      inline def setDataFormat(value: DataFormat): Self = StObject.set(x, "dataFormat", value.asInstanceOf[js.Any])
      
      inline def setDataFormatUndefined: Self = StObject.set(x, "dataFormat", js.undefined)
      
      inline def setPadding(value: PaddingMode): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setPoolSize(value: Double | (js.Tuple2[Double, Double])): Self = StObject.set(x, "poolSize", value.asInstanceOf[js.Any])
      
      inline def setPoolSizeUndefined: Self = StObject.set(x, "poolSize", js.undefined)
      
      inline def setStrides(value: Double | (js.Tuple2[Double, Double])): Self = StObject.set(x, "strides", value.asInstanceOf[js.Any])
      
      inline def setStridesUndefined: Self = StObject.set(x, "strides", js.undefined)
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
    
    inline def apply(): Pooling3DLayerArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Pooling3DLayerArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Pooling3DLayerArgs] (val x: Self) extends AnyVal {
      
      inline def setDataFormat(value: DataFormat): Self = StObject.set(x, "dataFormat", value.asInstanceOf[js.Any])
      
      inline def setDataFormatUndefined: Self = StObject.set(x, "dataFormat", js.undefined)
      
      inline def setPadding(value: PaddingMode): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setPoolSize(value: Double | (js.Tuple3[Double, Double, Double])): Self = StObject.set(x, "poolSize", value.asInstanceOf[js.Any])
      
      inline def setPoolSizeUndefined: Self = StObject.set(x, "poolSize", js.undefined)
      
      inline def setStrides(value: Double | (js.Tuple3[Double, Double, Double])): Self = StObject.set(x, "strides", value.asInstanceOf[js.Any])
      
      inline def setStridesUndefined: Self = StObject.set(x, "strides", js.undefined)
    }
  }
}
