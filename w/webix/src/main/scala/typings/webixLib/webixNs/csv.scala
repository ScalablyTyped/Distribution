package typings
package webixLib.webixNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait csv extends js.Object {
  var delimiter: js.Any = js.native
  var escape: scala.Boolean = js.native
  def parse(text: java.lang.String): js.Array[_] = js.native
  def parse(text: java.lang.String, delimiter: js.Any): js.Array[_] = js.native
  def stringify(data: js.Array[_]): java.lang.String = js.native
  def stringify(data: js.Array[_], delimiter: js.Any): java.lang.String = js.native
}

