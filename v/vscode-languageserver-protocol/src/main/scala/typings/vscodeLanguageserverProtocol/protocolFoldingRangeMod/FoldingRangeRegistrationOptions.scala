package typings.vscodeLanguageserverProtocol.protocolFoldingRangeMod

import typings.vscodeLanguageserverProtocol.protocolMod.StaticRegistrationOptions
import typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import typings.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FoldingRangeRegistrationOptions
  extends TextDocumentRegistrationOptions
     with WorkDoneProgressOptions
     with StaticRegistrationOptions

object FoldingRangeRegistrationOptions {
  @scala.inline
  def apply(): FoldingRangeRegistrationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FoldingRangeRegistrationOptions]
  }
}

