package typings
package tarDashStreamLib.tarDashStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pack
  extends nodeLib.streamMod.Readable {
  def entry(headers: Headers): nodeLib.streamMod.Writable = js.native
  def entry(headers: Headers, buffer: java.lang.String): nodeLib.streamMod.Writable = js.native
  def entry(headers: Headers, buffer: java.lang.String, callback: Callback): nodeLib.streamMod.Writable = js.native
  def entry(headers: Headers, buffer: nodeLib.Buffer): nodeLib.streamMod.Writable = js.native
  def entry(headers: Headers, buffer: nodeLib.Buffer, callback: Callback): nodeLib.streamMod.Writable = js.native
  def entry(headers: Headers, buffer: Callback): nodeLib.streamMod.Writable = js.native
  def entry(headers: Headers, buffer: Callback, callback: Callback): nodeLib.streamMod.Writable = js.native
}

