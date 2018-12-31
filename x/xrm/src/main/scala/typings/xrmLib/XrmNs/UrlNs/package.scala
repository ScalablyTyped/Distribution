package typings
package xrmLib.XrmNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object UrlNs {
  /**
    * Command Bar Display options for Xrm.Url.FormOpenParameters.cmdbar, Xrm.Url.ViewOpenParameters.cmdbar, and Xrm.Utility.FormOpenParameters.cmdbar.
    * @see {@link XrmEnum.CmdBarDisplay}
    */
  type CmdBarDisplay = xrmLib.xrmLibStrings.`true` | xrmLib.xrmLibStrings.`false`
  /**
    * Navigation Bar Display options for Xrm.Url.FormOpenParameters.navbar, Xrm.Url.ViewOpenParameters.navbar, and Xrm.Utility.FormOpenParameters.navbar.
    * @see {@link XrmEnum.NavBarDisplay}
    */
  type NavBarDisplay = xrmLib.xrmLibStrings.entity | xrmLib.xrmLibStrings.off | xrmLib.xrmLibStrings.on
  /**
    * Report Open Action options for Xrm.Url.ReportOpenParameters.actions.
    * @see {@link XrmEnum.ReportAction}
    */
  type ReportAction = xrmLib.xrmLibStrings.filter | xrmLib.xrmLibStrings.run
}
