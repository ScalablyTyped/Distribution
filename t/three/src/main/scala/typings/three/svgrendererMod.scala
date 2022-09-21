package typings.three

import typings.std.SVGElement
import typings.three.anon.Render
import typings.three.anon.Width
import typings.three.eventDispatcherMod.Event
import typings.three.threeMod.Camera
import typings.three.threeMod.Color
import typings.three.threeMod.Object3D
import typings.three.threeMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object svgrendererMod {
  
  @JSImport("three/examples/jsm/renderers/SVGRenderer", "SVGObject")
  @js.native
  open class SVGObject protected () extends Object3D[Event] {
    def this(node: SVGElement) = this()
    
    var node: SVGElement = js.native
  }
  
  @JSImport("three/examples/jsm/renderers/SVGRenderer", "SVGRenderer")
  @js.native
  open class SVGRenderer () extends StObject {
    
    var autoClear: Boolean = js.native
    
    def clear(): Unit = js.native
    
    var domElement: SVGElement = js.native
    
    def getSize(): Width = js.native
    
    var info: Render = js.native
    
    var overdraw: Double = js.native
    
    def render(scene: Scene, camera: Camera): Unit = js.native
    
    def setClearColor(color: Color, alpha: Double): Unit = js.native
    
    def setPixelRatio(): Unit = js.native
    
    def setPrecision(precision: Double): Unit = js.native
    
    def setQuality(quality: String): Unit = js.native
    
    def setSize(width: Double, height: Double): Unit = js.native
    
    var sortElements: Boolean = js.native
    
    var sortObjects: Boolean = js.native
  }
}
