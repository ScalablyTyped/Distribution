package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverTypes.mod.Diagnostic
import typings.vscodeLanguageserverTypes.mod.DocumentUri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublishDiagnosticsParams extends js.Object {
  /**
    * An array of diagnostic information items.
    */
  var diagnostics: js.Array[Diagnostic]
  /**
    * The URI for which diagnostic information is reported.
    */
  var uri: DocumentUri
  /**
    * Optional the version number of the document the diagnostics are published for.
    *
    * @since 3.15.0
    */
  var version: js.UndefOr[Double] = js.undefined
}

object PublishDiagnosticsParams {
  @scala.inline
  def apply(diagnostics: js.Array[Diagnostic], uri: DocumentUri, version: Int | Double = null): PublishDiagnosticsParams = {
    val __obj = js.Dynamic.literal(diagnostics = diagnostics.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishDiagnosticsParams]
  }
}

