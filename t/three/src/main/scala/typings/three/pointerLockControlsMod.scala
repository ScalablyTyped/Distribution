package typings.three

import typings.std.HTMLElement
import typings.three.eventDispatcherMod.Event
import typings.three.threeMod.Camera
import typings.three.threeMod.EventDispatcher
import typings.three.threeMod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pointerLockControlsMod {
  
  @JSImport("three/examples/jsm/controls/PointerLockControls", "PointerLockControls")
  @js.native
  open class PointerLockControls protected () extends EventDispatcher[Event] {
    def this(camera: Camera) = this()
    def this(camera: Camera, domElement: HTMLElement) = this()
    
    def connect(): Unit = js.native
    
    def disconnect(): Unit = js.native
    
    def dispose(): Unit = js.native
    
    var domElement: HTMLElement = js.native
    
    def getDirection(v: Vector3): Vector3 = js.native
    
    def getObject(): Camera = js.native
    
    // API
    var isLocked: Boolean = js.native
    
    def lock(): Unit = js.native
    
    var maxPolarAngle: Double = js.native
    
    var minPolarAngle: Double = js.native
    
    def moveForward(distance: Double): Unit = js.native
    
    def moveRight(distance: Double): Unit = js.native
    
    def unlock(): Unit = js.native
  }
}
