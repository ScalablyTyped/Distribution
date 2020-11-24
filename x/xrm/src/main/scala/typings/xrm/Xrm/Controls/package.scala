package typings.xrm.Xrm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Controls {
  
  /**
    * Control type for formContext.ui.quickForms.getControlType().
    */
  type ControlQuickFormType = typings.xrm.xrmStrings.quickform
  
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
    - typings.xrm.Xrm.Controls.ControlQuickFormType
  */
  type ControlType = typings.xrm.Xrm.Controls._ControlType | typings.xrm.Xrm.Controls.ControlQuickFormType
  
  type Grid = typings.xrm.Xrm.Controls.Grid_
}
