package typings.validator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/isISIN", JSImport.Namespace)
@js.native
object libIsISINMod extends js.Object {
  /**
    * Check if the string is an [ISIN](https://en.wikipedia.org/wiki/International_Securities_Identification_Number) (stock/security identifier).
    */
  def default(str: String): Boolean = js.native
}

