package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaveFileSuccess extends js.Object {
  /**
    * 文件的保存路径
    */
  var savedFilePath: js.UndefOr[java.lang.String] = js.undefined
}

object SaveFileSuccess {
  @scala.inline
  def apply(savedFilePath: java.lang.String = null): SaveFileSuccess = {
    val __obj = js.Dynamic.literal()
    if (savedFilePath != null) __obj.updateDynamic("savedFilePath")(savedFilePath)
    __obj.asInstanceOf[SaveFileSuccess]
  }
}

