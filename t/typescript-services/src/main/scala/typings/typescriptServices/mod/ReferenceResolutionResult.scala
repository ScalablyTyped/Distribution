package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.IResolvedFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "ReferenceResolutionResult")
@js.native
class ReferenceResolutionResult ()
  extends StObject
     with typings.typescriptServices.TypeScript.ReferenceResolutionResult {
  
  /* CompleteClass */
  var diagnostics: js.Array[typings.typescriptServices.TypeScript.Diagnostic] = js.native
  
  /* CompleteClass */
  var resolvedFiles: js.Array[IResolvedFile] = js.native
  
  /* CompleteClass */
  var seenNoDefaultLibTag: Boolean = js.native
}
