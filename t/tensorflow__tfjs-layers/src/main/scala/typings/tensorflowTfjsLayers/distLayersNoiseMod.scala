package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsLayers.distEngineTopologyMod.Layer
import typings.tensorflowTfjsLayers.distEngineTopologyMod.LayerArgs
import typings.tensorflowTfjsLayers.distKerasFormatCommonMod.Shape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLayersNoiseMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/noise", "AlphaDropout")
  @js.native
  open class AlphaDropout protected () extends Layer {
    def this(args: AlphaDropoutArgs) = this()
    
    def _getNoiseShape(inputs: js.Array[Tensor[Rank]]): Shape = js.native
    def _getNoiseShape(inputs: Tensor[Rank]): Shape = js.native
    
    val noiseShape: Shape = js.native
    
    val rate: Double = js.native
  }
  /* static members */
  object AlphaDropout {
    
    @JSImport("@tensorflow/tfjs-layers/dist/layers/noise", "AlphaDropout")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/layers/noise", "AlphaDropout.className")
    @js.native
    def className: String = js.native
    inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/noise", "GaussianDropout")
  @js.native
  open class GaussianDropout protected () extends Layer {
    def this(args: GaussianDropoutArgs) = this()
    
    val rate: Double = js.native
  }
  /* static members */
  object GaussianDropout {
    
    @JSImport("@tensorflow/tfjs-layers/dist/layers/noise", "GaussianDropout")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/layers/noise", "GaussianDropout.className")
    @js.native
    def className: String = js.native
    inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/noise", "GaussianNoise")
  @js.native
  open class GaussianNoise protected () extends Layer {
    def this(args: GaussianNoiseArgs) = this()
    
    val stddev: Double = js.native
  }
  /* static members */
  object GaussianNoise {
    
    @JSImport("@tensorflow/tfjs-layers/dist/layers/noise", "GaussianNoise")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/layers/noise", "GaussianNoise.className")
    @js.native
    def className: String = js.native
    inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  trait AlphaDropoutArgs
    extends StObject
       with LayerArgs {
    
    /**
      * A 1-D `Tensor` of type `int32`, representing the
      * shape for randomly generated keep/drop flags.
      */
    var noiseShape: js.UndefOr[Shape] = js.undefined
    
    /** drop probability.  */
    var rate: Double
  }
  object AlphaDropoutArgs {
    
    inline def apply(rate: Double): AlphaDropoutArgs = {
      val __obj = js.Dynamic.literal(rate = rate.asInstanceOf[js.Any])
      __obj.asInstanceOf[AlphaDropoutArgs]
    }
    
    extension [Self <: AlphaDropoutArgs](x: Self) {
      
      inline def setNoiseShape(value: Shape): Self = StObject.set(x, "noiseShape", value.asInstanceOf[js.Any])
      
      inline def setNoiseShapeUndefined: Self = StObject.set(x, "noiseShape", js.undefined)
      
      inline def setNoiseShapeVarargs(value: (Null | Double)*): Self = StObject.set(x, "noiseShape", js.Array(value*))
      
      inline def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
    }
  }
  
  trait GaussianDropoutArgs
    extends StObject
       with LayerArgs {
    
    /** drop probability.  */
    var rate: Double
  }
  object GaussianDropoutArgs {
    
    inline def apply(rate: Double): GaussianDropoutArgs = {
      val __obj = js.Dynamic.literal(rate = rate.asInstanceOf[js.Any])
      __obj.asInstanceOf[GaussianDropoutArgs]
    }
    
    extension [Self <: GaussianDropoutArgs](x: Self) {
      
      inline def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
    }
  }
  
  trait GaussianNoiseArgs
    extends StObject
       with LayerArgs {
    
    /** Standard Deviation.  */
    var stddev: Double
  }
  object GaussianNoiseArgs {
    
    inline def apply(stddev: Double): GaussianNoiseArgs = {
      val __obj = js.Dynamic.literal(stddev = stddev.asInstanceOf[js.Any])
      __obj.asInstanceOf[GaussianNoiseArgs]
    }
    
    extension [Self <: GaussianNoiseArgs](x: Self) {
      
      inline def setStddev(value: Double): Self = StObject.set(x, "stddev", value.asInstanceOf[js.Any])
    }
  }
}
