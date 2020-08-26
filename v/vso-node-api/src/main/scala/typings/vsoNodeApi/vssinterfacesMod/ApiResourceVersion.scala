package typings.vsoNodeApi.vssinterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApiResourceVersion extends js.Object {
  /**
    * String representation of the Public API version. This is the version that the public sees and is used for a large group of services (e.g. the TFS 1.0 API)
    */
  var apiVersion: String = js.native
  /**
    * Is the public API version in preview
    */
  var isPreview: Boolean = js.native
  /**
    * Internal resource version. This is defined per-resource and is used to support build-to-build compatibility of API changes within a given (in-preview) public api version. For example, within the TFS 1.0 API release cycle, while it is still in preview, a resource's data structure may be changed. This resource can be versioned such that older clients will still work (requests will be sent to the older version) and new/upgraded clients will talk to the new version of the resource.
    */
  var resourceVersion: Double = js.native
}

object ApiResourceVersion {
  @scala.inline
  def apply(apiVersion: String, isPreview: Boolean, resourceVersion: Double): ApiResourceVersion = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], isPreview = isPreview.asInstanceOf[js.Any], resourceVersion = resourceVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiResourceVersion]
  }
  @scala.inline
  implicit class ApiResourceVersionOps[Self <: ApiResourceVersion] (val x: Self) extends AnyVal {
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
    def setApiVersion(value: String): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsPreview(value: Boolean): Self = this.set("isPreview", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceVersion(value: Double): Self = this.set("resourceVersion", value.asInstanceOf[js.Any])
  }
  
}

