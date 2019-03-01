package typings
package vscodeDashLanguageserverDashProtocolLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CodeActionKind extends js.Object {
  /**
    * The code action kind is support with the following value
    * set.
    */
  var codeActionKind: Anon_ValueSetArrayCodeActionKind
}

object Anon_CodeActionKind {
  @scala.inline
  def apply(codeActionKind: Anon_ValueSetArrayCodeActionKind): Anon_CodeActionKind = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("codeActionKind")(codeActionKind)
    __obj.asInstanceOf[Anon_CodeActionKind]
  }
}

