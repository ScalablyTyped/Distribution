package typings.tmiJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Actions extends StObject {
  
  def action(channel: String, message: String): js.Promise[js.Array[String]] = js.native
  
  def ban(channel: String, username: String): js.Promise[js.Tuple3[String, String, String]] = js.native
  def ban(channel: String, username: String, reason: String): js.Promise[js.Tuple3[String, String, String]] = js.native
  
  def clear(channel: String): js.Promise[js.Array[String]] = js.native
  
  def color(color: String): js.Promise[js.Array[String]] = js.native
  
  def commercial(channel: String, seconds: Double): js.Promise[js.Tuple2[String, Double]] = js.native
  
  def connect(): js.Promise[js.Tuple2[String, Double]] = js.native
  
  def deletemessage(channel: String, messageUUID: String): js.Promise[js.Array[String]] = js.native
  
  def disconnect(): js.Promise[js.Tuple2[String, Double]] = js.native
  
  def emoteonly(channel: String): js.Promise[js.Array[String]] = js.native
  
  def emoteonlyoff(channel: String): js.Promise[js.Array[String]] = js.native
  
  def followersonly(channel: String): js.Promise[js.Tuple2[String, Double]] = js.native
  def followersonly(channel: String, length: Double): js.Promise[js.Tuple2[String, Double]] = js.native
  
  def followersonlyoff(channel: String): js.Promise[js.Array[String]] = js.native
  
  def host(channel: String, target: String): js.Promise[js.Tuple2[String, String]] = js.native
  
  def join(channel: String): js.Promise[js.Array[String]] = js.native
  
  def mod(channel: String, username: String): js.Promise[js.Tuple2[String, String]] = js.native
  
  def mods(channel: String): js.Promise[js.Array[String]] = js.native
  
  def part(channel: String): js.Promise[js.Array[String]] = js.native
  
  def ping(): js.Promise[js.Array[Double]] = js.native
  
  def r9kbeta(channel: String): js.Promise[js.Array[String]] = js.native
  
  def r9kbetaoff(channel: String): js.Promise[js.Array[String]] = js.native
  
  def raw(message: String): js.Promise[js.Array[String]] = js.native
  
  def say(channel: String, message: String): js.Promise[js.Array[String]] = js.native
  
  def slow(channel: String): js.Promise[js.Array[String]] = js.native
  def slow(channel: String, length: Double): js.Promise[js.Array[String]] = js.native
  
  def slowoff(channel: String): js.Promise[js.Array[String]] = js.native
  
  def subscribers(channel: String): js.Promise[js.Array[String]] = js.native
  
  def subscribersoff(channel: String): js.Promise[js.Array[String]] = js.native
  
  def timeout(channel: String, username: String): js.Promise[js.Tuple4[String, String, Double, String]] = js.native
  def timeout(channel: String, username: String, length: Double): js.Promise[js.Tuple4[String, String, Double, String]] = js.native
  def timeout(channel: String, username: String, length: Double, reason: String): js.Promise[js.Tuple4[String, String, Double, String]] = js.native
  def timeout(channel: String, username: String, length: Unit, reason: String): js.Promise[js.Tuple4[String, String, Double, String]] = js.native
  
  def unban(channel: String, username: String): js.Promise[js.Tuple2[String, String]] = js.native
  
  def unhost(channel: String): js.Promise[js.Array[String]] = js.native
  
  def unmod(channel: String, username: String): js.Promise[js.Tuple2[String, String]] = js.native
  
  def unvip(channel: String, username: String): js.Promise[js.Tuple2[String, String]] = js.native
  
  def vip(channel: String, username: String): js.Promise[js.Tuple2[String, String]] = js.native
  
  def vips(channel: String): js.Promise[js.Array[String]] = js.native
  
  def whisper(username: String, message: String): js.Promise[js.Tuple2[String, String]] = js.native
}
