package typings.typescriptDashServices.TypeScript.Services

import typings.typescriptDashServices.TypeScript.PullDecl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.DeclReferenceCompletionEntry")
@js.native
class DeclReferenceCompletionEntry protected () extends CachedCompletionEntryDetails {
  def this(name: String, kind: String, kindModifiers: String, decl: PullDecl) = this()
  var decl: PullDecl = js.native
  /* CompleteClass */
  override var docComment: String = js.native
  /* CompleteClass */
  override var fullSymbolName: String = js.native
  var hasBeenResolved: js.Any = js.native
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
  def resolve(`type`: String, fullSymbolName: String, docComments: String): Unit = js.native
}

