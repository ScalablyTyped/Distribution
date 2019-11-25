package typings.xrm.Xrm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Display States for setDisplayState() on {@link Controls.ProcessControl.setDisplayState Processes} and {@link Controls.Tab.setDisplayState Tabs}.
  * @see {@link XrmEnum.DisplayState}
  */
/* Rewritten from type alias, can be one of: 
  - typings.xrm.xrmStrings.collapsed
  - typings.xrm.xrmStrings.expanded
*/
trait DisplayState extends js.Object

object DisplayState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def collapsed: typings.xrm.xrmStrings.collapsed = this.cast("collapsed")
  @scala.inline
  def expanded: typings.xrm.xrmStrings.expanded = this.cast("expanded")
}

