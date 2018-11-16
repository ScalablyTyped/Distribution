package typings
package tgfancyLib.tgfancyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tgfancy
  extends nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.namespaced {
  def closeWebSocket(): stdLib.Promise[js.UndefOr[scala.Nothing]] = js.native
  def hasOpenWebSocket(): scala.Boolean = js.native
  def kickChatMember(chatId: java.lang.String, userId: java.lang.String, ban: scala.Boolean): stdLib.Promise[scala.Boolean] = js.native
  def kickChatMember(chatId: java.lang.String, userId: scala.Double): stdLib.Promise[scala.Boolean] = js.native
  def kickChatMember(chatId: java.lang.String, userId: scala.Double, ban: scala.Boolean): stdLib.Promise[scala.Boolean] = js.native
  def kickChatMember(chatId: scala.Double, userId: java.lang.String, ban: scala.Boolean): stdLib.Promise[scala.Boolean] = js.native
  def kickChatMember(chatId: scala.Double, userId: scala.Double): stdLib.Promise[scala.Boolean] = js.native
  def kickChatMember(chatId: scala.Double, userId: scala.Double, ban: scala.Boolean): stdLib.Promise[scala.Boolean] = js.native
  def openWebSocket(): stdLib.Promise[js.UndefOr[scala.Nothing]] = js.native
  def resolveChatId(chatId: java.lang.String): stdLib.Promise[tgfancyLib.tgfancyMod.TgfancyNs.ResolvedChat] = js.native
}

