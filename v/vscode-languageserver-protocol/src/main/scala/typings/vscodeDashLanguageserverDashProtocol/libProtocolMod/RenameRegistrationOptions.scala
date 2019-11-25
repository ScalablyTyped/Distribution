package typings.vscodeDashLanguageserverDashProtocol.libProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenameRegistrationOptions
  extends TextDocumentRegistrationOptions
     with RenameOptions

object RenameRegistrationOptions {
  @scala.inline
  def apply(documentSelector: DocumentSelector = null, prepareProvider: js.UndefOr[Boolean] = js.undefined): RenameRegistrationOptions = {
    val __obj = js.Dynamic.literal()
    if (documentSelector != null) __obj.updateDynamic("documentSelector")(documentSelector.asInstanceOf[js.Any])
    if (!js.isUndefined(prepareProvider)) __obj.updateDynamic("prepareProvider")(prepareProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenameRegistrationOptions]
  }
}

