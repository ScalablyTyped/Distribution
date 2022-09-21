package typings.three

import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.eventDispatcherMod.Event
import typings.three.materialMod.Material
import typings.three.threeMod.Camera
import typings.three.threeMod.Frustum
import typings.three.threeMod.Mesh
import typings.three.threeMod.Object3D
import typings.three.threeMod.Scene
import typings.three.threeMod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectionBoxMod {
  
  @JSImport("three/examples/jsm/interactive/SelectionBox", "SelectionBox")
  @js.native
  open class SelectionBox protected () extends StObject {
    def this(camera: Camera, scene: Scene) = this()
    def this(camera: Camera, scene: Scene, deep: Double) = this()
    
    var camera: Camera = js.native
    
    var collection: js.Array[Mesh[BufferGeometry, Material | js.Array[Material]]] = js.native
    
    var deep: Double = js.native
    
    var endPoint: Vector3 = js.native
    
    var scene: Scene = js.native
    
    def searchChildInFrustum(frustum: Frustum, `object`: Object3D[Event]): Unit = js.native
    
    def select(): js.Array[Mesh[BufferGeometry, Material | js.Array[Material]]] = js.native
    def select(startPoint: Unit, endPoint: Vector3): js.Array[Mesh[BufferGeometry, Material | js.Array[Material]]] = js.native
    def select(startPoint: Vector3): js.Array[Mesh[BufferGeometry, Material | js.Array[Material]]] = js.native
    def select(startPoint: Vector3, endPoint: Vector3): js.Array[Mesh[BufferGeometry, Material | js.Array[Material]]] = js.native
    
    var startPoint: Vector3 = js.native
    
    def updateFrustum(startPoint: Vector3, endPoint: Vector3): Unit = js.native
  }
}
