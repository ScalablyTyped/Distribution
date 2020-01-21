package typings.vegaTypings

import typings.vegaTypings.onEventsMod.Update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUpdate extends js.Object {
  var update: Update
}

object AnonUpdate {
  @scala.inline
  def apply(update: Update): AnonUpdate = {
    val __obj = js.Dynamic.literal(update = update.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonUpdate]
  }
}

