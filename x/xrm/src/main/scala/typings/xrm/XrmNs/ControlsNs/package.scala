package typings.xrm.XrmNs

import typings.xrm.xrmStrings.quickform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ControlsNs {
  /**
    * Control type for formContext.ui.quickForms.getControlType().
    */
  type ControlQuickFormType = quickform
  /**
    * Control types for {@link Controls.Control.getControlType Controls.Control.getControlType()}.
    * @see {@link XrmEnum.StandardControlType}
    */
  /* Rewritten from type alias, can be one of: 
    - typings.xrm.xrmStrings.standard
    - typings.xrm.xrmStrings.iframe
    - typings.xrm.xrmStrings.lookup
    - typings.xrm.xrmStrings.optionset
    - typings.xrm.xrmStrings.subgrid
    - typings.xrm.xrmStrings.webresource
    - typings.xrm.xrmStrings.notes
    - typings.xrm.xrmStrings.timercontrol
    - typings.xrm.xrmStrings.kbsearch
    - typings.xrm.xrmStrings.timelinewall
    - typings.xrm.XrmNs.ControlsNs.ControlQuickFormType
  */
  type ControlType = _ControlType | ControlQuickFormType
}
