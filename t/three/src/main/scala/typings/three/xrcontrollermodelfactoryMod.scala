package typings.three

import typings.three.eventDispatcherMod.Event
import typings.three.gltfloaderMod.GLTFLoader
import typings.three.threeMod.Group
import typings.three.threeMod.Object3D
import typings.three.threeMod.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xrcontrollermodelfactoryMod {
  
  @JSImport("three/examples/jsm/webxr/XRControllerModelFactory", "XRControllerModel")
  @js.native
  open class XRControllerModel () extends Object3D[Event] {
    
    var envMap: Texture = js.native
    
    var motionController: Any = js.native
    
    def setEnvironmentMap(envMap: Texture): XRControllerModel = js.native
  }
  
  @JSImport("three/examples/jsm/webxr/XRControllerModelFactory", "XRControllerModelFactory")
  @js.native
  open class XRControllerModelFactory () extends StObject {
    def this(gltfLoader: GLTFLoader) = this()
    
    def createControllerModel(controller: Group): XRControllerModel = js.native
    
    var gltfLoader: GLTFLoader | Null = js.native
    
    var path: String = js.native
  }
}
