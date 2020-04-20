package typings.uiBox.typesEnhancersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnhancedProp extends js.Object {
  var className: String
  var styles: String
}

object EnhancedProp {
  @scala.inline
  def apply(className: String, styles: String): EnhancedProp = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnhancedProp]
  }
}

