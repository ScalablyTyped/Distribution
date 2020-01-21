package typings.three

import typings.three.colorMod.Color
import typings.three.lightShadowMod.LightShadow
import typings.three.object3DMod.Object3D
import typings.three.threeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/lights/Light", JSImport.Namespace)
@js.native
object lightMod extends js.Object {
  @js.native
  class Light () extends Object3D {
    def this(hex: String) = this()
    def this(hex: Double) = this()
    def this(hex: String, intensity: Double) = this()
    def this(hex: Double, intensity: Double) = this()
    var color: Color = js.native
    var intensity: Double = js.native
    var isLight: `true` = js.native
    var shadow: LightShadow = js.native
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
  
}

