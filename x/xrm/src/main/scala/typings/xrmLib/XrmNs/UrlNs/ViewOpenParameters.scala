package typings
package xrmLib.XrmNs.UrlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for defining parameters on a request to open a view with main.aspx (as with
  * window.open). Useful for parsing the keys and values into a string of the format:
  * "&key=value".
  * @see {@link http://msdn.microsoft.com/en-us/library/gg328483.aspx External Link: Open forms, views, dialogs, and reports with a URL}
  * @remarks  A member for "pagetype" is not provided.  The value "entitylist" is required in
  *           the URL, for views. Example:  "pagetype=entitylist"
  */
trait ViewOpenParameters extends js.Object {
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
    * Controls whether the Navigation bar is displayed on the form.
    * @remarks **Accepted values are**:
    * * "on"      (The navigation bar is displayed.)
    * * "off"     (The navigation bar is not displayed.)
    * * "entity"  (On an entity form, only the navigation options for related entities are available.)
    */
  var navbar: js.UndefOr[NavBarDisplay] = js.undefined
  /**
    * The unique identifier of a view, in Guid format, which is valid for the entity described by
    * {@link etn}.
    */
  var viewid: java.lang.String
  /**
    * The type of view identified by {@link viewid}.
    * @remarks **Accepted values are**:
    * * 1039    System View
    * * 4230    User View.
    */
  var viewtype: xrmLib.XrmEnumNs.ViewType
}

object ViewOpenParameters {
  @scala.inline
  def apply(
    etn: java.lang.String,
    viewid: java.lang.String,
    viewtype: xrmLib.XrmEnumNs.ViewType,
    cmdbar: CmdBarDisplay = null,
    navbar: NavBarDisplay = null
  ): ViewOpenParameters = {
    val __obj = js.Dynamic.literal(etn = etn, viewid = viewid, viewtype = viewtype)
    if (cmdbar != null) __obj.updateDynamic("cmdbar")(cmdbar)
    if (navbar != null) __obj.updateDynamic("navbar")(navbar)
    __obj.asInstanceOf[ViewOpenParameters]
  }
}

