package typings.three

import typings.three.anon.Threshold
import typings.three.anon.X
import typings.three.cameraMod.Camera
import typings.three.face3Mod.Face3
import typings.three.layersMod.Layers
import typings.three.object3DMod.Object3D
import typings.three.rayMod.Ray
import typings.three.vector2Mod.Vector2
import typings.three.vector3Mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object raycasterMod {
  
  @JSImport("three/src/core/Raycaster", "Raycaster")
  @js.native
  /**
  	 * This creates a new raycaster object.
  	 * @param origin The origin vector where the ray casts from.
  	 * @param direction The direction vector that gives direction to the ray. Should be normalized.
  	 * @param near All results returned are further away than near. Near can't be negative. Default value is 0.
  	 * @param far All results returned are closer then far. Far can't be lower then near . Default value is Infinity.
  	 */
  class Raycaster () extends StObject {
    def this(origin: Vector3) = this()
    def this(origin: Unit, direction: Vector3) = this()
    def this(origin: Vector3, direction: Vector3) = this()
    def this(origin: Unit, direction: Unit, near: Double) = this()
    def this(origin: Unit, direction: Vector3, near: Double) = this()
    def this(origin: Vector3, direction: Unit, near: Double) = this()
    def this(origin: Vector3, direction: Vector3, near: Double) = this()
    def this(origin: Unit, direction: Unit, near: Double, far: Double) = this()
    def this(origin: Unit, direction: Unit, near: Unit, far: Double) = this()
    def this(origin: Unit, direction: Vector3, near: Double, far: Double) = this()
    def this(origin: Unit, direction: Vector3, near: Unit, far: Double) = this()
    def this(origin: Vector3, direction: Unit, near: Double, far: Double) = this()
    def this(origin: Vector3, direction: Unit, near: Unit, far: Double) = this()
    def this(origin: Vector3, direction: Vector3, near: Double, far: Double) = this()
    def this(origin: Vector3, direction: Vector3, near: Unit, far: Double) = this()
    
    /**
    	 * The camera to use when raycasting against view-dependent objects such as billboarded objects like Sprites. This field
    	 * can be set manually or is set when calling "setFromCamera".
    	 */
    var camera: Camera = js.native
    
    /**
    	 * The far factor of the raycaster. This value indicates which objects can be discarded based on the
    	 * distance. This value shouldn't be negative and should be larger than the near property.
    	 * @default Infinity
    	 */
    var far: Double = js.native
    
    /**
    	 * Checks all intersection between the ray and the object with or without the descendants. Intersections are returned sorted by distance, closest first.
    	 * @param object The object to check for intersection with the ray.
    	 * @param recursive If true, it also checks all descendants. Otherwise it only checks intersecton with the object. Default is false.
    	 * @param optionalTarget (optional) target to set the result. Otherwise a new Array is instantiated. If set, you must clear this array prior to each call (i.e., array.length = 0;).
    	 */
    def intersectObject(`object`: Object3D): js.Array[Intersection] = js.native
    def intersectObject(`object`: Object3D, recursive: Boolean): js.Array[Intersection] = js.native
    def intersectObject(`object`: Object3D, recursive: Boolean, optionalTarget: js.Array[Intersection]): js.Array[Intersection] = js.native
    def intersectObject(`object`: Object3D, recursive: Unit, optionalTarget: js.Array[Intersection]): js.Array[Intersection] = js.native
    
    /**
    	 * Checks all intersection between the ray and the objects with or without the descendants. Intersections are returned sorted by distance, closest first. Intersections are of the same form as those returned by .intersectObject.
    	 * @param objects The objects to check for intersection with the ray.
    	 * @param recursive If true, it also checks all descendants of the objects. Otherwise it only checks intersecton with the objects. Default is false.
    	 * @param optionalTarget (optional) target to set the result. Otherwise a new Array is instantiated. If set, you must clear this array prior to each call (i.e., array.length = 0;).
    	 */
    def intersectObjects(objects: js.Array[Object3D]): js.Array[Intersection] = js.native
    def intersectObjects(objects: js.Array[Object3D], recursive: Boolean): js.Array[Intersection] = js.native
    def intersectObjects(objects: js.Array[Object3D], recursive: Boolean, optionalTarget: js.Array[Intersection]): js.Array[Intersection] = js.native
    def intersectObjects(objects: js.Array[Object3D], recursive: Unit, optionalTarget: js.Array[Intersection]): js.Array[Intersection] = js.native
    
    /**
    	 * Used by Raycaster to selectively ignore 3D objects when performing intersection tests.
    	 * @default new THREE.Layers()
    	 */
    var layers: Layers = js.native
    
    /**
    	 * The near factor of the raycaster. This value indicates which objects can be discarded based on the
    	 * distance. This value shouldn't be negative and should be smaller than the far property.
    	 * @default 0
    	 */
    var near: Double = js.native
    
    /**
    	 * @default { Mesh: {}, Line: { threshold: 1 }, LOD: {}, Points: { threshold: 1 }, Sprite: {} }
    	 */
    var params: RaycasterParameters = js.native
    
    /** The Ray used for the raycasting. */
    var ray: Ray = js.native
    
    /**
    	 * Updates the ray with a new origin and direction.
    	 * @param origin The origin vector where the ray casts from.
    	 * @param direction The normalized direction vector that gives direction to the ray.
    	 */
    def set(origin: Vector3, direction: Vector3): Unit = js.native
    
    /**
    	 * Updates the ray with a new origin and direction.
    	 * @param coords 2D coordinates of the mouse, in normalized device coordinates (NDC)---X and Y components should be between -1 and 1.
    	 * @param camera camera from which the ray should originate
    	 */
    def setFromCamera(coords: X, camera: Camera): Unit = js.native
  }
  
  trait Intersection extends StObject {
    
    var distance: Double
    
    var distanceToRay: js.UndefOr[Double] = js.undefined
    
    var face: js.UndefOr[Face3 | Null] = js.undefined
    
    var faceIndex: js.UndefOr[Double] = js.undefined
    
    var index: js.UndefOr[Double] = js.undefined
    
    var instanceId: js.UndefOr[Double] = js.undefined
    
    var `object`: Object3D
    
    var point: Vector3
    
    var uv: js.UndefOr[Vector2] = js.undefined
  }
  object Intersection {
    
    @scala.inline
    def apply(distance: Double, `object`: Object3D, point: Vector3): Intersection = {
      val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Intersection]
    }
    
    @scala.inline
    implicit class IntersectionMutableBuilder[Self <: Intersection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistanceToRay(value: Double): Self = StObject.set(x, "distanceToRay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistanceToRayUndefined: Self = StObject.set(x, "distanceToRay", js.undefined)
      
      @scala.inline
      def setFace(value: Face3): Self = StObject.set(x, "face", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFaceIndex(value: Double): Self = StObject.set(x, "faceIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFaceIndexUndefined: Self = StObject.set(x, "faceIndex", js.undefined)
      
      @scala.inline
      def setFaceNull: Self = StObject.set(x, "face", null)
      
      @scala.inline
      def setFaceUndefined: Self = StObject.set(x, "face", js.undefined)
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setInstanceId(value: Double): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
      
      @scala.inline
      def setObject(value: Object3D): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPoint(value: Vector3): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUv(value: Vector2): Self = StObject.set(x, "uv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUvUndefined: Self = StObject.set(x, "uv", js.undefined)
    }
  }
  
  trait RaycasterParameters extends StObject {
    
    var LOD: js.UndefOr[js.Any] = js.undefined
    
    var Line: js.UndefOr[Threshold] = js.undefined
    
    var Mesh: js.UndefOr[js.Any] = js.undefined
    
    var Points: js.UndefOr[Threshold] = js.undefined
    
    var Sprite: js.UndefOr[js.Any] = js.undefined
  }
  object RaycasterParameters {
    
    @scala.inline
    def apply(): RaycasterParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RaycasterParameters]
    }
    
    @scala.inline
    implicit class RaycasterParametersMutableBuilder[Self <: RaycasterParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLOD(value: js.Any): Self = StObject.set(x, "LOD", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLODUndefined: Self = StObject.set(x, "LOD", js.undefined)
      
      @scala.inline
      def setLine(value: Threshold): Self = StObject.set(x, "Line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineUndefined: Self = StObject.set(x, "Line", js.undefined)
      
      @scala.inline
      def setMesh(value: js.Any): Self = StObject.set(x, "Mesh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeshUndefined: Self = StObject.set(x, "Mesh", js.undefined)
      
      @scala.inline
      def setPoints(value: Threshold): Self = StObject.set(x, "Points", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointsUndefined: Self = StObject.set(x, "Points", js.undefined)
      
      @scala.inline
      def setSprite(value: js.Any): Self = StObject.set(x, "Sprite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpriteUndefined: Self = StObject.set(x, "Sprite", js.undefined)
    }
  }
}
