package typings.yauzl.mod

import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import typings.std.Error
import typings.yauzl.anon.End
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yauzl", "RandomAccessReader")
@js.native
abstract class RandomAccessReader () extends EventEmitter {
  
  def _readStreamForRange(start: Double, end: Double): Unit = js.native
  
  def close(callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  
  def createReadStream(options: End): Unit = js.native
  
  def read(
    buffer: Buffer,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
  ): Unit = js.native
}
