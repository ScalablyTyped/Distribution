package typings
package uiDashSelectLib.angularMod.uiNs.selectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISelectConfig extends js.Object {
  var appendToBody: scala.Boolean
  var resetSearchInput: scala.Boolean
  var theme: java.lang.String
}

object ISelectConfig {
  @scala.inline
  def apply(appendToBody: scala.Boolean, resetSearchInput: scala.Boolean, theme: java.lang.String): ISelectConfig = {
    val __obj = js.Dynamic.literal(appendToBody = appendToBody, resetSearchInput = resetSearchInput, theme = theme)
  
    __obj.asInstanceOf[ISelectConfig]
  }
}

