package typings.typescriptServices.mod.Services

import typings.typescriptServices.TypeScript.Services.CompletionEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "Services.CompletionInfo")
@js.native
open class CompletionInfo ()
  extends StObject
     with typings.typescriptServices.TypeScript.Services.CompletionInfo {
  
  /* CompleteClass */
  var entries: js.Array[CompletionEntry] = js.native
  
  /* CompleteClass */
  var isMemberCompletion: Boolean = js.native
  
  /* CompleteClass */
  var maybeInaccurate: Boolean = js.native
}
