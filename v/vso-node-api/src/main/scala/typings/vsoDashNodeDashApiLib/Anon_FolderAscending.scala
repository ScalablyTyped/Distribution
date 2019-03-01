package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FolderAscending extends js.Object {
  var folderAscending: scala.Double
  var folderDescending: scala.Double
  var none: scala.Double
}

object Anon_FolderAscending {
  @scala.inline
  def apply(folderAscending: scala.Double, folderDescending: scala.Double, none: scala.Double): Anon_FolderAscending = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("folderAscending")(folderAscending)
    __obj.updateDynamic("folderDescending")(folderDescending)
    __obj.updateDynamic("none")(none)
    __obj.asInstanceOf[Anon_FolderAscending]
  }
}

