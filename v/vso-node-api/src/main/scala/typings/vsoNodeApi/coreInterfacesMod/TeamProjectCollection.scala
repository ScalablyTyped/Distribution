package typings.vsoNodeApi.coreInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeamProjectCollection extends TeamProjectCollectionReference {
  /**
    * The links to other objects related to this object.
    */
  var _links: js.Any = js.native
  /**
    * Project collection description.
    */
  var description: String = js.native
  /**
    * Project collection state.
    */
  var state: String = js.native
}

object TeamProjectCollection {
  @scala.inline
  def apply(_links: js.Any, description: String, id: String, name: String, state: String, url: String): TeamProjectCollection = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamProjectCollection]
  }
  @scala.inline
  implicit class TeamProjectCollectionOps[Self <: TeamProjectCollection] (val x: Self) extends AnyVal {
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
    def set_links(value: js.Any): Self = this.set("_links", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
  }
  
}

