package typings.vortexWebClient.DDS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataWriter extends js.Object {
  /**
    * Closes the DataWriter
    */
  def close(): Unit
  /**
    * Writes one or more samples.
    * @param ds - data sample
    */
  def write(ds: js.Any*): Unit
}

object DataWriter {
  @scala.inline
  def apply(close: () => Unit, write: /* repeated */ js.Any => Unit): DataWriter = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[DataWriter]
  }
}

