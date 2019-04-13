package typings
package twitLib.twitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Twit extends js.Object {
  def get(path: java.lang.String): js.Promise[PromiseResponse] = js.native
  /**
    * @see https://github.com/ttezel/twit#tgetpath-params-callback
    */
  def get(path: java.lang.String, callback: Callback): scala.Unit = js.native
  def get(path: java.lang.String, params: Params): js.Promise[PromiseResponse] = js.native
  def get(path: java.lang.String, params: Params, callback: Callback): scala.Unit = js.native
  /**
    * @see https://github.com/ttezel/twit#tgetauth
    */
  def getAuth(): Options = js.native
  def post(path: java.lang.String): js.Promise[PromiseResponse] = js.native
  /**
    * @see https://github.com/ttezel/twit#tpostpath-params-callback
    */
  def post(path: java.lang.String, callback: Callback): scala.Unit = js.native
  def post(path: java.lang.String, params: Params): js.Promise[PromiseResponse] = js.native
  def post(path: java.lang.String, params: Params, callback: Callback): scala.Unit = js.native
  /**
    * @see https://github.com/ttezel/twit#tpostmediachunkedparams-callback
    */
  def postMediaChunked(media: MediaParam, callback: Callback): scala.Unit = js.native
  /**
    * @see https://github.com/ttezel/twit#tsetauthtokens
    */
  def setAuth(tokens: ConfigKeys): scala.Unit = js.native
  /**
    * @see https://github.com/ttezel/twit#tstreampath-params
    */
  def stream(path: StreamEndpoint): Stream = js.native
  def stream(path: StreamEndpoint, params: Params): Stream = js.native
}

