package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverTypes.mod.Position
import typings.vscodeLanguageserverTypes.mod.ReferenceContext
import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReferenceParams
  extends StObject
     with TextDocumentPositionParams
     with WorkDoneProgressParams
     with PartialResultParams {
  
  var context: ReferenceContext
}
object ReferenceParams {
  
  inline def apply(context: ReferenceContext, position: Position, textDocument: TextDocumentIdentifier): ReferenceParams = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceParams]
  }
  
  extension [Self <: ReferenceParams](x: Self) {
    
    inline def setContext(value: ReferenceContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
  }
}
