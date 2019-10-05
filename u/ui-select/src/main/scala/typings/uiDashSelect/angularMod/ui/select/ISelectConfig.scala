package typings.uiDashSelect.angularMod.ui.select

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISelectConfig extends js.Object {
  var appendToBody: Boolean
  var resetSearchInput: Boolean
  var theme: String
}

object ISelectConfig {
  @scala.inline
  def apply(appendToBody: Boolean, resetSearchInput: Boolean, theme: String): ISelectConfig = {
    val __obj = js.Dynamic.literal(appendToBody = appendToBody, resetSearchInput = resetSearchInput, theme = theme)
  
    __obj.asInstanceOf[ISelectConfig]
  }
}

