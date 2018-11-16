package typings
package xrmLib.XrmEnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DisplayState extends js.Object

/**
     * Constant Enum: Display States for setDisplayState() on {@link Controls.ProcessControl.setDisplayState Processes} and {@link Controls.Tab.setDisplayState Tabs}.
     * @see {@link Xrm.DisplayState}
     */
@JSGlobal("XrmEnum.DisplayState")
@js.native
object DisplayState extends js.Object {
  @js.native
  sealed trait Collapsed
    extends xrmLib.XrmEnumNs.DisplayState
  
  @js.native
  sealed trait Expanded
    extends xrmLib.XrmEnumNs.DisplayState
  
  /* "collapsed" */ val Collapsed: Collapsed with java.lang.String = js.native
  /* "expanded" */ val Expanded: Expanded with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[xrmLib.XrmEnumNs.DisplayState with java.lang.String] = js.native
}

