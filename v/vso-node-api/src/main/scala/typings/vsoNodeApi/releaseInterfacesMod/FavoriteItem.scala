package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FavoriteItem extends js.Object {
  /**
    * Application specific data for the entry
    */
  var data: String = js.native
  /**
    * Unique Id of the the entry
    */
  var id: String = js.native
  /**
    * Display text for favorite entry
    */
  var name: String = js.native
  /**
    * Application specific favorite entry type. Empty or Null represents that Favorite item is a Folder
    */
  var `type`: String = js.native
}

object FavoriteItem {
  @scala.inline
  def apply(data: String, id: String, name: String, `type`: String): FavoriteItem = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FavoriteItem]
  }
  @scala.inline
  implicit class FavoriteItemOps[Self <: FavoriteItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

