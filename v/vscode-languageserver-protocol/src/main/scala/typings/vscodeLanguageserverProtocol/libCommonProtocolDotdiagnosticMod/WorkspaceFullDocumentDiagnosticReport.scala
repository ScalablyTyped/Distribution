package typings.vscodeLanguageserverProtocol.libCommonProtocolDotdiagnosticMod

import typings.vscodeLanguageserverTypes.mod.Diagnostic
import typings.vscodeLanguageserverTypes.mod.DocumentUri
import typings.vscodeLanguageserverTypes.mod.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkspaceFullDocumentDiagnosticReport
  extends StObject
     with FullDocumentDiagnosticReport
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
object WorkspaceFullDocumentDiagnosticReport {
  
  inline def apply(items: js.Array[Diagnostic], kind: /* "full" */ String, uri: DocumentUri): WorkspaceFullDocumentDiagnosticReport = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], version = null)
    __obj.asInstanceOf[WorkspaceFullDocumentDiagnosticReport]
  }
  
  extension [Self <: WorkspaceFullDocumentDiagnosticReport](x: Self) {
    
    inline def setUri(value: DocumentUri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: integer): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
  }
}
