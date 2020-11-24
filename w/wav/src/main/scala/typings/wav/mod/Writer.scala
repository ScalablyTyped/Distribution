package typings.wav.mod

import typings.node.Buffer
import typings.node.streamMod.Transform
import typings.wav.wavStrings.LE
import typings.wav.wavStrings.header
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wav", "Writer")
@js.native
class Writer () extends Transform {
  def this(opts: WriterOptions) = this()
  
  @JSName("addListener")
  def addListener_header(event: header, listener: js.Function1[/* header */ Buffer, Unit]): this.type = js.native
  
  var bitDepth: Double = js.native
  
  var bytesProcessed: Double = js.native
  
  var channels: Double = js.native
  
  var endianness: LE = js.native
  
  var format: Double = js.native
  
  @JSName("on")
  def on_header(event: header, listener: js.Function1[/* header */ Buffer, Unit]): this.type = js.native
  
  var sampleRate: Double = js.native
}
