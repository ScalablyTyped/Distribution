package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeActionContext extends js.Object {
  /**
  		 * An array of diagnostics.
  		 */
  val diagnostics: js.Array[Diagnostic]
}

object CodeActionContext {
  @scala.inline
  def apply(diagnostics: js.Array[Diagnostic]): CodeActionContext = {
    val __obj = js.Dynamic.literal(diagnostics = diagnostics)
  
    __obj.asInstanceOf[CodeActionContext]
  }
}

