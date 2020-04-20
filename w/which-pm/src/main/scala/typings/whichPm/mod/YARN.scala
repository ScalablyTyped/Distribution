package typings.whichPm.mod

import typings.whichPm.whichPmStrings.yarn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YARN extends Result {
  val name: yarn
}

object YARN {
  @scala.inline
  def apply(name: yarn): YARN = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[YARN]
  }
}

