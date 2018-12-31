package typings
package winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Supports random access of data in input and output streams. */
trait IRandomAccessStream
  extends IInputStream
     with IOutputStream {
  /** Gets a value that indicates whether the stream can be read from. */
  var canRead: scala.Boolean
  /** Gets a value that indicates whether the stream can be written to. */
  var canWrite: scala.Boolean
  /** Gets the byte offset of the stream. */
  var position: scala.Double
  /** Gets or sets the size of the random access stream. */
  var size: scala.Double
  /**
    * Creates a new instance of a IRandomAccessStream over the same resource as the current stream.
    * @return The new stream. The initial, internal position of the stream is 0.
    */
  def cloneStream(): IRandomAccessStream
  /**
    * Returns an input stream at a specified location in a stream.
    * @param position The location in the stream at which to begin.
    * @return The input stream.
    */
  def getInputStreamAt(position: scala.Double): IInputStream
  /**
    * Returns an output stream at a specified location in a stream.
    * @param position The location in the output stream at which to begin.
    * @return The output stream.
    */
  def getOutputStreamAt(position: scala.Double): IOutputStream
  /**
    * Sets the position of the stream to the specified value.
    * @param position The new position of the stream.
    */
  def seek(position: scala.Double): scala.Unit
}

