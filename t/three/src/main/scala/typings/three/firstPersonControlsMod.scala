package typings.three

import typings.std.Document
import typings.std.HTMLElement
import typings.three.threeMod.Camera
import typings.three.threeMod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firstPersonControlsMod {
  
  @JSImport("three/examples/jsm/controls/FirstPersonControls", "FirstPersonControls")
  @js.native
  open class FirstPersonControls protected () extends StObject {
    def this(`object`: Camera) = this()
    def this(`object`: Camera, domElement: HTMLElement) = this()
    
    var activeLook: Boolean = js.native
    
    var autoForward: Boolean = js.native
    
    var constrainVertical: Boolean = js.native
    
    def dispose(): Unit = js.native
    
    var domElement: HTMLElement | Document = js.native
    
    var enabled: Boolean = js.native
    
    def handleResize(): Unit = js.native
    
    var heightCoef: Double = js.native
    
    var heightMax: Double = js.native
    
    var heightMin: Double = js.native
    
    var heightSpeed: Boolean = js.native
    
    def lookAt(x: Double, y: Double, z: Double): this.type = js.native
    def lookAt(x: Vector3): this.type = js.native
    
    var lookSpeed: Double = js.native
    
    var lookVertical: Boolean = js.native
    
    var mouseDragOn: Boolean = js.native
    
    var movementSpeed: Double = js.native
    
    var `object`: Camera = js.native
    
    def update(delta: Double): this.type = js.native
    
    var verticalMax: Double = js.native
    
    var verticalMin: Double = js.native
  }
}
