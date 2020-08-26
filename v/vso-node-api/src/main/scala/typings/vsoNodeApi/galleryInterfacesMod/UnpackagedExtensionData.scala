package typings.vsoNodeApi.galleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnpackagedExtensionData extends js.Object {
  var categories: js.Array[String] = js.native
  var description: String = js.native
  var displayName: String = js.native
  var draftId: String = js.native
  var extensionName: String = js.native
  var installationTargets: js.Array[InstallationTarget] = js.native
  var isConvertedToMarkdown: Boolean = js.native
  var pricingCategory: String = js.native
  var product: String = js.native
  var publisherName: String = js.native
  var qnAEnabled: Boolean = js.native
  var referralUrl: String = js.native
  var repositoryUrl: String = js.native
  var tags: js.Array[String] = js.native
  var version: String = js.native
  var vsixId: String = js.native
}

object UnpackagedExtensionData {
  @scala.inline
  def apply(
    categories: js.Array[String],
    description: String,
    displayName: String,
    draftId: String,
    extensionName: String,
    installationTargets: js.Array[InstallationTarget],
    isConvertedToMarkdown: Boolean,
    pricingCategory: String,
    product: String,
    publisherName: String,
    qnAEnabled: Boolean,
    referralUrl: String,
    repositoryUrl: String,
    tags: js.Array[String],
    version: String,
    vsixId: String
  ): UnpackagedExtensionData = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], draftId = draftId.asInstanceOf[js.Any], extensionName = extensionName.asInstanceOf[js.Any], installationTargets = installationTargets.asInstanceOf[js.Any], isConvertedToMarkdown = isConvertedToMarkdown.asInstanceOf[js.Any], pricingCategory = pricingCategory.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any], publisherName = publisherName.asInstanceOf[js.Any], qnAEnabled = qnAEnabled.asInstanceOf[js.Any], referralUrl = referralUrl.asInstanceOf[js.Any], repositoryUrl = repositoryUrl.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], vsixId = vsixId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnpackagedExtensionData]
  }
  @scala.inline
  implicit class UnpackagedExtensionDataOps[Self <: UnpackagedExtensionData] (val x: Self) extends AnyVal {
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
    def setCategoriesVarargs(value: String*): Self = this.set("categories", js.Array(value :_*))
    @scala.inline
    def setCategories(value: js.Array[String]): Self = this.set("categories", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDraftId(value: String): Self = this.set("draftId", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtensionName(value: String): Self = this.set("extensionName", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstallationTargetsVarargs(value: InstallationTarget*): Self = this.set("installationTargets", js.Array(value :_*))
    @scala.inline
    def setInstallationTargets(value: js.Array[InstallationTarget]): Self = this.set("installationTargets", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsConvertedToMarkdown(value: Boolean): Self = this.set("isConvertedToMarkdown", value.asInstanceOf[js.Any])
    @scala.inline
    def setPricingCategory(value: String): Self = this.set("pricingCategory", value.asInstanceOf[js.Any])
    @scala.inline
    def setProduct(value: String): Self = this.set("product", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublisherName(value: String): Self = this.set("publisherName", value.asInstanceOf[js.Any])
    @scala.inline
    def setQnAEnabled(value: Boolean): Self = this.set("qnAEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setReferralUrl(value: String): Self = this.set("referralUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepositoryUrl(value: String): Self = this.set("repositoryUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def setVsixId(value: String): Self = this.set("vsixId", value.asInstanceOf[js.Any])
  }
  
}

