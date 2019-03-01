package typings
package yesqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Text extends js.Object {
  var text: java.lang.String
  var values: js.Array[_]
}

object Anon_Text {
  @scala.inline
  def apply(text: java.lang.String, values: js.Array[_]): Anon_Text = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("text")(text)
    __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[Anon_Text]
  }
}

