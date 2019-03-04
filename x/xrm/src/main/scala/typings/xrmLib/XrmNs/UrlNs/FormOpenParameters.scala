package typings
package xrmLib.XrmNs.UrlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for defining parameters on a request to open a form with main.aspx (as with
  * window.open). Useful for parsing the keys and values into a string of the format:
  * "&key=value".
  * @see {@link http://msdn.microsoft.com/en-us/library/gg328483.aspx External Link: Open forms, views, dialogs, and reports with a URL}
  * @remarks  A member for "pagetype" is not provided.  The value "entityrecord" is required in
  *           the URL, for forms. Example:  "pagetype=entityrecord"
  */
trait FormOpenParameters extends js.Object {
  /**
    * Controls whether the command bar is displayed.
    * @remarks **Accepted values are**:
    * * "true"    (The command bar is displayed.)
    * * "false"   (The command bar is not displayed.)
    */
  var cmdbar: js.UndefOr[CmdBarDisplay] = js.undefined
  /**
    * The logical name of the entity.
    */
  var etn: java.lang.String
  /**
    * Additional parameters can be provided to the request. This can only be used to provide
    * default field values for the form, or pass data to custom parameters that have been
    * customized for the form.  See example below for setting the selected form.
    * @example Example:  encodeURIComponent("formid={8c9f3e6f-7839-e211-831e-00155db7d98f}");
    */
  var extraqs: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Controls whether the Navigation bar is displayed on the form.
    * @remarks **Accepted values are**:
    * * "on"      (The navigation bar is displayed.)
    * * "off"     (The navigation bar is not displayed.)
    * * "entity"  (On an entity form, only the navigation options for related entities are available.)
    */
  var navbar: js.UndefOr[NavBarDisplay] = js.undefined
}

object FormOpenParameters {
  @scala.inline
  def apply(
    etn: java.lang.String,
    cmdbar: CmdBarDisplay = null,
    extraqs: java.lang.String = null,
    navbar: NavBarDisplay = null
  ): FormOpenParameters = {
    val __obj = js.Dynamic.literal(etn = etn)
    if (cmdbar != null) __obj.updateDynamic("cmdbar")(cmdbar)
    if (extraqs != null) __obj.updateDynamic("extraqs")(extraqs)
    if (navbar != null) __obj.updateDynamic("navbar")(navbar)
    __obj.asInstanceOf[FormOpenParameters]
  }
}

