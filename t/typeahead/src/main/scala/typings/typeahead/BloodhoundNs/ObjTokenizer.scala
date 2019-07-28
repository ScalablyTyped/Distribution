package typings.typeahead.BloodhoundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjTokenizer extends js.Object {
  /**
    * Split the string content of the given object attribute(s) on non-word
    * characters.
    */
  def nonword(key: String): js.Function1[/* obj */ js.Any, js.Array[String]] = js.native
  def nonword(key: js.Array[String]): js.Function1[/* obj */ js.Any, js.Array[String]] = js.native
  /**
    * Split the string content of the given object attribute(s) on
    * whitespace characters.
    */
  def whitespace(key: String): js.Function1[/* obj */ js.Any, js.Array[String]] = js.native
  def whitespace(key: js.Array[String]): js.Function1[/* obj */ js.Any, js.Array[String]] = js.native
}

