package typings.tizenCommonWeb.packageMod

import typings.std.Date
import typings.tizenCommonWeb.applicationMod.ApplicationId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PackageInformation extends js.Object {
  
  /**
    * An attribute to store the application ID list of a package.
    */
  val appIds: js.Array[ApplicationId] = js.native
  
  /**
    * An attribute to store the author of a package.
    */
  val author: String = js.native
  
  /**
    * An attribute to store the current data size of a package.
    */
  val dataSize: Double = js.native
  
  /**
    * An attribute to store the package description.
    */
  val description: String = js.native
  
  /**
    * An attribute to store the icon path of a package.
    *
    * The icon path of the package is the same as the icon path of the relevant application
    * (see the [iconPath](https://docs.tizen.org/application/web/api/3.0/device_api/tv/tizen/application.html#ApplicationInformation::iconPath) attribute of
    * the [ApplicationInformation](https://docs.tizen.org/application/web/api/3.0/device_api/tv/tizen/application.html#ApplicationInformation) interface).
    *
    * The relevant application is the one with the same
    * [packageId](https://docs.tizen.org/application/web/api/3.0/device_api/tv/tizen/application.html#ApplicationInformation::packageId) as the
    * [id](https://docs.tizen.org/application/web/api/3.0/device_api/tv/tizen/package.html#PackageInformation::id) of this package.
    */
  val iconPath: String = js.native
  
  /**
    * An attribute to store the identifier of a package.
    */
  val id: PackageId = js.native
  
  /**
    * An attribute to store the latest installed or updated time of a package.
    */
  val lastModified: Date = js.native
  
  /**
    * An attribute to store the package name.
    */
  val name: String = js.native
  
  /**
    * An attribute to store the total installed size(package + data) of a package.
    */
  val totalSize: Double = js.native
  
  /**
    * An attribute to store the package version.
    */
  val version: String = js.native
}
object PackageInformation {
  
  @scala.inline
  def apply(
    appIds: js.Array[ApplicationId],
    author: String,
    dataSize: Double,
    description: String,
    iconPath: String,
    id: PackageId,
    lastModified: Date,
    name: String,
    totalSize: Double,
    version: String
  ): PackageInformation = {
    val __obj = js.Dynamic.literal(appIds = appIds.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], dataSize = dataSize.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], iconPath = iconPath.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastModified = lastModified.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], totalSize = totalSize.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageInformation]
  }
  
  @scala.inline
  implicit class PackageInformationOps[Self <: PackageInformation] (val x: Self) extends AnyVal {
    
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
    def setAppIdsVarargs(value: ApplicationId*): Self = this.set("appIds", js.Array(value :_*))
    
    @scala.inline
    def setAppIds(value: js.Array[ApplicationId]): Self = this.set("appIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthor(value: String): Self = this.set("author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSize(value: Double): Self = this.set("dataSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconPath(value: String): Self = this.set("iconPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: PackageId): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModified(value: Date): Self = this.set("lastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalSize(value: Double): Self = this.set("totalSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
}
