package typings.vsoNodeApi.vssinterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApiResourceLocation extends js.Object {
  /**
    * Area name for this resource
    */
  var area: String = js.native
  /**
    * Unique Identifier for this location
    */
  var id: String = js.native
  /**
    * Maximum api version that this resource supports (current server version for this resource)
    */
  var maxVersion: String = js.native
  /**
    * Minimum api version that this resource supports
    */
  var minVersion: String = js.native
  /**
    * The latest version of this resource location that is in "Release" (non-preview) mode
    */
  var releasedVersion: String = js.native
  /**
    * Resource name
    */
  var resourceName: String = js.native
  /**
    * The current resource version supported by this resource location
    */
  var resourceVersion: Double = js.native
  /**
    * This location's route template (templated relative path)
    */
  var routeTemplate: String = js.native
}

object ApiResourceLocation {
  @scala.inline
  def apply(
    area: String,
    id: String,
    maxVersion: String,
    minVersion: String,
    releasedVersion: String,
    resourceName: String,
    resourceVersion: Double,
    routeTemplate: String
  ): ApiResourceLocation = {
    val __obj = js.Dynamic.literal(area = area.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], maxVersion = maxVersion.asInstanceOf[js.Any], minVersion = minVersion.asInstanceOf[js.Any], releasedVersion = releasedVersion.asInstanceOf[js.Any], resourceName = resourceName.asInstanceOf[js.Any], resourceVersion = resourceVersion.asInstanceOf[js.Any], routeTemplate = routeTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiResourceLocation]
  }
  @scala.inline
  implicit class ApiResourceLocationOps[Self <: ApiResourceLocation] (val x: Self) extends AnyVal {
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
    def setArea(value: String): Self = this.set("area", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxVersion(value: String): Self = this.set("maxVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinVersion(value: String): Self = this.set("minVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setReleasedVersion(value: String): Self = this.set("releasedVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceName(value: String): Self = this.set("resourceName", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceVersion(value: Double): Self = this.set("resourceVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setRouteTemplate(value: String): Self = this.set("routeTemplate", value.asInstanceOf[js.Any])
  }
  
}

