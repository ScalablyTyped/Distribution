package typings.yesql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Text extends js.Object {
  var text: String
  var values: js.Array[_]
}

object Anon_Text {
  @scala.inline
  def apply(text: String, values: js.Array[_]): Anon_Text = {
    val __obj = js.Dynamic.literal(text = text, values = values)
  
    __obj.asInstanceOf[Anon_Text]
  }
}

