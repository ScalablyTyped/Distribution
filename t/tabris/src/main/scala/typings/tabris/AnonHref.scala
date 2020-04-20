package typings.tabris

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHref extends js.Object {
  var children: js.UndefOr[String | js.Array[String]] = js.undefined
  var href: js.UndefOr[String] = js.undefined
}

object AnonHref {
  @scala.inline
  def apply(children: String | js.Array[String] = null, href: String = null): AnonHref = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHref]
  }
}

