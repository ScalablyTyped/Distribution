package typings.wav.wavMod

import typings.node.fsMod.WriteStream
import typings.wav.wavStrings.done
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wav", "FileWriter")
@js.native
class FileWriter protected () extends Writer {
  def this(path: String) = this()
  def this(path: String, opts: WriterOptions) = this()
  var file: WriteStream = js.native
  var path: String = js.native
  @JSName("addListener")
  def addListener_done(event: done, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_done(event: done, listener: js.Function0[Unit]): this.type = js.native
}

