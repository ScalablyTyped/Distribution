package typings
package twilioDashCommonLib.twilioDashCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-common", "AccessManager")
@js.native
class AccessManager protected ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(initialToken: java.lang.String) = this()
  val expires: js.UndefOr[stdLib.Date] = js.native
  val identity: js.UndefOr[java.lang.String] = js.native
  val isExpired: scala.Boolean = js.native
  val token: java.lang.String = js.native
  @JSName("on")
  def on_error(
    `type`: twilioDashCommonLib.twilioDashCommonLibStrings.error,
    listener: js.Function1[/* error */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_tokenExpired(
    `type`: twilioDashCommonLib.twilioDashCommonLibStrings.tokenExpired,
    listener: js.Function1[/* manager */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_tokenUpdated(
    `type`: twilioDashCommonLib.twilioDashCommonLibStrings.tokenUpdated,
    listener: js.Function1[/* manager */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_tokenWillExpire(
    `type`: twilioDashCommonLib.twilioDashCommonLibStrings.tokenWillExpire,
    listener: js.Function1[/* manager */ this.type, scala.Unit]
  ): this.type = js.native
  def updateToken(newToken: java.lang.String): js.Promise[AccessManager] = js.native
}

