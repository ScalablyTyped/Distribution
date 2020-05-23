package typings.wouter.anon

import typings.wouter.preactMod.NavigationalProps
import typings.wouter.preactMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToPath extends NavigationalProps {
  var to: Path
}

object ToPath {
  @scala.inline
  def apply(to: Path): ToPath = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToPath]
  }
}

