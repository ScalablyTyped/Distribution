package typings.three

import typings.std.Document
import typings.std.HTMLElement
import typings.three.eventDispatcherMod.Event
import typings.three.threeMod.Camera
import typings.three.threeMod.EventDispatcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flyControlsMod {
  
  @JSImport("three/examples/jsm/controls/FlyControls", "FlyControls")
  @js.native
  open class FlyControls protected () extends EventDispatcher[Event] {
    def this(`object`: Camera) = this()
    def this(`object`: Camera, domElement: HTMLElement) = this()
    
    var autoForward: Boolean = js.native
    
    def dispose(): Unit = js.native
    
    var domElement: HTMLElement | Document = js.native
    
    var dragToLook: Boolean = js.native
    
    var movementSpeed: Double = js.native
    
    var `object`: Camera = js.native
    
    var rollSpeed: Double = js.native
    
    def update(delta: Double): Unit = js.native
  }
}
