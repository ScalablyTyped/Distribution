package typings
package uiDashGridLib.uiDashGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISelectOption extends js.Object {
  var label: java.lang.String
  var value: scala.Double | java.lang.String
}

object ISelectOption {
  @scala.inline
  def apply(label: java.lang.String, value: scala.Double | java.lang.String): ISelectOption = {
    val __obj = js.Dynamic.literal(label = label, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ISelectOption]
  }
}

