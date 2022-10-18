package typings.three

import typings.three.srcThreeMod.BufferGeometry
import typings.three.srcThreeMod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmGeometriesLightningStrikeMod {
  
  @JSImport("three/examples/jsm/geometries/LightningStrike", "LightningStrike")
  @js.native
  open class LightningStrike () extends BufferGeometry {
    def this(rayParameters: RayParameters) = this()
    
    def copy(source: LightningStrike): this.type = js.native
    
    def copyParameters(): RayParameters = js.native
    def copyParameters(dest: Unit, source: RayParameters): RayParameters = js.native
    def copyParameters(dest: RayParameters): RayParameters = js.native
    def copyParameters(dest: RayParameters, source: RayParameters): RayParameters = js.native
    
    var state: Double = js.native
    
    def update(time: Double): Unit = js.native
  }
  /* static members */
  object LightningStrike {
    
    @JSImport("three/examples/jsm/geometries/LightningStrike", "LightningStrike.RAY_EXTINGUISHED")
    @js.native
    val RAY_EXTINGUISHED: Double = js.native
    
    // Ray states
    @JSImport("three/examples/jsm/geometries/LightningStrike", "LightningStrike.RAY_INITIALIZED")
    @js.native
    val RAY_INITIALIZED: Double = js.native
    
    @JSImport("three/examples/jsm/geometries/LightningStrike", "LightningStrike.RAY_PROPAGATING")
    @js.native
    val RAY_PROPAGATING: Double = js.native
    
    @JSImport("three/examples/jsm/geometries/LightningStrike", "LightningStrike.RAY_STEADY")
    @js.native
    val RAY_STEADY: Double = js.native
    
    @JSImport("three/examples/jsm/geometries/LightningStrike", "LightningStrike.RAY_UNBORN")
    @js.native
    val RAY_UNBORN: Double = js.native
    
    @JSImport("three/examples/jsm/geometries/LightningStrike", "LightningStrike.RAY_VANISHING")
    @js.native
    val RAY_VANISHING: Double = js.native
  }
  
  trait LightningSegment extends StObject {
    
    var fraction0: Double
    
    var fraction1: Double
    
    var iteration: Double
    
    var linPos0: Vector3
    
    var linPos1: Vector3
    
    var pos0: Vector3
    
    var pos1: Vector3
    
    var positionVariationFactor: Double
    
    var radius0: Double
    
    var radius1: Double
    
    var up0: Vector3
    
    var up1: Vector3
  }
  object LightningSegment {
    
    inline def apply(
      fraction0: Double,
      fraction1: Double,
      iteration: Double,
      linPos0: Vector3,
      linPos1: Vector3,
      pos0: Vector3,
      pos1: Vector3,
      positionVariationFactor: Double,
      radius0: Double,
      radius1: Double,
      up0: Vector3,
      up1: Vector3
    ): LightningSegment = {
      val __obj = js.Dynamic.literal(fraction0 = fraction0.asInstanceOf[js.Any], fraction1 = fraction1.asInstanceOf[js.Any], iteration = iteration.asInstanceOf[js.Any], linPos0 = linPos0.asInstanceOf[js.Any], linPos1 = linPos1.asInstanceOf[js.Any], pos0 = pos0.asInstanceOf[js.Any], pos1 = pos1.asInstanceOf[js.Any], positionVariationFactor = positionVariationFactor.asInstanceOf[js.Any], radius0 = radius0.asInstanceOf[js.Any], radius1 = radius1.asInstanceOf[js.Any], up0 = up0.asInstanceOf[js.Any], up1 = up1.asInstanceOf[js.Any])
      __obj.asInstanceOf[LightningSegment]
    }
    
    extension [Self <: LightningSegment](x: Self) {
      
      inline def setFraction0(value: Double): Self = StObject.set(x, "fraction0", value.asInstanceOf[js.Any])
      
      inline def setFraction1(value: Double): Self = StObject.set(x, "fraction1", value.asInstanceOf[js.Any])
      
      inline def setIteration(value: Double): Self = StObject.set(x, "iteration", value.asInstanceOf[js.Any])
      
      inline def setLinPos0(value: Vector3): Self = StObject.set(x, "linPos0", value.asInstanceOf[js.Any])
      
      inline def setLinPos1(value: Vector3): Self = StObject.set(x, "linPos1", value.asInstanceOf[js.Any])
      
      inline def setPos0(value: Vector3): Self = StObject.set(x, "pos0", value.asInstanceOf[js.Any])
      
      inline def setPos1(value: Vector3): Self = StObject.set(x, "pos1", value.asInstanceOf[js.Any])
      
      inline def setPositionVariationFactor(value: Double): Self = StObject.set(x, "positionVariationFactor", value.asInstanceOf[js.Any])
      
      inline def setRadius0(value: Double): Self = StObject.set(x, "radius0", value.asInstanceOf[js.Any])
      
      inline def setRadius1(value: Double): Self = StObject.set(x, "radius1", value.asInstanceOf[js.Any])
      
      inline def setUp0(value: Vector3): Self = StObject.set(x, "up0", value.asInstanceOf[js.Any])
      
      inline def setUp1(value: Vector3): Self = StObject.set(x, "up1", value.asInstanceOf[js.Any])
    }
  }
  
  trait LightningSubray extends StObject {
    
    var beginVanishingTime: Double
    
    var birthTime: Double
    
    var deathTime: Double
    
    var endPropagationTime: Double
    
    var linPos0: Vector3
    
    var linPos1: Vector3
    
    var maxIterations: Double
    
    var pos0: Vector3
    
    var pos1: Vector3
    
    var propagationTimeFactor: Double
    
    var radius0: Double
    
    var radius1: Double
    
    var recursion: Double
    
    var roughness: Double
    
    var seed: Double
    
    var straightness: Double
    
    var timeScale: Double
    
    var up0: Vector3
    
    var up1: Vector3
    
    var vanishingTimeFactor: Double
  }
  object LightningSubray {
    
    inline def apply(
      beginVanishingTime: Double,
      birthTime: Double,
      deathTime: Double,
      endPropagationTime: Double,
      linPos0: Vector3,
      linPos1: Vector3,
      maxIterations: Double,
      pos0: Vector3,
      pos1: Vector3,
      propagationTimeFactor: Double,
      radius0: Double,
      radius1: Double,
      recursion: Double,
      roughness: Double,
      seed: Double,
      straightness: Double,
      timeScale: Double,
      up0: Vector3,
      up1: Vector3,
      vanishingTimeFactor: Double
    ): LightningSubray = {
      val __obj = js.Dynamic.literal(beginVanishingTime = beginVanishingTime.asInstanceOf[js.Any], birthTime = birthTime.asInstanceOf[js.Any], deathTime = deathTime.asInstanceOf[js.Any], endPropagationTime = endPropagationTime.asInstanceOf[js.Any], linPos0 = linPos0.asInstanceOf[js.Any], linPos1 = linPos1.asInstanceOf[js.Any], maxIterations = maxIterations.asInstanceOf[js.Any], pos0 = pos0.asInstanceOf[js.Any], pos1 = pos1.asInstanceOf[js.Any], propagationTimeFactor = propagationTimeFactor.asInstanceOf[js.Any], radius0 = radius0.asInstanceOf[js.Any], radius1 = radius1.asInstanceOf[js.Any], recursion = recursion.asInstanceOf[js.Any], roughness = roughness.asInstanceOf[js.Any], seed = seed.asInstanceOf[js.Any], straightness = straightness.asInstanceOf[js.Any], timeScale = timeScale.asInstanceOf[js.Any], up0 = up0.asInstanceOf[js.Any], up1 = up1.asInstanceOf[js.Any], vanishingTimeFactor = vanishingTimeFactor.asInstanceOf[js.Any])
      __obj.asInstanceOf[LightningSubray]
    }
    
    extension [Self <: LightningSubray](x: Self) {
      
      inline def setBeginVanishingTime(value: Double): Self = StObject.set(x, "beginVanishingTime", value.asInstanceOf[js.Any])
      
      inline def setBirthTime(value: Double): Self = StObject.set(x, "birthTime", value.asInstanceOf[js.Any])
      
      inline def setDeathTime(value: Double): Self = StObject.set(x, "deathTime", value.asInstanceOf[js.Any])
      
      inline def setEndPropagationTime(value: Double): Self = StObject.set(x, "endPropagationTime", value.asInstanceOf[js.Any])
      
      inline def setLinPos0(value: Vector3): Self = StObject.set(x, "linPos0", value.asInstanceOf[js.Any])
      
      inline def setLinPos1(value: Vector3): Self = StObject.set(x, "linPos1", value.asInstanceOf[js.Any])
      
      inline def setMaxIterations(value: Double): Self = StObject.set(x, "maxIterations", value.asInstanceOf[js.Any])
      
      inline def setPos0(value: Vector3): Self = StObject.set(x, "pos0", value.asInstanceOf[js.Any])
      
      inline def setPos1(value: Vector3): Self = StObject.set(x, "pos1", value.asInstanceOf[js.Any])
      
      inline def setPropagationTimeFactor(value: Double): Self = StObject.set(x, "propagationTimeFactor", value.asInstanceOf[js.Any])
      
      inline def setRadius0(value: Double): Self = StObject.set(x, "radius0", value.asInstanceOf[js.Any])
      
      inline def setRadius1(value: Double): Self = StObject.set(x, "radius1", value.asInstanceOf[js.Any])
      
      inline def setRecursion(value: Double): Self = StObject.set(x, "recursion", value.asInstanceOf[js.Any])
      
      inline def setRoughness(value: Double): Self = StObject.set(x, "roughness", value.asInstanceOf[js.Any])
      
      inline def setSeed(value: Double): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
      
      inline def setStraightness(value: Double): Self = StObject.set(x, "straightness", value.asInstanceOf[js.Any])
      
      inline def setTimeScale(value: Double): Self = StObject.set(x, "timeScale", value.asInstanceOf[js.Any])
      
      inline def setUp0(value: Vector3): Self = StObject.set(x, "up0", value.asInstanceOf[js.Any])
      
      inline def setUp1(value: Vector3): Self = StObject.set(x, "up1", value.asInstanceOf[js.Any])
      
      inline def setVanishingTimeFactor(value: Double): Self = StObject.set(x, "vanishingTimeFactor", value.asInstanceOf[js.Any])
    }
  }
  
  trait RandomGenerator extends StObject {
    
    def getSeed(): Double
    
    def random(): Double
    
    def setSeed(seed: Double): Unit
  }
  object RandomGenerator {
    
    inline def apply(getSeed: () => Double, random: () => Double, setSeed: Double => Unit): RandomGenerator = {
      val __obj = js.Dynamic.literal(getSeed = js.Any.fromFunction0(getSeed), random = js.Any.fromFunction0(random), setSeed = js.Any.fromFunction1(setSeed))
      __obj.asInstanceOf[RandomGenerator]
    }
    
    extension [Self <: RandomGenerator](x: Self) {
      
      inline def setGetSeed(value: () => Double): Self = StObject.set(x, "getSeed", js.Any.fromFunction0(value))
      
      inline def setRandom(value: () => Double): Self = StObject.set(x, "random", js.Any.fromFunction0(value))
      
      inline def setSetSeed(value: Double => Unit): Self = StObject.set(x, "setSeed", js.Any.fromFunction1(value))
    }
  }
  
  trait RayParameters extends StObject {
    
    var birthTime: js.UndefOr[Double] = js.undefined
    
    var deathTime: js.UndefOr[Double] = js.undefined
    
    var destOffset: js.UndefOr[Vector3] = js.undefined
    
    var generateUVs: js.UndefOr[Boolean] = js.undefined
    
    var isEternal: js.UndefOr[Boolean] = js.undefined
    
    var isStatic: js.UndefOr[Boolean] = js.undefined
    
    var maxIterations: js.UndefOr[Double] = js.undefined
    
    var maxSubrayRecursion: js.UndefOr[Double] = js.undefined
    
    var minRadius: js.UndefOr[Double] = js.undefined
    
    var noiseSeed: js.UndefOr[Double] = js.undefined
    
    var onDecideSubrayCreation: js.UndefOr[
        js.Function2[/* segment */ LightningSegment, /* lightningStrike */ LightningStrike, Unit]
      ] = js.undefined
    
    var onSubrayCreation: js.UndefOr[
        js.Function4[
          /* segment */ LightningSegment, 
          /* parentSubray */ LightningSubray, 
          /* childSubray */ LightningSubray, 
          /* lightningStrike */ LightningStrike, 
          Unit
        ]
      ] = js.undefined
    
    var propagationTimeFactor: js.UndefOr[Double] = js.undefined
    
    var radius0: js.UndefOr[Double] = js.undefined
    
    var radius0Factor: js.UndefOr[Double] = js.undefined
    
    var radius1: js.UndefOr[Double] = js.undefined
    
    var radius1Factor: js.UndefOr[Double] = js.undefined
    
    var ramification: js.UndefOr[Double] = js.undefined
    
    var randomGenerator: js.UndefOr[RandomGenerator] = js.undefined
    
    var recursionProbability: js.UndefOr[Double] = js.undefined
    
    var roughness: js.UndefOr[Double] = js.undefined
    
    var sourceOffset: js.UndefOr[Vector3] = js.undefined
    
    var straightness: js.UndefOr[Double] = js.undefined
    
    var subrayDutyCycle: js.UndefOr[Double] = js.undefined
    
    var subrayPeriod: js.UndefOr[Double] = js.undefined
    
    var timeScale: js.UndefOr[Double] = js.undefined
    
    var up0: js.UndefOr[Vector3] = js.undefined
    
    var up1: js.UndefOr[Vector3] = js.undefined
    
    var vanishingTimeFactor: js.UndefOr[Double] = js.undefined
  }
  object RayParameters {
    
    inline def apply(): RayParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RayParameters]
    }
    
    extension [Self <: RayParameters](x: Self) {
      
      inline def setBirthTime(value: Double): Self = StObject.set(x, "birthTime", value.asInstanceOf[js.Any])
      
      inline def setBirthTimeUndefined: Self = StObject.set(x, "birthTime", js.undefined)
      
      inline def setDeathTime(value: Double): Self = StObject.set(x, "deathTime", value.asInstanceOf[js.Any])
      
      inline def setDeathTimeUndefined: Self = StObject.set(x, "deathTime", js.undefined)
      
      inline def setDestOffset(value: Vector3): Self = StObject.set(x, "destOffset", value.asInstanceOf[js.Any])
      
      inline def setDestOffsetUndefined: Self = StObject.set(x, "destOffset", js.undefined)
      
      inline def setGenerateUVs(value: Boolean): Self = StObject.set(x, "generateUVs", value.asInstanceOf[js.Any])
      
      inline def setGenerateUVsUndefined: Self = StObject.set(x, "generateUVs", js.undefined)
      
      inline def setIsEternal(value: Boolean): Self = StObject.set(x, "isEternal", value.asInstanceOf[js.Any])
      
      inline def setIsEternalUndefined: Self = StObject.set(x, "isEternal", js.undefined)
      
      inline def setIsStatic(value: Boolean): Self = StObject.set(x, "isStatic", value.asInstanceOf[js.Any])
      
      inline def setIsStaticUndefined: Self = StObject.set(x, "isStatic", js.undefined)
      
      inline def setMaxIterations(value: Double): Self = StObject.set(x, "maxIterations", value.asInstanceOf[js.Any])
      
      inline def setMaxIterationsUndefined: Self = StObject.set(x, "maxIterations", js.undefined)
      
      inline def setMaxSubrayRecursion(value: Double): Self = StObject.set(x, "maxSubrayRecursion", value.asInstanceOf[js.Any])
      
      inline def setMaxSubrayRecursionUndefined: Self = StObject.set(x, "maxSubrayRecursion", js.undefined)
      
      inline def setMinRadius(value: Double): Self = StObject.set(x, "minRadius", value.asInstanceOf[js.Any])
      
      inline def setMinRadiusUndefined: Self = StObject.set(x, "minRadius", js.undefined)
      
      inline def setNoiseSeed(value: Double): Self = StObject.set(x, "noiseSeed", value.asInstanceOf[js.Any])
      
      inline def setNoiseSeedUndefined: Self = StObject.set(x, "noiseSeed", js.undefined)
      
      inline def setOnDecideSubrayCreation(value: (/* segment */ LightningSegment, /* lightningStrike */ LightningStrike) => Unit): Self = StObject.set(x, "onDecideSubrayCreation", js.Any.fromFunction2(value))
      
      inline def setOnDecideSubrayCreationUndefined: Self = StObject.set(x, "onDecideSubrayCreation", js.undefined)
      
      inline def setOnSubrayCreation(
        value: (/* segment */ LightningSegment, /* parentSubray */ LightningSubray, /* childSubray */ LightningSubray, /* lightningStrike */ LightningStrike) => Unit
      ): Self = StObject.set(x, "onSubrayCreation", js.Any.fromFunction4(value))
      
      inline def setOnSubrayCreationUndefined: Self = StObject.set(x, "onSubrayCreation", js.undefined)
      
      inline def setPropagationTimeFactor(value: Double): Self = StObject.set(x, "propagationTimeFactor", value.asInstanceOf[js.Any])
      
      inline def setPropagationTimeFactorUndefined: Self = StObject.set(x, "propagationTimeFactor", js.undefined)
      
      inline def setRadius0(value: Double): Self = StObject.set(x, "radius0", value.asInstanceOf[js.Any])
      
      inline def setRadius0Factor(value: Double): Self = StObject.set(x, "radius0Factor", value.asInstanceOf[js.Any])
      
      inline def setRadius0FactorUndefined: Self = StObject.set(x, "radius0Factor", js.undefined)
      
      inline def setRadius0Undefined: Self = StObject.set(x, "radius0", js.undefined)
      
      inline def setRadius1(value: Double): Self = StObject.set(x, "radius1", value.asInstanceOf[js.Any])
      
      inline def setRadius1Factor(value: Double): Self = StObject.set(x, "radius1Factor", value.asInstanceOf[js.Any])
      
      inline def setRadius1FactorUndefined: Self = StObject.set(x, "radius1Factor", js.undefined)
      
      inline def setRadius1Undefined: Self = StObject.set(x, "radius1", js.undefined)
      
      inline def setRamification(value: Double): Self = StObject.set(x, "ramification", value.asInstanceOf[js.Any])
      
      inline def setRamificationUndefined: Self = StObject.set(x, "ramification", js.undefined)
      
      inline def setRandomGenerator(value: RandomGenerator): Self = StObject.set(x, "randomGenerator", value.asInstanceOf[js.Any])
      
      inline def setRandomGeneratorUndefined: Self = StObject.set(x, "randomGenerator", js.undefined)
      
      inline def setRecursionProbability(value: Double): Self = StObject.set(x, "recursionProbability", value.asInstanceOf[js.Any])
      
      inline def setRecursionProbabilityUndefined: Self = StObject.set(x, "recursionProbability", js.undefined)
      
      inline def setRoughness(value: Double): Self = StObject.set(x, "roughness", value.asInstanceOf[js.Any])
      
      inline def setRoughnessUndefined: Self = StObject.set(x, "roughness", js.undefined)
      
      inline def setSourceOffset(value: Vector3): Self = StObject.set(x, "sourceOffset", value.asInstanceOf[js.Any])
      
      inline def setSourceOffsetUndefined: Self = StObject.set(x, "sourceOffset", js.undefined)
      
      inline def setStraightness(value: Double): Self = StObject.set(x, "straightness", value.asInstanceOf[js.Any])
      
      inline def setStraightnessUndefined: Self = StObject.set(x, "straightness", js.undefined)
      
      inline def setSubrayDutyCycle(value: Double): Self = StObject.set(x, "subrayDutyCycle", value.asInstanceOf[js.Any])
      
      inline def setSubrayDutyCycleUndefined: Self = StObject.set(x, "subrayDutyCycle", js.undefined)
      
      inline def setSubrayPeriod(value: Double): Self = StObject.set(x, "subrayPeriod", value.asInstanceOf[js.Any])
      
      inline def setSubrayPeriodUndefined: Self = StObject.set(x, "subrayPeriod", js.undefined)
      
      inline def setTimeScale(value: Double): Self = StObject.set(x, "timeScale", value.asInstanceOf[js.Any])
      
      inline def setTimeScaleUndefined: Self = StObject.set(x, "timeScale", js.undefined)
      
      inline def setUp0(value: Vector3): Self = StObject.set(x, "up0", value.asInstanceOf[js.Any])
      
      inline def setUp0Undefined: Self = StObject.set(x, "up0", js.undefined)
      
      inline def setUp1(value: Vector3): Self = StObject.set(x, "up1", value.asInstanceOf[js.Any])
      
      inline def setUp1Undefined: Self = StObject.set(x, "up1", js.undefined)
      
      inline def setVanishingTimeFactor(value: Double): Self = StObject.set(x, "vanishingTimeFactor", value.asInstanceOf[js.Any])
      
      inline def setVanishingTimeFactorUndefined: Self = StObject.set(x, "vanishingTimeFactor", js.undefined)
    }
  }
}
