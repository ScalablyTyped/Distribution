package typings
package wampyLib.wampyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Wampy extends js.Object {
  var constructor: WampyStatic = js.native
  def abort(): Wampy = js.native
  def call(topicURI: java.lang.String): Wampy = js.native
  def call(topicURI: java.lang.String, payload: Payload): Wampy = js.native
  def call(topicURI: java.lang.String, payload: Payload, callbacks: CallCallbacksHash): Wampy = js.native
  def call(
    topicURI: java.lang.String,
    payload: Payload,
    callbacks: CallCallbacksHash,
    advancedOptions: CallAdvancedOptions
  ): Wampy = js.native
  def call(topicURI: java.lang.String, payload: Payload, callbacks: SuccessCallback): Wampy = js.native
  def call(
    topicURI: java.lang.String,
    payload: Payload,
    callbacks: SuccessCallback,
    advancedOptions: CallAdvancedOptions
  ): Wampy = js.native
  def cancel(reqId: scala.Double): Wampy = js.native
  def cancel(reqId: scala.Double, callbacks: Callback): Wampy = js.native
  def cancel(reqId: scala.Double, callbacks: Callback, advancedOptions: CancelAdvancedOptions): Wampy = js.native
  def cancel(reqId: scala.Double, callbacks: CancelCallbacksHash): Wampy = js.native
  def cancel(reqId: scala.Double, callbacks: CancelCallbacksHash, advancedOptions: CancelAdvancedOptions): Wampy = js.native
  def connect(): Wampy = js.native
  def connect(url: java.lang.String): Wampy = js.native
  def disconnect(): Wampy = js.native
  def getOpStatus(): WampyOpStatus = js.native
  def getSessionId(): scala.Double = js.native
  def options(): WampyOptions | Wampy = js.native
  def options(opts: WampyOptions): WampyOptions | Wampy = js.native
  def publish(topicURI: java.lang.String): Wampy = js.native
  def publish(topicURI: java.lang.String, payload: Payload): Wampy = js.native
  def publish(topicURI: java.lang.String, payload: Payload, callbacks: PublishCallbacksHash): Wampy = js.native
  def publish(
    topicURI: java.lang.String,
    payload: Payload,
    callbacks: PublishCallbacksHash,
    advancedOptions: PublishAdvancedOptions
  ): Wampy = js.native
  def register(topicURI: java.lang.String, callbacks: RPCCallback): Wampy = js.native
  def register(topicURI: java.lang.String, callbacks: RPCCallback, avdancedOptions: RegisterAdvancedOptions): Wampy = js.native
  def register(topicURI: java.lang.String, callbacks: RegisterCallbacksHash): Wampy = js.native
  def register(
    topicURI: java.lang.String,
    callbacks: RegisterCallbacksHash,
    avdancedOptions: RegisterAdvancedOptions
  ): Wampy = js.native
  def subscribe(topicURI: java.lang.String, callbacks: EventCallback): Wampy = js.native
  def subscribe(topicURI: java.lang.String, callbacks: SubscribeCallbacksHash): Wampy = js.native
  def unregister(topicURI: java.lang.String): Wampy = js.native
  def unregister(topicURI: java.lang.String, callbacks: Callback): Wampy = js.native
  def unregister(topicURI: java.lang.String, callbacks: UnregisterCallbacksHash): Wampy = js.native
  def unsubscribe(topicURI: java.lang.String): Wampy = js.native
  def unsubscribe(topicURI: java.lang.String, callbacks: EventCallback): Wampy = js.native
  def unsubscribe(topicURI: java.lang.String, callbacks: UnsubscibeCallbacksHash): Wampy = js.native
}

