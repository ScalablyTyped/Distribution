package typings.vscodeLanguageserverProtocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEdits extends js.Object {
  /**
    * The server supports deltas for full documents.
    */
  var edits: js.UndefOr[Boolean] = js.undefined
}

object AnonEdits {
  @scala.inline
  def apply(edits: js.UndefOr[Boolean] = js.undefined): AnonEdits = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(edits)) __obj.updateDynamic("edits")(edits.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEdits]
  }
}

