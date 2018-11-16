package typings
package typescriptDashServicesLib.TypeScriptNs.ServicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.DeclReferenceCompletionEntry")
@js.native
class DeclReferenceCompletionEntry protected () extends CachedCompletionEntryDetails {
  def this(name: java.lang.String, kind: java.lang.String, kindModifiers: java.lang.String, decl: typescriptDashServicesLib.TypeScriptNs.PullDecl) = this()
  var decl: typescriptDashServicesLib.TypeScriptNs.PullDecl = js.native
  /* CompleteClass */
  override var docComment: java.lang.String = js.native
  /* CompleteClass */
  override var fullSymbolName: java.lang.String = js.native
  var hasBeenResolved: js.Any = js.native
  /* CompleteClass */
  override var kind: java.lang.String = js.native
  /* CompleteClass */
  override var kindModifiers: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /* CompleteClass */
  override var `type`: java.lang.String = js.native
  /* CompleteClass */
  override def isResolved(): scala.Boolean = js.native
  def resolve(`type`: java.lang.String, fullSymbolName: java.lang.String, docComments: java.lang.String): scala.Unit = js.native
}

