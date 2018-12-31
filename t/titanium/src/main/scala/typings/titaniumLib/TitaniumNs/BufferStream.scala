package typings
package titaniumLib.TitaniumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Wrapper around <Titanium.Buffer> that implements the <Titanium.IOStream> interface.
	 */
@js.native
trait BufferStream extends Proxy {
  /**
  		 * Closes this stream.
  		 */
  def close(): scala.Unit = js.native
  /**
  		 * Indicates whether this stream is readable.
  		 */
  def isReadable(): scala.Boolean = js.native
  /**
  		 * Indicates whether this stream is writable.
  		 */
  def isWritable(): scala.Boolean = js.native
  /**
  		 * Reads data from this stream into a buffer.
  		 */
  def read(buffer: Buffer): scala.Double = js.native
  def read(buffer: Buffer, offset: scala.Double): scala.Double = js.native
  def read(buffer: Buffer, offset: scala.Double, length: scala.Double): scala.Double = js.native
  /**
  		 * Writes data from a buffer to this stream.
  		 */
  def write(buffer: Buffer): scala.Double = js.native
  def write(buffer: Buffer, offset: scala.Double): scala.Double = js.native
  def write(buffer: Buffer, offset: scala.Double, length: scala.Double): scala.Double = js.native
}

