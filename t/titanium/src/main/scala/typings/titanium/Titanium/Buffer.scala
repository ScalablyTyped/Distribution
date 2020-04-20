package typings.titanium.Titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Buffer is a mutable, resizable container for raw data.
	 */
@JSGlobal("Titanium.Buffer")
@js.native
class Buffer () extends Proxy {
  /**
  		 * Byte order of this buffer.
  		 */
  var byteOrder: Double = js.native
  /**
  		 * Length of the buffer in bytes.
  		 */
  var length: Double = js.native
  /**
  		 * The type of data encoding to use with `value`.
  		 */
  var `type`: String = js.native
  /**
  		 * Data to be encoded.
  		 */
  var value: Double | String = js.native
  /**
  		 * Appends `sourceBuffer` to the this buffer.
  		 */
  def append(sourceBuffer: Buffer): Double = js.native
  def append(sourceBuffer: Buffer, sourceOffset: Double): Double = js.native
  def append(sourceBuffer: Buffer, sourceOffset: Double, sourceLength: Double): Double = js.native
  /**
  		 * Clears this buffer's contents but does not change the size of the buffer.
  		 */
  def clear(): Unit = js.native
  def clone(offset: Double): Buffer = js.native
  def clone(offset: Double, length: Double): Buffer = js.native
  /**
  		 * Copies data from `sourceBuffer` into the current buffer at `offset`.
  		 */
  def copy(sourceBuffer: Buffer, offset: Double): Double = js.native
  def copy(sourceBuffer: Buffer, offset: Double, sourceOffset: Double): Double = js.native
  def copy(sourceBuffer: Buffer, offset: Double, sourceOffset: Double, sourceLength: Double): Double = js.native
  /**
  		 * Fills this buffer with the specified byte value.
  		 */
  def fill(fillByte: Double): Unit = js.native
  def fill(fillByte: Double, offset: Double): Unit = js.native
  def fill(fillByte: Double, offset: Double, length: Double): Unit = js.native
  /**
  		 * Gets the value of the <Titanium.Buffer.byteOrder> property.
  		 * @deprecated Access <Titanium.Buffer.byteOrder> instead.
  		 */
  def getByteOrder(): Double = js.native
  /**
  		 * Gets the value of the <Titanium.Buffer.length> property.
  		 * @deprecated Access <Titanium.Buffer.length> instead.
  		 */
  def getLength(): Double = js.native
  /**
  		 * Gets the value of the <Titanium.Buffer.type> property.
  		 * @deprecated Access <Titanium.Buffer.type> instead.
  		 */
  def getType(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Buffer.value> property.
  		 * @deprecated Access <Titanium.Buffer.value> instead.
  		 */
  def getValue(): Double | String = js.native
  /**
  		 * Inserts data from `sourceBuffer` into this buffer at `offset`.
  		 */
  def insert(sourceBuffer: Buffer, offset: Double): Double = js.native
  def insert(sourceBuffer: Buffer, offset: Double, sourceOffset: Double): Double = js.native
  def insert(sourceBuffer: Buffer, offset: Double, sourceOffset: Double, sourceLength: Double): Double = js.native
  /**
  		 * Releases the space allocated to the buffer, and sets its length to 0.
  		 */
  def release(): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Buffer.byteOrder> property.
  		 * @deprecated Set the value using <Titanium.Buffer.byteOrder> instead.
  		 */
  def setByteOrder(byteOrder: Double): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Buffer.length> property.
  		 * @deprecated Set the value using <Titanium.Buffer.length> instead.
  		 */
  def setLength(length: Double): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Buffer.type> property.
  		 * @deprecated Set the value using <Titanium.Buffer.type> instead.
  		 */
  def setType(`type`: String): Unit = js.native
  def setValue(value: String): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Buffer.value> property.
  		 * @deprecated Set the value using <Titanium.Buffer.value> instead.
  		 */
  def setValue(value: Double): Unit = js.native
  /**
  		 * Converts this buffer to a <Titanium.Blob>.
  		 */
  def toBlob(): Blob = js.native
}

