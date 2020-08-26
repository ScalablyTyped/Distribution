package typings.vsoNodeApi.vssinterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentityRef extends js.Object {
  var directoryAlias: String = js.native
  var displayName: String = js.native
  var id: String = js.native
  var imageUrl: String = js.native
  var inactive: Boolean = js.native
  var isAadIdentity: Boolean = js.native
  var isContainer: Boolean = js.native
  var profileUrl: String = js.native
  var uniqueName: String = js.native
  var url: String = js.native
}

object IdentityRef {
  @scala.inline
  def apply(
    directoryAlias: String,
    displayName: String,
    id: String,
    imageUrl: String,
    inactive: Boolean,
    isAadIdentity: Boolean,
    isContainer: Boolean,
    profileUrl: String,
    uniqueName: String,
    url: String
  ): IdentityRef = {
    val __obj = js.Dynamic.literal(directoryAlias = directoryAlias.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], imageUrl = imageUrl.asInstanceOf[js.Any], inactive = inactive.asInstanceOf[js.Any], isAadIdentity = isAadIdentity.asInstanceOf[js.Any], isContainer = isContainer.asInstanceOf[js.Any], profileUrl = profileUrl.asInstanceOf[js.Any], uniqueName = uniqueName.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityRef]
  }
  @scala.inline
  implicit class IdentityRefOps[Self <: IdentityRef] (val x: Self) extends AnyVal {
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
    def setDirectoryAlias(value: String): Self = this.set("directoryAlias", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setImageUrl(value: String): Self = this.set("imageUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setInactive(value: Boolean): Self = this.set("inactive", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsAadIdentity(value: Boolean): Self = this.set("isAadIdentity", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsContainer(value: Boolean): Self = this.set("isContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def setProfileUrl(value: String): Self = this.set("profileUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setUniqueName(value: String): Self = this.set("uniqueName", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

