package typings.vsoNodeApi.interfacesGalleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublishedExtension extends StObject {
  
  var categories: js.Array[String]
  
  var deploymentType: ExtensionDeploymentTechnology
  
  var displayName: String
  
  var extensionId: String
  
  var extensionName: String
  
  var flags: PublishedExtensionFlags
  
  var installationTargets: js.Array[InstallationTarget]
  
  var lastUpdated: js.Date
  
  var longDescription: String
  
  /**
    * Date on which the extension was first uploaded.
    */
  var publishedDate: js.Date
  
  var publisher: PublisherFacts
  
  /**
    * Date on which the extension first went public.
    */
  var releaseDate: js.Date
  
  var sharedWith: js.Array[ExtensionShare]
  
  var shortDescription: String
  
  var statistics: js.Array[ExtensionStatistic]
  
  var tags: js.Array[String]
  
  var versions: js.Array[ExtensionVersion]
}
object PublishedExtension {
  
  inline def apply(
    categories: js.Array[String],
    deploymentType: ExtensionDeploymentTechnology,
    displayName: String,
    extensionId: String,
    extensionName: String,
    flags: PublishedExtensionFlags,
    installationTargets: js.Array[InstallationTarget],
    lastUpdated: js.Date,
    longDescription: String,
    publishedDate: js.Date,
    publisher: PublisherFacts,
    releaseDate: js.Date,
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
  implicit open class MutableBuilder[Self <: PublishedExtension] (val x: Self) extends AnyVal {
    
    inline def setCategories(value: js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value*))
    
    inline def setDeploymentType(value: ExtensionDeploymentTechnology): Self = StObject.set(x, "deploymentType", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setExtensionId(value: String): Self = StObject.set(x, "extensionId", value.asInstanceOf[js.Any])
    
    inline def setExtensionName(value: String): Self = StObject.set(x, "extensionName", value.asInstanceOf[js.Any])
    
    inline def setFlags(value: PublishedExtensionFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setInstallationTargets(value: js.Array[InstallationTarget]): Self = StObject.set(x, "installationTargets", value.asInstanceOf[js.Any])
    
    inline def setInstallationTargetsVarargs(value: InstallationTarget*): Self = StObject.set(x, "installationTargets", js.Array(value*))
    
    inline def setLastUpdated(value: js.Date): Self = StObject.set(x, "lastUpdated", value.asInstanceOf[js.Any])
    
    inline def setLongDescription(value: String): Self = StObject.set(x, "longDescription", value.asInstanceOf[js.Any])
    
    inline def setPublishedDate(value: js.Date): Self = StObject.set(x, "publishedDate", value.asInstanceOf[js.Any])
    
    inline def setPublisher(value: PublisherFacts): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    inline def setReleaseDate(value: js.Date): Self = StObject.set(x, "releaseDate", value.asInstanceOf[js.Any])
    
    inline def setSharedWith(value: js.Array[ExtensionShare]): Self = StObject.set(x, "sharedWith", value.asInstanceOf[js.Any])
    
    inline def setSharedWithVarargs(value: ExtensionShare*): Self = StObject.set(x, "sharedWith", js.Array(value*))
    
    inline def setShortDescription(value: String): Self = StObject.set(x, "shortDescription", value.asInstanceOf[js.Any])
    
    inline def setStatistics(value: js.Array[ExtensionStatistic]): Self = StObject.set(x, "statistics", value.asInstanceOf[js.Any])
    
    inline def setStatisticsVarargs(value: ExtensionStatistic*): Self = StObject.set(x, "statistics", js.Array(value*))
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setVersions(value: js.Array[ExtensionVersion]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    
    inline def setVersionsVarargs(value: ExtensionVersion*): Self = StObject.set(x, "versions", js.Array(value*))
  }
}
