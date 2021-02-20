package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import typings.tensorflowTfjsLayers.topologyMod.Layer
import typings.tensorflowTfjsLayers.topologyMod.LayerArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noiseMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/noise", "AlphaDropout")
  @js.native
  class AlphaDropout protected () extends Layer {
    def this(args: AlphaDropoutArgs) = this()
    
    def _getNoiseShape(inputs: js.Array[Tensor[Rank]]): js.Array[Double] = js.native
    def _getNoiseShape(inputs: Tensor[Rank]): js.Array[Double] = js.native
    
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
    @scala.inline
    def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/noise", "GaussianDropout")
  @js.native
  class GaussianDropout protected () extends Layer {
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
    @scala.inline
    def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/noise", "GaussianNoise")
  @js.native
  class GaussianNoise protected () extends Layer {
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
    @scala.inline
    def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait AlphaDropoutArgs extends LayerArgs {
    
    /**
      * A 1-D `Tensor` of type `int32`, representing the
      * shape for randomly generated keep/drop flags.
      */
    var noiseShape: js.UndefOr[Shape] = js.native
    
    /** drop probability.  */
    var rate: Double = js.native
  }
  object AlphaDropoutArgs {
    
    @scala.inline
    def apply(rate: Double): AlphaDropoutArgs = {
      val __obj = js.Dynamic.literal(rate = rate.asInstanceOf[js.Any])
      __obj.asInstanceOf[AlphaDropoutArgs]
    }
    
    @scala.inline
    implicit class AlphaDropoutArgsMutableBuilder[Self <: AlphaDropoutArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNoiseShape(value: Shape): Self = StObject.set(x, "noiseShape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoiseShapeUndefined: Self = StObject.set(x, "noiseShape", js.undefined)
      
      @scala.inline
      def setNoiseShapeVarargs(value: (Null | Double)*): Self = StObject.set(x, "noiseShape", js.Array(value :_*))
      
      @scala.inline
      def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GaussianDropoutArgs extends LayerArgs {
    
    /** drop probability.  */
    var rate: Double = js.native
  }
  object GaussianDropoutArgs {
    
    @scala.inline
    def apply(rate: Double): GaussianDropoutArgs = {
      val __obj = js.Dynamic.literal(rate = rate.asInstanceOf[js.Any])
      __obj.asInstanceOf[GaussianDropoutArgs]
    }
    
    @scala.inline
    implicit class GaussianDropoutArgsMutableBuilder[Self <: GaussianDropoutArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GaussianNoiseArgs extends LayerArgs {
    
    /** Standard Deviation.  */
    var stddev: Double = js.native
  }
  object GaussianNoiseArgs {
    
    @scala.inline
    def apply(stddev: Double): GaussianNoiseArgs = {
      val __obj = js.Dynamic.literal(stddev = stddev.asInstanceOf[js.Any])
      __obj.asInstanceOf[GaussianNoiseArgs]
    }
    
    @scala.inline
    implicit class GaussianNoiseArgsMutableBuilder[Self <: GaussianNoiseArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStddev(value: Double): Self = StObject.set(x, "stddev", value.asInstanceOf[js.Any])
    }
  }
}
