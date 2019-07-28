package typings.typescriptDashServices.TypeScriptNs.ServicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.ResolvedCompletionEntry")
@js.native
class ResolvedCompletionEntry protected () extends CachedCompletionEntryDetails {
  def this(
    name: String,
    kind: String,
    kindModifiers: String,
    `type`: String,
    fullSymbolName: String,
    docComment: String
  ) = this()
  /* CompleteClass */
  override var docComment: String = js.native
  /* CompleteClass */
  override var fullSymbolName: String = js.native
  /* CompleteClass */
  override var kind: String = js.native
  /* CompleteClass */
  override var kindModifiers: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override var `type`: String = js.native
  /* CompleteClass */
  override def isResolved(): Boolean = js.native
}

