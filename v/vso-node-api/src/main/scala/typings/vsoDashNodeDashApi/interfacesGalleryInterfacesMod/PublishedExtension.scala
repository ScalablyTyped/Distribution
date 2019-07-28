package typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublishedExtension extends js.Object {
  var categories: js.Array[String]
  var deploymentType: ExtensionDeploymentTechnology
  var displayName: String
  var extensionId: String
  var extensionName: String
  var flags: PublishedExtensionFlags
  var installationTargets: js.Array[InstallationTarget]
  var lastUpdated: Date
  var longDescription: String
  /**
    * Date on which the extension was first uploaded.
    */
  var publishedDate: Date
  var publisher: PublisherFacts
  /**
    * Date on which the extension first went public.
    */
  var releaseDate: Date
  var sharedWith: js.Array[ExtensionShare]
  var shortDescription: String
  var statistics: js.Array[ExtensionStatistic]
  var tags: js.Array[String]
  var versions: js.Array[ExtensionVersion]
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
    val __obj = js.Dynamic.literal(categories = categories, deploymentType = deploymentType, displayName = displayName, extensionId = extensionId, extensionName = extensionName, flags = flags, installationTargets = installationTargets, lastUpdated = lastUpdated, longDescription = longDescription, publishedDate = publishedDate, publisher = publisher, releaseDate = releaseDate, sharedWith = sharedWith, shortDescription = shortDescription, statistics = statistics, tags = tags, versions = versions)
  
    __obj.asInstanceOf[PublishedExtension]
  }
}

