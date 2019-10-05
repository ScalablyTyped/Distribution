package typings.telebot.telebotMod

import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.std.Error
import typings.std.RegExp
import typings.telebot.Anon_CacheTime
import typings.telebot.Anon_Caption
import typings.telebot.Anon_CaptionDuration
import typings.telebot.Anon_CaptionDurationFileName
import typings.telebot.Anon_CaptionDurationFileNameNotification
import typings.telebot.Anon_ChatId
import typings.telebot.Anon_ChatIdInlineMessageId
import typings.telebot.Anon_ChatIdInlineMsgId
import typings.telebot.Anon_ChatIdInlineMsgIdMessageId
import typings.telebot.Anon_Currency
import typings.telebot.Anon_Duration
import typings.telebot.Anon_ErrorMessage
import typings.telebot.Anon_ErrorMessageString
import typings.telebot.Anon_FileName
import typings.telebot.Anon_FoursquareId
import typings.telebot.Anon_Limit
import typings.telebot.Anon_Notification
import typings.telebot.Anon_NotificationBoolean
import typings.telebot.Anon_NotificationReplyMarkup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait telebot extends js.Object {
  def answerCallbackQuery(callback_query_id: String): Boolean = js.native
  def answerCallbackQuery(callback_query_id: String, opt: Anon_CacheTime): Boolean = js.native
  def answerList(id: String): AnswerList = js.native
  def answerList(id: String, opt: js.Any): AnswerList = js.native
  def answerPreCheckoutQuery(pre_checkout_query_id: String, ok: Boolean): Boolean = js.native
  def answerPreCheckoutQuery(pre_checkout_query_id: String, ok: Boolean, opt: Anon_ErrorMessageString): Boolean = js.native
  def answerQuery(param: js.Any*): Boolean = js.native
  def answerShippingQuery(shipping_query_id: String, ok: Boolean): Boolean = js.native
  def answerShippingQuery(shipping_query_id: String, ok: Boolean, opt: Anon_ErrorMessage): Boolean = js.native
  def button(`type`: String): js.Any = js.native
  def button(`type`: String, text: String): js.Any = js.native
  def cleanEvent(`type`: String): Boolean = js.native
  def connect(args: js.Any*): Unit = js.native
  def deleteMessage(chat_id: String, from_message_id: Double): Boolean = js.native
  def deleteMessage(chat_id: Double, from_message_id: Double): Boolean = js.native
  def deleteWebhook(): Boolean = js.native
  def destroyEvent(`type`: String): Boolean = js.native
  def editMessageCaption(config: Anon_ChatIdInlineMsgIdMessageId, caption: String): js.Any | Boolean = js.native
  def editMessageCaption(config: Anon_ChatIdInlineMsgId, caption: String): js.Any | Boolean = js.native
  def editMessageReplyMarkup(config: Anon_ChatIdInlineMsgIdMessageId, replyMarkup: js.Any): js.Any | Boolean = js.native
  def editMessageReplyMarkup(config: Anon_ChatIdInlineMsgId, replyMarkup: js.Any): js.Any | Boolean = js.native
  def editMessageText(config: Anon_ChatIdInlineMsgIdMessageId, text: String): js.Any | Boolean = js.native
  def editMessageText(config: Anon_ChatIdInlineMsgId, text: String): js.Any | Boolean = js.native
  def event(types: String, data: js.Any): js.Promise[_] = js.native
  def event(types: String, data: js.Any, self: js.Any): js.Promise[_] = js.native
  def event(types: js.Array[String], data: js.Any): js.Promise[_] = js.native
  def event(types: js.Array[String], data: js.Any, self: js.Any): js.Promise[_] = js.native
  def forwardMessage(chat_id: String, from_chat_id: String, message_id: Double): js.Any = js.native
  def forwardMessage(chat_id: String, from_chat_id: String, message_id: Double, opt: Anon_NotificationBoolean): js.Any = js.native
  def forwardMessage(chat_id: String, from_chat_id: Double, message_id: Double): js.Any = js.native
  def forwardMessage(chat_id: String, from_chat_id: Double, message_id: Double, opt: Anon_NotificationBoolean): js.Any = js.native
  def forwardMessage(chat_id: Double, from_chat_id: String, message_id: Double): js.Any = js.native
  def forwardMessage(chat_id: Double, from_chat_id: String, message_id: Double, opt: Anon_NotificationBoolean): js.Any = js.native
  def forwardMessage(chat_id: Double, from_chat_id: Double, message_id: Double): js.Any = js.native
  def forwardMessage(chat_id: Double, from_chat_id: Double, message_id: Double, opt: Anon_NotificationBoolean): js.Any = js.native
  def getChat(chat_id: String): js.Any = js.native
  def getChat(chat_id: Double): js.Any = js.native
  def getChatAdministrators(chat_id: String): js.Array[_] | js.Any = js.native
  def getChatAdministrators(chat_id: Double): js.Array[_] | js.Any = js.native
  def getChatMember(chat_id: String, user_id: Double): js.Any = js.native
  def getChatMember(chat_id: Double, user_id: Double): js.Any = js.native
  def getChatMembersCount(chat_id: String): Double = js.native
  def getChatMembersCount(chat_id: Double): Double = js.native
  def getFile(file_id: String): js.Any = js.native
  def getGameHighScores(user_id: Double): js.Array[_] = js.native
  def getGameHighScores(user_id: Double, opt: Anon_ChatIdInlineMessageId): js.Array[_] = js.native
  // Telegram API
  def getMe(): js.Any = js.native
  def getUpdates(offset: Double, limit: Double, timeout: Double, allowed_updates: String): Unit = js.native
  def getUpdates(offset: Double, limit: Double, timeout: Double, allowed_updates: js.Array[String]): Unit = js.native
  def getUserProfilePhotos(user_id: Double): js.Any = js.native
  def getUserProfilePhotos(user_id: Double, opt: Anon_Limit): js.Any = js.native
  def getWebhookInfo(): js.Any = js.native
  def inlineButton(text: String): js.Any = js.native
  def inlineButton(text: String, opt: js.Any): js.Any = js.native
  def inlineKeyboard(inlineButtons: js.Array[js.Array[_]]): js.Any = js.native
  def inlineQueryKeyboard(config: js.Array[js.Array[_]]): js.Any = js.native
  // methods.js
  def keyboard(buttons: js.Array[js.Array[_]]): js.Any = js.native
  def keyboard(buttons: js.Array[js.Array[_]], opt: js.Any): js.Any = js.native
  def kickChatMember(chat_id: String, user_id: Double): Boolean = js.native
  def kickChatMember(chat_id: Double, user_id: Double): Boolean = js.native
  def leaveChat(chat_id: String): Boolean = js.native
  def leaveChat(chat_id: Double): Boolean = js.native
  def mod(names: String, fn: genericCb): js.Any = js.native
  def mod(names: js.Array[String], fn: genericCb): js.Any = js.native
  def modRun(name: String, data: js.Any): js.Any = js.native
  def on(types: String, fn: genericCb): Boolean = js.native
  def on(types: String, fn: genericCb, opt: js.Any): Boolean = js.native
  def on(types: js.Array[String], fn: genericCb): Boolean = js.native
  def on(types: js.Array[String], fn: genericCb, opt: js.Any): Boolean = js.native
  def on(types: RegExp, fn: genericCb): Boolean = js.native
  def on(types: RegExp, fn: genericCb, opt: js.Any): Boolean = js.native
  def plug(module: module): Unit = js.native
  def properties(form: js.Any, opt: js.Any): js.Any = js.native
  def receiveUpdates(updateList: js.Array[_]): js.Promise[_] = js.native
  def removeEvent(`type`: String, fn: genericCb): Boolean = js.native
  def removeMod(name: String, fn: genericCb): Boolean = js.native
  def request(url: String, form: js.Any, data: js.Any): js.Promise[_] = js.native
  def sendAction(chat_id: String, action: String): Boolean = js.native
  def sendAction(chat_id: Double, action: String): Boolean = js.native
  def sendAudio(chat_id: String, file: String): js.Any = js.native
  def sendAudio(chat_id: String, file: String, opt: Anon_CaptionDuration): js.Any = js.native
  def sendAudio(chat_id: String, file: js.Any): js.Any = js.native
  def sendAudio(chat_id: String, file: js.Any, opt: Anon_CaptionDuration): js.Any = js.native
  def sendAudio(chat_id: String, file: Buffer): js.Any = js.native
  def sendAudio(chat_id: String, file: Buffer, opt: Anon_CaptionDuration): js.Any = js.native
  def sendAudio(chat_id: String, file: ReadableStream): js.Any = js.native
  def sendAudio(chat_id: String, file: ReadableStream, opt: Anon_CaptionDuration): js.Any = js.native
  def sendAudio(chat_id: Double, file: String): js.Any = js.native
  def sendAudio(chat_id: Double, file: String, opt: Anon_CaptionDuration): js.Any = js.native
  def sendAudio(chat_id: Double, file: js.Any): js.Any = js.native
  def sendAudio(chat_id: Double, file: js.Any, opt: Anon_CaptionDuration): js.Any = js.native
  def sendAudio(chat_id: Double, file: Buffer): js.Any = js.native
  def sendAudio(chat_id: Double, file: Buffer, opt: Anon_CaptionDuration): js.Any = js.native
  def sendAudio(chat_id: Double, file: ReadableStream): js.Any = js.native
  def sendAudio(chat_id: Double, file: ReadableStream, opt: Anon_CaptionDuration): js.Any = js.native
  def sendContact(chat_id: String, number: String, firstName: String): js.Any = js.native
  def sendContact(chat_id: String, number: String, firstName: String, lastName: String): js.Any = js.native
  def sendContact(
    chat_id: String,
    number: String,
    firstName: String,
    lastName: String,
    opt: Anon_NotificationReplyMarkup
  ): js.Any = js.native
  def sendContact(chat_id: Double, number: String, firstName: String): js.Any = js.native
  def sendContact(chat_id: Double, number: String, firstName: String, lastName: String): js.Any = js.native
  def sendContact(
    chat_id: Double,
    number: String,
    firstName: String,
    lastName: String,
    opt: Anon_NotificationReplyMarkup
  ): js.Any = js.native
  def sendDocument(chat_id: String, file: String): js.Any = js.native
  def sendDocument(chat_id: String, file: String, opt: Anon_Caption): js.Any = js.native
  def sendDocument(chat_id: String, file: js.Any): js.Any = js.native
  def sendDocument(chat_id: String, file: js.Any, opt: Anon_Caption): js.Any = js.native
  def sendDocument(chat_id: String, file: Buffer): js.Any = js.native
  def sendDocument(chat_id: String, file: Buffer, opt: Anon_Caption): js.Any = js.native
  def sendDocument(chat_id: String, file: ReadableStream): js.Any = js.native
  def sendDocument(chat_id: String, file: ReadableStream, opt: Anon_Caption): js.Any = js.native
  def sendDocument(chat_id: Double, file: String): js.Any = js.native
  def sendDocument(chat_id: Double, file: String, opt: Anon_Caption): js.Any = js.native
  def sendDocument(chat_id: Double, file: js.Any): js.Any = js.native
  def sendDocument(chat_id: Double, file: js.Any, opt: Anon_Caption): js.Any = js.native
  def sendDocument(chat_id: Double, file: Buffer): js.Any = js.native
  def sendDocument(chat_id: Double, file: Buffer, opt: Anon_Caption): js.Any = js.native
  def sendDocument(chat_id: Double, file: ReadableStream): js.Any = js.native
  def sendDocument(chat_id: Double, file: ReadableStream, opt: Anon_Caption): js.Any = js.native
  def sendGame(chat_id: String, game_short_name: String): js.Any = js.native
  def sendGame(chat_id: String, game_short_name: String, opt: Anon_NotificationReplyMarkup): js.Any = js.native
  def sendGame(chat_id: Double, game_short_name: String): js.Any = js.native
  def sendGame(chat_id: Double, game_short_name: String, opt: Anon_NotificationReplyMarkup): js.Any = js.native
  def sendInvoice(chat_id: String, invoiceDetails: Anon_Currency): js.Any = js.native
  def sendInvoice(chat_id: Double, invoiceDetails: Anon_Currency): js.Any = js.native
  def sendLocation(chat_id: String, coords: js.Tuple2[Double, Double]): js.Any = js.native
  def sendLocation(chat_id: String, coords: js.Tuple2[Double, Double], opt: Anon_NotificationReplyMarkup): js.Any = js.native
  def sendLocation(chat_id: Double, coords: js.Tuple2[Double, Double]): js.Any = js.native
  def sendLocation(chat_id: Double, coords: js.Tuple2[Double, Double], opt: Anon_NotificationReplyMarkup): js.Any = js.native
  def sendMessage(chat_id: String, text: String): js.Any = js.native
  def sendMessage(chat_id: String, text: String, opt: Anon_Notification): js.Any = js.native
  def sendMessage(chat_id: Double, text: String): js.Any = js.native
  def sendMessage(chat_id: Double, text: String, opt: Anon_Notification): js.Any = js.native
  def sendPhoto(chat_id: String, file: String): js.Any = js.native
  def sendPhoto(chat_id: String, file: String, opt: Anon_Caption): js.Any = js.native
  def sendPhoto(chat_id: String, file: js.Any): js.Any = js.native
  def sendPhoto(chat_id: String, file: js.Any, opt: Anon_Caption): js.Any = js.native
  def sendPhoto(chat_id: String, file: Buffer): js.Any = js.native
  def sendPhoto(chat_id: String, file: Buffer, opt: Anon_Caption): js.Any = js.native
  def sendPhoto(chat_id: String, file: ReadableStream): js.Any = js.native
  def sendPhoto(chat_id: String, file: ReadableStream, opt: Anon_Caption): js.Any = js.native
  def sendPhoto(chat_id: Double, file: String): js.Any = js.native
  def sendPhoto(chat_id: Double, file: String, opt: Anon_Caption): js.Any = js.native
  def sendPhoto(chat_id: Double, file: js.Any): js.Any = js.native
  def sendPhoto(chat_id: Double, file: js.Any, opt: Anon_Caption): js.Any = js.native
  def sendPhoto(chat_id: Double, file: Buffer): js.Any = js.native
  def sendPhoto(chat_id: Double, file: Buffer, opt: Anon_Caption): js.Any = js.native
  def sendPhoto(chat_id: Double, file: ReadableStream): js.Any = js.native
  def sendPhoto(chat_id: Double, file: ReadableStream, opt: Anon_Caption): js.Any = js.native
  def sendSticker(chat_id: String, file: String): js.Any = js.native
  def sendSticker(chat_id: String, file: String, opt: Anon_FileName): js.Any = js.native
  def sendSticker(chat_id: String, file: js.Any): js.Any = js.native
  def sendSticker(chat_id: String, file: js.Any, opt: Anon_FileName): js.Any = js.native
  def sendSticker(chat_id: String, file: Buffer): js.Any = js.native
  def sendSticker(chat_id: String, file: Buffer, opt: Anon_FileName): js.Any = js.native
  def sendSticker(chat_id: String, file: ReadableStream): js.Any = js.native
  def sendSticker(chat_id: String, file: ReadableStream, opt: Anon_FileName): js.Any = js.native
  def sendSticker(chat_id: Double, file: String): js.Any = js.native
  def sendSticker(chat_id: Double, file: String, opt: Anon_FileName): js.Any = js.native
  def sendSticker(chat_id: Double, file: js.Any): js.Any = js.native
  def sendSticker(chat_id: Double, file: js.Any, opt: Anon_FileName): js.Any = js.native
  def sendSticker(chat_id: Double, file: Buffer): js.Any = js.native
  def sendSticker(chat_id: Double, file: Buffer, opt: Anon_FileName): js.Any = js.native
  def sendSticker(chat_id: Double, file: ReadableStream): js.Any = js.native
  def sendSticker(chat_id: Double, file: ReadableStream, opt: Anon_FileName): js.Any = js.native
  def sendVenue(chat_id: String, coords: js.Tuple2[Double, Double], title: String, address: String): js.Any = js.native
  def sendVenue(
    chat_id: String,
    coords: js.Tuple2[Double, Double],
    title: String,
    address: String,
    opt: Anon_FoursquareId
  ): js.Any = js.native
  def sendVenue(chat_id: Double, coords: js.Tuple2[Double, Double], title: String, address: String): js.Any = js.native
  def sendVenue(
    chat_id: Double,
    coords: js.Tuple2[Double, Double],
    title: String,
    address: String,
    opt: Anon_FoursquareId
  ): js.Any = js.native
  def sendVideo(chat_id: String, file: String): js.Any = js.native
  def sendVideo(chat_id: String, file: String, opt: Anon_CaptionDurationFileName): js.Any = js.native
  def sendVideo(chat_id: String, file: js.Any): js.Any = js.native
  def sendVideo(chat_id: String, file: js.Any, opt: Anon_CaptionDurationFileName): js.Any = js.native
  def sendVideo(chat_id: String, file: Buffer): js.Any = js.native
  def sendVideo(chat_id: String, file: Buffer, opt: Anon_CaptionDurationFileName): js.Any = js.native
  def sendVideo(chat_id: String, file: ReadableStream): js.Any = js.native
  def sendVideo(chat_id: String, file: ReadableStream, opt: Anon_CaptionDurationFileName): js.Any = js.native
  def sendVideo(chat_id: Double, file: String): js.Any = js.native
  def sendVideo(chat_id: Double, file: String, opt: Anon_CaptionDurationFileName): js.Any = js.native
  def sendVideo(chat_id: Double, file: js.Any): js.Any = js.native
  def sendVideo(chat_id: Double, file: js.Any, opt: Anon_CaptionDurationFileName): js.Any = js.native
  def sendVideo(chat_id: Double, file: Buffer): js.Any = js.native
  def sendVideo(chat_id: Double, file: Buffer, opt: Anon_CaptionDurationFileName): js.Any = js.native
  def sendVideo(chat_id: Double, file: ReadableStream): js.Any = js.native
  def sendVideo(chat_id: Double, file: ReadableStream, opt: Anon_CaptionDurationFileName): js.Any = js.native
  def sendVideoNote(chat_id: String, file: String): js.Any = js.native
  def sendVideoNote(chat_id: String, file: String, opt: Anon_Duration): js.Any = js.native
  def sendVideoNote(chat_id: String, file: js.Any): js.Any = js.native
  def sendVideoNote(chat_id: String, file: js.Any, opt: Anon_Duration): js.Any = js.native
  def sendVideoNote(chat_id: String, file: Buffer): js.Any = js.native
  def sendVideoNote(chat_id: String, file: Buffer, opt: Anon_Duration): js.Any = js.native
  def sendVideoNote(chat_id: String, file: ReadableStream): js.Any = js.native
  def sendVideoNote(chat_id: String, file: ReadableStream, opt: Anon_Duration): js.Any = js.native
  def sendVideoNote(chat_id: Double, file: String): js.Any = js.native
  def sendVideoNote(chat_id: Double, file: String, opt: Anon_Duration): js.Any = js.native
  def sendVideoNote(chat_id: Double, file: js.Any): js.Any = js.native
  def sendVideoNote(chat_id: Double, file: js.Any, opt: Anon_Duration): js.Any = js.native
  def sendVideoNote(chat_id: Double, file: Buffer): js.Any = js.native
  def sendVideoNote(chat_id: Double, file: Buffer, opt: Anon_Duration): js.Any = js.native
  def sendVideoNote(chat_id: Double, file: ReadableStream): js.Any = js.native
  def sendVideoNote(chat_id: Double, file: ReadableStream, opt: Anon_Duration): js.Any = js.native
  def sendVoice(chat_id: String, file: String): js.Any = js.native
  def sendVoice(chat_id: String, file: String, opt: Anon_CaptionDurationFileNameNotification): js.Any = js.native
  def sendVoice(chat_id: String, file: js.Any): js.Any = js.native
  def sendVoice(chat_id: String, file: js.Any, opt: Anon_CaptionDurationFileNameNotification): js.Any = js.native
  def sendVoice(chat_id: String, file: Buffer): js.Any = js.native
  def sendVoice(chat_id: String, file: Buffer, opt: Anon_CaptionDurationFileNameNotification): js.Any = js.native
  def sendVoice(chat_id: String, file: ReadableStream): js.Any = js.native
  def sendVoice(chat_id: String, file: ReadableStream, opt: Anon_CaptionDurationFileNameNotification): js.Any = js.native
  def sendVoice(chat_id: Double, file: String): js.Any = js.native
  def sendVoice(chat_id: Double, file: String, opt: Anon_CaptionDurationFileNameNotification): js.Any = js.native
  def sendVoice(chat_id: Double, file: js.Any): js.Any = js.native
  def sendVoice(chat_id: Double, file: js.Any, opt: Anon_CaptionDurationFileNameNotification): js.Any = js.native
  def sendVoice(chat_id: Double, file: Buffer): js.Any = js.native
  def sendVoice(chat_id: Double, file: Buffer, opt: Anon_CaptionDurationFileNameNotification): js.Any = js.native
  def sendVoice(chat_id: Double, file: ReadableStream): js.Any = js.native
  def sendVoice(chat_id: Double, file: ReadableStream, opt: Anon_CaptionDurationFileNameNotification): js.Any = js.native
  def setGameScore(user_id: Double, score: Double): Boolean | Error | js.Any = js.native
  def setGameScore(user_id: Double, score: Double, opt: Anon_ChatId): Boolean | Error | js.Any = js.native
  def setWebhook(url: String): Boolean = js.native
  def setWebhook(url: String, certificate: js.Any): Boolean = js.native
  def setWebhook(url: String, certificate: js.Any, allowed_updates: js.Array[String]): Boolean = js.native
  def setWebhook(url: String, certificate: js.Any, allowed_updates: js.Array[String], max_connections: Double): Boolean = js.native
  def start(args: js.Any*): Unit = js.native
  def stop(message: String): Unit = js.native
  def unbanChatMember(chat_id: String, user_id: Double): Boolean = js.native
  def unbanChatMember(chat_id: Double, user_id: Double): Boolean = js.native
  def use(module: module): Unit = js.native
}

