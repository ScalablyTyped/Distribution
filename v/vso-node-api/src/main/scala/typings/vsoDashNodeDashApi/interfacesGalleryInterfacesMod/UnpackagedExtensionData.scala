package typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnpackagedExtensionData extends js.Object {
  var categories: js.Array[String]
  var description: String
  var displayName: String
  var draftId: String
  var extensionName: String
  var installationTargets: js.Array[InstallationTarget]
  var isConvertedToMarkdown: Boolean
  var pricingCategory: String
  var product: String
  var publisherName: String
  var qnAEnabled: Boolean
  var referralUrl: String
  var repositoryUrl: String
  var tags: js.Array[String]
  var version: String
  var vsixId: String
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
}

