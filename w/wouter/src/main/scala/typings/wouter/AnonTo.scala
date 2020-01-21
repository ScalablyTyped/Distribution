package typings.wouter

import typings.wouter.mod.NavigationalProps
import typings.wouter.mod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTo extends NavigationalProps {
  var to: Path
}

object AnonTo {
  @scala.inline
  def apply(to: Path): AnonTo = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTo]
  }
}

