package typings.three.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three", "AmbientLight")
@js.native
/**
	 * This creates a Ambientlight with a color.
	 * @param color Numeric value of the RGB component of the color or a Color instance.
	 * @param [intensity=1]
	 */
class AmbientLight ()
  extends typings.three.ambientLightMod.AmbientLight {
  def this(color: String) = this()
  def this(color: Double) = this()
  def this(color: typings.three.colorMod.Color) = this()
  def this(color: js.UndefOr[scala.Nothing], intensity: Double) = this()
  def this(color: String, intensity: Double) = this()
  def this(color: Double, intensity: Double) = this()
  def this(color: typings.three.colorMod.Color, intensity: Double) = this()
}
