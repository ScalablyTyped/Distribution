package typings.validator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/isISO31661Alpha2", JSImport.Namespace)
@js.native
object libIsISO31661Alpha2Mod extends js.Object {
  /**
    * Check if the string is a valid [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) officially assigned country code.
    */
  def default(str: String): Boolean = js.native
}

