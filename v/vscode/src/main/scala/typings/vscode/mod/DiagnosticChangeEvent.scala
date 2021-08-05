package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagnosticChangeEvent extends StObject {
  
  /**
    * An array of resources for which diagnostics have changed.
    */
  val uris: js.Array[Uri]
}
object DiagnosticChangeEvent {
  
  inline def apply(uris: js.Array[Uri]): DiagnosticChangeEvent = {
    val __obj = js.Dynamic.literal(uris = uris.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagnosticChangeEvent]
  }
  
  extension [Self <: DiagnosticChangeEvent](x: Self) {
    
    inline def setUris(value: js.Array[Uri]): Self = StObject.set(x, "uris", value.asInstanceOf[js.Any])
    
    inline def setUrisVarargs(value: Uri*): Self = StObject.set(x, "uris", js.Array(value :_*))
  }
}
