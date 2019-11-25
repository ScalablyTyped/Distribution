package typings.uniDashApp.Page

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationBarButtonTapOption extends js.Object {
  /**
    * 原生标题栏按钮数组的下标
    */
  var index: String
}

object NavigationBarButtonTapOption {
  @scala.inline
  def apply(index: String): NavigationBarButtonTapOption = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NavigationBarButtonTapOption]
  }
}

