package typings.typography.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleFont extends js.Object {
  var name: String
  var styles: js.Array[String]
}

object GoogleFont {
  @scala.inline
  def apply(name: String, styles: js.Array[String]): GoogleFont = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleFont]
  }
}

