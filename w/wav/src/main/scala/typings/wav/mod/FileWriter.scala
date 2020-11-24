package typings.wav.mod

import typings.node.fsMod.WriteStream
import typings.wav.wavStrings.done
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wav", "FileWriter")
@js.native
class FileWriter protected () extends Writer {
  def this(path: String) = this()
  def this(path: String, opts: WriterOptions) = this()
  
  @JSName("addListener")
  def addListener_done(event: done, listener: js.Function0[Unit]): this.type = js.native
  
  var file: WriteStream = js.native
  
  @JSName("on")
  def on_done(event: done, listener: js.Function0[Unit]): this.type = js.native
  
  var path: String = js.native
}
