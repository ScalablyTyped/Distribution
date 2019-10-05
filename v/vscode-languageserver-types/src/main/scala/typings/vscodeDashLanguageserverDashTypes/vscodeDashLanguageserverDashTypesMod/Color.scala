package typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  /**
    * The alpha component of this color in the range [0-1].
    */
  val alpha: Double
  /**
    * The blue component of this color in the range [0-1].
    */
  val blue: Double
  /**
    * The green component of this color in the range [0-1].
    */
  val green: Double
  /**
    * The red component of this color in the range [0-1].
    */
  val red: Double
}

@JSImport("vscode-languageserver-types", "Color")
@js.native
object Color extends js.Object {
  /**
    * Creates a new Color literal.
    */
  def create(red: Double, green: Double, blue: Double, alpha: Double): Color = js.native
  /**
    * Checks whether the given literal conforms to the [Color](#Color) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.Color */ Boolean = js.native
}

