package typings.three

import typings.three.eventDispatcherMod.Event
import typings.three.threeMod.Group
import typings.three.threeMod.Object3D
import typings.three.threeStrings.boxes
import typings.three.threeStrings.mesh
import typings.three.threeStrings.spheres
import typings.three.xrhandmeshmodelMod.XRHandMeshModel
import typings.three.xrhandprimitivemodelMod.XRHandPrimitiveModel
import typings.three.xrhandprimitivemodelMod.XRHandPrimitiveModelOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xrhandmodelfactoryMod {
  
  @JSImport("three/examples/jsm/webxr/XRHandModelFactory", "XRHandModel")
  @js.native
  open class XRHandModel () extends Object3D[Event] {
    
    var motionController: XRHandPrimitiveModel | XRHandMeshModel = js.native
  }
  
  @JSImport("three/examples/jsm/webxr/XRHandModelFactory", "XRHandModelFactory")
  @js.native
  open class XRHandModelFactory () extends StObject {
    
    def createHandModel(controller: Group): XRHandModel = js.native
    def createHandModel(controller: Group, profile: spheres | boxes | mesh): XRHandModel = js.native
    def createHandModel(controller: Group, profile: spheres | boxes | mesh, options: XRHandPrimitiveModelOptions): XRHandModel = js.native
    def createHandModel(controller: Group, profile: Unit, options: XRHandPrimitiveModelOptions): XRHandModel = js.native
    
    var path: String = js.native
    
    def setPath(path: String): XRHandModelFactory = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.three.threeStrings.left
    - typings.three.threeStrings.right
  */
  trait XRHandModelHandedness extends StObject
  object XRHandModelHandedness {
    
    inline def left: typings.three.threeStrings.left = "left".asInstanceOf[typings.three.threeStrings.left]
    
    inline def right: typings.three.threeStrings.right = "right".asInstanceOf[typings.three.threeStrings.right]
  }
}
