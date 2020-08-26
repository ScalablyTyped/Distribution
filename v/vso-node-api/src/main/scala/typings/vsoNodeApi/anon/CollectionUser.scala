package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionUser extends js.Object {
  var collection_User: scala.Double = js.native
  var project_Team: scala.Double = js.native
}

object CollectionUser {
  @scala.inline
  def apply(collection_User: scala.Double, project_Team: scala.Double): CollectionUser = {
    val __obj = js.Dynamic.literal(collection_User = collection_User.asInstanceOf[js.Any], project_Team = project_Team.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionUser]
  }
  @scala.inline
  implicit class CollectionUserOps[Self <: CollectionUser] (val x: Self) extends AnyVal {
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
    def setCollection_User(value: scala.Double): Self = this.set("collection_User", value.asInstanceOf[js.Any])
    @scala.inline
    def setProject_Team(value: scala.Double): Self = this.set("project_Team", value.asInstanceOf[js.Any])
  }
  
}

