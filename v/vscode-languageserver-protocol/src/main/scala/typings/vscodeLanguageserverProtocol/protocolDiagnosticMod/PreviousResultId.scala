package typings.vscodeLanguageserverProtocol.protocolDiagnosticMod

import typings.vscodeLanguageserverTypes.mod.DocumentUri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreviousResultId extends StObject {
  
  /**
    * The URI for which the client knowns a
    * result id.
    */
  var uri: DocumentUri
  
  /**
    * The value of the previous result id.
    */
  var value: String
}
object PreviousResultId {
  
  inline def apply(uri: DocumentUri, value: String): PreviousResultId = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviousResultId]
  }
  
  extension [Self <: PreviousResultId](x: Self) {
    
    inline def setUri(value: DocumentUri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
