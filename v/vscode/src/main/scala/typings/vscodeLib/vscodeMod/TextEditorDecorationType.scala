package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextEditorDecorationType extends js.Object {
  /**
  		 * Internal representation of the handle.
  		 */
  val key: java.lang.String
  /**
  		 * Remove this decoration type and all decorations on all text editors using it.
  		 */
  def dispose(): scala.Unit
}

object TextEditorDecorationType {
  @scala.inline
  def apply(dispose: () => scala.Unit, key: java.lang.String): TextEditorDecorationType = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), key = key)
  
    __obj.asInstanceOf[TextEditorDecorationType]
  }
}

