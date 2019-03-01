package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DidSaveTextDocumentParams extends js.Object {
  /**
    * Optional the content when saved. Depends on the includeText value
    * when the save notification was requested.
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The document that was closed.
    */
  var textDocument: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.VersionedTextDocumentIdentifier
}

object DidSaveTextDocumentParams {
  @scala.inline
  def apply(
    textDocument: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.VersionedTextDocumentIdentifier,
    text: java.lang.String = null
  ): DidSaveTextDocumentParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("textDocument")(textDocument)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[DidSaveTextDocumentParams]
  }
}

