package typings.vscodeLanguageclient.semanticTokensProposedMod.vscodeAugmentingMod

import typings.std.Uint32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "SemanticTokensEdit")
@js.native
class SemanticTokensEdit protected () extends js.Object {
  def this(start: Double, deleteCount: Double) = this()
  def this(start: Double, deleteCount: Double, data: Uint32Array) = this()
  
  val data: js.UndefOr[Uint32Array] = js.native
  
  val deleteCount: Double = js.native
  
  val start: Double = js.native
}
