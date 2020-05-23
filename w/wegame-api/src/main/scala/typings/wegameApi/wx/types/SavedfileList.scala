package typings.wegameApi.wx.types

import typings.wegameApi.anon.CreateTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SavedfileList extends js.Object {
  var fileList: CreateTime
}

object SavedfileList {
  @scala.inline
  def apply(fileList: CreateTime): SavedfileList = {
    val __obj = js.Dynamic.literal(fileList = fileList.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavedfileList]
  }
}

