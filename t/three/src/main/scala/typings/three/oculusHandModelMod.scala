package typings.three

import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.eventDispatcherMod.Event
import typings.three.materialMod.Material
import typings.three.threeMod.Mesh
import typings.three.threeMod.Object3D
import typings.three.threeMod.Texture
import typings.three.threeMod.Vector3
import typings.three.xrhandmeshmodelMod.XRHandMeshModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object oculusHandModelMod {
  
  @JSImport("three/examples/jsm/webxr/OculusHandModel", "OculusHandModel")
  @js.native
  open class OculusHandModel protected () extends Object3D[Event] {
    def this(controller: Object3D[Event]) = this()
    
    def checkButton(button: Object3D[Event]): Unit = js.native
    
    var controller: Object3D[Event] = js.native
    
    var envMap: Texture | Null = js.native
    
    def getPointerPosition(): Vector3 | Null = js.native
    
    def intersectBoxObject(boxObject: Object3D[Event]): Boolean = js.native
    
    var mesh: (Mesh[BufferGeometry, Material | js.Array[Material]]) | Null = js.native
    
    var motionController: XRHandMeshModel | Null = js.native
  }
}
