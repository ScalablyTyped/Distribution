package typings
package textDashBufferLib.textDashBufferMod.Global.TextBufferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The static side to the TextBuffer class. */
@js.native
trait TextBufferStatic
  extends /** Create a new buffer with the given params. */
org.scalablytyped.runtime.Instantiable0[TextBuffer]
     with /** Create a new buffer with the given starting text. */
/** Create a new buffer with the given params. */
org.scalablytyped.runtime.Instantiable1[
      (/* text */ java.lang.String) | (/* params */ textDashBufferLib.Anon_Text), 
      TextBuffer
    ] {
  var Point: PointStatic = js.native
  var Range: RangeStatic = js.native
  /**
               *  Restore a TextBuffer based on an earlier state created using the
               *  TextBuffer::serialize method.
               */
  def deserialize(params: js.Object): js.Promise[TextBuffer] = js.native
  /** Create a new buffer backed by the given file path. */
  def load(source: java.lang.String): js.Promise[TextBuffer] = js.native
  /** Create a new buffer backed by the given file path. */
  def load(
    source: java.lang.String,
    params: textDashBufferLib.textDashBufferMod.Global.TextBufferNs.OptionsNs.BufferLoad
  ): js.Promise[TextBuffer] = js.native
  /**
               *  Create a new buffer backed by the given file path. For better performance,
               *  use TextBuffer.load instead.
               */
  def loadSync(filePath: java.lang.String): TextBuffer = js.native
  /**
               *  Create a new buffer backed by the given file path. For better performance,
               *  use TextBuffer.load instead.
               */
  def loadSync(
    filePath: java.lang.String,
    params: textDashBufferLib.textDashBufferMod.Global.TextBufferNs.OptionsNs.BufferLoad
  ): TextBuffer = js.native
}

