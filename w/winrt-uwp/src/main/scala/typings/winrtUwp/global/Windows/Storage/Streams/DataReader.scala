package typings.winrtUwp.global.Windows.Storage.Streams

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import typings.winrtUwp.Windows.Storage.Streams.IInputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Reads data from an input stream. */
@JSGlobal("Windows.Storage.Streams.DataReader")
@js.native
class DataReader protected ()
  extends typings.winrtUwp.Windows.Storage.Streams.DataReader {
  /**
    * Creates and initializes a new instance of the data reader.
    * @param inputStream The input stream.
    */
  def this(inputStream: IInputStream) = this()
}

/* static members */
@JSGlobal("Windows.Storage.Streams.DataReader")
@js.native
object DataReader extends js.Object {
  /**
    * Creates a new instance of the data reader with data from the specified buffer.
    * @param buffer The buffer.
    * @return The data reader.
    */
  def fromBuffer(buffer: IBuffer): typings.winrtUwp.Windows.Storage.Streams.DataReader = js.native
}

