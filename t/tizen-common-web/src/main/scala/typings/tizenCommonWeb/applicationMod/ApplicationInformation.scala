package typings.tizenCommonWeb.applicationMod

import typings.std.Date
import typings.tizenCommonWeb.packageMod.PackageId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationInformation extends js.Object {
  /**
    * An array of attributes to store the categories that the app belongs to.
    *
    * @since 2.0
    */
  val categories: js.Array[String] = js.native
  /**
    * An attribute to store the icon path of an application.
    */
  val iconPath: String = js.native
  /**
    * An attribute to store the identifier of an application for application management.
    */
  val id: ApplicationId = js.native
  /**
    * An attribute to store the application install/update time.
    *
    * @since 2.0
    */
  val installDate: Date = js.native
  /**
    * An attribute to store the name of an application.
    */
  val name: String = js.native
  /**
    * An attribute to store the package ID of an application.
    *
    * @since 2.1
    */
  val packageId: PackageId = js.native
  /**
    * An attribute that determines whether the application information should
    * be shown (such as in menus).
    */
  val show: Boolean = js.native
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
  val size: Double = js.native
  /**
    * An attribute to store the version of an application.
    */
  val version: String = js.native
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
  implicit class ApplicationInformationOps[Self <: ApplicationInformation] (val x: Self) extends AnyVal {
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
    def setCategoriesVarargs(value: String*): Self = this.set("categories", js.Array(value :_*))
    @scala.inline
    def setCategories(value: js.Array[String]): Self = this.set("categories", value.asInstanceOf[js.Any])
    @scala.inline
    def setIconPath(value: String): Self = this.set("iconPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: ApplicationId): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstallDate(value: Date): Self = this.set("installDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPackageId(value: PackageId): Self = this.set("packageId", value.asInstanceOf[js.Any])
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

