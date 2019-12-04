package typings.validator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/isMagnetURI", JSImport.Namespace)
@js.native
object libIsMagnetURIMod extends js.Object {
  /**
    * Check if the string is a [magnet uri format](https://en.wikipedia.org/wiki/Magnet_URI_scheme).
    */
  def default(str: String): Boolean = js.native
}

