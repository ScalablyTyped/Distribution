package typings.vsoNodeApi.coreInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeamProjectReference extends js.Object {
  /**
    * Project abbreviation.
    */
  var abbreviation: String = js.native
  /**
    * The project's description (if any).
    */
  var description: String = js.native
  /**
    * Project identifier.
    */
  var id: String = js.native
  /**
    * Project name.
    */
  var name: String = js.native
  /**
    * Project revision.
    */
  var revision: Double = js.native
  /**
    * Project state.
    */
  var state: js.Any = js.native
  /**
    * Url to the full version of the object.
    */
  var url: String = js.native
  /**
    * Project visibility.
    */
  var visibility: ProjectVisibility = js.native
}

object TeamProjectReference {
  @scala.inline
  def apply(
    abbreviation: String,
    description: String,
    id: String,
    name: String,
    revision: Double,
    state: js.Any,
    url: String,
    visibility: ProjectVisibility
  ): TeamProjectReference = {
    val __obj = js.Dynamic.literal(abbreviation = abbreviation.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamProjectReference]
  }
  @scala.inline
  implicit class TeamProjectReferenceOps[Self <: TeamProjectReference] (val x: Self) extends AnyVal {
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
    def setAbbreviation(value: String): Self = this.set("abbreviation", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRevision(value: Double): Self = this.set("revision", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: js.Any): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisibility(value: ProjectVisibility): Self = this.set("visibility", value.asInstanceOf[js.Any])
  }
  
}

