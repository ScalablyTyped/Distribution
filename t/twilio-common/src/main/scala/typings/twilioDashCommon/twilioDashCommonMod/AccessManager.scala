package typings.twilioDashCommon.twilioDashCommonMod

import typings.node.eventsMod.EventEmitter
import typings.std.Date
import typings.std.Error
import typings.twilioDashCommon.twilioDashCommonStrings.error
import typings.twilioDashCommon.twilioDashCommonStrings.tokenExpired
import typings.twilioDashCommon.twilioDashCommonStrings.tokenUpdated
import typings.twilioDashCommon.twilioDashCommonStrings.tokenWillExpire
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-common", "AccessManager")
@js.native
class AccessManager protected () extends EventEmitter {
  def this(initialToken: String) = this()
  val expires: js.UndefOr[Date] = js.native
  val identity: js.UndefOr[String] = js.native
  val isExpired: Boolean = js.native
  val token: String = js.native
  @JSName("on")
  def on_error(`type`: error, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
  @JSName("on")
  def on_tokenExpired(`type`: tokenExpired, listener: js.Function1[/* manager */ this.type, Unit]): this.type = js.native
  @JSName("on")
  def on_tokenUpdated(`type`: tokenUpdated, listener: js.Function1[/* manager */ this.type, Unit]): this.type = js.native
  @JSName("on")
  def on_tokenWillExpire(`type`: tokenWillExpire, listener: js.Function1[/* manager */ this.type, Unit]): this.type = js.native
  def updateToken(newToken: String): js.Promise[AccessManager] = js.native
}

