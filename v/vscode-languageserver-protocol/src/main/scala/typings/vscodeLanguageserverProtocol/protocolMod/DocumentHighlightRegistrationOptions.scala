package typings.vscodeLanguageserverProtocol.protocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentHighlightRegistrationOptions
  extends StObject
     with TextDocumentRegistrationOptions
     with WorkDoneProgressOptions
object DocumentHighlightRegistrationOptions {
  
  @scala.inline
  def apply(): DocumentHighlightRegistrationOptions = {
    val __obj = js.Dynamic.literal(documentSelector = null)
    __obj.asInstanceOf[DocumentHighlightRegistrationOptions]
  }
}
