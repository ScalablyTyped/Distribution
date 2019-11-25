package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FavoriteItem extends js.Object {
  /**
    * Application specific data for the entry
    */
  var data: String
  /**
    * Unique Id of the the entry
    */
  var id: String
  /**
    * Display text for favorite entry
    */
  var name: String
  /**
    * Application specific favorite entry type. Empty or Null represents that Favorite item is a Folder
    */
  var `type`: String
}

object FavoriteItem {
  @scala.inline
  def apply(data: String, id: String, name: String, `type`: String): FavoriteItem = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FavoriteItem]
  }
}

