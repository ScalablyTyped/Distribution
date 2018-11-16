package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CompletionParams extends TextDocumentPositionParams {
  /**
       * The completion context. This is only available it the client specifies
       * to send this using `ClientCapabilities.textDocument.completion.contextSupport === true`
       */
  var context: js.UndefOr[CompletionContext] = js.undefined
}

