package typings.tarDashStream.tarDashStreamMod

import typings.node.Buffer
import typings.node.streamMod.Readable
import typings.node.streamMod.ReadableOptions
import typings.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pack extends Readable {
  def entry(headers: Headers): Writable = js.native
  def entry(headers: Headers, buffer: String): Writable = js.native
  def entry(headers: Headers, buffer: String, callback: Callback): Writable = js.native
  def entry(headers: Headers, buffer: Buffer): Writable = js.native
  def entry(headers: Headers, buffer: Buffer, callback: Callback): Writable = js.native
  def entry(headers: Headers, buffer: Callback): Writable = js.native
  def entry(headers: Headers, buffer: Callback, callback: Callback): Writable = js.native
}

@JSImport("tar-stream", "pack")
@js.native
object pack extends js.Object {
  def apply(): Pack = js.native
  def apply(opts: ReadableOptions): Pack = js.native
}

