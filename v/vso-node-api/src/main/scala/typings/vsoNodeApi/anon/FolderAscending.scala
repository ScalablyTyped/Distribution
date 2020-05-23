package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FolderAscending extends js.Object {
  var folderAscending: scala.Double
  var folderDescending: scala.Double
  var none: scala.Double
}

object FolderAscending {
  @scala.inline
  def apply(folderAscending: scala.Double, folderDescending: scala.Double, none: scala.Double): FolderAscending = {
    val __obj = js.Dynamic.literal(folderAscending = folderAscending.asInstanceOf[js.Any], folderDescending = folderDescending.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[FolderAscending]
  }
}

