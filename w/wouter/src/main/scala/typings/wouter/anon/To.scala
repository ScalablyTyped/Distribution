package typings.wouter.anon

import typings.wouter.mod.NavigationalProps
import typings.wouter.mod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait To extends NavigationalProps {
  var to: Path
}

object To {
  @scala.inline
  def apply(to: Path): To = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[To]
  }
}

