package typings.three

import typings.three.anon.Distance
import typings.three.srcCamerasCameraMod.Camera
import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcCoreObject3DMod.Object3D
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsLodMod {
  
  @JSImport("three/src/objects/LOD", "LOD")
  @js.native
  /**
    * Creates a new {@link LOD}.
    */
  open class LOD () extends Object3D[Event] {
    
    /**
      * Adds a mesh that will display at a certain distance and greater. Typically the further away the distance, the lower the detail on the mesh.
      *
      * @param object The Object3D to display at this level.
      * @param distance The distance at which to display this level of detail. Expects a `Float`. Default `0.0`.
      * @param hysteresis Threshold used to avoid flickering at LOD boundaries, as a fraction of distance. Expects a `Float`. Default `0.0`.
      */
    def addLevel(`object`: Object3D[Event]): this.type = js.native
    def addLevel(`object`: Object3D[Event], distance: Double): this.type = js.native
    def addLevel(`object`: Object3D[Event], distance: Double, hysteresis: Double): this.type = js.native
    def addLevel(`object`: Object3D[Event], distance: Unit, hysteresis: Double): this.type = js.native
    
    /**
      * Whether the {@link LOD} object is updated automatically by the renderer per frame or not.
      * If set to `false`, you have to call {@link update | .update()} in the render loop by yourself.
      * @defaultValue `true`
      */
    var autoUpdate: Boolean = js.native
    
    /**
      * Get the currently active {@link LOD} level
      * @remarks
      * As index of the levels array.
      */
    def getCurrentLevel(): Double = js.native
    
    /**
      * Get a reference to the first {@link THREE.Object3D | Object3D} (mesh) that is greater than {@link distance}.
      * @param distance Expects a `Float`
      */
    def getObjectForDistance(distance: Double): Object3D[Event] | Null = js.native
    
    /**
      * Read-only flag to check if a given object is of type {@link LOD}.
      * @remarks This is a _constant_ value
      * @defaultValue `true`
      */
    val isLOD: `true` = js.native
    
    /**
      * An array of level objects
      */
    var levels: js.Array[Distance] = js.native
    
    /**
      * @override
      * @defaultValue `LOD`
      */
    @JSName("type")
    val type_LOD: String | typings.three.threeStrings.LOD = js.native
    
    /**
      * Set the visibility of each {@link levels | level}'s {@link THREE.Object3D | object} based on distance from the {@link THREE.Camera | camera}.
      * @param camera
      */
    def update(camera: Camera): Unit = js.native
  }
}
