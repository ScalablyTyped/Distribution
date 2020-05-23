package typings.vscode.mod

import typings.std.Uint32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode", "SemanticTokensEdit")
@js.native
class SemanticTokensEdit protected () extends js.Object {
  def this(start: Double, deleteCount: Double) = this()
  def this(start: Double, deleteCount: Double, data: Uint32Array) = this()
  /**
    * The elements to insert.
    */
  val data: js.UndefOr[Uint32Array] = js.native
  /**
    * The count of elements to remove.
    */
  val deleteCount: Double = js.native
  /**
    * The start offset of the edit.
    */
  val start: Double = js.native
}

