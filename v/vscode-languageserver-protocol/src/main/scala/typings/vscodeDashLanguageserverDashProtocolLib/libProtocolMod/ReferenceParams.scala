package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReferenceParams extends TextDocumentPositionParams {
  var context: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.ReferenceContext
}

object ReferenceParams {
  @scala.inline
  def apply(
    context: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.ReferenceContext,
    position: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.Position,
    textDocument: vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.TextDocumentIdentifier
  ): ReferenceParams = {
    val __obj = js.Dynamic.literal(context = context, position = position, textDocument = textDocument)
  
    __obj.asInstanceOf[ReferenceParams]
  }
}

