package typings
package xrmLib.XrmEnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constant Enum: Client Types for {@link ClientContext.getClient clientContext.getClient()}.
  * @see {@link Xrm.Client}
  */
/* Rewritten from type alias, can be one of: 
  - xrmLib.xrmLibStrings.Web
  - xrmLib.xrmLibStrings.Outlook
  - xrmLib.xrmLibStrings.Mobile
  - xrmLib.xrmLibStrings.UnifiedServiceDesk
*/
trait Client extends js.Object

object Client {
  @scala.inline
  def Mobile: xrmLib.xrmLibStrings.Mobile = this.cast("Mobile")
  @scala.inline
  def Outlook: xrmLib.xrmLibStrings.Outlook = this.cast("Outlook")
  @scala.inline
  def USD: xrmLib.xrmLibStrings.UnifiedServiceDesk = this.cast("UnifiedServiceDesk")
  @scala.inline
  def UnifiedServiceDesk: xrmLib.xrmLibStrings.UnifiedServiceDesk = this.cast("UnifiedServiceDesk")
  @scala.inline
  def Web: xrmLib.xrmLibStrings.Web = this.cast("Web")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

