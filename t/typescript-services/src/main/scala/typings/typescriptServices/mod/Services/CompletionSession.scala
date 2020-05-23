package typings.typescriptServices.mod.Services

import typings.typescriptServices.TypeScript.IdentiferNameHashTable
import typings.typescriptServices.TypeScript.Services.CachedCompletionEntryDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Services.CompletionSession")
@js.native
class CompletionSession protected ()
  extends typings.typescriptServices.TypeScript.Services.CompletionSession {
  def this(fileName: String, position: Double, entries: IdentiferNameHashTable[CachedCompletionEntryDetails]) = this()
  /* CompleteClass */
  override var entries: IdentiferNameHashTable[CachedCompletionEntryDetails] = js.native
  /* CompleteClass */
  override var fileName: String = js.native
  /* CompleteClass */
  override var position: Double = js.native
}

