package typings.titanium.Titanium

import typings.titanium.DecodeNumberDict
import typings.titanium.DecodeStringDict
import typings.titanium.EncodeNumberDict
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * A module for translating between primitive types and raw byte streams.
	 */
@JSGlobal("Titanium.Codec")
@js.native
object Codec extends js.Object {
  /**
  		 * Big endian (network) byte order -- that is, the most significant byte first.
  		 */
  val BIG_ENDIAN: Double = js.native
  /**
  		 * ASCII character encoding..
  		 */
  val CHARSET_ASCII: String = js.native
  /**
  		 * ISO 8859-1 (Latin-1) character encoding.
  		 */
  val CHARSET_ISO_LATIN_1: String = js.native
  /**
  		 * UTF-16 character encoding with default byte order.
  		 */
  val CHARSET_UTF16: String = js.native
  /**
  		 * UTF-16 character encoding with big endian byte order.
  		 */
  val CHARSET_UTF16BE: String = js.native
  /**
  		 * UTF-16 character encoding with little endian byte order.
  		 */
  val CHARSET_UTF16LE: String = js.native
  /**
  		 * UTF-8 character encoding.
  		 */
  val CHARSET_UTF8: String = js.native
  /**
  		 * Little endian byte order -- that is, the least significant byte first.
  		 */
  val LITTLE_ENDIAN: Double = js.native
  /**
  		 * 8-bit integer encoding type.
  		 */
  val TYPE_BYTE: String = js.native
  /**
  		 * 64-bit double precision floating-point type.
  		 */
  val TYPE_DOUBLE: String = js.native
  /**
  		 * 32-bit single precision floating-point type.
  		 */
  val TYPE_FLOAT: String = js.native
  /**
  		 * 32-bit integer encoding type.
  		 */
  val TYPE_INT: String = js.native
  /**
  		 * 64-bit integer encoding type.
  		 */
  val TYPE_LONG: String = js.native
  /**
  		 * 16-bit integer encoding type.
  		 */
  val TYPE_SHORT: String = js.native
  /**
  		 * The name of the API that this proxy corresponds to.
  		 */
  val apiName: String = js.native
  /**
  		 * Indicates if the proxy will bubble an event to its parent.
  		 */
  var bubbleParent: Boolean = js.native
  /**
  		 * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
  		 */
  var lifecycleContainer: Window | TabGroup = js.native
  /**
  		 * Adds the specified callback as an event listener for the named event.
  		 */
  def addEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
  /**
  		 * Applies the properties to the proxy.
  		 */
  def applyProperties(props: js.Any): Unit = js.native
  /**
  		 * Decodes a number from the `source` buffer using the specified data type.
  		 */
  def decodeNumber(options: DecodeNumberDict): Double = js.native
  /**
  		 * Decodes the source buffer into a String using the supplied character set.
  		 */
  def decodeString(options: DecodeStringDict): String = js.native
  /**
  		 * Encodes a number and writes it to a buffer.
  		 */
  def encodeNumber(options: EncodeNumberDict): Double = js.native
  /**
  		 * Encodes a string into a series of bytes in a buffer using the specified character set.
  		 */
  def encodeString(options: js.Any): Double = js.native
  /**
  		 * Fires a synthesized event to any registered listeners.
  		 */
  def fireEvent(name: String, event: js.Any): Unit = js.native
  /**
  		 * Gets the value of the <Titanium.Codec.apiName> property.
  		 */
  def getApiName(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Codec.bubbleParent> property.
  		 */
  def getBubbleParent(): Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.Codec.lifecycleContainer> property.
  		 */
  def getLifecycleContainer(): Window | TabGroup = js.native
  /**
  		 * Get the OS native byte order (either <Titanium.Codec.BIG_ENDIAN> or
  		 * <Titanium.Codec.LITTLE_ENDIAN>).
  		 */
  def getNativeByteOrder(): Double = js.native
  /**
  		 * Removes the specified callback as an event listener for the named event.
  		 */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Codec.bubbleParent> property.
  		 */
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Codec.lifecycleContainer> property.
  		 */
  def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Codec.lifecycleContainer> property.
  		 */
  def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
}

