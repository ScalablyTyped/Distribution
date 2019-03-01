package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeLensParams extends js.Object {
  /**
    * The document to request code lens for.
    */
  var textDocument: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocumentIdentifier
}

object CodeLensParams {
  @scala.inline
  def apply(
    textDocument: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocumentIdentifier
  ): CodeLensParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("textDocument")(textDocument)
    __obj.asInstanceOf[CodeLensParams]
  }
}

