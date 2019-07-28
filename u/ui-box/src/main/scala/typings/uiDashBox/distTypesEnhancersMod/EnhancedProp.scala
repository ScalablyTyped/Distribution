package typings.uiDashBox.distTypesEnhancersMod

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
    val __obj = js.Dynamic.literal(className = className, styles = styles)
  
    __obj.asInstanceOf[EnhancedProp]
  }
}

