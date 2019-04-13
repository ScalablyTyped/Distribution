package typings
package titaniumLib.TitaniumNs.FilesystemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Wrapper around `Titanium.Filesystem.File` that implements the `Titanium.IOStream` interface
		 */
@js.native
trait FileStream
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  			 * closes file stream, exception is thrown on error
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
  def read(buffer: titaniumLib.TitaniumNs.Buffer): scala.Double = js.native
  def read(buffer: titaniumLib.TitaniumNs.Buffer, offset: scala.Double): scala.Double = js.native
  def read(buffer: titaniumLib.TitaniumNs.Buffer, offset: scala.Double, length: scala.Double): scala.Double = js.native
  def read(
    buffer: titaniumLib.TitaniumNs.Buffer,
    offset: scala.Double,
    length: scala.Double,
    resultsCallback: js.Function1[/* param0 */ titaniumLib.ReadCallbackArgs, _]
  ): scala.Double = js.native
  /**
  			 * Writes data from a buffer to this stream.
  			 */
  def write(buffer: titaniumLib.TitaniumNs.Buffer): scala.Double = js.native
  def write(buffer: titaniumLib.TitaniumNs.Buffer, offset: scala.Double): scala.Double = js.native
  def write(buffer: titaniumLib.TitaniumNs.Buffer, offset: scala.Double, length: scala.Double): scala.Double = js.native
  def write(
    buffer: titaniumLib.TitaniumNs.Buffer,
    offset: scala.Double,
    length: scala.Double,
    resultsCallback: js.Function1[/* param0 */ titaniumLib.WriteCallbackArgs, _]
  ): scala.Double = js.native
}

