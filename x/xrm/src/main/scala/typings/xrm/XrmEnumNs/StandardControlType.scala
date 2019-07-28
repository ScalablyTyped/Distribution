package typings.xrm.XrmEnumNs

import typings.xrm.xrmStrings.iframe
import typings.xrm.xrmStrings.kbsearch
import typings.xrm.xrmStrings.lookup
import typings.xrm.xrmStrings.multiselectoptionset
import typings.xrm.xrmStrings.notes
import typings.xrm.xrmStrings.optionset
import typings.xrm.xrmStrings.quickform
import typings.xrm.xrmStrings.standard
import typings.xrm.xrmStrings.subgrid
import typings.xrm.xrmStrings.timelinewall
import typings.xrm.xrmStrings.timercontrol
import typings.xrm.xrmStrings.webresource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constant Enum: Control types for {@link Controls.Control.getControlType Controls.Control.getControlType()}.
  * @see {@link Xrm.Controls.ControlType}
  */
/* Rewritten from type alias, can be one of: 
  - typings.xrm.xrmStrings.standard
  - typings.xrm.xrmStrings.iframe
  - typings.xrm.xrmStrings.lookup
  - typings.xrm.xrmStrings.optionset
  - typings.xrm.xrmStrings.multiselectoptionset
  - typings.xrm.xrmStrings.subgrid
  - typings.xrm.xrmStrings.webresource
  - typings.xrm.xrmStrings.notes
  - typings.xrm.xrmStrings.timercontrol
  - typings.xrm.xrmStrings.kbsearch
  - typings.xrm.xrmStrings.timelinewall
  - typings.xrm.xrmStrings.quickform
*/
trait StandardControlType extends js.Object

object StandardControlType {
  @scala.inline
  def IFrame: iframe = this.cast("iframe")
  @scala.inline
  def KBSearch: kbsearch = this.cast("kbsearch")
  @scala.inline
  def Lookup: lookup = this.cast("lookup")
  @scala.inline
  def MultiSelectOptionSet: multiselectoptionset = this.cast("multiselectoptionset")
  @scala.inline
  def Notes: notes = this.cast("notes")
  @scala.inline
  def OptionSet: optionset = this.cast("optionset")
  @scala.inline
  def QuickForm: quickform = this.cast("quickform")
  @scala.inline
  def Standard: standard = this.cast("standard")
  @scala.inline
  def SubGrid: subgrid = this.cast("subgrid")
  @scala.inline
  def TimeLineWall: timelinewall = this.cast("timelinewall")
  @scala.inline
  def TimerControl: timercontrol = this.cast("timercontrol")
  @scala.inline
  def WebResource: webresource = this.cast("webresource")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

