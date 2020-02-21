package typings.yargs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSortcommands extends js.Object {
  /** Sort commands alphabetically. Default is `false` */
  var `sort-commands`: Boolean
}

object AnonSortcommands {
  @scala.inline
  def apply(`sort-commands`: Boolean): AnonSortcommands = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("sort-commands")(`sort-commands`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSortcommands]
  }
}

