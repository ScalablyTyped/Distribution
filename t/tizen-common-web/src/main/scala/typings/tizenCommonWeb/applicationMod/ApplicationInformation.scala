package typings.tizenCommonWeb.applicationMod

import typings.std.Date
import typings.tizenCommonWeb.packageMod.PackageId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationInformation extends StObject {
  
  /**
    * An array of attributes to store the categories that the app belongs to.
    *
    * @since 2.0
    */
  val categories: js.Array[String]
  
  /**
    * An attribute to store the icon path of an application.
    */
  val iconPath: String
  
  /**
    * An attribute to store the identifier of an application for application management.
    */
  val id: ApplicationId
  
  /**
    * An attribute to store the application install/update time.
    *
    * @since 2.0
    */
  val installDate: Date
  
  /**
    * An attribute to store the name of an application.
    */
  val name: String
  
  /**
    * An attribute to store the package ID of an application.
    *
    * @since 2.1
    */
  val packageId: PackageId
  
  /**
    * An attribute that determines whether the application information should
    * be shown (such as in menus).
    */
  val show: Boolean
  
  /**
    * An attribute to store the application size (installed space).
    *
    * @since 2.0
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/application.info
    *
    * @throw WebAPIException SecurityError
    */
  val size: Double
  
  /**
    * An attribute to store the version of an application.
    */
  val version: String
}
object ApplicationInformation {
  
  @scala.inline
  def apply(
    categories: js.Array[String],
    iconPath: String,
    id: ApplicationId,
    installDate: Date,
    name: String,
    packageId: PackageId,
    show: Boolean,
    size: Double,
    version: String
  ): ApplicationInformation = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any], iconPath = iconPath.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], installDate = installDate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], packageId = packageId.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationInformation]
  }
  
  @scala.inline
  implicit class ApplicationInformationMutableBuilder[Self <: ApplicationInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategories(value: js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value :_*))
    
    @scala.inline
    def setIconPath(value: String): Self = StObject.set(x, "iconPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: ApplicationId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstallDate(value: Date): Self = StObject.set(x, "installDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageId(value: PackageId): Self = StObject.set(x, "packageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
