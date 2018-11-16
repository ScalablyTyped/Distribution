package typings
package umbracoLib.umbracoNs.resourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
    * @ngdoc service
    * @name umbraco.resources.packageInstallResource
    * @description handles data for package installations
    **/

trait IPackageResource extends js.Object {
  def cleanUp(`package`: java.lang.String): scala.Unit
  /**
           * @ngdoc method
           * @name umbraco.resources.packageInstallResource#fetchPackage
           * @methodOf umbraco.resources.packageInstallResource
           *
           * @description
           * Downloads a package file from our.umbraco.org to the website server.
           *
           * ##usage
           * <pre>
           * packageResource.download("guid-guid-guid-guid")
           *    .then(function(path) {
           *        alert('downloaded');
           *    });
           * </pre>
           *
           * @param {String} the unique package ID
           * @returns {String} path to the downloaded zip file.
           *
           */
  def fetch(id: java.lang.String): java.lang.String
  /**
           * @ngdoc method
           * @name umbraco.resources.packageInstallResource#createmanifest
           * @methodOf umbraco.resources.packageInstallResource
           *
           * @description
           * Creates a package manifest for a given folder of files.
           * This manifest keeps track of all installed files and data items
           * so a package can be uninstalled at a later time.
           * After creating a manifest, you can use the ID to install files and data.
           *
           * ##usage
           * <pre>
           * packageResource.createManifest("packages/id-of-install-file")
           *    .then(function(summary) {
           *        alert('unzipped');
           *    });
           * </pre>
           *
           * @param {String} folder the path to the temporary folder containing files
           * @returns {Int} the ID assigned to the saved package manifest
           *
           */
  def `import`(`package`: java.lang.String): scala.Double
  def installData(`package`: java.lang.String): scala.Unit
  def installFiles(`package`: java.lang.String): scala.Unit
}

