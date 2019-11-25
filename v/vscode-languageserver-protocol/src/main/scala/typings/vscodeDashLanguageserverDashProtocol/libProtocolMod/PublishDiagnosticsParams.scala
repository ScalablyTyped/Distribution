package typings.vscodeDashLanguageserverDashProtocol.libProtocolMod

import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Diagnostic
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
  var uri: String
}

object PublishDiagnosticsParams {
  @scala.inline
  def apply(diagnostics: js.Array[Diagnostic], uri: String): PublishDiagnosticsParams = {
    val __obj = js.Dynamic.literal(diagnostics = diagnostics.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PublishDiagnosticsParams]
  }
}

