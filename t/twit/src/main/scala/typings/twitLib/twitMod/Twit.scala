package typings
package twitLib.twitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Twit extends js.Object {
  def get(path: java.lang.String): stdLib.Promise[twitLib.twitMod.TwitNs.PromiseResponse] = js.native
  /**
       * @see https://github.com/ttezel/twit#tgetpath-params-callback
       */
  def get(path: java.lang.String, callback: twitLib.twitMod.TwitNs.Callback): scala.Unit = js.native
  def get(path: java.lang.String, params: twitLib.twitMod.TwitNs.Params): stdLib.Promise[twitLib.twitMod.TwitNs.PromiseResponse] = js.native
  def get(
    path: java.lang.String,
    params: twitLib.twitMod.TwitNs.Params,
    callback: twitLib.twitMod.TwitNs.Callback
  ): scala.Unit = js.native
  /**
       * @see https://github.com/ttezel/twit#tgetauth
       */
  def getAuth(): twitLib.twitMod.TwitNs.Options = js.native
  def post(path: java.lang.String): stdLib.Promise[twitLib.twitMod.TwitNs.PromiseResponse] = js.native
  /**
       * @see https://github.com/ttezel/twit#tpostpath-params-callback
       */
  def post(path: java.lang.String, callback: twitLib.twitMod.TwitNs.Callback): scala.Unit = js.native
  def post(path: java.lang.String, params: twitLib.twitMod.TwitNs.Params): stdLib.Promise[twitLib.twitMod.TwitNs.PromiseResponse] = js.native
  def post(
    path: java.lang.String,
    params: twitLib.twitMod.TwitNs.Params,
    callback: twitLib.twitMod.TwitNs.Callback
  ): scala.Unit = js.native
  /**
       * @see https://github.com/ttezel/twit#tpostmediachunkedparams-callback
       */
  def postMediaChunked(media: twitLib.twitMod.TwitNs.MediaParam, callback: twitLib.twitMod.TwitNs.Callback): scala.Unit = js.native
  /**
       * @see https://github.com/ttezel/twit#tsetauthtokens
       */
  def setAuth(tokens: twitLib.twitMod.TwitNs.ConfigKeys): scala.Unit = js.native
  /**
       * @see https://github.com/ttezel/twit#tstreampath-params
       */
  def stream(path: twitLib.twitMod.TwitNs.StreamEndpoint): twitLib.twitMod.TwitNs.Stream = js.native
  /**
       * @see https://github.com/ttezel/twit#tstreampath-params
       */
  def stream(path: twitLib.twitMod.TwitNs.StreamEndpoint, params: twitLib.twitMod.TwitNs.Params): twitLib.twitMod.TwitNs.Stream = js.native
}

