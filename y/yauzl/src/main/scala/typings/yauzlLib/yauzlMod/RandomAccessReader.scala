package typings
package yauzlLib.yauzlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yauzl", "RandomAccessReader")
@js.native
abstract class RandomAccessReader ()
  extends nodeLib.eventsMod.EventEmitter {
  def _readStreamForRange(start: scala.Double, end: scala.Double): scala.Unit = js.native
  def close(callback: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]): scala.Unit = js.native
  def createReadStream(options: yauzlLib.Anon_End): scala.Unit = js.native
  def read(
    buffer: nodeLib.Buffer,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]
  ): scala.Unit = js.native
}

