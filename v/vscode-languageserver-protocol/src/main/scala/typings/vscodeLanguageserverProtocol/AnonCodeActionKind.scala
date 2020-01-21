package typings.vscodeLanguageserverProtocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCodeActionKind extends js.Object {
  /**
    * The code action kind is support with the following value
    * set.
    */
  var codeActionKind: AnonValueSetArrayCodeActionKind
}

object AnonCodeActionKind {
  @scala.inline
  def apply(codeActionKind: AnonValueSetArrayCodeActionKind): AnonCodeActionKind = {
    val __obj = js.Dynamic.literal(codeActionKind = codeActionKind.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCodeActionKind]
  }
}

