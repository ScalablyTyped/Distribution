package typings.wav.mod

import typings.node.streamMod.Transform
import typings.node.streamMod.TransformOptions
import typings.wav.wavStrings.chunk
import typings.wav.wavStrings.format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wav", "Reader")
@js.native
class Reader () extends Transform {
  def this(opts: TransformOptions) = this()
  @JSName("addListener")
  def addListener_chunk(event: chunk, listener: js.Function1[/* unknownChunk */ UnknownChunk, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_format(event: format, listener: js.Function1[/* format */ Format, Unit]): this.type = js.native
  @JSName("on")
  def on_chunk(event: chunk, listener: js.Function1[/* unknownChunk */ UnknownChunk, Unit]): this.type = js.native
  @JSName("on")
  def on_format(event: format, listener: js.Function1[/* format */ Format, Unit]): this.type = js.native
}

