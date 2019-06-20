package typings
package uiDashBoxLib.distTypesEnhancersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnhancedProp extends js.Object {
  var className: java.lang.String
  var styles: java.lang.String
}

object EnhancedProp {
  @scala.inline
  def apply(className: java.lang.String, styles: java.lang.String): EnhancedProp = {
    val __obj = js.Dynamic.literal(className = className, styles = styles)
  
    __obj.asInstanceOf[EnhancedProp]
  }
}

