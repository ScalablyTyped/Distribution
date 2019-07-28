package typings.twit.twitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Twit extends js.Object {
  def get(path: String): js.Promise[PromiseResponse] = js.native
  /**
    * @see https://github.com/ttezel/twit#tgetpath-params-callback
    */
  def get(path: String, callback: Callback): Unit = js.native
  def get(path: String, params: Params): js.Promise[PromiseResponse] = js.native
  def get(path: String, params: Params, callback: Callback): Unit = js.native
  /**
    * @see https://github.com/ttezel/twit#tgetauth
    */
  def getAuth(): Options = js.native
  def post(path: String): js.Promise[PromiseResponse] = js.native
  /**
    * @see https://github.com/ttezel/twit#tpostpath-params-callback
    */
  def post(path: String, callback: Callback): Unit = js.native
  def post(path: String, params: Params): js.Promise[PromiseResponse] = js.native
  def post(path: String, params: Params, callback: Callback): Unit = js.native
  /**
    * @see https://github.com/ttezel/twit#tpostmediachunkedparams-callback
    */
  def postMediaChunked(media: MediaParam, callback: Callback): Unit = js.native
  /**
    * @see https://github.com/ttezel/twit#tsetauthtokens
    */
  def setAuth(tokens: ConfigKeys): Unit = js.native
  /**
    * @see https://github.com/ttezel/twit#tstreampath-params
    */
  def stream(path: StreamEndpoint): Stream = js.native
  def stream(path: StreamEndpoint, params: Params): Stream = js.native
}

