package typings.tgfancy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tgfancy
  extends typings.nodeTelegramBotApi.mod.^ {
  def closeWebSocket(): js.Promise[js.UndefOr[scala.Nothing]] = js.native
  def hasOpenWebSocket(): Boolean = js.native
  def kickChatMember(chatId: String, userId: String, ban: Boolean): js.Promise[Boolean] = js.native
  def kickChatMember(chatId: String, userId: Double): js.Promise[Boolean] = js.native
  def kickChatMember(chatId: String, userId: Double, ban: Boolean): js.Promise[Boolean] = js.native
  def kickChatMember(chatId: Double, userId: String, ban: Boolean): js.Promise[Boolean] = js.native
  def kickChatMember(chatId: Double, userId: Double): js.Promise[Boolean] = js.native
  def kickChatMember(chatId: Double, userId: Double, ban: Boolean): js.Promise[Boolean] = js.native
  def openWebSocket(): js.Promise[js.UndefOr[scala.Nothing]] = js.native
  def resolveChatId(chatId: String): js.Promise[ResolvedChat] = js.native
}

