package typings.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDigest extends js.Object {
  var digest: String
  var size: Double
}

object AnonDigest {
  @scala.inline
  def apply(digest: String, size: Double): AnonDigest = {
    val __obj = js.Dynamic.literal(digest = digest.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDigest]
  }
}

