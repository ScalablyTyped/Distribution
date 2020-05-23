package typings.vortexWebClient.DDS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataReader extends js.Object {
  /**
    * Attaches the  listener `l` to this data reader and returns
    * the id associated to the listener.
    * @param l - listener code
    * @returns listener handle
    */
  def addListener(l: js.Function1[/* msg */ js.Any, Unit]): Double
  /**
    * closes the DataReader
    */
  def close(): Unit
  /**
    * removes a listener from this data reader.
    * @param idx - listener id
    */
  def removeListener(idx: Double): Unit
  def resetStats(): Unit
}

object DataReader {
  @scala.inline
  def apply(
    addListener: js.Function1[/* msg */ js.Any, Unit] => Double,
    close: () => Unit,
    removeListener: Double => Unit,
    resetStats: () => Unit
  ): DataReader = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction1(addListener), close = js.Any.fromFunction0(close), removeListener = js.Any.fromFunction1(removeListener), resetStats = js.Any.fromFunction0(resetStats))
    __obj.asInstanceOf[DataReader]
  }
}

