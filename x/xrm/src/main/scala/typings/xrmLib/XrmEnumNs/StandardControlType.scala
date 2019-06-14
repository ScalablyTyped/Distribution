package typings
package xrmLib.XrmEnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constant Enum: Control types for {@link Controls.Control.getControlType Controls.Control.getControlType()}.
  * @see {@link Xrm.Controls.ControlType}
  */
/* Rewritten from type alias, can be one of: 
  - xrmLib.xrmLibStrings.standard
  - xrmLib.xrmLibStrings.iframe
  - xrmLib.xrmLibStrings.lookup
  - xrmLib.xrmLibStrings.optionset
  - xrmLib.xrmLibStrings.multiselectoptionset
  - xrmLib.xrmLibStrings.subgrid
  - xrmLib.xrmLibStrings.webresource
  - xrmLib.xrmLibStrings.notes
  - xrmLib.xrmLibStrings.timercontrol
  - xrmLib.xrmLibStrings.kbsearch
  - xrmLib.xrmLibStrings.timelinewall
  - xrmLib.xrmLibStrings.quickform
*/
trait StandardControlType extends js.Object

object StandardControlType {
  @scala.inline
  def IFrame: xrmLib.xrmLibStrings.iframe = this.cast("iframe")
  @scala.inline
  def KBSearch: xrmLib.xrmLibStrings.kbsearch = this.cast("kbsearch")
  @scala.inline
  def Lookup: xrmLib.xrmLibStrings.lookup = this.cast("lookup")
  @scala.inline
  def MultiSelectOptionSet: xrmLib.xrmLibStrings.multiselectoptionset = this.cast("multiselectoptionset")
  @scala.inline
  def Notes: xrmLib.xrmLibStrings.notes = this.cast("notes")
  @scala.inline
  def OptionSet: xrmLib.xrmLibStrings.optionset = this.cast("optionset")
  @scala.inline
  def QuickForm: xrmLib.xrmLibStrings.quickform = this.cast("quickform")
  @scala.inline
  def Standard: xrmLib.xrmLibStrings.standard = this.cast("standard")
  @scala.inline
  def SubGrid: xrmLib.xrmLibStrings.subgrid = this.cast("subgrid")
  @scala.inline
  def TimeLineWall: xrmLib.xrmLibStrings.timelinewall = this.cast("timelinewall")
  @scala.inline
  def TimerControl: xrmLib.xrmLibStrings.timercontrol = this.cast("timercontrol")
  @scala.inline
  def WebResource: xrmLib.xrmLibStrings.webresource = this.cast("webresource")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

