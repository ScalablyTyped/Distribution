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
  type ControlType = _ControlType | ControlQuickFormType
}
