package typings.three

import typings.three.anon.Threshold
import typings.three.srcCamerasCameraMod.Camera
import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcCoreLayersMod.Layers
import typings.three.srcCoreObject3DMod.Object3D
import typings.three.srcMathRayMod.Ray
import typings.three.srcMathVector2Mod.Vector2
import typings.three.srcMathVector3Mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCoreRaycasterMod {
  
  @JSImport("three/src/core/Raycaster", "Raycaster")
  @js.native
  /**
    * This creates a new {@link Raycaster} object.
    * @param origin The origin vector where the ray casts from. Default `new Vector3()`
    * @param direction The direction vector that gives direction to the ray. Should be normalized. Default `new Vector3(0, 0, -1)`
    * @param near All results returned are further away than near. Near can't be negative. Expects a `Float`. Default `0`
    * @param far All results returned are closer than far. Far can't be lower than near. Expects a `Float`. Default `Infinity`
    */
  open class Raycaster () extends StObject {
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
      * The camera to use when raycasting against view-dependent objects such as billboarded objects like {@link THREE.Sprites | Sprites}.
      * This field can be set manually or is set when calling  {@link setFromCamera}.
      * @defaultValue `null`
      */
    var camera: Camera = js.native
    
    /**
      * The far factor of the raycaster. This value indicates which objects can be discarded based on the distance.
      * This value shouldn't be negative and should be larger than the near property.
      * @remarks Expects a `Float`
      * @defaultValue `Infinity`
      */
    var far: Double = js.native
    
    /**
      * Checks all intersection between the ray and the object with or without the descendants
      * @remarks Intersections are returned sorted by distance, closest first
      * @remarks {@link Raycaster} delegates to the {@link Object3D.raycast | raycast} method of the passed object, when evaluating whether the ray intersects the object or not
      * This allows {@link THREE.Mesh | meshes} to respond differently to ray casting than {@link THREE.Line | lines} and {@link THREE.Points | pointclouds}.
      * **Note** that for meshes, faces must be pointed towards the origin of the {@link Raycaster.ray | ray} in order to be detected;
      * intersections of the ray passing through the back of a face will not be detected
      * To raycast against both faces of an object, you'll want to set the {@link Mesh.material | material}'s {@link Material.side | side} property to `THREE.DoubleSide`.
      * @see {@link intersectObjects | .intersectObjects()}.
      * @param object The object to check for intersection with the ray.
      * @param recursive If true, it also checks all descendants. Otherwise it only checks intersection with the object. Default `true`
      * @param optionalTarget Target to set the result. Otherwise a new {@link Array | Array} is instantiated.
      * If set, you must clear this array prior to each call (i.e., array.length = 0;). Default `[]`
      * @returns An array of intersections is returned.
      */
    def intersectObject[TIntersected /* <: Object3D[Event] */](`object`: Object3D[Event]): js.Array[Intersection[TIntersected]] = js.native
    def intersectObject[TIntersected /* <: Object3D[Event] */](`object`: Object3D[Event], recursive: Boolean): js.Array[Intersection[TIntersected]] = js.native
    def intersectObject[TIntersected /* <: Object3D[Event] */](
      `object`: Object3D[Event],
      recursive: Boolean,
      optionalTarget: js.Array[Intersection[TIntersected]]
    ): js.Array[Intersection[TIntersected]] = js.native
    def intersectObject[TIntersected /* <: Object3D[Event] */](`object`: Object3D[Event], recursive: Unit, optionalTarget: js.Array[Intersection[TIntersected]]): js.Array[Intersection[TIntersected]] = js.native
    
    /**
      * Checks all intersection between the ray and the objects with or without the descendants
      * @remarks Intersections are returned sorted by distance, closest first
      * @remarks Intersections are of the same form as those returned by {@link intersectObject | .intersectObject()}.
      * @remarks {@link Raycaster} delegates to the {@link Object3D.raycast | raycast} method of the passed object, when evaluating whether the ray intersects the object or not
      * This allows {@link THREE.Mesh | meshes} to respond differently to ray casting than {@link THREE.Line | lines} and {@link THREE.Points | pointclouds}.
      * **Note** that for meshes, faces must be pointed towards the origin of the {@link Raycaster.ray | ray} in order to be detected;
      * intersections of the ray passing through the back of a face will not be detected
      * To raycast against both faces of an object, you'll want to set the {@link Mesh.material | material}'s {@link Material.side | side} property to `THREE.DoubleSide`.
      * @see {@link intersectObject | .intersectObject()}.
      * @param objects The objects to check for intersection with the ray.
      * @param recursive If true, it also checks all descendants of the objects. Otherwise it only checks intersection with the objects. Default `true`
      * @param optionalTarget Target to set the result. Otherwise a new {@link Array | Array} is instantiated.
      * If set, you must clear this array prior to each call (i.e., array.length = 0;). Default `[]`
      * @returns An array of intersections is returned.
      */
    def intersectObjects[TIntersected /* <: Object3D[Event] */](objects: js.Array[Object3D[Event]]): js.Array[Intersection[TIntersected]] = js.native
    def intersectObjects[TIntersected /* <: Object3D[Event] */](objects: js.Array[Object3D[Event]], recursive: Boolean): js.Array[Intersection[TIntersected]] = js.native
    def intersectObjects[TIntersected /* <: Object3D[Event] */](
      objects: js.Array[Object3D[Event]],
      recursive: Boolean,
      optionalTarget: js.Array[Intersection[TIntersected]]
    ): js.Array[Intersection[TIntersected]] = js.native
    def intersectObjects[TIntersected /* <: Object3D[Event] */](
      objects: js.Array[Object3D[Event]],
      recursive: Unit,
      optionalTarget: js.Array[Intersection[TIntersected]]
    ): js.Array[Intersection[TIntersected]] = js.native
    
    /**
      * Used by {@link Raycaster} to selectively ignore 3D objects when performing intersection tests.
      * The following code example ensures that only 3D objects on layer `1` will be honored by the instance of Raycaster.
      * ```
      * raycaster.layers.set( 1 );
      * object.layers.enable( 1 );
      * ```
      * @defaultValue `new THREE.Layers()` - See {@link THREE.Layers | Layers}.
      */
    var layers: Layers = js.native
    
    /**
      * The near factor of the raycaster. This value indicates which objects can be discarded based on the distance.
      * This value shouldn't be negative and should be smaller than the far property.
      * @remarks Expects a `Float`
      * @defaultValue `0`
      */
    var near: Double = js.native
    
    /**
      * An data object where threshold is the precision of the {@link Raycaster} when intersecting objects, in world units.
      * @defaultValue `{ Mesh: {}, Line: { threshold: 1 }, LOD: {}, Points: { threshold: 1 }, Sprite: {} }`
      */
    var params: RaycasterParameters = js.native
    
    /**
      * The {@link THREE.RaycasterRay | Ray} used for the raycasting.
      */
    var ray: Ray = js.native
    
    /**
      * Updates the ray with a new origin and direction
      * @remarks
      * Please note that this method only copies the values from the arguments.
      * @param origin The origin vector where the ray casts from.
      * @param direction The normalized direction vector that gives direction to the ray.
      */
    def set(origin: Vector3, direction: Vector3): Unit = js.native
    
    /**
      * Updates the ray with a new origin and direction.
      * @param coords 2D coordinates of the mouse, in normalized device coordinates (NDC)---X and Y components should be between -1 and 1.
      * @param camera camera from which the ray should originate
      */
    def setFromCamera(coords: Vector2, camera: Camera): Unit = js.native
  }
  
  trait Face extends StObject {
    
    var a: Double
    
    var b: Double
    
    var c: Double
    
    var materialIndex: Double
    
    var normal: Vector3
  }
  object Face {
    
    inline def apply(a: Double, b: Double, c: Double, materialIndex: Double, normal: Vector3): Face = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], c = c.asInstanceOf[js.Any], materialIndex = materialIndex.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any])
      __obj.asInstanceOf[Face]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Face] (val x: Self) extends AnyVal {
      
      inline def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setC(value: Double): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
      
      inline def setMaterialIndex(value: Double): Self = StObject.set(x, "materialIndex", value.asInstanceOf[js.Any])
      
      inline def setNormal(value: Vector3): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
    }
  }
  
  trait Intersection[TIntersected /* <: Object3D[Event] */] extends StObject {
    
    /** Distance between the origin of the ray and the intersection */
    var distance: Double
    
    var distanceToRay: js.UndefOr[Double] = js.undefined
    
    /** Intersected face */
    var face: js.UndefOr[Face | Null] = js.undefined
    
    /** Index of the intersected face */
    var faceIndex: js.UndefOr[Double] = js.undefined
    
    var index: js.UndefOr[Double] = js.undefined
    
    /** The index number of the instance where the ray intersects the {@link THREE.InstancedMesh | InstancedMesh } */
    var instanceId: js.UndefOr[Double] = js.undefined
    
    var normal: js.UndefOr[Vector3] = js.undefined
    
    /** The intersected object */
    var `object`: TIntersected
    
    /** Point of intersection, in world coordinates */
    var point: Vector3
    
    var uv: js.UndefOr[Vector2] = js.undefined
    
    var uv1: js.UndefOr[Vector2] = js.undefined
  }
  object Intersection {
    
    inline def apply[TIntersected /* <: Object3D[Event] */](distance: Double, `object`: TIntersected, point: Vector3): Intersection[TIntersected] = {
      val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Intersection[TIntersected]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Intersection[?], TIntersected /* <: Object3D[Event] */] (val x: Self & Intersection[TIntersected]) extends AnyVal {
      
      inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      inline def setDistanceToRay(value: Double): Self = StObject.set(x, "distanceToRay", value.asInstanceOf[js.Any])
      
      inline def setDistanceToRayUndefined: Self = StObject.set(x, "distanceToRay", js.undefined)
      
      inline def setFace(value: Face): Self = StObject.set(x, "face", value.asInstanceOf[js.Any])
      
      inline def setFaceIndex(value: Double): Self = StObject.set(x, "faceIndex", value.asInstanceOf[js.Any])
      
      inline def setFaceIndexUndefined: Self = StObject.set(x, "faceIndex", js.undefined)
      
      inline def setFaceNull: Self = StObject.set(x, "face", null)
      
      inline def setFaceUndefined: Self = StObject.set(x, "face", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setInstanceId(value: Double): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
      
      inline def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
      
      inline def setNormal(value: Vector3): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
      
      inline def setNormalUndefined: Self = StObject.set(x, "normal", js.undefined)
      
      inline def setObject(value: TIntersected): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setPoint(value: Vector3): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
      
      inline def setUv(value: Vector2): Self = StObject.set(x, "uv", value.asInstanceOf[js.Any])
      
      inline def setUv1(value: Vector2): Self = StObject.set(x, "uv1", value.asInstanceOf[js.Any])
      
      inline def setUv1Undefined: Self = StObject.set(x, "uv1", js.undefined)
      
      inline def setUvUndefined: Self = StObject.set(x, "uv", js.undefined)
    }
  }
  
  trait RaycasterParameters extends StObject {
    
    var LOD: js.UndefOr[Any] = js.undefined
    
    var Line: js.UndefOr[Threshold] = js.undefined
    
    var Line2: js.UndefOr[Threshold] = js.undefined
    
    var Mesh: js.UndefOr[Any] = js.undefined
    
    var Points: js.UndefOr[Threshold] = js.undefined
    
    var Sprite: js.UndefOr[Any] = js.undefined
  }
  object RaycasterParameters {
    
    inline def apply(): RaycasterParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RaycasterParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RaycasterParameters] (val x: Self) extends AnyVal {
      
      inline def setLOD(value: Any): Self = StObject.set(x, "LOD", value.asInstanceOf[js.Any])
      
      inline def setLODUndefined: Self = StObject.set(x, "LOD", js.undefined)
      
      inline def setLine(value: Threshold): Self = StObject.set(x, "Line", value.asInstanceOf[js.Any])
      
      inline def setLine2(value: Threshold): Self = StObject.set(x, "Line2", value.asInstanceOf[js.Any])
      
      inline def setLine2Undefined: Self = StObject.set(x, "Line2", js.undefined)
      
      inline def setLineUndefined: Self = StObject.set(x, "Line", js.undefined)
      
      inline def setMesh(value: Any): Self = StObject.set(x, "Mesh", value.asInstanceOf[js.Any])
      
      inline def setMeshUndefined: Self = StObject.set(x, "Mesh", js.undefined)
      
      inline def setPoints(value: Threshold): Self = StObject.set(x, "Points", value.asInstanceOf[js.Any])
      
      inline def setPointsUndefined: Self = StObject.set(x, "Points", js.undefined)
      
      inline def setSprite(value: Any): Self = StObject.set(x, "Sprite", value.asInstanceOf[js.Any])
      
      inline def setSpriteUndefined: Self = StObject.set(x, "Sprite", js.undefined)
    }
  }
}
