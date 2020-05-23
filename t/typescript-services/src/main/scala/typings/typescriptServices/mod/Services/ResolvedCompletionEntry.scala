package typings.typescriptServices.mod.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Services.ResolvedCompletionEntry")
@js.native
class ResolvedCompletionEntry protected ()
  extends typings.typescriptServices.TypeScript.Services.ResolvedCompletionEntry {
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

