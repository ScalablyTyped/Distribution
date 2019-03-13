package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceControlInputBox extends js.Object {
  /**
  		 * A string to show as place holder in the input box to guide the user.
  		 */
  var placeholder: java.lang.String
  /**
  		 * Setter and getter for the contents of the input box.
  		 */
  var value: java.lang.String
}

object SourceControlInputBox {
  @scala.inline
  def apply(placeholder: java.lang.String, value: java.lang.String): SourceControlInputBox = {
    val __obj = js.Dynamic.literal(placeholder = placeholder, value = value)
  
    __obj.asInstanceOf[SourceControlInputBox]
  }
}

