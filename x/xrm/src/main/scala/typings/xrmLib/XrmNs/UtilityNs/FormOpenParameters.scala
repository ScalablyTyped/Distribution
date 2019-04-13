package typings
package xrmLib.XrmNs.UtilityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for defining parameters on a Xrm.Utility.openEntityForm() request.
  */
trait FormOpenParameters extends OpenParameters {
  /**
    * Controls whether the command bar is displayed.
    * @remarks **Accepted values are**:
    * * "true"    (The command bar is displayed.)
    * * "false"   (The command bar is not displayed.)
    */
  var cmdbar: js.UndefOr[xrmLib.XrmNs.UrlNs.CmdBarDisplay] = js.undefined
  /**
    * The identifier of the form to use, when several are available.
    */
  var formid: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Controls whether the Navigation bar is displayed on the form.
    * @remarks **Accepted values are**:
    * * "on"      (The navigation bar is displayed.)
    * * "off"     (The navigation bar is not displayed.)
    * * "entity"  (On an entity form, only the navigation options for related entities are available.)
    */
  var navbar: js.UndefOr[xrmLib.XrmNs.UrlNs.NavBarDisplay] = js.undefined
}

object FormOpenParameters {
  @scala.inline
  def apply(
    StringDictionary: /**
    * Additional parameters can be provided to the request, by overloading
    * this object with additional key and value pairs. This can only be used
    * to provide default field values for the form, or pass data to custom
    * parameters that have been customized for the form.
    */
  org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]] = null,
    cmdbar: xrmLib.XrmNs.UrlNs.CmdBarDisplay = null,
    formid: java.lang.String = null,
    navbar: xrmLib.XrmNs.UrlNs.NavBarDisplay = null
  ): FormOpenParameters = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (cmdbar != null) __obj.updateDynamic("cmdbar")(cmdbar)
    if (formid != null) __obj.updateDynamic("formid")(formid)
    if (navbar != null) __obj.updateDynamic("navbar")(navbar)
    __obj.asInstanceOf[FormOpenParameters]
  }
}

