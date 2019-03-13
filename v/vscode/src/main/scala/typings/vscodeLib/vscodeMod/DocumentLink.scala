package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode", "DocumentLink")
@js.native
class DocumentLink protected () extends js.Object {
  /**
  		 * Creates a new document link.
  		 *
  		 * @param range The range the document link applies to. Must not be empty.
  		 * @param target The uri the document link points to.
  		 */
  def this(range: Range) = this()
  def this(range: Range, target: Uri) = this()
  /**
  		 * The range this link applies to.
  		 */
  var range: Range = js.native
  /**
  		 * The uri this link points to.
  		 */
  var target: js.UndefOr[Uri] = js.native
}

