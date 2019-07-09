package typings
package threeLib.srcLightsLightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/lights/Light", "Light")
@js.native
class Light ()
  extends threeLib.srcCoreObject3DMod.Object3D {
  def this(hex: java.lang.String) = this()
  def this(hex: scala.Double) = this()
  def this(hex: java.lang.String, intensity: scala.Double) = this()
  def this(hex: scala.Double, intensity: scala.Double) = this()
  var color: threeLib.srcMathColorMod.Color = js.native
  var intensity: scala.Double = js.native
  var isLight: threeLib.threeLibNumbers.`true` = js.native
  var shadow: threeLib.srcLightsLightShadowMod.LightShadow = js.native
  /**
  	 * @deprecated Use shadow.bias instead.
  	 */
  var shadowBias: js.Any = js.native
  /**
  	 * @deprecated Use shadow.camera.bottom instead.
  	 */
  var shadowCameraBottom: js.Any = js.native
  /**
  	 * @deprecated Use shadow.camera.far instead.
  	 */
  var shadowCameraFar: js.Any = js.native
  /**
  	 * @deprecated Use shadow.camera.fov instead.
  	 */
  var shadowCameraFov: js.Any = js.native
  /**
  	 * @deprecated Use shadow.camera.left instead.
  	 */
  var shadowCameraLeft: js.Any = js.native
  /**
  	 * @deprecated Use shadow.camera.near instead.
  	 */
  var shadowCameraNear: js.Any = js.native
  /**
  	 * @deprecated Use shadow.camera.right instead.
  	 */
  var shadowCameraRight: js.Any = js.native
  /**
  	 * @deprecated Use shadow.camera.top instead.
  	 */
  var shadowCameraTop: js.Any = js.native
  /**
  	 * @deprecated Use shadow.mapSize.height instead.
  	 */
  var shadowMapHeight: js.Any = js.native
  /**
  	 * @deprecated Use shadow.mapSize.width instead.
  	 */
  var shadowMapWidth: js.Any = js.native
}

