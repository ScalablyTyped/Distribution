package typings.xrm.XrmEnum

import typings.xrm.xrmStrings.UnifiedServiceDesk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constant Enum: Client Types for {@link ClientContext.getClient clientContext.getClient()}.
  * @see {@link Xrm.Client}
  */
/* Rewritten from type alias, can be one of: 
  - typings.xrm.xrmStrings.Web
  - typings.xrm.xrmStrings.Outlook
  - typings.xrm.xrmStrings.Mobile
  - typings.xrm.xrmStrings.UnifiedServiceDesk
*/
trait Client extends js.Object

object Client {
  @scala.inline
  def Mobile: typings.xrm.xrmStrings.Mobile = this.cast("Mobile")
  @scala.inline
  def Outlook: typings.xrm.xrmStrings.Outlook = this.cast("Outlook")
  @scala.inline
  def USD: UnifiedServiceDesk = this.cast("UnifiedServiceDesk")
  @scala.inline
  def UnifiedServiceDesk: typings.xrm.xrmStrings.UnifiedServiceDesk = this.cast("UnifiedServiceDesk")
  @scala.inline
  def Web: typings.xrm.xrmStrings.Web = this.cast("Web")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

