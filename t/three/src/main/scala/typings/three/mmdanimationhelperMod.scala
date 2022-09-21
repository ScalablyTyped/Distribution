package typings.three

import typings.std.GainNode
import typings.std.WeakMap
import typings.three.anon.Afterglow
import typings.three.anon.Animation
import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.ccdiksolverMod.CCDIKSolver
import typings.three.eventDispatcherMod.Event
import typings.three.materialMod.Material
import typings.three.mmdphysicsMod.MMDPhysics
import typings.three.threeMod.AnimationClip
import typings.three.threeMod.AnimationMixer
import typings.three.threeMod.Audio
import typings.three.threeMod.Bone
import typings.three.threeMod.Camera
import typings.three.threeMod.Object3D
import typings.three.threeMod.Quaternion
import typings.three.threeMod.SkinnedMesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mmdanimationhelperMod {
  
  @JSImport("three/examples/jsm/animation/MMDAnimationHelper", "AudioManager")
  @js.native
  open class AudioManager protected () extends StObject {
    def this(audio: Audio[GainNode]) = this()
    def this(audio: Audio[GainNode], params: AudioManagerParameter) = this()
    
    var audio: Audio[GainNode] = js.native
    
    var audioDuration: Double = js.native
    
    def control(delta: Double): this.type = js.native
    
    var currentTime: Double = js.native
    
    var delayTime: Double = js.native
    
    var duration: Double = js.native
    
    var elapsedTime: Double = js.native
  }
  
  @JSImport("three/examples/jsm/animation/MMDAnimationHelper", "GrantSolver")
  @js.native
  open class GrantSolver protected () extends StObject {
    def this(mesh: SkinnedMesh[BufferGeometry, Material | js.Array[Material]], grants: js.Array[js.Object]) = this()
    
    def addGrantRotation(bone: Bone, q: Quaternion, ratio: Double): this.type = js.native
    
    var grants: js.Array[js.Object] = js.native
    
    var mesh: SkinnedMesh[BufferGeometry, Material | js.Array[Material]] = js.native
    
    def update(): this.type = js.native
    
    def updateOne(gran: js.Array[js.Object]): this.type = js.native
  }
  
  @JSImport("three/examples/jsm/animation/MMDAnimationHelper", "MMDAnimationHelper")
  @js.native
  open class MMDAnimationHelper () extends StObject {
    def this(params: MMDAnimationHelperParameter) = this()
    
    def add(`object`: Audio[GainNode]): this.type = js.native
    def add(`object`: Audio[GainNode], params: MMDAnimationHelperAddParameter): this.type = js.native
    def add(`object`: Camera): this.type = js.native
    def add(`object`: Camera, params: MMDAnimationHelperAddParameter): this.type = js.native
    def add(`object`: SkinnedMesh[BufferGeometry, Material | js.Array[Material]]): this.type = js.native
    def add(
      `object`: SkinnedMesh[BufferGeometry, Material | js.Array[Material]],
      params: MMDAnimationHelperAddParameter
    ): this.type = js.native
    
    var audio: Audio[GainNode] = js.native
    
    var audioManager: AudioManager = js.native
    
    var camera: Camera | Null = js.native
    
    var cameraTarget: Object3D[Event] = js.native
    
    var configuration: Afterglow = js.native
    
    def createGrantSolver(mesh: SkinnedMesh[BufferGeometry, Material | js.Array[Material]]): GrantSolver = js.native
    
    def enable(key: String, enabled: Boolean): this.type = js.native
    
    var enabled: Animation = js.native
    
    var masterPhysics: Null = js.native
    
    var meshes: js.Array[SkinnedMesh[BufferGeometry, Material | js.Array[Material]]] = js.native
    
    var objects: WeakMap[
        (SkinnedMesh[BufferGeometry, Material | js.Array[Material]]) | Camera | AudioManager, 
        MMDAnimationHelperMixer
      ] = js.native
    
    def onBeforePhysics(mesh: SkinnedMesh[BufferGeometry, Material | js.Array[Material]]): Unit = js.native
    
    def pose(mesh: SkinnedMesh[BufferGeometry, Material | js.Array[Material]], vpd: js.Object): this.type = js.native
    def pose(
      mesh: SkinnedMesh[BufferGeometry, Material | js.Array[Material]],
      vpd: js.Object,
      params: MMDAnimationHelperPoseParameter
    ): this.type = js.native
    
    def remove(`object`: Audio[GainNode]): this.type = js.native
    def remove(`object`: Camera): this.type = js.native
    def remove(`object`: SkinnedMesh[BufferGeometry, Material | js.Array[Material]]): this.type = js.native
    
    var sharedPhysics: Boolean = js.native
    
    def update(delta: Double): this.type = js.native
  }
  
  trait AudioManagerParameter extends StObject {
    
    var delayTime: js.UndefOr[Double] = js.undefined
  }
  object AudioManagerParameter {
    
    inline def apply(): AudioManagerParameter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AudioManagerParameter]
    }
    
    extension [Self <: AudioManagerParameter](x: Self) {
      
      inline def setDelayTime(value: Double): Self = StObject.set(x, "delayTime", value.asInstanceOf[js.Any])
      
      inline def setDelayTimeUndefined: Self = StObject.set(x, "delayTime", js.undefined)
    }
  }
  
  trait MMDAnimationHelperAddParameter extends StObject {
    
    var animation: js.UndefOr[AnimationClip | js.Array[AnimationClip]] = js.undefined
    
    var delayTime: js.UndefOr[Double] = js.undefined
    
    var gravity: js.UndefOr[Double] = js.undefined
    
    var maxStepNum: js.UndefOr[Double] = js.undefined
    
    var physics: js.UndefOr[Boolean] = js.undefined
    
    var unitStep: js.UndefOr[Double] = js.undefined
    
    var warmup: js.UndefOr[Double] = js.undefined
  }
  object MMDAnimationHelperAddParameter {
    
    inline def apply(): MMDAnimationHelperAddParameter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MMDAnimationHelperAddParameter]
    }
    
    extension [Self <: MMDAnimationHelperAddParameter](x: Self) {
      
      inline def setAnimation(value: AnimationClip | js.Array[AnimationClip]): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setAnimationVarargs(value: AnimationClip*): Self = StObject.set(x, "animation", js.Array(value*))
      
      inline def setDelayTime(value: Double): Self = StObject.set(x, "delayTime", value.asInstanceOf[js.Any])
      
      inline def setDelayTimeUndefined: Self = StObject.set(x, "delayTime", js.undefined)
      
      inline def setGravity(value: Double): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
      
      inline def setGravityUndefined: Self = StObject.set(x, "gravity", js.undefined)
      
      inline def setMaxStepNum(value: Double): Self = StObject.set(x, "maxStepNum", value.asInstanceOf[js.Any])
      
      inline def setMaxStepNumUndefined: Self = StObject.set(x, "maxStepNum", js.undefined)
      
      inline def setPhysics(value: Boolean): Self = StObject.set(x, "physics", value.asInstanceOf[js.Any])
      
      inline def setPhysicsUndefined: Self = StObject.set(x, "physics", js.undefined)
      
      inline def setUnitStep(value: Double): Self = StObject.set(x, "unitStep", value.asInstanceOf[js.Any])
      
      inline def setUnitStepUndefined: Self = StObject.set(x, "unitStep", js.undefined)
      
      inline def setWarmup(value: Double): Self = StObject.set(x, "warmup", value.asInstanceOf[js.Any])
      
      inline def setWarmupUndefined: Self = StObject.set(x, "warmup", js.undefined)
    }
  }
  
  trait MMDAnimationHelperMixer extends StObject {
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var grantSolver: GrantSolver
    
    var ikSolver: CCDIKSolver
    
    var looped: Boolean
    
    var mixer: js.UndefOr[AnimationMixer] = js.undefined
    
    var physics: js.UndefOr[MMDPhysics] = js.undefined
  }
  object MMDAnimationHelperMixer {
    
    inline def apply(grantSolver: GrantSolver, ikSolver: CCDIKSolver, looped: Boolean): MMDAnimationHelperMixer = {
      val __obj = js.Dynamic.literal(grantSolver = grantSolver.asInstanceOf[js.Any], ikSolver = ikSolver.asInstanceOf[js.Any], looped = looped.asInstanceOf[js.Any])
      __obj.asInstanceOf[MMDAnimationHelperMixer]
    }
    
    extension [Self <: MMDAnimationHelperMixer](x: Self) {
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setGrantSolver(value: GrantSolver): Self = StObject.set(x, "grantSolver", value.asInstanceOf[js.Any])
      
      inline def setIkSolver(value: CCDIKSolver): Self = StObject.set(x, "ikSolver", value.asInstanceOf[js.Any])
      
      inline def setLooped(value: Boolean): Self = StObject.set(x, "looped", value.asInstanceOf[js.Any])
      
      inline def setMixer(value: AnimationMixer): Self = StObject.set(x, "mixer", value.asInstanceOf[js.Any])
      
      inline def setMixerUndefined: Self = StObject.set(x, "mixer", js.undefined)
      
      inline def setPhysics(value: MMDPhysics): Self = StObject.set(x, "physics", value.asInstanceOf[js.Any])
      
      inline def setPhysicsUndefined: Self = StObject.set(x, "physics", js.undefined)
    }
  }
  
  trait MMDAnimationHelperParameter extends StObject {
    
    var afterglow: js.UndefOr[Double] = js.undefined
    
    var resetPhysicsOnLoop: js.UndefOr[Boolean] = js.undefined
    
    var sync: js.UndefOr[Boolean] = js.undefined
  }
  object MMDAnimationHelperParameter {
    
    inline def apply(): MMDAnimationHelperParameter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MMDAnimationHelperParameter]
    }
    
    extension [Self <: MMDAnimationHelperParameter](x: Self) {
      
      inline def setAfterglow(value: Double): Self = StObject.set(x, "afterglow", value.asInstanceOf[js.Any])
      
      inline def setAfterglowUndefined: Self = StObject.set(x, "afterglow", js.undefined)
      
      inline def setResetPhysicsOnLoop(value: Boolean): Self = StObject.set(x, "resetPhysicsOnLoop", value.asInstanceOf[js.Any])
      
      inline def setResetPhysicsOnLoopUndefined: Self = StObject.set(x, "resetPhysicsOnLoop", js.undefined)
      
      inline def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
      
      inline def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
    }
  }
  
  trait MMDAnimationHelperPoseParameter extends StObject {
    
    var grant: js.UndefOr[Boolean] = js.undefined
    
    var ik: js.UndefOr[Boolean] = js.undefined
    
    var resetPose: js.UndefOr[Boolean] = js.undefined
  }
  object MMDAnimationHelperPoseParameter {
    
    inline def apply(): MMDAnimationHelperPoseParameter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MMDAnimationHelperPoseParameter]
    }
    
    extension [Self <: MMDAnimationHelperPoseParameter](x: Self) {
      
      inline def setGrant(value: Boolean): Self = StObject.set(x, "grant", value.asInstanceOf[js.Any])
      
      inline def setGrantUndefined: Self = StObject.set(x, "grant", js.undefined)
      
      inline def setIk(value: Boolean): Self = StObject.set(x, "ik", value.asInstanceOf[js.Any])
      
      inline def setIkUndefined: Self = StObject.set(x, "ik", js.undefined)
      
      inline def setResetPose(value: Boolean): Self = StObject.set(x, "resetPose", value.asInstanceOf[js.Any])
      
      inline def setResetPoseUndefined: Self = StObject.set(x, "resetPose", js.undefined)
    }
  }
}
