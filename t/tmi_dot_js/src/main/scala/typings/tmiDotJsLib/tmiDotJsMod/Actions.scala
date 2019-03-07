package typings
package tmiDotJsLib.tmiDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Actions extends js.Object {
  def action(channel: java.lang.String, message: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def ban(channel: java.lang.String, username: java.lang.String): js.Promise[js.Tuple3[java.lang.String, java.lang.String, java.lang.String]] = js.native
  def ban(channel: java.lang.String, username: java.lang.String, reason: java.lang.String): js.Promise[js.Tuple3[java.lang.String, java.lang.String, java.lang.String]] = js.native
  def clear(channel: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def color(color: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def commercial(channel: java.lang.String, seconds: scala.Double): js.Promise[js.Tuple2[java.lang.String, scala.Double]] = js.native
  def connect(): js.Promise[js.Tuple2[java.lang.String, scala.Double]] = js.native
  def disconnect(): js.Promise[js.Tuple2[java.lang.String, scala.Double]] = js.native
  def emoteonly(channel: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def emoteonlyoff(channel: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def followersonly(channel: java.lang.String): js.Promise[js.Tuple2[java.lang.String, scala.Double]] = js.native
  def followersonly(channel: java.lang.String, length: scala.Double): js.Promise[js.Tuple2[java.lang.String, scala.Double]] = js.native
  def followersonlyoff(channel: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def host(channel: java.lang.String, target: java.lang.String): js.Promise[js.Tuple2[java.lang.String, java.lang.String]] = js.native
  def join(channel: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def mod(channel: java.lang.String, username: java.lang.String): js.Promise[js.Tuple2[java.lang.String, java.lang.String]] = js.native
  def mods(channel: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def part(channel: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def ping(): js.Promise[js.Array[scala.Double]] = js.native
  def r9kbeta(channel: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def r9kbetaoff(channel: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def raw(message: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def say(channel: java.lang.String, message: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def slow(channel: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def slow(channel: java.lang.String, length: scala.Double): js.Promise[js.Array[java.lang.String]] = js.native
  def slowoff(channel: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def subscribers(channel: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def subscribersoff(channel: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def timeout(channel: java.lang.String, username: java.lang.String): js.Promise[js.Tuple4[java.lang.String, java.lang.String, scala.Double, java.lang.String]] = js.native
  def timeout(channel: java.lang.String, username: java.lang.String, length: scala.Double): js.Promise[js.Tuple4[java.lang.String, java.lang.String, scala.Double, java.lang.String]] = js.native
  def timeout(
    channel: java.lang.String,
    username: java.lang.String,
    length: scala.Double,
    reason: java.lang.String
  ): js.Promise[js.Tuple4[java.lang.String, java.lang.String, scala.Double, java.lang.String]] = js.native
  def unban(channel: java.lang.String, username: java.lang.String): js.Promise[js.Tuple2[java.lang.String, java.lang.String]] = js.native
  def unhost(channel: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def unmod(channel: java.lang.String, username: java.lang.String): js.Promise[js.Tuple2[java.lang.String, java.lang.String]] = js.native
  def whisper(username: java.lang.String, message: java.lang.String): js.Promise[js.Tuple2[java.lang.String, java.lang.String]] = js.native
}

