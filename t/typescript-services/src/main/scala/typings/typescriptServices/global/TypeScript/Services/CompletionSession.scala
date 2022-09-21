package typings.typescriptServices.global.TypeScript.Services

import typings.typescriptServices.TypeScript.IdentiferNameHashTable
import typings.typescriptServices.TypeScript.Services.CachedCompletionEntryDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.Services.CompletionSession")
@js.native
open class CompletionSession protected ()
  extends StObject
     with typings.typescriptServices.TypeScript.Services.CompletionSession {
  def this(fileName: String, position: Double, entries: IdentiferNameHashTable[CachedCompletionEntryDetails]) = this()
  
  /* CompleteClass */
  var entries: IdentiferNameHashTable[CachedCompletionEntryDetails] = js.native
  
  /* CompleteClass */
  var fileName: String = js.native
  
  /* CompleteClass */
  var position: Double = js.native
}
