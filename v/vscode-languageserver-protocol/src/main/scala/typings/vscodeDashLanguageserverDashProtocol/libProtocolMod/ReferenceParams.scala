package typings.vscodeDashLanguageserverDashProtocol.libProtocolMod

import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.Position
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.ReferenceContext
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.TextDocumentIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReferenceParams extends TextDocumentPositionParams {
  var context: ReferenceContext
}

object ReferenceParams {
  @scala.inline
  def apply(context: ReferenceContext, position: Position, textDocument: TextDocumentIdentifier): ReferenceParams = {
    val __obj = js.Dynamic.literal(context = context, position = position, textDocument = textDocument)
  
    __obj.asInstanceOf[ReferenceParams]
  }
}

