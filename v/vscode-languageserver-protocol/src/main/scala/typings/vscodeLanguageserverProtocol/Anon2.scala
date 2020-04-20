package typings.vscodeLanguageserverProtocol

import typings.vscodeLanguageserverTypes.mod.CodeActionKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon2 extends js.Object {
  /**
    * The code action kind values the client supports. When this
    * property exists the client also guarantees that it will
    * handle values outside its set gracefully and falls back
    * to a default value when unknown.
    */
  var valueSet: js.Array[CodeActionKind]
}

object Anon2 {
  @scala.inline
  def apply(valueSet: js.Array[CodeActionKind]): Anon2 = {
    val __obj = js.Dynamic.literal(valueSet = valueSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon2]
  }
}

