package typings.uniDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaveFileSuccess extends js.Object {
  /**
    * 文件的保存路径
    */
  var savedFilePath: js.UndefOr[String] = js.undefined
}

object SaveFileSuccess {
  @scala.inline
  def apply(savedFilePath: String = null): SaveFileSuccess = {
    val __obj = js.Dynamic.literal()
    if (savedFilePath != null) __obj.updateDynamic("savedFilePath")(savedFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveFileSuccess]
  }
}

