package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShellQuotedString extends js.Object {
  /**
  		 * The quoting style to use.
  		 */
  var quoting: ShellQuoting
  /**
  		 * The actual string value.
  		 */
  var value: java.lang.String
}

object ShellQuotedString {
  @scala.inline
  def apply(quoting: ShellQuoting, value: java.lang.String): ShellQuotedString = {
    val __obj = js.Dynamic.literal(quoting = quoting, value = value)
  
    __obj.asInstanceOf[ShellQuotedString]
  }
}

