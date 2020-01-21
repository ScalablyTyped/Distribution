package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFolderAscending extends js.Object {
  var folderAscending: Double
  var folderDescending: Double
  var none: Double
}

object AnonFolderAscending {
  @scala.inline
  def apply(folderAscending: Double, folderDescending: Double, none: Double): AnonFolderAscending = {
    val __obj = js.Dynamic.literal(folderAscending = folderAscending.asInstanceOf[js.Any], folderDescending = folderDescending.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFolderAscending]
  }
}

