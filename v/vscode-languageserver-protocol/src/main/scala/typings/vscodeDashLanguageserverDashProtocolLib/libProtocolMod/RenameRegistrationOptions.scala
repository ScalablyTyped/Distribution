package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenameRegistrationOptions
  extends TextDocumentRegistrationOptions
     with RenameOptions

object RenameRegistrationOptions {
  @scala.inline
  def apply(
    documentSelector: DocumentSelector = null,
    prepareProvider: js.UndefOr[scala.Boolean] = js.undefined
  ): RenameRegistrationOptions = {
    val __obj = js.Dynamic.literal()
    if (documentSelector != null) __obj.updateDynamic("documentSelector")(documentSelector)
    if (!js.isUndefined(prepareProvider)) __obj.updateDynamic("prepareProvider")(prepareProvider)
    __obj.asInstanceOf[RenameRegistrationOptions]
  }
}

