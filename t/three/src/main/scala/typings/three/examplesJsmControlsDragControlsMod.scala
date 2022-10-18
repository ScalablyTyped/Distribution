package typings.three

import typings.std.HTMLElement
import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcThreeMod.Camera
import typings.three.srcThreeMod.EventDispatcher
import typings.three.srcThreeMod.Object3D
import typings.three.srcThreeMod.Raycaster
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmControlsDragControlsMod {
  
  @JSImport("three/examples/jsm/controls/DragControls", "DragControls")
  @js.native
  open class DragControls protected () extends EventDispatcher[Event] {
    def this(objects: js.Array[Object3D[Event]], camera: Camera) = this()
    def this(objects: js.Array[Object3D[Event]], camera: Camera, domElement: HTMLElement) = this()
    
    def activate(): Unit = js.native
    
    def deactivate(): Unit = js.native
    
    def dispose(): Unit = js.native
    
    // API
    var enabled: Boolean = js.native
    
    def getObjects(): js.Array[Object3D[Event]] = js.native
    
    def getRaycaster(): Raycaster = js.native
    
    var `object`: Camera = js.native
    
    var transformGroup: Boolean = js.native
  }
}
