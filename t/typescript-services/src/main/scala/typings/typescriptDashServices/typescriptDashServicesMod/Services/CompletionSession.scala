package typings.typescriptDashServices.typescriptDashServicesMod.Services

import typings.typescriptDashServices.TypeScript.Services.CachedCompletionEntryDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Services.CompletionSession")
@js.native
class CompletionSession protected ()
  extends typings.typescriptDashServices.TypeScript.Services.CompletionSession {
  def this(
    fileName: String,
    position: Double,
    entries: typings.typescriptDashServices.TypeScript.IdentiferNameHashTable[CachedCompletionEntryDetails]
  ) = this()
}

