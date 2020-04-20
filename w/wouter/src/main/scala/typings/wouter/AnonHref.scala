package typings.wouter

import typings.wouter.mod.NavigationalProps
import typings.wouter.mod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHref extends NavigationalProps {
  var href: Path
}

object AnonHref {
  @scala.inline
  def apply(href: Path): AnonHref = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHref]
  }
}

