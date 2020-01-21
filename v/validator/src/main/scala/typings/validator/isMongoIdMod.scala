package typings.validator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/isMongoId", JSImport.Namespace)
@js.native
object isMongoIdMod extends js.Object {
  /**
    * Check if the string is a valid hex-encoded representation of a [MongoDB ObjectId](http://docs.mongodb.org/manual/reference/object-id/).
    */
  def default(str: String): Boolean = js.native
}

