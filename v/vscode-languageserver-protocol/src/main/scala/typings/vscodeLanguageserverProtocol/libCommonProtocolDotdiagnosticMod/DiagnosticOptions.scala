package typings.vscodeLanguageserverProtocol.libCommonProtocolDotdiagnosticMod

import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.WorkDoneProgressOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagnosticOptions
  extends StObject
     with WorkDoneProgressOptions {
  
  /**
    * An optional identifier under which the diagnostics are
    * managed by the client.
    */
  var identifier: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the language has inter file dependencies meaning that
    * editing code in one file can result in a different diagnostic
    * set in another file. Inter file dependencies are common for
    * most programming languages and typically uncommon for linters.
    */
  var interFileDependencies: Boolean
  
  /**
    * The server provides support for workspace diagnostics as well.
    */
  var workspaceDiagnostics: Boolean
}
object DiagnosticOptions {
  
  inline def apply(interFileDependencies: Boolean, workspaceDiagnostics: Boolean): DiagnosticOptions = {
    val __obj = js.Dynamic.literal(interFileDependencies = interFileDependencies.asInstanceOf[js.Any], workspaceDiagnostics = workspaceDiagnostics.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagnosticOptions]
  }
  
  extension [Self <: DiagnosticOptions](x: Self) {
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setInterFileDependencies(value: Boolean): Self = StObject.set(x, "interFileDependencies", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceDiagnostics(value: Boolean): Self = StObject.set(x, "workspaceDiagnostics", value.asInstanceOf[js.Any])
  }
}
