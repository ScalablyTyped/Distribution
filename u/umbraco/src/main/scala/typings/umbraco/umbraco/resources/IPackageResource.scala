package typings.umbraco.umbraco.resources

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @ngdoc service
  * @name umbraco.resources.packageInstallResource
  * @description handles data for package installations
  **/
trait IPackageResource extends js.Object {
  def cleanUp(`package`: String): Unit
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
  def fetch(id: String): String
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
  def `import`(`package`: String): Double
  def installData(`package`: String): Unit
  def installFiles(`package`: String): Unit
}

object IPackageResource {
  @scala.inline
  def apply(
    cleanUp: String => Unit,
    fetch: String => String,
    `import`: String => Double,
    installData: String => Unit,
    installFiles: String => Unit
  ): IPackageResource = {
    val __obj = js.Dynamic.literal(cleanUp = js.Any.fromFunction1(cleanUp), fetch = js.Any.fromFunction1(fetch), installData = js.Any.fromFunction1(installData), installFiles = js.Any.fromFunction1(installFiles))
    __obj.updateDynamic("import")(js.Any.fromFunction1(`import`))
    __obj.asInstanceOf[IPackageResource]
  }
}

