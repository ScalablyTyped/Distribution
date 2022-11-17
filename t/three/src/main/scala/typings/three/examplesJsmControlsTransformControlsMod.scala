package typings.three

import typings.std.HTMLElement
import typings.three.anon.LEFT_
import typings.three.anon.Rotate
import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcThreeMod.Camera
import typings.three.srcThreeMod.Mesh
import typings.three.srcThreeMod.Object3D
import typings.three.srcThreeMod.Quaternion
import typings.three.srcThreeMod.Raycaster
import typings.three.srcThreeMod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmControlsTransformControlsMod {
  
  @JSImport("three/examples/jsm/controls/TransformControls", "TransformControls")
  @js.native
  open class TransformControls protected () extends Object3D[Event] {
    def this(`object`: Camera) = this()
    def this(`object`: Camera, domElement: HTMLElement) = this()
    
    def attach(`object`: Object3D[Event]): this.type = js.native
    
    var axis: "X" | "Y" | "Z" | "E" | "XY" | "YZ" | "XZ" | "XYZ" | "XYZE" | Null = js.native
    
    // API
    var camera: Camera = js.native
    
    def detach(): this.type = js.native
    
    def dispose(): Unit = js.native
    
    var domElement: HTMLElement = js.native
    
    var dragging: Boolean = js.native
    
    var enabled: Boolean = js.native
    
    def getMode(): "translate" | "rotate" | "scale" = js.native
    
    def getRaycaster(): Raycaster = js.native
    
    val isTransformControls: true = js.native
    
    var mode: "translate" | "rotate" | "scale" = js.native
    
    var mouseButtons: LEFT_ = js.native
    
    var `object`: js.UndefOr[Object3D[Event]] = js.native
    
    def reset(): Unit = js.native
    
    var rotationSnap: Double | Null = js.native
    
    @JSName("setMode")
    @scala.annotation.targetName("setMode_translate_rotate_scale")
    def setMode(mode: "translate" | "rotate" | "scale"): Unit = js.native
    
    def setRotationSnap(): Unit = js.native
    def setRotationSnap(rotationSnap: Double): Unit = js.native
    
    def setScaleSnap(): Unit = js.native
    def setScaleSnap(scaleSnap: Double): Unit = js.native
    
    def setSize(size: Double): Unit = js.native
    
    @JSName("setSpace")
    @scala.annotation.targetName("setSpace_world_local")
    def setSpace(space: "world" | "local"): Unit = js.native
    
    def setTranslationSnap(): Unit = js.native
    def setTranslationSnap(translationSnap: Double): Unit = js.native
    
    var showX: Boolean = js.native
    
    var showY: Boolean = js.native
    
    var showZ: Boolean = js.native
    
    var size: Double = js.native
    
    var space: "world" | "local" = js.native
    
    var translationSnap: Double | Null = js.native
  }
  
  @JSImport("three/examples/jsm/controls/TransformControls", "TransformControlsGizmo")
  @js.native
  open class TransformControlsGizmo () extends Object3D[Event] {
    
    var gizmo: Rotate = js.native
    
    var helper: Rotate = js.native
    
    var isTransformControlsGizmo: true = js.native
    
    var picker: Rotate = js.native
    
    @JSName("type")
    var type_TransformControlsGizmo: "TransformControlsGizmo" = js.native
  }
  
  @JSImport("three/examples/jsm/controls/TransformControls", "TransformControlsPlane")
  @js.native
  open class TransformControlsPlane ()
    extends Mesh[BufferGeometry, Material | js.Array[Material]] {
    
    var axis: "X" | "Y" | "Z" | "XY" | "YZ" | "XZ" | "XYZ" | "E" = js.native
    
    var eye: Vector3 = js.native
    
    var isTransformControlsPlane: true = js.native
    
    var mode: "translate" | "scale" | "rotate" = js.native
    
    var space: "local" | "world" = js.native
    
    @JSName("type")
    var type_TransformControlsPlane: "TransformControlsPlane" = js.native
    
    var worldPosition: Vector3 = js.native
    
    var worldQuaternion: Quaternion = js.native
  }
}
