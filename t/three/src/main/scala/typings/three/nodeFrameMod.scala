package typings.three

import typings.three.eventDispatcherMod.Event
import typings.three.threeMod.Camera
import typings.three.threeMod.Material
import typings.three.threeMod.Object3D
import typings.three.webGLRendererMod.Renderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeFrameMod {
  
  @JSImport("three/examples/jsm/nodes/core/NodeFrame", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with NodeFrame {
    
    /* CompleteClass */
    var camera: Null | Camera = js.native
    
    /* CompleteClass */
    var deltaTime: Double = js.native
    
    /* CompleteClass */
    var frameId: Double = js.native
    
    /* CompleteClass */
    var material: Null | Material = js.native
    
    /* CompleteClass */
    var `object`: Null | Object3D[Event] = js.native
    
    /* CompleteClass */
    var renderer: Null | Renderer = js.native
    
    /* CompleteClass */
    var startTime: Null | Double = js.native
    
    /* CompleteClass */
    var time: Double = js.native
    
    /* CompleteClass */
    override def update(): Unit = js.native
    
    /* CompleteClass */
    override def updateNode(node: typings.three.nodeMod.default): Unit = js.native
  }
  
  trait NodeFrame extends StObject {
    
    var camera: Null | Camera
    
    var deltaTime: Double
    
    var frameId: Double
    
    var material: Null | Material
    
    var `object`: Null | Object3D[Event]
    
    var renderer: Null | Renderer
    
    var startTime: Null | Double
    
    var time: Double
    
    def update(): Unit
    
    def updateNode(node: typings.three.nodeMod.default): Unit
  }
  object NodeFrame {
    
    inline def apply(
      deltaTime: Double,
      frameId: Double,
      time: Double,
      update: () => Unit,
      updateNode: typings.three.nodeMod.default => Unit
    ): NodeFrame = {
      val __obj = js.Dynamic.literal(deltaTime = deltaTime.asInstanceOf[js.Any], frameId = frameId.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], update = js.Any.fromFunction0(update), updateNode = js.Any.fromFunction1(updateNode), camera = null, material = null, renderer = null, startTime = null)
      __obj.updateDynamic("object")(null)
      __obj.asInstanceOf[NodeFrame]
    }
    
    extension [Self <: NodeFrame](x: Self) {
      
      inline def setCamera(value: Camera): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
      
      inline def setCameraNull: Self = StObject.set(x, "camera", null)
      
      inline def setDeltaTime(value: Double): Self = StObject.set(x, "deltaTime", value.asInstanceOf[js.Any])
      
      inline def setFrameId(value: Double): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
      
      inline def setMaterial(value: Material): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
      
      inline def setMaterialNull: Self = StObject.set(x, "material", null)
      
      inline def setObject(value: Object3D[Event]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setObjectNull: Self = StObject.set(x, "object", null)
      
      inline def setRenderer(value: Renderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
      
      inline def setRendererNull: Self = StObject.set(x, "renderer", null)
      
      inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
      
      inline def setUpdateNode(value: typings.three.nodeMod.default => Unit): Self = StObject.set(x, "updateNode", js.Any.fromFunction1(value))
    }
  }
}
