package typings.titanium.TitaniumNs

import typings.titanium.ReadCallbackArgs
import typings.titanium.WriteCallbackArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Wrapper around <Titanium.Blob> that implements the <Titanium.IOStream> interface.
	 */
@js.native
trait BlobStream extends Proxy {
  /**
  		 * Closes this stream.
  		 */
  def close(): Unit = js.native
  /**
  		 * Indicates whether this stream is readable.
  		 */
  def isReadable(): Boolean = js.native
  /**
  		 * Indicates whether this stream is writable.
  		 */
  def isWritable(): Boolean = js.native
  /**
  		 * Reads data from this stream into a buffer.
  		 */
  def read(buffer: Buffer): Double = js.native
  def read(buffer: Buffer, offset: Double): Double = js.native
  def read(buffer: Buffer, offset: Double, length: Double): Double = js.native
  def read(
    buffer: Buffer,
    offset: Double,
    length: Double,
    resultsCallback: js.Function1[/* param0 */ ReadCallbackArgs, _]
  ): Double = js.native
  /**
  		 * Writes data from a buffer to this stream.
  		 */
  def write(buffer: Buffer): Double = js.native
  def write(buffer: Buffer, offset: Double): Double = js.native
  def write(buffer: Buffer, offset: Double, length: Double): Double = js.native
  def write(
    buffer: Buffer,
    offset: Double,
    length: Double,
    resultsCallback: js.Function1[/* param0 */ WriteCallbackArgs, _]
  ): Double = js.native
}

