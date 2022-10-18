package typings.three

import typings.std.Document
import typings.std.HTMLElement
import typings.std.Window
import typings.three.anon.BOTTOM
import typings.three.anon.PartialLEFTMOUSEMIDDLEMOU
import typings.three.anon.PartialONETOUCHTWOTOUCH
import typings.three.anon.Target
import typings.three.srcThreeMod.Camera
import typings.three.srcThreeMod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmControlsOrbitControlsMod {
  
  @JSImport("three/examples/jsm/controls/OrbitControls", "MapControls")
  @js.native
  open class MapControls protected () extends OrbitControls {
    def this(`object`: Camera) = this()
    def this(`object`: Camera, domElement: HTMLElement) = this()
  }
  
  @JSImport("three/examples/jsm/controls/OrbitControls", "OrbitControls")
  @js.native
  open class OrbitControls protected () extends StObject {
    def this(`object`: Camera) = this()
    def this(`object`: Camera, domElement: HTMLElement) = this()
    
    // EventDispatcher mixins
    def addEventListener(`type`: String, listener: js.Function1[/* event */ Any, Unit]): Unit = js.native
    
    var autoRotate: Boolean = js.native
    
    var autoRotateSpeed: Double = js.native
    
    // deprecated
    var center: Vector3 = js.native
    
    var dampingFactor: Double = js.native
    
    def dispatchEvent(event: Target): Unit = js.native
    
    def dispose(): Unit = js.native
    
    var domElement: HTMLElement | Document = js.native
    
    var enableDamping: Boolean = js.native
    
    var enablePan: Boolean = js.native
    
    var enableRotate: Boolean = js.native
    
    var enableZoom: Boolean = js.native
    
    // API
    var enabled: Boolean = js.native
    
    def getAzimuthalAngle(): Double = js.native
    
    def getDistance(): Double = js.native
    
    def getPolarAngle(): Double = js.native
    
    def hasEventListener(`type`: String, listener: js.Function1[/* event */ Any, Unit]): Boolean = js.native
    
    var keyPanSpeed: Double = js.native
    
    var keys: BOTTOM = js.native
    
    def listenToKeyEvents(domElement: HTMLElement): Unit = js.native
    def listenToKeyEvents(domElement: Window): Unit = js.native
    
    var maxAzimuthAngle: Double = js.native
    
    var maxDistance: Double = js.native
    
    var maxPolarAngle: Double = js.native
    
    var maxZoom: Double = js.native
    
    var minAzimuthAngle: Double = js.native
    
    var minDistance: Double = js.native
    
    var minPolarAngle: Double = js.native
    
    var minZoom: Double = js.native
    
    var mouseButtons: PartialLEFTMOUSEMIDDLEMOU = js.native
    
    var `object`: Camera = js.native
    
    var panSpeed: Double = js.native
    
    var position0: Vector3 = js.native
    
    def removeEventListener(`type`: String, listener: js.Function1[/* event */ Any, Unit]): Unit = js.native
    
    def reset(): Unit = js.native
    
    var rotateSpeed: Double = js.native
    
    def saveState(): Unit = js.native
    
    var screenSpacePanning: Boolean = js.native
    
    var target: Vector3 = js.native
    
    var target0: Vector3 = js.native
    
    var touches: PartialONETOUCHTWOTOUCH = js.native
    
    def update(): Boolean = js.native
    
    var zoomO: Double = js.native
    
    var zoomSpeed: Double = js.native
  }
}
