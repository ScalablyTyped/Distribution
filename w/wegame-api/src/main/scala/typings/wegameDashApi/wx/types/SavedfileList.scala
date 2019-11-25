package typings.wegameDashApi.wx.types

import typings.wegameDashApi.Anon_CreateTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SavedfileList extends js.Object {
  var fileList: Anon_CreateTime
}

object SavedfileList {
  @scala.inline
  def apply(fileList: Anon_CreateTime): SavedfileList = {
    val __obj = js.Dynamic.literal(fileList = fileList.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SavedfileList]
  }
}

