package typings.three

import typings.three.eventDispatcherMod.Event
import typings.three.threeMod.Camera
import typings.three.threeMod.Color
import typings.three.threeMod.Material
import typings.three.threeMod.Object3D
import typings.three.threeMod.Scene
import typings.three.threeMod.Vector2
import typings.three.threeMod.Vector3
import typings.three.threeMod.Vector4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object projectorMod {
  
  @JSImport("three/examples/jsm/renderers/Projector", "Projector")
  @js.native
  open class Projector () extends StObject {
    
    def projectScene(scene: Scene, camera: Camera, sortObjects: Boolean, sortElements: Boolean): Any = js.native
  }
  
  @JSImport("three/examples/jsm/renderers/Projector", "RenderableFace")
  @js.native
  open class RenderableFace () extends StObject {
    
    var color: Color = js.native
    
    var id: Double = js.native
    
    var material: Material = js.native
    
    var normalModel: Vector3 = js.native
    
    var renderOrder: Double = js.native
    
    var uvs: js.Array[Vector2] = js.native
    
    var v1: RenderableVertex = js.native
    
    var v2: RenderableVertex = js.native
    
    var v3: RenderableVertex = js.native
    
    var vertexNormalsLength: Double = js.native
    
    var vertexNormalsModel: js.Array[Vector3] = js.native
    
    var z: Double = js.native
  }
  
  @JSImport("three/examples/jsm/renderers/Projector", "RenderableLine")
  @js.native
  open class RenderableLine () extends StObject {
    
    var id: Double = js.native
    
    var material: Material = js.native
    
    var renderOrder: Double = js.native
    
    var v1: RenderableVertex = js.native
    
    var v2: RenderableVertex = js.native
    
    var vertexColors: js.Array[Color] = js.native
    
    var z: Double = js.native
  }
  
  @JSImport("three/examples/jsm/renderers/Projector", "RenderableObject")
  @js.native
  open class RenderableObject () extends StObject {
    
    var id: Double = js.native
    
    var `object`: Object3D[Event] = js.native
    
    var renderOrder: Double = js.native
    
    var z: Double = js.native
  }
  
  @JSImport("three/examples/jsm/renderers/Projector", "RenderableSprite")
  @js.native
  open class RenderableSprite () extends StObject {
    
    var id: Double = js.native
    
    var material: Material = js.native
    
    var `object`: Object3D[Event] = js.native
    
    var renderOrder: Double = js.native
    
    var rotation: Double = js.native
    
    var scale: Vector2 = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
    
    var z: Double = js.native
  }
  
  @JSImport("three/examples/jsm/renderers/Projector", "RenderableVertex")
  @js.native
  open class RenderableVertex () extends StObject {
    
    def copy(vertex: RenderableVertex): Unit = js.native
    
    var position: Vector3 = js.native
    
    var positionScreen: Vector4 = js.native
    
    var positionWorld: Vector3 = js.native
    
    var visible: Boolean = js.native
  }
}
