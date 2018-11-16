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

