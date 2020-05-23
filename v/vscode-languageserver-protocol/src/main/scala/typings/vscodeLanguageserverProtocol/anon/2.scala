package typings.vscodeLanguageserverProtocol.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `2` extends js.Object {
  /**
    * The code action kind values the client supports. When this
    * property exists the client also guarantees that it will
    * handle values outside its set gracefully and falls back
    * to a default value when unknown.
    */
  var valueSet: js.Array[typings.vscodeLanguageserverTypes.mod.CodeActionKind]
}

object `2` {
  @scala.inline
  def apply(valueSet: js.Array[typings.vscodeLanguageserverTypes.mod.CodeActionKind]): `2` = {
    val __obj = js.Dynamic.literal(valueSet = valueSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`]
  }
}

