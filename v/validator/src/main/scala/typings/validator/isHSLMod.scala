package typings.validator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/isHSL", JSImport.Namespace)
@js.native
object isHSLMod extends js.Object {
  /**
    * Check if the string is an HSL (hue, saturation, lightness, optional alpha) color based on CSS Colors Level 4 specification.
    * Comma-separated format supported. Space-separated format supported with the exception of a few edge cases (ex: hsl(200grad+.1%62%/1)).
    */
  def default(str: String): Boolean = js.native
}

