package typings.xrm.Xrm.Url

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Command Bar Display options for Xrm.Url.FormOpenParameters.cmdbar, Xrm.Url.ViewOpenParameters.cmdbar, and Xrm.Utility.FormOpenParameters.cmdbar.
  * @see {@link XrmEnum.CmdBarDisplay}
  */
/* Rewritten from type alias, can be one of: 
  - typings.xrm.xrmStrings.`true`
  - typings.xrm.xrmStrings.`false`
*/
trait CmdBarDisplay extends js.Object

object CmdBarDisplay {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `false`: typings.xrm.xrmStrings.`false` = this.cast("false")
  @scala.inline
  def `true`: typings.xrm.xrmStrings.`true` = this.cast("true")
}

