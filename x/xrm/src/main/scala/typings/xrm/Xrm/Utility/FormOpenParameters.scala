package typings.xrm.Xrm.Utility

import typings.xrm.Xrm.Url.CmdBarDisplay
import typings.xrm.Xrm.Url.NavBarDisplay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for defining parameters on a Xrm.Utility.openEntityForm() request.
  */
@js.native
trait FormOpenParameters extends OpenParameters {
  /**
    * Controls whether the command bar is displayed.
    * @remarks **Accepted values are**:
    * * "true"    (The command bar is displayed.)
    * * "false"   (The command bar is not displayed.)
    */
  var cmdbar: js.UndefOr[CmdBarDisplay] = js.native
  /**
    * The identifier of the form to use, when several are available.
    */
  var formid: js.UndefOr[String] = js.native
  /**
    * Controls whether the Navigation bar is displayed on the form.
    * @remarks **Accepted values are**:
    * * "on"      (The navigation bar is displayed.)
    * * "off"     (The navigation bar is not displayed.)
    * * "entity"  (On an entity form, only the navigation options for related entities are available.)
    */
  var navbar: js.UndefOr[NavBarDisplay] = js.native
}

object FormOpenParameters {
  @scala.inline
  def apply(): FormOpenParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormOpenParameters]
  }
  @scala.inline
  implicit class FormOpenParametersOps[Self <: FormOpenParameters] (val x: Self) extends AnyVal {
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
    def setCmdbar(value: CmdBarDisplay): Self = this.set("cmdbar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCmdbar: Self = this.set("cmdbar", js.undefined)
    @scala.inline
    def setFormid(value: String): Self = this.set("formid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormid: Self = this.set("formid", js.undefined)
    @scala.inline
    def setNavbar(value: NavBarDisplay): Self = this.set("navbar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavbar: Self = this.set("navbar", js.undefined)
  }
  
}

