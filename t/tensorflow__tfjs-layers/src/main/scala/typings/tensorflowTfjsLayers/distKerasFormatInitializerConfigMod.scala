package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsLayers.distKerasFormatTypesMod.BaseSerialization
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKerasFormatInitializerConfigMod {
  
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
    
    inline def apply(value: Double): ConstantConfig = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConstantConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConstantConfig] (val x: Self) extends AnyVal {
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
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
    
    inline def normal: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.normal = "normal".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.normal]
    
    inline def truncatedNormal: truncatedNormal_ = "truncatedNormal".asInstanceOf[truncatedNormal_]
    
    inline def uniform: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.uniform = "uniform".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.uniform]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.normal
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.uniform
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.truncated_normal
  */
  trait DistributionSerialization extends StObject
  object DistributionSerialization {
    
    inline def normal: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.normal = "normal".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.normal]
    
    inline def truncated_normal: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.truncated_normal = "truncated_normal".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.truncated_normal]
    
    inline def uniform: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.uniform = "uniform".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.uniform]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fanIn
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fanOut
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fanAvg
  */
  trait FanMode extends StObject
  object FanMode {
    
    inline def fanAvg: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fanAvg = "fanAvg".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fanAvg]
    
    inline def fanIn: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fanIn = "fanIn".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fanIn]
    
    inline def fanOut: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fanOut = "fanOut".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fanOut]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fan_in
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fan_out
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fan_avg
  */
  trait FanModeSerialization extends StObject
  object FanModeSerialization {
    
    inline def fan_avg: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fan_avg = "fan_avg".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fan_avg]
    
    inline def fan_in: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fan_in = "fan_in".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fan_in]
    
    inline def fan_out: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fan_out = "fan_out".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fan_out]
  }
  
  trait IdentityConfig extends StObject {
    
    var gain: js.UndefOr[Double] = js.undefined
  }
  object IdentityConfig {
    
    inline def apply(): IdentityConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IdentityConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IdentityConfig] (val x: Self) extends AnyVal {
      
      inline def setGain(value: Double): Self = StObject.set(x, "gain", value.asInstanceOf[js.Any])
      
      inline def setGainUndefined: Self = StObject.set(x, "gain", js.undefined)
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
    
    inline def Constant: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Constant = "Constant".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Constant]
    
    inline def Identity: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Identity = "Identity".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Identity]
    
    inline def Ones: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Ones = "Ones".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Ones]
    
    inline def Orthogonal: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Orthogonal = "Orthogonal".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Orthogonal]
    
    inline def RandomNormal: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RandomNormal = "RandomNormal".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RandomNormal]
    
    inline def RandomUniform: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RandomUniform = "RandomUniform".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RandomUniform]
    
    inline def TruncatedNormal: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.TruncatedNormal = "TruncatedNormal".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.TruncatedNormal]
    
    inline def VarianceScaling: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.VarianceScaling = "VarianceScaling".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.VarianceScaling]
    
    inline def Zeros: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Zeros = "Zeros".asInstanceOf[typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Zeros]
  }
  
  type InitializerSerialization = ZerosSerialization | OnesSerialization | ConstantSerialization | RandomUniformSerialization | RandomNormalSerialization | TruncatedNormalSerialization | IdentitySerialization | VarianceScalingSerialization | OrthogonalSerialization
  
  type OnesSerialization = BaseSerialization[Ones, js.Object]
  
  trait OrthogonalConfig extends StObject {
    
    var gain: js.UndefOr[Double] = js.undefined
    
    var seed: js.UndefOr[Double] = js.undefined
  }
  object OrthogonalConfig {
    
    inline def apply(): OrthogonalConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OrthogonalConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OrthogonalConfig] (val x: Self) extends AnyVal {
      
      inline def setGain(value: Double): Self = StObject.set(x, "gain", value.asInstanceOf[js.Any])
      
      inline def setGainUndefined: Self = StObject.set(x, "gain", js.undefined)
      
      inline def setSeed(value: Double): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
      
      inline def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
    }
  }
  
  type OrthogonalSerialization = BaseSerialization[Orthogonal, OrthogonalConfig]
  
  trait RandomNormalConfig extends StObject {
    
    var mean: js.UndefOr[Double] = js.undefined
    
    var seed: js.UndefOr[Double] = js.undefined
    
    var stddev: js.UndefOr[Double] = js.undefined
  }
  object RandomNormalConfig {
    
    inline def apply(): RandomNormalConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RandomNormalConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RandomNormalConfig] (val x: Self) extends AnyVal {
      
      inline def setMean(value: Double): Self = StObject.set(x, "mean", value.asInstanceOf[js.Any])
      
      inline def setMeanUndefined: Self = StObject.set(x, "mean", js.undefined)
      
      inline def setSeed(value: Double): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
      
      inline def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
      
      inline def setStddev(value: Double): Self = StObject.set(x, "stddev", value.asInstanceOf[js.Any])
      
      inline def setStddevUndefined: Self = StObject.set(x, "stddev", js.undefined)
    }
  }
  
  type RandomNormalSerialization = BaseSerialization[RandomNormal, RandomNormalConfig]
  
  trait RandomUniformConfig extends StObject {
    
    var maxval: js.UndefOr[Double] = js.undefined
    
    var minval: js.UndefOr[Double] = js.undefined
    
    var seed: js.UndefOr[Double] = js.undefined
  }
  object RandomUniformConfig {
    
    inline def apply(): RandomUniformConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RandomUniformConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RandomUniformConfig] (val x: Self) extends AnyVal {
      
      inline def setMaxval(value: Double): Self = StObject.set(x, "maxval", value.asInstanceOf[js.Any])
      
      inline def setMaxvalUndefined: Self = StObject.set(x, "maxval", js.undefined)
      
      inline def setMinval(value: Double): Self = StObject.set(x, "minval", value.asInstanceOf[js.Any])
      
      inline def setMinvalUndefined: Self = StObject.set(x, "minval", js.undefined)
      
      inline def setSeed(value: Double): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
      
      inline def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
    }
  }
  
  type RandomUniformSerialization = BaseSerialization[RandomUniform, RandomUniformConfig]
  
  trait TruncatedNormalConfig extends StObject {
    
    var mean: js.UndefOr[Double] = js.undefined
    
    var seed: js.UndefOr[Double] = js.undefined
    
    var stddev: js.UndefOr[Double] = js.undefined
  }
  object TruncatedNormalConfig {
    
    inline def apply(): TruncatedNormalConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TruncatedNormalConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TruncatedNormalConfig] (val x: Self) extends AnyVal {
      
      inline def setMean(value: Double): Self = StObject.set(x, "mean", value.asInstanceOf[js.Any])
      
      inline def setMeanUndefined: Self = StObject.set(x, "mean", js.undefined)
      
      inline def setSeed(value: Double): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
      
      inline def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
      
      inline def setStddev(value: Double): Self = StObject.set(x, "stddev", value.asInstanceOf[js.Any])
      
      inline def setStddevUndefined: Self = StObject.set(x, "stddev", js.undefined)
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
    
    inline def apply(): VarianceScalingConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VarianceScalingConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VarianceScalingConfig] (val x: Self) extends AnyVal {
      
      inline def setDistribution(value: DistributionSerialization): Self = StObject.set(x, "distribution", value.asInstanceOf[js.Any])
      
      inline def setDistributionUndefined: Self = StObject.set(x, "distribution", js.undefined)
      
      inline def setMode(value: FanModeSerialization): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setSeed(value: Double): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
      
      inline def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
    }
  }
  
  type VarianceScalingSerialization = BaseSerialization[VarianceScaling, VarianceScalingConfig]
  
  type ZerosSerialization = BaseSerialization[Zeros, js.Object]
}
