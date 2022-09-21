package typings.three

import typings.std.HTMLElement
import typings.three.anon.Width
import typings.three.eventDispatcherMod.Event
import typings.three.threeMod.Camera
import typings.three.threeMod.Object3D
import typings.three.threeMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object css2drendererMod {
  
  @JSImport("three/examples/jsm/renderers/CSS2DRenderer", "CSS2DObject")
  @js.native
  open class CSS2DObject protected () extends Object3D[Event] {
    def this(element: HTMLElement) = this()
    
    var element: HTMLElement = js.native
    
    def onAfterRender(renderer: Any, scene: Scene, camera: Camera): Unit = js.native
    
    def onBeforeRender(renderer: Any, scene: Scene, camera: Camera): Unit = js.native
  }
  
  @JSImport("three/examples/jsm/renderers/CSS2DRenderer", "CSS2DRenderer")
  @js.native
  open class CSS2DRenderer () extends StObject {
    def this(parameters: CSS2DParameters) = this()
    
    var domElement: HTMLElement = js.native
    
    def getSize(): Width = js.native
    
    def render(scene: Scene, camera: Camera): Unit = js.native
    
    def setSize(width: Double, height: Double): Unit = js.native
  }
  
  trait CSS2DParameters extends StObject {
    
    var element: js.UndefOr[HTMLElement] = js.undefined
  }
  object CSS2DParameters {
    
    inline def apply(): CSS2DParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CSS2DParameters]
    }
    
    extension [Self <: CSS2DParameters](x: Self) {
      
      inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    }
  }
}
