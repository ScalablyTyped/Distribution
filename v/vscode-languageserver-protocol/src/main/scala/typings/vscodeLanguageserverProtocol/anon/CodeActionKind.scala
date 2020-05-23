package typings.vscodeLanguageserverProtocol.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeActionKind extends js.Object {
  /**
    * The code action kind is support with the following value
    * set.
    */
  var codeActionKind: `2`
}

object CodeActionKind {
  @scala.inline
  def apply(codeActionKind: `2`): CodeActionKind = {
    val __obj = js.Dynamic.literal(codeActionKind = codeActionKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeActionKind]
  }
}

