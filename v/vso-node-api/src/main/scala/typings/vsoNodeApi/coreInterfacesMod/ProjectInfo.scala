package typings.vsoNodeApi.coreInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectInfo extends js.Object {
  var abbreviation: String = js.native
  var description: String = js.native
  var id: String = js.native
  var lastUpdateTime: Date = js.native
  var name: String = js.native
  var properties: js.Array[ProjectProperty] = js.native
  /**
    * Current revision of the project
    */
  var revision: Double = js.native
  var state: js.Any = js.native
  var uri: String = js.native
  var version: Double = js.native
  var visibility: ProjectVisibility = js.native
}

object ProjectInfo {
  @scala.inline
  def apply(
    abbreviation: String,
    description: String,
    id: String,
    lastUpdateTime: Date,
    name: String,
    properties: js.Array[ProjectProperty],
    revision: Double,
    state: js.Any,
    uri: String,
    version: Double,
    visibility: ProjectVisibility
  ): ProjectInfo = {
    val __obj = js.Dynamic.literal(abbreviation = abbreviation.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastUpdateTime = lastUpdateTime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectInfo]
  }
  @scala.inline
  implicit class ProjectInfoOps[Self <: ProjectInfo] (val x: Self) extends AnyVal {
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
    def setLastUpdateTime(value: Date): Self = this.set("lastUpdateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPropertiesVarargs(value: ProjectProperty*): Self = this.set("properties", js.Array(value :_*))
    @scala.inline
    def setProperties(value: js.Array[ProjectProperty]): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def setRevision(value: Double): Self = this.set("revision", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: js.Any): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisibility(value: ProjectVisibility): Self = this.set("visibility", value.asInstanceOf[js.Any])
  }
  
}

