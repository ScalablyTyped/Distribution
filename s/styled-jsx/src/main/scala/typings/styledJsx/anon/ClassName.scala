package typings.styledJsx.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassName extends js.Object {
  var className: String
  var styles: String
}

object ClassName {
  @scala.inline
  def apply(className: String, styles: String): ClassName = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassName]
  }
}

