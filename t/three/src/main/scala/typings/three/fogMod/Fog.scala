package typings.three.fogMod

import typings.three.colorMod.Color
import typings.three.threeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/scenes/Fog", "Fog")
@js.native
class Fog protected () extends IFog {
  def this(color: String) = this()
  def this(color: Double) = this()
  def this(color: Color) = this()
  def this(color: String, near: Double) = this()
  def this(color: Double, near: Double) = this()
  def this(color: Color, near: Double) = this()
  def this(color: String, near: js.UndefOr[scala.Nothing], far: Double) = this()
  def this(color: String, near: Double, far: Double) = this()
  def this(color: Double, near: js.UndefOr[scala.Nothing], far: Double) = this()
  def this(color: Double, near: Double, far: Double) = this()
  def this(color: Color, near: js.UndefOr[scala.Nothing], far: Double) = this()
  def this(color: Color, near: Double, far: Double) = this()
  /**
  	 * The maximum distance at which fog stops being calculated and applied. Objects that are more than 'far' units away from the active camera won't be affected by fog.
  	 * Default is 1000.
  	 */
  var far: Double = js.native
  val isFog: `true` = js.native
  /**
  	 * The minimum distance to start applying fog. Objects that are less than 'near' units from the active camera won't be affected by fog.
  	 */
  var near: Double = js.native
}

