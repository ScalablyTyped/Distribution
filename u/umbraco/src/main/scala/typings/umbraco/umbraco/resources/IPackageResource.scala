package typings.umbraco.umbraco.resources

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @ngdoc service
  * @name umbraco.resources.packageInstallResource
  * @description handles data for package installations
  **/
@js.native
trait IPackageResource extends js.Object {
  def cleanUp(_package: String): Unit = js.native
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
  def fetch(id: String): String = js.native
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
  def `import`(_package: String): Double = js.native
  def installData(_package: String): Unit = js.native
  def installFiles(_package: String): Unit = js.native
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
  @scala.inline
  implicit class IPackageResourceOps[Self <: IPackageResource] (val x: Self) extends AnyVal {
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
    def setCleanUp(value: String => Unit): Self = this.set("cleanUp", js.Any.fromFunction1(value))
    @scala.inline
    def setFetch(value: String => String): Self = this.set("fetch", js.Any.fromFunction1(value))
    @scala.inline
    def setImport(value: String => Double): Self = this.set("import", js.Any.fromFunction1(value))
    @scala.inline
    def setInstallData(value: String => Unit): Self = this.set("installData", js.Any.fromFunction1(value))
    @scala.inline
    def setInstallFiles(value: String => Unit): Self = this.set("installFiles", js.Any.fromFunction1(value))
  }
  
}

