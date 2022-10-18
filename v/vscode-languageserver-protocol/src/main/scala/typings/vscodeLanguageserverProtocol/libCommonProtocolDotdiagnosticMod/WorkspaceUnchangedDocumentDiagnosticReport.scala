package typings.vscodeLanguageserverProtocol.libCommonProtocolDotdiagnosticMod

import typings.vscodeLanguageserverTypes.mod.DocumentUri
import typings.vscodeLanguageserverTypes.mod.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkspaceUnchangedDocumentDiagnosticReport
  extends StObject
     with UnchangedDocumentDiagnosticReport
     with WorkspaceDocumentDiagnosticReport {
  
  /**
    * The URI for which diagnostic information is reported.
    */
  var uri: DocumentUri
  
  /**
    * The version number for which the diagnostics are reported.
    * If the document is not marked as open `null` can be provided.
    */
  var version: integer | Null
}
object WorkspaceUnchangedDocumentDiagnosticReport {
  
  inline def apply(kind: /* "unchanged" */ String, resultId: String, uri: DocumentUri): WorkspaceUnchangedDocumentDiagnosticReport = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], resultId = resultId.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], version = null)
    __obj.asInstanceOf[WorkspaceUnchangedDocumentDiagnosticReport]
  }
  
  extension [Self <: WorkspaceUnchangedDocumentDiagnosticReport](x: Self) {
    
    inline def setUri(value: DocumentUri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: integer): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
  }
}
