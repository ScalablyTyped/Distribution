package typings.three

import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcThreeMod.Camera
import typings.three.srcThreeMod.Object3D
import typings.three.srcThreeMod.Vector3
import typings.three.srcThreeMod.WebGLRenderer
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmHelpersViewHelperMod {
  
  @JSImport("three/examples/jsm/helpers/ViewHelper", "ViewHelper")
  @js.native
  open class ViewHelper protected () extends Object3D[Event] {
    def this(camera: Camera, domElement: HTMLElement) = this()
    
    var animating: Boolean = js.native
    
    var center: Vector3 = js.native
    
    def dispose(): Unit = js.native
    
    def handleClick(event: MouseEvent): Boolean = js.native
    
    val isViewHelper: `true` = js.native
    
    def render(renderer: WebGLRenderer): Unit = js.native
    
    def update(delta: Double): Unit = js.native
  }
}
