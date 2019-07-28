package typings.three.srcHelpersPointLightHelperMod

import typings.three.srcCoreObject3DMod.Object3D
import typings.three.srcLightsPointLightMod.PointLight
import typings.three.srcMathColorMod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/helpers/PointLightHelper", "PointLightHelper")
@js.native
class PointLightHelper protected () extends Object3D {
  def this(light: PointLight) = this()
  def this(light: PointLight, sphereSize: Double) = this()
  def this(light: PointLight, sphereSize: Double, color: String) = this()
  def this(light: PointLight, sphereSize: Double, color: Double) = this()
  def this(light: PointLight, sphereSize: Double, color: Color) = this()
  var color: js.UndefOr[Color | String | Double] = js.native
  var light: PointLight = js.native
  def dispose(): Unit = js.native
  def update(): Unit = js.native
}

