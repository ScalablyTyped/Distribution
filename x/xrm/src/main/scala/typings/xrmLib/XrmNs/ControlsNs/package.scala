package typings
package xrmLib.XrmNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ControlsNs {
  /**
    * Control type for formContext.ui.quickForms.getControlType().
    */
  type ControlQuickFormType = xrmLib.xrmLibStrings.quickform
  /**
    * Control types for {@link Controls.Control.getControlType Controls.Control.getControlType()}.
    * @see {@link XrmEnum.StandardControlType}
    */
  /* Rewritten from type alias, can be one of: 
    - xrmLib.xrmLibStrings.standard
    - xrmLib.xrmLibStrings.iframe
    - xrmLib.xrmLibStrings.lookup
    - xrmLib.xrmLibStrings.optionset
    - xrmLib.xrmLibStrings.subgrid
    - xrmLib.xrmLibStrings.webresource
    - xrmLib.xrmLibStrings.notes
    - xrmLib.xrmLibStrings.timercontrol
    - xrmLib.xrmLibStrings.kbsearch
    - xrmLib.xrmLibStrings.timelinewall
    - ControlQuickFormType
  */
  type ControlType = _ControlType | ControlQuickFormType
}
