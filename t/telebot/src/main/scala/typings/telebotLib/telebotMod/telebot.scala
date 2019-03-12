package typings
package telebotLib.telebotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait telebot extends js.Object {
  def answerCallbackQuery(callback_query_id: java.lang.String): scala.Boolean = js.native
  def answerCallbackQuery(callback_query_id: java.lang.String, opt: telebotLib.Anon_CacheTime): scala.Boolean = js.native
  def answerList(id: java.lang.String): telebotLib.telebotMod.telebotNs.AnswerList = js.native
  def answerList(id: java.lang.String, opt: js.Any): telebotLib.telebotMod.telebotNs.AnswerList = js.native
  def answerPreCheckoutQuery(pre_checkout_query_id: java.lang.String, ok: scala.Boolean): scala.Boolean = js.native
  def answerPreCheckoutQuery(
    pre_checkout_query_id: java.lang.String,
    ok: scala.Boolean,
    opt: telebotLib.Anon_ErrorMessageString
  ): scala.Boolean = js.native
  def answerQuery(param: js.Any*): scala.Boolean = js.native
  def answerShippingQuery(shipping_query_id: java.lang.String, ok: scala.Boolean): scala.Boolean = js.native
  def answerShippingQuery(shipping_query_id: java.lang.String, ok: scala.Boolean, opt: telebotLib.Anon_ErrorMessage): scala.Boolean = js.native
  def button(`type`: java.lang.String): js.Any = js.native
  def button(`type`: java.lang.String, text: java.lang.String): js.Any = js.native
  def cleanEvent(`type`: java.lang.String): scala.Boolean = js.native
  def connect(args: js.Any*): scala.Unit = js.native
  def deleteMessage(chat_id: java.lang.String, from_message_id: scala.Double): scala.Boolean = js.native
  def deleteMessage(chat_id: scala.Double, from_message_id: scala.Double): scala.Boolean = js.native
  def deleteWebhook(): scala.Boolean = js.native
  def destroyEvent(`type`: java.lang.String): scala.Boolean = js.native
  def editMessageCaption(config: telebotLib.Anon_ChatIdInlineMsgIdMessageId, caption: java.lang.String): js.Any | scala.Boolean = js.native
  def editMessageCaption(config: telebotLib.Anon_ChatIdInlineMsgId, caption: java.lang.String): js.Any | scala.Boolean = js.native
  def editMessageReplyMarkup(config: telebotLib.Anon_ChatIdInlineMsgIdMessageId, replyMarkup: js.Any): js.Any | scala.Boolean = js.native
  def editMessageReplyMarkup(config: telebotLib.Anon_ChatIdInlineMsgId, replyMarkup: js.Any): js.Any | scala.Boolean = js.native
  def editMessageText(config: telebotLib.Anon_ChatIdInlineMsgIdMessageId, text: java.lang.String): js.Any | scala.Boolean = js.native
  def editMessageText(config: telebotLib.Anon_ChatIdInlineMsgId, text: java.lang.String): js.Any | scala.Boolean = js.native
  def event(types: java.lang.String, data: js.Any): js.Promise[_] = js.native
  def event(types: java.lang.String, data: js.Any, self: js.Any): js.Promise[_] = js.native
  def event(types: js.Array[java.lang.String], data: js.Any): js.Promise[_] = js.native
  def event(types: js.Array[java.lang.String], data: js.Any, self: js.Any): js.Promise[_] = js.native
  def forwardMessage(chat_id: java.lang.String, from_chat_id: java.lang.String, message_id: scala.Double): js.Any = js.native
  def forwardMessage(
    chat_id: java.lang.String,
    from_chat_id: java.lang.String,
    message_id: scala.Double,
    opt: telebotLib.Anon_NotificationBoolean
  ): js.Any = js.native
  def forwardMessage(chat_id: java.lang.String, from_chat_id: scala.Double, message_id: scala.Double): js.Any = js.native
  def forwardMessage(
    chat_id: java.lang.String,
    from_chat_id: scala.Double,
    message_id: scala.Double,
    opt: telebotLib.Anon_NotificationBoolean
  ): js.Any = js.native
  def forwardMessage(chat_id: scala.Double, from_chat_id: java.lang.String, message_id: scala.Double): js.Any = js.native
  def forwardMessage(
    chat_id: scala.Double,
    from_chat_id: java.lang.String,
    message_id: scala.Double,
    opt: telebotLib.Anon_NotificationBoolean
  ): js.Any = js.native
  def forwardMessage(chat_id: scala.Double, from_chat_id: scala.Double, message_id: scala.Double): js.Any = js.native
  def forwardMessage(
    chat_id: scala.Double,
    from_chat_id: scala.Double,
    message_id: scala.Double,
    opt: telebotLib.Anon_NotificationBoolean
  ): js.Any = js.native
  def getChat(chat_id: java.lang.String): js.Any = js.native
  def getChat(chat_id: scala.Double): js.Any = js.native
  def getChatAdministrators(chat_id: java.lang.String): js.Array[_] | js.Any = js.native
  def getChatAdministrators(chat_id: scala.Double): js.Array[_] | js.Any = js.native
  def getChatMember(chat_id: java.lang.String, user_id: scala.Double): js.Any = js.native
  def getChatMember(chat_id: scala.Double, user_id: scala.Double): js.Any = js.native
  def getChatMembersCount(chat_id: java.lang.String): scala.Double = js.native
  def getChatMembersCount(chat_id: scala.Double): scala.Double = js.native
  def getFile(file_id: java.lang.String): js.Any = js.native
  def getGameHighScores(user_id: scala.Double): js.Array[_] = js.native
  def getGameHighScores(user_id: scala.Double, opt: telebotLib.Anon_ChatIdInlineMessageId): js.Array[_] = js.native
  // Telegram API
  def getMe(): js.Any = js.native
  def getUpdates(
    offset: scala.Double,
    limit: scala.Double,
    timeout: scala.Double,
    allowed_updates: java.lang.String
  ): scala.Unit = js.native
  def getUpdates(
    offset: scala.Double,
    limit: scala.Double,
    timeout: scala.Double,
    allowed_updates: js.Array[java.lang.String]
  ): scala.Unit = js.native
  def getUserProfilePhotos(user_id: scala.Double): js.Any = js.native
  def getUserProfilePhotos(user_id: scala.Double, opt: telebotLib.Anon_Limit): js.Any = js.native
  def getWebhookInfo(): js.Any = js.native
  def inlineButton(text: java.lang.String): js.Any = js.native
  def inlineButton(text: java.lang.String, opt: js.Any): js.Any = js.native
  def inlineKeyboard(inlineButtons: js.Array[js.Array[_]]): js.Any = js.native
  def inlineQueryKeyboard(config: js.Array[js.Array[_]]): js.Any = js.native
  // methods.js
  def keyboard(buttons: js.Array[js.Array[_]]): js.Any = js.native
  def keyboard(buttons: js.Array[js.Array[_]], opt: js.Any): js.Any = js.native
  def kickChatMember(chat_id: java.lang.String, user_id: scala.Double): scala.Boolean = js.native
  def kickChatMember(chat_id: scala.Double, user_id: scala.Double): scala.Boolean = js.native
  def leaveChat(chat_id: java.lang.String): scala.Boolean = js.native
  def leaveChat(chat_id: scala.Double): scala.Boolean = js.native
  def mod(names: java.lang.String, fn: telebotLib.telebotMod.telebotNs.genericCb): js.Any = js.native
  def mod(names: js.Array[java.lang.String], fn: telebotLib.telebotMod.telebotNs.genericCb): js.Any = js.native
  def modRun(name: java.lang.String, data: js.Any): js.Any = js.native
  def on(types: java.lang.String, fn: telebotLib.telebotMod.telebotNs.genericCb): scala.Boolean = js.native
  def on(types: java.lang.String, fn: telebotLib.telebotMod.telebotNs.genericCb, opt: js.Any): scala.Boolean = js.native
  def on(types: js.Array[java.lang.String], fn: telebotLib.telebotMod.telebotNs.genericCb): scala.Boolean = js.native
  def on(types: js.Array[java.lang.String], fn: telebotLib.telebotMod.telebotNs.genericCb, opt: js.Any): scala.Boolean = js.native
  def on(types: stdLib.RegExp, fn: telebotLib.telebotMod.telebotNs.genericCb): scala.Boolean = js.native
  def on(types: stdLib.RegExp, fn: telebotLib.telebotMod.telebotNs.genericCb, opt: js.Any): scala.Boolean = js.native
  def plug(module: telebotLib.telebotMod.telebotNs.module): scala.Unit = js.native
  def properties(form: js.Any, opt: js.Any): js.Any = js.native
  def receiveUpdates(updateList: js.Array[_]): js.Promise[_] = js.native
  def removeEvent(`type`: java.lang.String, fn: telebotLib.telebotMod.telebotNs.genericCb): scala.Boolean = js.native
  def removeMod(name: java.lang.String, fn: telebotLib.telebotMod.telebotNs.genericCb): scala.Boolean = js.native
  def request(url: java.lang.String, form: js.Any, data: js.Any): js.Promise[_] = js.native
  def sendAction(chat_id: java.lang.String, action: java.lang.String): scala.Boolean = js.native
  def sendAction(chat_id: scala.Double, action: java.lang.String): scala.Boolean = js.native
  def sendAudio(chat_id: java.lang.String, file: java.lang.String): js.Any = js.native
  def sendAudio(chat_id: java.lang.String, file: java.lang.String, opt: telebotLib.Anon_CaptionDuration): js.Any = js.native
  def sendAudio(chat_id: java.lang.String, file: js.Any): js.Any = js.native
  def sendAudio(chat_id: java.lang.String, file: js.Any, opt: telebotLib.Anon_CaptionDuration): js.Any = js.native
  def sendAudio(chat_id: java.lang.String, file: nodeLib.Buffer): js.Any = js.native
  def sendAudio(chat_id: java.lang.String, file: nodeLib.Buffer, opt: telebotLib.Anon_CaptionDuration): js.Any = js.native
  def sendAudio(chat_id: java.lang.String, file: nodeLib.NodeJSNs.ReadableStream): js.Any = js.native
  def sendAudio(
    chat_id: java.lang.String,
    file: nodeLib.NodeJSNs.ReadableStream,
    opt: telebotLib.Anon_CaptionDuration
  ): js.Any = js.native
  def sendAudio(chat_id: scala.Double, file: java.lang.String): js.Any = js.native
  def sendAudio(chat_id: scala.Double, file: java.lang.String, opt: telebotLib.Anon_CaptionDuration): js.Any = js.native
  def sendAudio(chat_id: scala.Double, file: js.Any): js.Any = js.native
  def sendAudio(chat_id: scala.Double, file: js.Any, opt: telebotLib.Anon_CaptionDuration): js.Any = js.native
  def sendAudio(chat_id: scala.Double, file: nodeLib.Buffer): js.Any = js.native
  def sendAudio(chat_id: scala.Double, file: nodeLib.Buffer, opt: telebotLib.Anon_CaptionDuration): js.Any = js.native
  def sendAudio(chat_id: scala.Double, file: nodeLib.NodeJSNs.ReadableStream): js.Any = js.native
  def sendAudio(chat_id: scala.Double, file: nodeLib.NodeJSNs.ReadableStream, opt: telebotLib.Anon_CaptionDuration): js.Any = js.native
  def sendContact(chat_id: java.lang.String, number: java.lang.String, firstName: java.lang.String): js.Any = js.native
  def sendContact(
    chat_id: java.lang.String,
    number: java.lang.String,
    firstName: java.lang.String,
    lastName: java.lang.String
  ): js.Any = js.native
  def sendContact(
    chat_id: java.lang.String,
    number: java.lang.String,
    firstName: java.lang.String,
    lastName: java.lang.String,
    opt: telebotLib.Anon_NotificationReplyMarkup
  ): js.Any = js.native
  def sendContact(chat_id: scala.Double, number: java.lang.String, firstName: java.lang.String): js.Any = js.native
  def sendContact(
    chat_id: scala.Double,
    number: java.lang.String,
    firstName: java.lang.String,
    lastName: java.lang.String
  ): js.Any = js.native
  def sendContact(
    chat_id: scala.Double,
    number: java.lang.String,
    firstName: java.lang.String,
    lastName: java.lang.String,
    opt: telebotLib.Anon_NotificationReplyMarkup
  ): js.Any = js.native
  def sendDocument(chat_id: java.lang.String, file: java.lang.String): js.Any = js.native
  def sendDocument(chat_id: java.lang.String, file: java.lang.String, opt: telebotLib.Anon_Caption): js.Any = js.native
  def sendDocument(chat_id: java.lang.String, file: js.Any): js.Any = js.native
  def sendDocument(chat_id: java.lang.String, file: js.Any, opt: telebotLib.Anon_Caption): js.Any = js.native
  def sendDocument(chat_id: java.lang.String, file: nodeLib.Buffer): js.Any = js.native
  def sendDocument(chat_id: java.lang.String, file: nodeLib.Buffer, opt: telebotLib.Anon_Caption): js.Any = js.native
  def sendDocument(chat_id: java.lang.String, file: nodeLib.NodeJSNs.ReadableStream): js.Any = js.native
  def sendDocument(chat_id: java.lang.String, file: nodeLib.NodeJSNs.ReadableStream, opt: telebotLib.Anon_Caption): js.Any = js.native
  def sendDocument(chat_id: scala.Double, file: java.lang.String): js.Any = js.native
  def sendDocument(chat_id: scala.Double, file: java.lang.String, opt: telebotLib.Anon_Caption): js.Any = js.native
  def sendDocument(chat_id: scala.Double, file: js.Any): js.Any = js.native
  def sendDocument(chat_id: scala.Double, file: js.Any, opt: telebotLib.Anon_Caption): js.Any = js.native
  def sendDocument(chat_id: scala.Double, file: nodeLib.Buffer): js.Any = js.native
  def sendDocument(chat_id: scala.Double, file: nodeLib.Buffer, opt: telebotLib.Anon_Caption): js.Any = js.native
  def sendDocument(chat_id: scala.Double, file: nodeLib.NodeJSNs.ReadableStream): js.Any = js.native
  def sendDocument(chat_id: scala.Double, file: nodeLib.NodeJSNs.ReadableStream, opt: telebotLib.Anon_Caption): js.Any = js.native
  def sendGame(chat_id: java.lang.String, game_short_name: java.lang.String): js.Any = js.native
  def sendGame(
    chat_id: java.lang.String,
    game_short_name: java.lang.String,
    opt: telebotLib.Anon_NotificationReplyMarkup
  ): js.Any = js.native
  def sendGame(chat_id: scala.Double, game_short_name: java.lang.String): js.Any = js.native
  def sendGame(
    chat_id: scala.Double,
    game_short_name: java.lang.String,
    opt: telebotLib.Anon_NotificationReplyMarkup
  ): js.Any = js.native
  def sendInvoice(chat_id: java.lang.String, invoiceDetails: telebotLib.Anon_Currency): js.Any = js.native
  def sendInvoice(chat_id: scala.Double, invoiceDetails: telebotLib.Anon_Currency): js.Any = js.native
  def sendLocation(chat_id: java.lang.String, coords: js.Tuple2[scala.Double, scala.Double]): js.Any = js.native
  def sendLocation(
    chat_id: java.lang.String,
    coords: js.Tuple2[scala.Double, scala.Double],
    opt: telebotLib.Anon_NotificationReplyMarkup
  ): js.Any = js.native
  def sendLocation(chat_id: scala.Double, coords: js.Tuple2[scala.Double, scala.Double]): js.Any = js.native
  def sendLocation(
    chat_id: scala.Double,
    coords: js.Tuple2[scala.Double, scala.Double],
    opt: telebotLib.Anon_NotificationReplyMarkup
  ): js.Any = js.native
  def sendMessage(chat_id: java.lang.String, text: java.lang.String): js.Any = js.native
  def sendMessage(chat_id: java.lang.String, text: java.lang.String, opt: telebotLib.Anon_Notification): js.Any = js.native
  def sendMessage(chat_id: scala.Double, text: java.lang.String): js.Any = js.native
  def sendMessage(chat_id: scala.Double, text: java.lang.String, opt: telebotLib.Anon_Notification): js.Any = js.native
  def sendPhoto(chat_id: java.lang.String, file: java.lang.String): js.Any = js.native
  def sendPhoto(chat_id: java.lang.String, file: java.lang.String, opt: telebotLib.Anon_Caption): js.Any = js.native
  def sendPhoto(chat_id: java.lang.String, file: js.Any): js.Any = js.native
  def sendPhoto(chat_id: java.lang.String, file: js.Any, opt: telebotLib.Anon_Caption): js.Any = js.native
  def sendPhoto(chat_id: java.lang.String, file: nodeLib.Buffer): js.Any = js.native
  def sendPhoto(chat_id: java.lang.String, file: nodeLib.Buffer, opt: telebotLib.Anon_Caption): js.Any = js.native
  def sendPhoto(chat_id: java.lang.String, file: nodeLib.NodeJSNs.ReadableStream): js.Any = js.native
  def sendPhoto(chat_id: java.lang.String, file: nodeLib.NodeJSNs.ReadableStream, opt: telebotLib.Anon_Caption): js.Any = js.native
  def sendPhoto(chat_id: scala.Double, file: java.lang.String): js.Any = js.native
  def sendPhoto(chat_id: scala.Double, file: java.lang.String, opt: telebotLib.Anon_Caption): js.Any = js.native
  def sendPhoto(chat_id: scala.Double, file: js.Any): js.Any = js.native
  def sendPhoto(chat_id: scala.Double, file: js.Any, opt: telebotLib.Anon_Caption): js.Any = js.native
  def sendPhoto(chat_id: scala.Double, file: nodeLib.Buffer): js.Any = js.native
  def sendPhoto(chat_id: scala.Double, file: nodeLib.Buffer, opt: telebotLib.Anon_Caption): js.Any = js.native
  def sendPhoto(chat_id: scala.Double, file: nodeLib.NodeJSNs.ReadableStream): js.Any = js.native
  def sendPhoto(chat_id: scala.Double, file: nodeLib.NodeJSNs.ReadableStream, opt: telebotLib.Anon_Caption): js.Any = js.native
  def sendSticker(chat_id: java.lang.String, file: java.lang.String): js.Any = js.native
  def sendSticker(chat_id: java.lang.String, file: java.lang.String, opt: telebotLib.Anon_FileName): js.Any = js.native
  def sendSticker(chat_id: java.lang.String, file: js.Any): js.Any = js.native
  def sendSticker(chat_id: java.lang.String, file: js.Any, opt: telebotLib.Anon_FileName): js.Any = js.native
  def sendSticker(chat_id: java.lang.String, file: nodeLib.Buffer): js.Any = js.native
  def sendSticker(chat_id: java.lang.String, file: nodeLib.Buffer, opt: telebotLib.Anon_FileName): js.Any = js.native
  def sendSticker(chat_id: java.lang.String, file: nodeLib.NodeJSNs.ReadableStream): js.Any = js.native
  def sendSticker(chat_id: java.lang.String, file: nodeLib.NodeJSNs.ReadableStream, opt: telebotLib.Anon_FileName): js.Any = js.native
  def sendSticker(chat_id: scala.Double, file: java.lang.String): js.Any = js.native
  def sendSticker(chat_id: scala.Double, file: java.lang.String, opt: telebotLib.Anon_FileName): js.Any = js.native
  def sendSticker(chat_id: scala.Double, file: js.Any): js.Any = js.native
  def sendSticker(chat_id: scala.Double, file: js.Any, opt: telebotLib.Anon_FileName): js.Any = js.native
  def sendSticker(chat_id: scala.Double, file: nodeLib.Buffer): js.Any = js.native
  def sendSticker(chat_id: scala.Double, file: nodeLib.Buffer, opt: telebotLib.Anon_FileName): js.Any = js.native
  def sendSticker(chat_id: scala.Double, file: nodeLib.NodeJSNs.ReadableStream): js.Any = js.native
  def sendSticker(chat_id: scala.Double, file: nodeLib.NodeJSNs.ReadableStream, opt: telebotLib.Anon_FileName): js.Any = js.native
  def sendVenue(
    chat_id: java.lang.String,
    coords: js.Tuple2[scala.Double, scala.Double],
    title: java.lang.String,
    address: java.lang.String
  ): js.Any = js.native
  def sendVenue(
    chat_id: java.lang.String,
    coords: js.Tuple2[scala.Double, scala.Double],
    title: java.lang.String,
    address: java.lang.String,
    opt: telebotLib.Anon_FoursquareId
  ): js.Any = js.native
  def sendVenue(
    chat_id: scala.Double,
    coords: js.Tuple2[scala.Double, scala.Double],
    title: java.lang.String,
    address: java.lang.String
  ): js.Any = js.native
  def sendVenue(
    chat_id: scala.Double,
    coords: js.Tuple2[scala.Double, scala.Double],
    title: java.lang.String,
    address: java.lang.String,
    opt: telebotLib.Anon_FoursquareId
  ): js.Any = js.native
  def sendVideo(chat_id: java.lang.String, file: java.lang.String): js.Any = js.native
  def sendVideo(chat_id: java.lang.String, file: java.lang.String, opt: telebotLib.Anon_CaptionDurationFileName): js.Any = js.native
  def sendVideo(chat_id: java.lang.String, file: js.Any): js.Any = js.native
  def sendVideo(chat_id: java.lang.String, file: js.Any, opt: telebotLib.Anon_CaptionDurationFileName): js.Any = js.native
  def sendVideo(chat_id: java.lang.String, file: nodeLib.Buffer): js.Any = js.native
  def sendVideo(chat_id: java.lang.String, file: nodeLib.Buffer, opt: telebotLib.Anon_CaptionDurationFileName): js.Any = js.native
  def sendVideo(chat_id: java.lang.String, file: nodeLib.NodeJSNs.ReadableStream): js.Any = js.native
  def sendVideo(
    chat_id: java.lang.String,
    file: nodeLib.NodeJSNs.ReadableStream,
    opt: telebotLib.Anon_CaptionDurationFileName
  ): js.Any = js.native
  def sendVideo(chat_id: scala.Double, file: java.lang.String): js.Any = js.native
  def sendVideo(chat_id: scala.Double, file: java.lang.String, opt: telebotLib.Anon_CaptionDurationFileName): js.Any = js.native
  def sendVideo(chat_id: scala.Double, file: js.Any): js.Any = js.native
  def sendVideo(chat_id: scala.Double, file: js.Any, opt: telebotLib.Anon_CaptionDurationFileName): js.Any = js.native
  def sendVideo(chat_id: scala.Double, file: nodeLib.Buffer): js.Any = js.native
  def sendVideo(chat_id: scala.Double, file: nodeLib.Buffer, opt: telebotLib.Anon_CaptionDurationFileName): js.Any = js.native
  def sendVideo(chat_id: scala.Double, file: nodeLib.NodeJSNs.ReadableStream): js.Any = js.native
  def sendVideo(
    chat_id: scala.Double,
    file: nodeLib.NodeJSNs.ReadableStream,
    opt: telebotLib.Anon_CaptionDurationFileName
  ): js.Any = js.native
  def sendVideoNote(chat_id: java.lang.String, file: java.lang.String): js.Any = js.native
  def sendVideoNote(chat_id: java.lang.String, file: java.lang.String, opt: telebotLib.Anon_Duration): js.Any = js.native
  def sendVideoNote(chat_id: java.lang.String, file: js.Any): js.Any = js.native
  def sendVideoNote(chat_id: java.lang.String, file: js.Any, opt: telebotLib.Anon_Duration): js.Any = js.native
  def sendVideoNote(chat_id: java.lang.String, file: nodeLib.Buffer): js.Any = js.native
  def sendVideoNote(chat_id: java.lang.String, file: nodeLib.Buffer, opt: telebotLib.Anon_Duration): js.Any = js.native
  def sendVideoNote(chat_id: java.lang.String, file: nodeLib.NodeJSNs.ReadableStream): js.Any = js.native
  def sendVideoNote(chat_id: java.lang.String, file: nodeLib.NodeJSNs.ReadableStream, opt: telebotLib.Anon_Duration): js.Any = js.native
  def sendVideoNote(chat_id: scala.Double, file: java.lang.String): js.Any = js.native
  def sendVideoNote(chat_id: scala.Double, file: java.lang.String, opt: telebotLib.Anon_Duration): js.Any = js.native
  def sendVideoNote(chat_id: scala.Double, file: js.Any): js.Any = js.native
  def sendVideoNote(chat_id: scala.Double, file: js.Any, opt: telebotLib.Anon_Duration): js.Any = js.native
  def sendVideoNote(chat_id: scala.Double, file: nodeLib.Buffer): js.Any = js.native
  def sendVideoNote(chat_id: scala.Double, file: nodeLib.Buffer, opt: telebotLib.Anon_Duration): js.Any = js.native
  def sendVideoNote(chat_id: scala.Double, file: nodeLib.NodeJSNs.ReadableStream): js.Any = js.native
  def sendVideoNote(chat_id: scala.Double, file: nodeLib.NodeJSNs.ReadableStream, opt: telebotLib.Anon_Duration): js.Any = js.native
  def sendVoice(chat_id: java.lang.String, file: java.lang.String): js.Any = js.native
  def sendVoice(
    chat_id: java.lang.String,
    file: java.lang.String,
    opt: telebotLib.Anon_CaptionDurationFileNameNotification
  ): js.Any = js.native
  def sendVoice(chat_id: java.lang.String, file: js.Any): js.Any = js.native
  def sendVoice(chat_id: java.lang.String, file: js.Any, opt: telebotLib.Anon_CaptionDurationFileNameNotification): js.Any = js.native
  def sendVoice(chat_id: java.lang.String, file: nodeLib.Buffer): js.Any = js.native
  def sendVoice(
    chat_id: java.lang.String,
    file: nodeLib.Buffer,
    opt: telebotLib.Anon_CaptionDurationFileNameNotification
  ): js.Any = js.native
  def sendVoice(chat_id: java.lang.String, file: nodeLib.NodeJSNs.ReadableStream): js.Any = js.native
  def sendVoice(
    chat_id: java.lang.String,
    file: nodeLib.NodeJSNs.ReadableStream,
    opt: telebotLib.Anon_CaptionDurationFileNameNotification
  ): js.Any = js.native
  def sendVoice(chat_id: scala.Double, file: java.lang.String): js.Any = js.native
  def sendVoice(
    chat_id: scala.Double,
    file: java.lang.String,
    opt: telebotLib.Anon_CaptionDurationFileNameNotification
  ): js.Any = js.native
  def sendVoice(chat_id: scala.Double, file: js.Any): js.Any = js.native
  def sendVoice(chat_id: scala.Double, file: js.Any, opt: telebotLib.Anon_CaptionDurationFileNameNotification): js.Any = js.native
  def sendVoice(chat_id: scala.Double, file: nodeLib.Buffer): js.Any = js.native
  def sendVoice(
    chat_id: scala.Double,
    file: nodeLib.Buffer,
    opt: telebotLib.Anon_CaptionDurationFileNameNotification
  ): js.Any = js.native
  def sendVoice(chat_id: scala.Double, file: nodeLib.NodeJSNs.ReadableStream): js.Any = js.native
  def sendVoice(
    chat_id: scala.Double,
    file: nodeLib.NodeJSNs.ReadableStream,
    opt: telebotLib.Anon_CaptionDurationFileNameNotification
  ): js.Any = js.native
  def setGameScore(user_id: scala.Double, score: scala.Double): scala.Boolean | stdLib.Error | js.Any = js.native
  def setGameScore(user_id: scala.Double, score: scala.Double, opt: telebotLib.Anon_ChatId): scala.Boolean | stdLib.Error | js.Any = js.native
  def setWebhook(url: java.lang.String): scala.Boolean = js.native
  def setWebhook(url: java.lang.String, certificate: js.Any): scala.Boolean = js.native
  def setWebhook(url: java.lang.String, certificate: js.Any, allowed_updates: js.Array[java.lang.String]): scala.Boolean = js.native
  def setWebhook(
    url: java.lang.String,
    certificate: js.Any,
    allowed_updates: js.Array[java.lang.String],
    max_connections: scala.Double
  ): scala.Boolean = js.native
  def start(args: js.Any*): scala.Unit = js.native
  def stop(message: java.lang.String): scala.Unit = js.native
  def unbanChatMember(chat_id: java.lang.String, user_id: scala.Double): scala.Boolean = js.native
  def unbanChatMember(chat_id: scala.Double, user_id: scala.Double): scala.Boolean = js.native
  def use(module: telebotLib.telebotMod.telebotNs.module): scala.Unit = js.native
}

