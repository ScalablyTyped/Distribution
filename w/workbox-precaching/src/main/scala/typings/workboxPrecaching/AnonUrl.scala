package typings.workboxPrecaching

import typings.std.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUrl extends js.Object {
  var url: URL
}

object AnonUrl {
  @scala.inline
  def apply(url: URL): AnonUrl = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonUrl]
  }
}

