package typings.validator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/isMimeType", JSImport.Namespace)
@js.native
object libIsMimeTypeMod extends js.Object {
  /**
    * Check if the string matches to a valid [MIME type](https://en.wikipedia.org/wiki/Media_type) format.
    */
  def default(str: String): Boolean = js.native
}

