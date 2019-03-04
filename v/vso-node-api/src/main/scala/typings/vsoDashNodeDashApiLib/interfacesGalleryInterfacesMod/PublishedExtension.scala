package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublishedExtension extends js.Object {
  var categories: js.Array[java.lang.String]
  var deploymentType: ExtensionDeploymentTechnology
  var displayName: java.lang.String
  var extensionId: java.lang.String
  var extensionName: java.lang.String
  var flags: PublishedExtensionFlags
  var installationTargets: js.Array[InstallationTarget]
  var lastUpdated: stdLib.Date
  var longDescription: java.lang.String
  /**
    * Date on which the extension was first uploaded.
    */
  var publishedDate: stdLib.Date
  var publisher: PublisherFacts
  /**
    * Date on which the extension first went public.
    */
  var releaseDate: stdLib.Date
  var sharedWith: js.Array[ExtensionShare]
  var shortDescription: java.lang.String
  var statistics: js.Array[ExtensionStatistic]
  var tags: js.Array[java.lang.String]
  var versions: js.Array[ExtensionVersion]
}

object PublishedExtension {
  @scala.inline
  def apply(
    categories: js.Array[java.lang.String],
    deploymentType: ExtensionDeploymentTechnology,
    displayName: java.lang.String,
    extensionId: java.lang.String,
    extensionName: java.lang.String,
    flags: PublishedExtensionFlags,
    installationTargets: js.Array[InstallationTarget],
    lastUpdated: stdLib.Date,
    longDescription: java.lang.String,
    publishedDate: stdLib.Date,
    publisher: PublisherFacts,
    releaseDate: stdLib.Date,
    sharedWith: js.Array[ExtensionShare],
    shortDescription: java.lang.String,
    statistics: js.Array[ExtensionStatistic],
    tags: js.Array[java.lang.String],
    versions: js.Array[ExtensionVersion]
  ): PublishedExtension = {
    val __obj = js.Dynamic.literal(categories = categories, deploymentType = deploymentType, displayName = displayName, extensionId = extensionId, extensionName = extensionName, flags = flags, installationTargets = installationTargets, lastUpdated = lastUpdated, longDescription = longDescription, publishedDate = publishedDate, publisher = publisher, releaseDate = releaseDate, sharedWith = sharedWith, shortDescription = shortDescription, statistics = statistics, tags = tags, versions = versions)
  
    __obj.asInstanceOf[PublishedExtension]
  }
}

