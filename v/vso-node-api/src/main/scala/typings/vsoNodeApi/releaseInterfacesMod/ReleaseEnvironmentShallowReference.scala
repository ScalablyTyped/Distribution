package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReleaseEnvironmentShallowReference extends js.Object {
  /**
    * Gets the links to related resources, APIs, and views for the release environment.
    */
  var _links: js.Any = js.native
  /**
    * Gets the unique identifier of release environment.
    */
  var id: Double = js.native
  /**
    * Gets or sets the name of the release environment.
    */
  var name: String = js.native
  /**
    * Gets the REST API url to access the release environment.
    */
  var url: String = js.native
}

object ReleaseEnvironmentShallowReference {
  @scala.inline
  def apply(_links: js.Any, id: Double, name: String, url: String): ReleaseEnvironmentShallowReference = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseEnvironmentShallowReference]
  }
  @scala.inline
  implicit class ReleaseEnvironmentShallowReferenceOps[Self <: ReleaseEnvironmentShallowReference] (val x: Self) extends AnyVal {
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
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

