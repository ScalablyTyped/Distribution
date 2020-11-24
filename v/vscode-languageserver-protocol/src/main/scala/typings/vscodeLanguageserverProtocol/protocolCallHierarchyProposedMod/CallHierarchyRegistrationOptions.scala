package typings.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod

import typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import typings.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallHierarchyRegistrationOptions
  extends TextDocumentRegistrationOptions
     with WorkDoneProgressOptions
object CallHierarchyRegistrationOptions {
  
  @scala.inline
  def apply(): CallHierarchyRegistrationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallHierarchyRegistrationOptions]
  }
}
