package typings.three.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three", "ArrowHelper")
@js.native
class ArrowHelper protected ()
  extends typings.three.arrowHelperMod.ArrowHelper {
  /**
  	 * @param [dir=new THREE.Vector3( 0, 0, 1 )]
  	 * @param [origin=new THREE.Vector3( 0, 0, 0 )]
  	 * @param [length=1]
  	 * @param [color=0xffff00]
  	 * @param headLength
  	 * @param headWidth
  	 */
  def this(
    dir: typings.three.vector3Mod.Vector3,
    origin: js.UndefOr[typings.three.vector3Mod.Vector3],
    length: js.UndefOr[Double],
    color: js.UndefOr[typings.three.colorMod.Color | String | Double],
    headLength: js.UndefOr[Double],
    headWidth: js.UndefOr[Double]
  ) = this()
}
