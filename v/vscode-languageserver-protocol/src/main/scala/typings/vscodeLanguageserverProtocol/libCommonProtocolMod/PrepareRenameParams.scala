package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverTypes.mod.Position
import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrepareRenameParams
  extends StObject
     with TextDocumentPositionParams
     with WorkDoneProgressParams
object PrepareRenameParams {
  
  inline def apply(position: Position, textDocument: TextDocumentIdentifier): PrepareRenameParams = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrepareRenameParams]
  }
}
