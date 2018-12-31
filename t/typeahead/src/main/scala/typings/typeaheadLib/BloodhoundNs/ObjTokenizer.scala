package typings
package typeaheadLib.BloodhoundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjTokenizer extends js.Object {
  /**
    * Split the string content of the given object attribute(s) on non-word
    * characters.
    */
  def nonword(key: java.lang.String): js.Function1[/* obj */ js.Any, js.Array[java.lang.String]] = js.native
  def nonword(key: js.Array[java.lang.String]): js.Function1[/* obj */ js.Any, js.Array[java.lang.String]] = js.native
  /**
    * Split the string content of the given object attribute(s) on
    * whitespace characters.
    */
  def whitespace(key: java.lang.String): js.Function1[/* obj */ js.Any, js.Array[java.lang.String]] = js.native
  def whitespace(key: js.Array[java.lang.String]): js.Function1[/* obj */ js.Any, js.Array[java.lang.String]] = js.native
}

