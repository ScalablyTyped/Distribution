package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllAttributes extends js.Object {
  var allAttributes: scala.Double = js.native
  var excludeNonValidated: scala.Double = js.native
  var includeAssetUri: scala.Double = js.native
  var includeCategoryAndTags: scala.Double = js.native
  var includeFiles: scala.Double = js.native
  var includeInstallationTargets: scala.Double = js.native
  var includeLatestVersionOnly: scala.Double = js.native
  var includeLcids: scala.Double = js.native
  var includeMetadata: scala.Double = js.native
  var includeMinimalPayloadForVsIde: scala.Double = js.native
  var includeSharedAccounts: scala.Double = js.native
  var includeStatistics: scala.Double = js.native
  var includeVersionProperties: scala.Double = js.native
  var includeVersions: scala.Double = js.native
  var none: scala.Double = js.native
  var useFallbackAssetUri: scala.Double = js.native
}

object AllAttributes {
  @scala.inline
  def apply(
    allAttributes: scala.Double,
    excludeNonValidated: scala.Double,
    includeAssetUri: scala.Double,
    includeCategoryAndTags: scala.Double,
    includeFiles: scala.Double,
    includeInstallationTargets: scala.Double,
    includeLatestVersionOnly: scala.Double,
    includeLcids: scala.Double,
    includeMetadata: scala.Double,
    includeMinimalPayloadForVsIde: scala.Double,
    includeSharedAccounts: scala.Double,
    includeStatistics: scala.Double,
    includeVersionProperties: scala.Double,
    includeVersions: scala.Double,
    none: scala.Double,
    useFallbackAssetUri: scala.Double
  ): AllAttributes = {
    val __obj = js.Dynamic.literal(allAttributes = allAttributes.asInstanceOf[js.Any], excludeNonValidated = excludeNonValidated.asInstanceOf[js.Any], includeAssetUri = includeAssetUri.asInstanceOf[js.Any], includeCategoryAndTags = includeCategoryAndTags.asInstanceOf[js.Any], includeFiles = includeFiles.asInstanceOf[js.Any], includeInstallationTargets = includeInstallationTargets.asInstanceOf[js.Any], includeLatestVersionOnly = includeLatestVersionOnly.asInstanceOf[js.Any], includeLcids = includeLcids.asInstanceOf[js.Any], includeMetadata = includeMetadata.asInstanceOf[js.Any], includeMinimalPayloadForVsIde = includeMinimalPayloadForVsIde.asInstanceOf[js.Any], includeSharedAccounts = includeSharedAccounts.asInstanceOf[js.Any], includeStatistics = includeStatistics.asInstanceOf[js.Any], includeVersionProperties = includeVersionProperties.asInstanceOf[js.Any], includeVersions = includeVersions.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], useFallbackAssetUri = useFallbackAssetUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllAttributes]
  }
  @scala.inline
  implicit class AllAttributesOps[Self <: AllAttributes] (val x: Self) extends AnyVal {
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
    def setAllAttributes(value: scala.Double): Self = this.set("allAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setExcludeNonValidated(value: scala.Double): Self = this.set("excludeNonValidated", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludeAssetUri(value: scala.Double): Self = this.set("includeAssetUri", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludeCategoryAndTags(value: scala.Double): Self = this.set("includeCategoryAndTags", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludeFiles(value: scala.Double): Self = this.set("includeFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludeInstallationTargets(value: scala.Double): Self = this.set("includeInstallationTargets", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludeLatestVersionOnly(value: scala.Double): Self = this.set("includeLatestVersionOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludeLcids(value: scala.Double): Self = this.set("includeLcids", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludeMetadata(value: scala.Double): Self = this.set("includeMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludeMinimalPayloadForVsIde(value: scala.Double): Self = this.set("includeMinimalPayloadForVsIde", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludeSharedAccounts(value: scala.Double): Self = this.set("includeSharedAccounts", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludeStatistics(value: scala.Double): Self = this.set("includeStatistics", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludeVersionProperties(value: scala.Double): Self = this.set("includeVersionProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludeVersions(value: scala.Double): Self = this.set("includeVersions", value.asInstanceOf[js.Any])
    @scala.inline
    def setNone(value: scala.Double): Self = this.set("none", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseFallbackAssetUri(value: scala.Double): Self = this.set("useFallbackAssetUri", value.asInstanceOf[js.Any])
  }
  
}

