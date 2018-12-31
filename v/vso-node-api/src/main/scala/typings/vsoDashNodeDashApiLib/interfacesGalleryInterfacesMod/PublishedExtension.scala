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

