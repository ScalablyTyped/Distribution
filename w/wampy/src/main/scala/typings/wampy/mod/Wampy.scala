package typings.wampy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Wampy extends js.Object {
  var constructor: WampyStatic = js.native
  def abort(): Wampy = js.native
  def call(topicURI: String): Wampy = js.native
  def call(
    topicURI: String,
    payload: js.UndefOr[Payload],
    callbacks: js.UndefOr[scala.Nothing],
    advancedOptions: CallAdvancedOptions
  ): Wampy = js.native
  def call(topicURI: String, payload: js.UndefOr[Payload], callbacks: CallCallbacksHash): Wampy = js.native
  def call(
    topicURI: String,
    payload: js.UndefOr[Payload],
    callbacks: CallCallbacksHash,
    advancedOptions: CallAdvancedOptions
  ): Wampy = js.native
  def call(topicURI: String, payload: js.UndefOr[Payload], callbacks: SuccessCallback): Wampy = js.native
  def call(
    topicURI: String,
    payload: js.UndefOr[Payload],
    callbacks: SuccessCallback,
    advancedOptions: CallAdvancedOptions
  ): Wampy = js.native
  def call(topicURI: String, payload: Payload): Wampy = js.native
  def cancel(reqId: Double): Wampy = js.native
  def cancel(reqId: Double, callbacks: js.UndefOr[scala.Nothing], advancedOptions: CancelAdvancedOptions): Wampy = js.native
  def cancel(reqId: Double, callbacks: Callback): Wampy = js.native
  def cancel(reqId: Double, callbacks: Callback, advancedOptions: CancelAdvancedOptions): Wampy = js.native
  def cancel(reqId: Double, callbacks: CancelCallbacksHash): Wampy = js.native
  def cancel(reqId: Double, callbacks: CancelCallbacksHash, advancedOptions: CancelAdvancedOptions): Wampy = js.native
  def connect(): Wampy = js.native
  def connect(url: String): Wampy = js.native
  def disconnect(): Wampy = js.native
  def getOpStatus(): WampyOpStatus = js.native
  def getSessionId(): Double = js.native
  def options(): WampyOptions | Wampy = js.native
  def options(opts: WampyOptions): WampyOptions | Wampy = js.native
  def publish(topicURI: String): Wampy = js.native
  def publish(
    topicURI: String,
    payload: js.UndefOr[Payload],
    callbacks: js.UndefOr[scala.Nothing],
    advancedOptions: PublishAdvancedOptions
  ): Wampy = js.native
  def publish(topicURI: String, payload: js.UndefOr[Payload], callbacks: PublishCallbacksHash): Wampy = js.native
  def publish(
    topicURI: String,
    payload: js.UndefOr[Payload],
    callbacks: PublishCallbacksHash,
    advancedOptions: PublishAdvancedOptions
  ): Wampy = js.native
  def publish(topicURI: String, payload: Payload): Wampy = js.native
  def register(topicURI: String, callbacks: RPCCallback): Wampy = js.native
  def register(topicURI: String, callbacks: RPCCallback, avdancedOptions: RegisterAdvancedOptions): Wampy = js.native
  def register(topicURI: String, callbacks: RegisterCallbacksHash): Wampy = js.native
  def register(topicURI: String, callbacks: RegisterCallbacksHash, avdancedOptions: RegisterAdvancedOptions): Wampy = js.native
  def subscribe(topicURI: String, callbacks: EventCallback): Wampy = js.native
  def subscribe(topicURI: String, callbacks: SubscribeCallbacksHash): Wampy = js.native
  def unregister(topicURI: String): Wampy = js.native
  def unregister(topicURI: String, callbacks: Callback): Wampy = js.native
  def unregister(topicURI: String, callbacks: UnregisterCallbacksHash): Wampy = js.native
  def unsubscribe(topicURI: String): Wampy = js.native
  def unsubscribe(topicURI: String, callbacks: EventCallback): Wampy = js.native
  def unsubscribe(topicURI: String, callbacks: UnsubscibeCallbacksHash): Wampy = js.native
}

