package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FavoriteItem extends js.Object {
  /**
    * Application specific data for the entry
    */
  var data: java.lang.String
  /**
    * Unique Id of the the entry
    */
  var id: java.lang.String
  /**
    * Display text for favorite entry
    */
  var name: java.lang.String
  /**
    * Application specific favorite entry type. Empty or Null represents that Favorite item is a Folder
    */
  var `type`: java.lang.String
}

object FavoriteItem {
  @scala.inline
  def apply(data: java.lang.String, id: java.lang.String, name: java.lang.String, `type`: java.lang.String): FavoriteItem = {
    val __obj = js.Dynamic.literal(data = data, id = id, name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[FavoriteItem]
  }
}

