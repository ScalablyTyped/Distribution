package typings.three.mod

import typings.three.srcUtilsMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three", "AmbientLight")
@js.native
/**
  * This creates a Ambientlight with a color.
  * @param color Numeric value of the RGB component of the color or a Color instance.
  * @param [intensity=1]
  */
open class AmbientLight ()
  extends typings.three.srcThreeMod.AmbientLight {
  def this(color: ColorRepresentation) = this()
  def this(color: Unit, intensity: Double) = this()
  def this(color: ColorRepresentation, intensity: Double) = this()
}
