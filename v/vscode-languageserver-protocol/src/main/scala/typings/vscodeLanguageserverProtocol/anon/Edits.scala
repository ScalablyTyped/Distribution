package typings.vscodeLanguageserverProtocol.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Edits extends js.Object {
  /**
    * The server supports deltas for full documents.
    */
  var edits: js.UndefOr[Boolean] = js.undefined
}

object Edits {
  @scala.inline
  def apply(edits: js.UndefOr[Boolean] = js.undefined): Edits = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(edits)) __obj.updateDynamic("edits")(edits.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Edits]
  }
}

