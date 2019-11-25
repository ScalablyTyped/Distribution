package typings.wegameDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Digest extends js.Object {
  var digest: String
  var size: Double
}

object Anon_Digest {
  @scala.inline
  def apply(digest: String, size: Double): Anon_Digest = {
    val __obj = js.Dynamic.literal(digest = digest.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Digest]
  }
}

