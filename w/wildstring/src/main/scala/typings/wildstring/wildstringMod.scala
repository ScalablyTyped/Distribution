package typings.wildstring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wildstring", JSImport.Namespace)
@js.native
object wildstringMod extends js.Object {
  var caseSensitive: Boolean = js.native
  var wildcard: String = js.native
  def `match`(pattern: String, string: String): Boolean = js.native
  def replace(pattern: String, strings: String): String = js.native
  def replace(pattern: String, strings: js.Array[String]): String = js.native
}

