package typings.wegameApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Digest extends js.Object {
  var digest: String
  var size: Double
}

object Digest {
  @scala.inline
  def apply(digest: String, size: Double): Digest = {
    val __obj = js.Dynamic.literal(digest = digest.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Digest]
  }
}

