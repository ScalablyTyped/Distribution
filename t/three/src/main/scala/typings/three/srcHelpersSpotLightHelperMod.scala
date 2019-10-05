package typings.three

import typings.three.srcCoreObject3DMod.Object3D
import typings.three.srcLightsLightMod.Light
import typings.three.srcMathColorMod.Color
import typings.three.srcObjectsLineSegmentsMod.LineSegments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/helpers/SpotLightHelper", JSImport.Namespace)
@js.native
object srcHelpersSpotLightHelperMod extends js.Object {
  @js.native
  class SpotLightHelper protected () extends Object3D {
    def this(light: Light) = this()
    def this(light: Light, color: String) = this()
    def this(light: Light, color: Double) = this()
    def this(light: Light, color: Color) = this()
    var color: js.UndefOr[Color | String | Double] = js.native
    var cone: LineSegments = js.native
    var light: Light = js.native
    def dispose(): Unit = js.native
    def update(): Unit = js.native
  }
  
}

