package typings.unsplashJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Links extends js.Object {
  var links: Downloadlocation
}

object Links {
  @scala.inline
  def apply(links: Downloadlocation): Links = {
    val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any])
    __obj.asInstanceOf[Links]
  }
}

