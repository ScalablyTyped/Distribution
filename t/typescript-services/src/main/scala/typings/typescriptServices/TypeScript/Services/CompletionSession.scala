package typings.typescriptServices.TypeScript.Services

import typings.typescriptServices.TypeScript.IdentiferNameHashTable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompletionSession extends js.Object {
  var entries: IdentiferNameHashTable[CachedCompletionEntryDetails]
  var fileName: String
  var position: Double
}

object CompletionSession {
  @scala.inline
  def apply(entries: IdentiferNameHashTable[CachedCompletionEntryDetails], fileName: String, position: Double): CompletionSession = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionSession]
  }
}

