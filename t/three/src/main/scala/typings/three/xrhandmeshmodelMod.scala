package typings.three

import typings.three.eventDispatcherMod.Event
import typings.three.threeMod.Object3D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xrhandmeshmodelMod {
  
  @JSImport("three/examples/jsm/webxr/XRHandMeshModel", "XRHandMeshModel")
  @js.native
  open class XRHandMeshModel protected () extends StObject {
    def this(handModel: Object3D[Event], controller: Object3D[Event], path: String, handedness: String) = this()
    
    var bones: js.Array[Object3D[Event]] = js.native
    
    var controller: Object3D[Event] = js.native
    
    var handModel: Object3D[Event] = js.native
    
    def updateMesh(): Unit = js.native
  }
}
