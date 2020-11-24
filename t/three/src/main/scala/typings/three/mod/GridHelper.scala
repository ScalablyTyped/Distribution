package typings.three.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three", "GridHelper")
@js.native
class GridHelper protected ()
  extends typings.three.gridHelperMod.GridHelper {
  /**
  	 * @param [size=10]
  	 * @param [divisions=10]
  	 * @param [color1=0x444444]
  	 * @param [color2=0x888888]
  	 */
  def this(
    size: js.UndefOr[Double],
    divisions: js.UndefOr[Double],
    color1: js.UndefOr[typings.three.colorMod.Color | String | Double],
    color2: js.UndefOr[typings.three.colorMod.Color | String | Double]
  ) = this()
}
