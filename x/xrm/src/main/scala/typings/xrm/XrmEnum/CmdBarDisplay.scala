package typings.xrm.XrmEnum

import typings.xrm.xrmStrings.`false`
import typings.xrm.xrmStrings.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constant Enum: Command Bar Display options for Xrm.Url.FormOpenParameters.cmdbar, Xrm.Url.ViewOpenParameters.cmdbar, and Xrm.Utility.FormOpenParameters.cmdbar.
  * @see {@link Xrm.Url.CmdBarDisplay}
  */
/* Rewritten from type alias, can be one of: 
  - typings.xrm.xrmStrings.`true`
  - typings.xrm.xrmStrings.`false`
*/
trait CmdBarDisplay extends js.Object

object CmdBarDisplay {
  @scala.inline
  def False: `false` = this.cast("false")
  @scala.inline
  def True: `true` = this.cast("true")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

