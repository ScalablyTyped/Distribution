package typings.validator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/isISRC", JSImport.Namespace)
@js.native
object isISRCMod extends js.Object {
  /**
    * Check if the string is a [ISRC](https://en.wikipedia.org/wiki/International_Standard_Recording_Code).
    */
  def default(str: String): Boolean = js.native
}

