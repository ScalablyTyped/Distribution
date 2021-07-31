package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Constant
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Identity
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Ones
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Orthogonal
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RandomNormal
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RandomUniform
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.TruncatedNormal
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.VarianceScaling
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Zeros
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.truncatedNormal_
import typings.tensorflowTfjsLayers.typesMod.BaseSerialization
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object initializerConfigMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/keras_format/initializer_config", "VALID_DISTRIBUTION_VALUES")
  @js.native
  val VALID_DISTRIBUTION_VALUES: js.Array[String] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/keras_format/initializer_config", "VALID_FAN_MODE_VALUES")
  @js.native
  val VALID_FAN_MODE_VALUES: js.Array[String] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/keras_format/initializer_config", "initializerClassNames")
  @js.native
  val initializerClassNames: js.Array[InitializerClassName] = js.native
  
  trait ConstantConfig extends StObject {
    
    var value: Double
  }
  object ConstantConfig {
    
    @scala.inline
    def apply(value: Double): ConstantConfig = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConstantConfig]
    }
    
    @scala.inline
    implicit class ConstantConfigMutableBuilder[Self <: ConstantConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type ConstantSerialization = BaseSerialization[Constant, ConstantConfig]
  
  /* Rewritten from type alias, can be one of: 
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.normal
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.uniform
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.truncatedNormal_
  */
  trait Distribution extends StObject
  object Distribution {
    
    @scala.inline
    def normal: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.normal = "normal".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.normal]
    
    @scala.inline
    def truncatedNormal: truncatedNormal_ = "truncatedNormal".asInstanceOf[truncatedNormal_]
    
    @scala.inline
    def uniform: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.uniform = "uniform".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.uniform]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.normal
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.uniform
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.truncated_normal
  */
  trait DistributionSerialization extends StObject
  object DistributionSerialization {
    
    @scala.inline
    def normal: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.normal = "normal".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.normal]
    
    @scala.inline
    def truncated_normal: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.truncated_normal = "truncated_normal".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.truncated_normal]
    
    @scala.inline
    def uniform: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.uniform = "uniform".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.uniform]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fanIn
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fanOut
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fanAvg
  */
  trait FanMode extends StObject
  object FanMode {
    
    @scala.inline
    def fanAvg: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fanAvg = "fanAvg".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fanAvg]
    
    @scala.inline
    def fanIn: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fanIn = "fanIn".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fanIn]
    
    @scala.inline
    def fanOut: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fanOut = "fanOut".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fanOut]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fan_in
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fan_out
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fan_avg
  */
  trait FanModeSerialization extends StObject
  object FanModeSerialization {
    
    @scala.inline
    def fan_avg: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fan_avg = "fan_avg".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fan_avg]
    
    @scala.inline
    def fan_in: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fan_in = "fan_in".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fan_in]
    
    @scala.inline
    def fan_out: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fan_out = "fan_out".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fan_out]
  }
  
  trait IdentityConfig extends StObject {
    
    var gain: js.UndefOr[Double] = js.undefined
  }
  object IdentityConfig {
    
    @scala.inline
    def apply(): IdentityConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IdentityConfig]
    }
    
    @scala.inline
    implicit class IdentityConfigMutableBuilder[Self <: IdentityConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGain(value: Double): Self = StObject.set(x, "gain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGainUndefined: Self = StObject.set(x, "gain", js.undefined)
    }
  }
  
  type IdentitySerialization = BaseSerialization[Identity, IdentityConfig]
  
  /* Inlined @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/initializer_config.InitializerSerialization['class_name'] */
  /* Rewritten from type alias, can be one of: 
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.TruncatedNormal
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Ones
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Constant
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RandomNormal
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Orthogonal
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RandomUniform
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Identity
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Zeros
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.VarianceScaling
  */
  trait InitializerClassName extends StObject
  object InitializerClassName {
    
    @scala.inline
    def Constant: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Constant = "Constant".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Constant]
    
    @scala.inline
    def Identity: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Identity = "Identity".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Identity]
    
    @scala.inline
    def Ones: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Ones = "Ones".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Ones]
    
    @scala.inline
    def Orthogonal: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Orthogonal = "Orthogonal".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Orthogonal]
    
    @scala.inline
    def RandomNormal: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RandomNormal = "RandomNormal".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RandomNormal]
    
    @scala.inline
    def RandomUniform: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RandomUniform = "RandomUniform".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RandomUniform]
    
    @scala.inline
    def TruncatedNormal: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.TruncatedNormal = "TruncatedNormal".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.TruncatedNormal]
    
    @scala.inline
    def VarianceScaling: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.VarianceScaling = "VarianceScaling".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.VarianceScaling]
    
    @scala.inline
    def Zeros: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Zeros = "Zeros".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Zeros]
  }
  
  type InitializerSerialization = ZerosSerialization | OnesSerialization | ConstantSerialization | RandomUniformSerialization | RandomNormalSerialization | TruncatedNormalSerialization | IdentitySerialization | VarianceScalingSerialization | OrthogonalSerialization
  
  type OnesSerialization = BaseSerialization[Ones, js.Object]
  
  trait OrthogonalConfig extends StObject {
    
    var gain: js.UndefOr[Double] = js.undefined
    
    var seed: js.UndefOr[Double] = js.undefined
  }
  object OrthogonalConfig {
    
    @scala.inline
    def apply(): OrthogonalConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OrthogonalConfig]
    }
    
    @scala.inline
    implicit class OrthogonalConfigMutableBuilder[Self <: OrthogonalConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGain(value: Double): Self = StObject.set(x, "gain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGainUndefined: Self = StObject.set(x, "gain", js.undefined)
      
      @scala.inline
      def setSeed(value: Double): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
    }
  }
  
  type OrthogonalSerialization = BaseSerialization[Orthogonal, OrthogonalConfig]
  
  trait RandomNormalConfig extends StObject {
    
    var mean: js.UndefOr[Double] = js.undefined
    
    var seed: js.UndefOr[Double] = js.undefined
    
    var stddev: js.UndefOr[Double] = js.undefined
  }
  object RandomNormalConfig {
    
    @scala.inline
    def apply(): RandomNormalConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RandomNormalConfig]
    }
    
    @scala.inline
    implicit class RandomNormalConfigMutableBuilder[Self <: RandomNormalConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMean(value: Double): Self = StObject.set(x, "mean", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeanUndefined: Self = StObject.set(x, "mean", js.undefined)
      
      @scala.inline
      def setSeed(value: Double): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
      
      @scala.inline
      def setStddev(value: Double): Self = StObject.set(x, "stddev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStddevUndefined: Self = StObject.set(x, "stddev", js.undefined)
    }
  }
  
  type RandomNormalSerialization = BaseSerialization[RandomNormal, RandomNormalConfig]
  
  trait RandomUniformConfig extends StObject {
    
    var maxval: js.UndefOr[Double] = js.undefined
    
    var minval: js.UndefOr[Double] = js.undefined
    
    var seed: js.UndefOr[Double] = js.undefined
  }
  object RandomUniformConfig {
    
    @scala.inline
    def apply(): RandomUniformConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RandomUniformConfig]
    }
    
    @scala.inline
    implicit class RandomUniformConfigMutableBuilder[Self <: RandomUniformConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxval(value: Double): Self = StObject.set(x, "maxval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxvalUndefined: Self = StObject.set(x, "maxval", js.undefined)
      
      @scala.inline
      def setMinval(value: Double): Self = StObject.set(x, "minval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinvalUndefined: Self = StObject.set(x, "minval", js.undefined)
      
      @scala.inline
      def setSeed(value: Double): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
    }
  }
  
  type RandomUniformSerialization = BaseSerialization[RandomUniform, RandomUniformConfig]
  
  trait TruncatedNormalConfig extends StObject {
    
    var mean: js.UndefOr[Double] = js.undefined
    
    var seed: js.UndefOr[Double] = js.undefined
    
    var stddev: js.UndefOr[Double] = js.undefined
  }
  object TruncatedNormalConfig {
    
    @scala.inline
    def apply(): TruncatedNormalConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TruncatedNormalConfig]
    }
    
    @scala.inline
    implicit class TruncatedNormalConfigMutableBuilder[Self <: TruncatedNormalConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMean(value: Double): Self = StObject.set(x, "mean", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeanUndefined: Self = StObject.set(x, "mean", js.undefined)
      
      @scala.inline
      def setSeed(value: Double): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
      
      @scala.inline
      def setStddev(value: Double): Self = StObject.set(x, "stddev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStddevUndefined: Self = StObject.set(x, "stddev", js.undefined)
    }
  }
  
  type TruncatedNormalSerialization = BaseSerialization[TruncatedNormal, TruncatedNormalConfig]
  
  trait VarianceScalingConfig extends StObject {
    
    var distribution: js.UndefOr[DistributionSerialization] = js.undefined
    
    var mode: js.UndefOr[FanModeSerialization] = js.undefined
    
    var scale: js.UndefOr[Double] = js.undefined
    
    var seed: js.UndefOr[Double] = js.undefined
  }
  object VarianceScalingConfig {
    
    @scala.inline
    def apply(): VarianceScalingConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VarianceScalingConfig]
    }
    
    @scala.inline
    implicit class VarianceScalingConfigMutableBuilder[Self <: VarianceScalingConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDistribution(value: DistributionSerialization): Self = StObject.set(x, "distribution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistributionUndefined: Self = StObject.set(x, "distribution", js.undefined)
      
      @scala.inline
      def setMode(value: FanModeSerialization): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      @scala.inline
      def setSeed(value: Double): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
    }
  }
  
  type VarianceScalingSerialization = BaseSerialization[VarianceScaling, VarianceScalingConfig]
  
  type ZerosSerialization = BaseSerialization[Zeros, js.Object]
}
