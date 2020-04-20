package typings.wegameApi.wx.types

import typings.wegameApi.AnonCreateTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SavedfileList extends js.Object {
  var fileList: AnonCreateTime
}

object SavedfileList {
  @scala.inline
  def apply(fileList: AnonCreateTime): SavedfileList = {
    val __obj = js.Dynamic.literal(fileList = fileList.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavedfileList]
  }
}

