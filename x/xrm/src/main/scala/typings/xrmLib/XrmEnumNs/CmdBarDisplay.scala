package typings
package xrmLib.XrmEnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CmdBarDisplay extends js.Object

/**
  * Constant Enum: Command Bar Display options for Xrm.Url.FormOpenParameters.cmdbar, Xrm.Url.ViewOpenParameters.cmdbar, and Xrm.Utility.FormOpenParameters.cmdbar.
  * @see {@link Xrm.Url.CmdBarDisplay}
  */
@JSGlobal("XrmEnum.CmdBarDisplay")
@js.native
object CmdBarDisplay extends js.Object {
  @js.native
  sealed trait False
    extends xrmLib.XrmEnumNs.CmdBarDisplay
  
  @js.native
  sealed trait True
    extends xrmLib.XrmEnumNs.CmdBarDisplay
  
  /* "false" */ val False: False with java.lang.String = js.native
  /* "true" */ val True: True with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[xrmLib.XrmEnumNs.CmdBarDisplay with java.lang.String] = js.native
}

