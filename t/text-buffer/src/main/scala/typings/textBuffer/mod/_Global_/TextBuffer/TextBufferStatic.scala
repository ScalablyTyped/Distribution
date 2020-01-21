package typings.textBuffer.mod._Global_.TextBuffer

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.textBuffer.AnonShouldDestroyOnFileDelete
import typings.textBuffer.mod._Global_.TextBuffer.Options.BufferLoad
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The static side to the TextBuffer class. */
@js.native
trait TextBufferStatic
  extends /** Create a new buffer with the given params. */
Instantiable0[typings.textBuffer.mod._Global_.TextBuffer.TextBuffer]
     with /** Create a new buffer with the given starting text. */
Instantiable1[
      (/* params */ AnonShouldDestroyOnFileDelete) | (/* text */ String), 
      typings.textBuffer.mod._Global_.TextBuffer.TextBuffer
    ] {
  var Point: PointStatic = js.native
  var Range: RangeStatic = js.native
  /**
    *  Restore a TextBuffer based on an earlier state created using the
    *  TextBuffer::serialize method.
    */
  def deserialize(params: js.Object): js.Promise[typings.textBuffer.mod._Global_.TextBuffer.TextBuffer] = js.native
  /** Create a new buffer backed by the given file path. */
  def load(source: String): js.Promise[typings.textBuffer.mod._Global_.TextBuffer.TextBuffer] = js.native
  def load(source: String, params: BufferLoad): js.Promise[typings.textBuffer.mod._Global_.TextBuffer.TextBuffer] = js.native
  /**
    *  Create a new buffer backed by the given file path. For better performance,
    *  use TextBuffer.load instead.
    */
  def loadSync(filePath: String): typings.textBuffer.mod._Global_.TextBuffer.TextBuffer = js.native
  def loadSync(filePath: String, params: BufferLoad): typings.textBuffer.mod._Global_.TextBuffer.TextBuffer = js.native
}

