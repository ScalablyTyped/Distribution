package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackageInformation extends StObject {
  
  /**
    * An attribute to store the application ID list of a package.
    */
  val appIds: js.Array[ApplicationId]
  
  /**
    * An attribute to store the author of a package.
    */
  val author: String
  
  /**
    * An attribute to store the current data size of a package.
    */
  val dataSize: Double
  
  /**
    * An attribute to store the package description.
    */
  val description: String
  
  /**
    * An attribute to store the icon path of a package.
    *
    * The icon path of the package is the same as the icon path of the relevant application
    * (see the [iconPath](application.html#ApplicationInformation::iconPath) attribute of
    * the [ApplicationInformation](application.html#ApplicationInformation) interface).
    *
    * The relevant application is the one with the same
    * [packageId](application.html#ApplicationInformation::packageId) as the
    * [id](#PackageInformation::id) of this package.
    */
  val iconPath: String
  
  /**
    * An attribute to store the identifier of a package.
    */
  val id: PackageId
  
  /**
    * An attribute to store the latest installed or updated time of a package.
    */
  val lastModified: js.Date
  
  /**
    * An attribute to store the package name.
    */
  val name: String
  
  /**
    * An attribute to store the total installed size(package + data) of a package.
    */
  val totalSize: Double
  
  /**
    * An attribute to store the package version.
    */
  val version: String
}
object PackageInformation {
  
  inline def apply(
    appIds: js.Array[ApplicationId],
    author: String,
    dataSize: Double,
    description: String,
    iconPath: String,
    id: PackageId,
    lastModified: js.Date,
    name: String,
    totalSize: Double,
    version: String
  ): PackageInformation = {
    val __obj = js.Dynamic.literal(appIds = appIds.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], dataSize = dataSize.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], iconPath = iconPath.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastModified = lastModified.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], totalSize = totalSize.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageInformation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PackageInformation] (val x: Self) extends AnyVal {
    
    inline def setAppIds(value: js.Array[ApplicationId]): Self = StObject.set(x, "appIds", value.asInstanceOf[js.Any])
    
    inline def setAppIdsVarargs(value: ApplicationId*): Self = StObject.set(x, "appIds", js.Array(value*))
    
    inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setDataSize(value: Double): Self = StObject.set(x, "dataSize", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setIconPath(value: String): Self = StObject.set(x, "iconPath", value.asInstanceOf[js.Any])
    
    inline def setId(value: PackageId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLastModified(value: js.Date): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTotalSize(value: Double): Self = StObject.set(x, "totalSize", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
