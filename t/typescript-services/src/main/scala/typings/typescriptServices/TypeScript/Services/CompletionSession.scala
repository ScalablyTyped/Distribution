package typings.typescriptServices.TypeScript.Services

import typings.typescriptServices.TypeScript.IdentiferNameHashTable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.CompletionSession")
@js.native
class CompletionSession protected () extends js.Object {
  def this(fileName: String, position: Double, entries: IdentiferNameHashTable[CachedCompletionEntryDetails]) = this()
  var entries: IdentiferNameHashTable[CachedCompletionEntryDetails] = js.native
  var fileName: String = js.native
  var position: Double = js.native
}

