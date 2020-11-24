package typings.xrm.Xrm.Url

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for defining parameters on a request to open a form with main.aspx (as with
  * window.open). Useful for parsing the keys and values into a string of the format:
  * "&key=value".
  * @see {@link http://msdn.microsoft.com/en-us/library/gg328483.aspx External Link: Open forms, views, dialogs, and reports with a URL}
  * @remarks  A member for "pagetype" is not provided.  The value "entityrecord" is required in
  *           the URL, for forms. Example:  "pagetype=entityrecord"
  */
@js.native
trait FormOpenParameters extends js.Object {
  
  /**
    * Controls whether the command bar is displayed.
    * @remarks **Accepted values are**:
    * * "true"    (The command bar is displayed.)
    * * "false"   (The command bar is not displayed.)
    */
  var cmdbar: js.UndefOr[CmdBarDisplay] = js.native
  
  /**
    * The logical name of the entity.
    */
  var etn: String = js.native
  
  /**
    * Additional parameters can be provided to the request. This can only be used to provide
    * default field values for the form, or pass data to custom parameters that have been
    * customized for the form.  See example below for setting the selected form.
    * @example Example:  encodeURIComponent("formid={8c9f3e6f-7839-e211-831e-00155db7d98f}");
    */
  var extraqs: js.UndefOr[String] = js.native
  
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
  def apply(etn: String): FormOpenParameters = {
    val __obj = js.Dynamic.literal(etn = etn.asInstanceOf[js.Any])
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
    def setEtn(value: String): Self = this.set("etn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCmdbar(value: CmdBarDisplay): Self = this.set("cmdbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCmdbar: Self = this.set("cmdbar", js.undefined)
    
    @scala.inline
    def setExtraqs(value: String): Self = this.set("extraqs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtraqs: Self = this.set("extraqs", js.undefined)
    
    @scala.inline
    def setNavbar(value: NavBarDisplay): Self = this.set("navbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavbar: Self = this.set("navbar", js.undefined)
  }
}
