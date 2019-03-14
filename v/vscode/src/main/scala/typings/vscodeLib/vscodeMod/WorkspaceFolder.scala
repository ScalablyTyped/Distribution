package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkspaceFolder extends js.Object {
  /**
  		 * The ordinal number of this workspace folder.
  		 */
  val index: scala.Double
  /**
  		 * The name of this workspace folder. Defaults to
  		 * the basename its [uri-path](#Uri.path)
  		 */
  val name: java.lang.String
  /**
  		 * The associated URI for this workspace folder.
  		 */
  val uri: Uri
}

object WorkspaceFolder {
  @scala.inline
  def apply(index: scala.Double, name: java.lang.String, uri: Uri): WorkspaceFolder = {
    val __obj = js.Dynamic.literal(index = index, name = name, uri = uri)
  
    __obj.asInstanceOf[WorkspaceFolder]
  }
}

