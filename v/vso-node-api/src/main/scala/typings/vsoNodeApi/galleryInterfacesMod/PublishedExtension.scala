package typings.vsoNodeApi.galleryInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublishedExtension extends js.Object {
  
  var categories: js.Array[String] = js.native
  
  var deploymentType: ExtensionDeploymentTechnology = js.native
  
  var displayName: String = js.native
  
  var extensionId: String = js.native
  
  var extensionName: String = js.native
  
  var flags: PublishedExtensionFlags = js.native
  
  var installationTargets: js.Array[InstallationTarget] = js.native
  
  var lastUpdated: Date = js.native
  
  var longDescription: String = js.native
  
  /**
    * Date on which the extension was first uploaded.
    */
  var publishedDate: Date = js.native
  
  var publisher: PublisherFacts = js.native
  
  /**
    * Date on which the extension first went public.
    */
  var releaseDate: Date = js.native
  
  var sharedWith: js.Array[ExtensionShare] = js.native
  
  var shortDescription: String = js.native
  
  var statistics: js.Array[ExtensionStatistic] = js.native
  
  var tags: js.Array[String] = js.native
  
  var versions: js.Array[ExtensionVersion] = js.native
}
object PublishedExtension {
  
  @scala.inline
  def apply(
    categories: js.Array[String],
    deploymentType: ExtensionDeploymentTechnology,
    displayName: String,
    extensionId: String,
    extensionName: String,
    flags: PublishedExtensionFlags,
    installationTargets: js.Array[InstallationTarget],
    lastUpdated: Date,
    longDescription: String,
    publishedDate: Date,
    publisher: PublisherFacts,
    releaseDate: Date,
    sharedWith: js.Array[ExtensionShare],
    shortDescription: String,
    statistics: js.Array[ExtensionStatistic],
    tags: js.Array[String],
    versions: js.Array[ExtensionVersion]
  ): PublishedExtension = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any], deploymentType = deploymentType.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], extensionId = extensionId.asInstanceOf[js.Any], extensionName = extensionName.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], installationTargets = installationTargets.asInstanceOf[js.Any], lastUpdated = lastUpdated.asInstanceOf[js.Any], longDescription = longDescription.asInstanceOf[js.Any], publishedDate = publishedDate.asInstanceOf[js.Any], publisher = publisher.asInstanceOf[js.Any], releaseDate = releaseDate.asInstanceOf[js.Any], sharedWith = sharedWith.asInstanceOf[js.Any], shortDescription = shortDescription.asInstanceOf[js.Any], statistics = statistics.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishedExtension]
  }
  
  @scala.inline
  implicit class PublishedExtensionOps[Self <: PublishedExtension] (val x: Self) extends AnyVal {
    
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
    def setDeploymentType(value: ExtensionDeploymentTechnology): Self = this.set("deploymentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionId(value: String): Self = this.set("extensionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionName(value: String): Self = this.set("extensionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlags(value: PublishedExtensionFlags): Self = this.set("flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstallationTargetsVarargs(value: InstallationTarget*): Self = this.set("installationTargets", js.Array(value :_*))
    
    @scala.inline
    def setInstallationTargets(value: js.Array[InstallationTarget]): Self = this.set("installationTargets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdated(value: Date): Self = this.set("lastUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongDescription(value: String): Self = this.set("longDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishedDate(value: Date): Self = this.set("publishedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisher(value: PublisherFacts): Self = this.set("publisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseDate(value: Date): Self = this.set("releaseDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedWithVarargs(value: ExtensionShare*): Self = this.set("sharedWith", js.Array(value :_*))
    
    @scala.inline
    def setSharedWith(value: js.Array[ExtensionShare]): Self = this.set("sharedWith", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortDescription(value: String): Self = this.set("shortDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatisticsVarargs(value: ExtensionStatistic*): Self = this.set("statistics", js.Array(value :_*))
    
    @scala.inline
    def setStatistics(value: js.Array[ExtensionStatistic]): Self = this.set("statistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionsVarargs(value: ExtensionVersion*): Self = this.set("versions", js.Array(value :_*))
    
    @scala.inline
    def setVersions(value: js.Array[ExtensionVersion]): Self = this.set("versions", value.asInstanceOf[js.Any])
  }
}
