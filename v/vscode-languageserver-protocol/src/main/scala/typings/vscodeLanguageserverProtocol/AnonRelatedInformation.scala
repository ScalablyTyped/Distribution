package typings.vscodeLanguageserverProtocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRelatedInformation extends js.Object {
  /**
    * Whether the clients accepts diagnostics with related information.
    */
  var relatedInformation: js.UndefOr[Boolean] = js.undefined
}

object AnonRelatedInformation {
  @scala.inline
  def apply(relatedInformation: js.UndefOr[Boolean] = js.undefined): AnonRelatedInformation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(relatedInformation)) __obj.updateDynamic("relatedInformation")(relatedInformation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRelatedInformation]
  }
}

