package typings
package tgfancyLib.tgfancyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tgfancy
  extends nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.^ {
  def closeWebSocket(): js.Promise[js.UndefOr[scala.Nothing]] = js.native
  def hasOpenWebSocket(): scala.Boolean = js.native
  def kickChatMember(chatId: java.lang.String, userId: java.lang.String, ban: scala.Boolean): js.Promise[scala.Boolean] = js.native
  def kickChatMember(chatId: java.lang.String, userId: scala.Double): js.Promise[scala.Boolean] = js.native
  def kickChatMember(chatId: java.lang.String, userId: scala.Double, ban: scala.Boolean): js.Promise[scala.Boolean] = js.native
  def kickChatMember(chatId: scala.Double, userId: java.lang.String, ban: scala.Boolean): js.Promise[scala.Boolean] = js.native
  def kickChatMember(chatId: scala.Double, userId: scala.Double): js.Promise[scala.Boolean] = js.native
  def kickChatMember(chatId: scala.Double, userId: scala.Double, ban: scala.Boolean): js.Promise[scala.Boolean] = js.native
  def openWebSocket(): js.Promise[js.UndefOr[scala.Nothing]] = js.native
  def resolveChatId(chatId: java.lang.String): js.Promise[ResolvedChat] = js.native
}

