package typings.vscodeLanguageserverProtocol.protocolSelectionRangeMod

import typings.vscodeLanguageserverProtocol.protocolMod.StaticRegistrationOptions
import typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import typings.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectionRangeRegistrationOptions
  extends WorkDoneProgressOptions
     with TextDocumentRegistrationOptions
     with StaticRegistrationOptions
object SelectionRangeRegistrationOptions {
  
  @scala.inline
  def apply(): SelectionRangeRegistrationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectionRangeRegistrationOptions]
  }
}
