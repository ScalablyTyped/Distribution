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
}

