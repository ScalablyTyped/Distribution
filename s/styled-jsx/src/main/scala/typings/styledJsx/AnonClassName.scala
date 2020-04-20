package typings.styledJsx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClassName extends js.Object {
  var className: String
  var styles: String
}

object AnonClassName {
  @scala.inline
  def apply(className: String, styles: String): AnonClassName = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClassName]
  }
}

