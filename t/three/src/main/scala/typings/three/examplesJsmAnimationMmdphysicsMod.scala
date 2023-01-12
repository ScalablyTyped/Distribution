package typings.three

import typings.three.mod.MeshBasicMaterial
import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcThreeMod.Bone
import typings.three.srcThreeMod.Euler
import typings.three.srcThreeMod.Matrix4
import typings.three.srcThreeMod.Object3D
import typings.three.srcThreeMod.Quaternion
import typings.three.srcThreeMod.SkinnedMesh
import typings.three.srcThreeMod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmAnimationMmdphysicsMod {
  
  @JSImport("three/examples/jsm/animation/MMDPhysics", "Constraint")
  @js.native
  open class Constraint protected () extends StObject {
    def this(
      mesh: SkinnedMesh[BufferGeometry, Material | js.Array[Material]],
      world: js.Object,
      bodyA: RigidBody,
      bodyB: RigidBody,
      params: js.Object,
      manager: ResourceManager
    ) = this()
    
    var bodyA: RigidBody = js.native
    
    var bodyB: RigidBody = js.native
    
    var manager: ResourceManager = js.native
    
    var mesh: SkinnedMesh[BufferGeometry, Material | js.Array[Material]] = js.native
    
    var params: js.Object = js.native
    
    var world: js.Object = js.native
  }
  
  @JSImport("three/examples/jsm/animation/MMDPhysics", "MMDPhysics")
  @js.native
  open class MMDPhysics protected () extends StObject {
    def this(
      mesh: SkinnedMesh[BufferGeometry, Material | js.Array[Material]],
      rigidBodyParams: js.Array[js.Object]
    ) = this()
    def this(
      mesh: SkinnedMesh[BufferGeometry, Material | js.Array[Material]],
      rigidBodyParams: js.Array[js.Object],
      constraintParams: js.Array[js.Object]
    ) = this()
    def this(
      mesh: SkinnedMesh[BufferGeometry, Material | js.Array[Material]],
      rigidBodyParams: js.Array[js.Object],
      constraintParams: js.Array[js.Object],
      params: MMDPhysicsParameter
    ) = this()
    def this(
      mesh: SkinnedMesh[BufferGeometry, Material | js.Array[Material]],
      rigidBodyParams: js.Array[js.Object],
      constraintParams: Unit,
      params: MMDPhysicsParameter
    ) = this()
    
    var bodies: js.Array[RigidBody] = js.native
    
    var constraints: js.Array[Constraint] = js.native
    
    def createHelper(): MMDPhysicsHelper = js.native
    
    var gravity: Vector3 = js.native
    
    var manager: ResourceManager = js.native
    
    var maxStepNum: Double = js.native
    
    var mesh: SkinnedMesh[BufferGeometry, Material | js.Array[Material]] = js.native
    
    def reset(): this.type = js.native
    
    def setGravity(gravity: Vector3): this.type = js.native
    
    var unitStep: Double = js.native
    
    def update(delta: Double): this.type = js.native
    
    def warmup(cycles: Double): this.type = js.native
    
    var world: Null = js.native
  }
  
  @JSImport("three/examples/jsm/animation/MMDPhysics", "MMDPhysicsHelper")
  @js.native
  open class MMDPhysicsHelper protected () extends Object3D[Event] {
    def this(
      mesh: typings.three.mod.SkinnedMesh[BufferGeometry, Material | js.Array[Material]],
      physics: MMDPhysics
    ) = this()
    
    def dispose(): Unit = js.native
    
    var materials: js.Tuple3[MeshBasicMaterial, MeshBasicMaterial, MeshBasicMaterial] = js.native
    
    var mesh: typings.three.mod.SkinnedMesh[BufferGeometry, Material | js.Array[Material]] = js.native
    
    var physics: MMDPhysics = js.native
  }
  
  @JSImport("three/examples/jsm/animation/MMDPhysics", "ResourceManager")
  @js.native
  open class ResourceManager () extends StObject {
    
    def addVector3(v1: js.Object, v2: js.Object): js.Object = js.native
    
    def allocQuaternion(): Unit = js.native
    
    def allocThreeEuler(): Unit = js.native
    
    def allocThreeMatrix4(): Unit = js.native
    
    def allocThreeQuaternion(): Unit = js.native
    
    def allocThreeVector3(): Unit = js.native
    
    def allocTransform(): Unit = js.native
    
    def allocVector3(): Unit = js.native
    
    def columnOfMatrix3(m: js.Object, i: Double): js.Object = js.native
    
    def copyOrigin(t1: js.Object, t2: js.Object): Unit = js.native
    
    def dotVectors3(v1: js.Object, v2: js.Object): Double = js.native
    
    def freeQuaternion(q: js.Object): Unit = js.native
    
    def freeThreeEuler(e: Euler): Unit = js.native
    
    def freeThreeMatrix4(m: Matrix4): Unit = js.native
    
    def freeThreeQuaternion(q: Quaternion): Unit = js.native
    
    def freeThreeVector3(v: Vector3): Unit = js.native
    
    def freeTransform(t: js.Object): Unit = js.native
    
    def freeVector3(v: js.Object): Unit = js.native
    
    def getBasis(t: js.Object): js.Object = js.native
    
    def getBasisAsMatrix3(t: js.Object): js.Object = js.native
    
    def getOrigin(t: js.Object): js.Object = js.native
    
    def inverseTransform(t: js.Object): js.Object = js.native
    
    def matrix3ToQuaternion(m: js.Object): js.Object = js.native
    
    def multiplyMatrices3(m1: js.Object, m2: js.Object): js.Object = js.native
    
    def multiplyMatrix3ByVector3(m: js.Object, v: js.Object): js.Object = js.native
    
    def multiplyTransforms(t1: js.Object, t2: js.Object): js.Object = js.native
    
    def negativeVector3(v: js.Object): js.Object = js.native
    
    def quaternionToMatrix3(q: js.Object): js.Object = js.native
    
    var quaternions: js.Array[js.Object] = js.native
    
    def rowOfMatrix3(m: js.Object, i: Double): js.Object = js.native
    
    def setBasis(t: js.Object, q: js.Object): Unit = js.native
    
    def setBasisFromArray3(t: js.Object, a: js.Array[Double]): Unit = js.native
    
    def setBasisFromMatrix3(t: js.Object, m: js.Object): Unit = js.native
    
    def setBasisFromThreeQuaternion(t: js.Object, a: Quaternion): Unit = js.native
    
    def setIdentity(): Unit = js.native
    
    def setOrigin(t: js.Object, v: js.Object): Unit = js.native
    
    def setOriginFromArray3(t: js.Object, a: js.Array[Double]): Unit = js.native
    
    def setOriginFromThreeVector3(t: js.Object, v: Vector3): Unit = js.native
    
    var threeEulers: js.Array[Euler] = js.native
    
    var threeMatrix4s: js.Array[Matrix4] = js.native
    
    var threeQuaternions: js.Array[Quaternion] = js.native
    
    var threeVector3s: js.Array[Vector3] = js.native
    
    var transforms: js.Array[js.Object] = js.native
    
    def transposeMatrix3(m: js.Object): js.Object = js.native
    
    var vector3s: js.Array[js.Object] = js.native
  }
  
  @JSImport("three/examples/jsm/animation/MMDPhysics", "RigidBody")
  @js.native
  open class RigidBody protected () extends StObject {
    def this(
      mesh: SkinnedMesh[BufferGeometry, Material | js.Array[Material]],
      world: js.Object,
      params: js.Object,
      manager: ResourceManager
    ) = this()
    
    var body: js.Object = js.native
    
    var bone: Bone = js.native
    
    var boneOffsetForm: js.Object = js.native
    
    var boneOffsetFormInverse: js.Object = js.native
    
    var manager: ResourceManager = js.native
    
    var mesh: SkinnedMesh[BufferGeometry, Material | js.Array[Material]] = js.native
    
    var params: js.Object = js.native
    
    def reset(): this.type = js.native
    
    def updateBone(): this.type = js.native
    
    def updateFromBone(): this.type = js.native
    
    var world: js.Object = js.native
  }
  
  trait MMDPhysicsParameter extends StObject {
    
    var gravity: js.UndefOr[Vector3] = js.undefined
    
    var maxStepNum: js.UndefOr[Double] = js.undefined
    
    var unitStep: js.UndefOr[Double] = js.undefined
  }
  object MMDPhysicsParameter {
    
    inline def apply(): MMDPhysicsParameter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MMDPhysicsParameter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MMDPhysicsParameter] (val x: Self) extends AnyVal {
      
      inline def setGravity(value: Vector3): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
      
      inline def setGravityUndefined: Self = StObject.set(x, "gravity", js.undefined)
      
      inline def setMaxStepNum(value: Double): Self = StObject.set(x, "maxStepNum", value.asInstanceOf[js.Any])
      
      inline def setMaxStepNumUndefined: Self = StObject.set(x, "maxStepNum", js.undefined)
      
      inline def setUnitStep(value: Double): Self = StObject.set(x, "unitStep", value.asInstanceOf[js.Any])
      
      inline def setUnitStepUndefined: Self = StObject.set(x, "unitStep", js.undefined)
    }
  }
}
