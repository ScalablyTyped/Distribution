package typings.yargs

import typings.yargs.yargsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDemandOption extends js.Object {
  var demandOption: String | `true`
}

object AnonDemandOption {
  @scala.inline
  def apply(demandOption: String | `true`): AnonDemandOption = {
    val __obj = js.Dynamic.literal(demandOption = demandOption.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDemandOption]
  }
}

