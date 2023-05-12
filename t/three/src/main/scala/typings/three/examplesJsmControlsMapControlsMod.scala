package typings.three

import typings.std.HTMLElement
import typings.three.examplesJsmControlsOrbitControlsMod.OrbitControls
import typings.three.srcThreeMod.Camera
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmControlsMapControlsMod {
  
  @JSImport("three/examples/jsm/controls/MapControls", "MapControls")
  @js.native
  open class MapControls protected () extends OrbitControls {
    def this(`object`: Camera) = this()
    def this(`object`: Camera, domElement: HTMLElement) = this()
  }
}
