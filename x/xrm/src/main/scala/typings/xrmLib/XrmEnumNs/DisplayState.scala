package typings
package xrmLib.XrmEnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constant Enum: Display States for setDisplayState() on {@link Controls.ProcessControl.setDisplayState Processes} and {@link Controls.Tab.setDisplayState Tabs}.
  * @see {@link Xrm.DisplayState}
  */
/* Rewritten from type alias, can be one of: 
  - xrmLib.xrmLibStrings.expanded
  - xrmLib.xrmLibStrings.collapsed
*/
trait DisplayState extends js.Object

object DisplayState {
  @scala.inline
  def Collapsed: xrmLib.xrmLibStrings.collapsed = this.cast("collapsed")
  @scala.inline
  def Expanded: xrmLib.xrmLibStrings.expanded = this.cast("expanded")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

