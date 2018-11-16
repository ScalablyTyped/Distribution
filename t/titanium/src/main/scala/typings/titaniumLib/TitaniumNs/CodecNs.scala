package typings
package titaniumLib.TitaniumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * A module for translating between primitive types and raw byte streams.
	 */
@JSGlobal("Titanium.Codec")
@js.native
object CodecNs extends js.Object {
  /**
  		 * Big endian (network) byte order -- that is, the most significant byte first.
  		 */
  val BIG_ENDIAN: scala.Double = js.native
  /**
  		 * ASCII character encoding..
  		 */
  val CHARSET_ASCII: java.lang.String = js.native
  /**
  		 * ISO 8859-1 (Latin-1) character encoding.
  		 */
  val CHARSET_ISO_LATIN_1: java.lang.String = js.native
  /**
  		 * UTF-16 character encoding with default byte order.
  		 */
  val CHARSET_UTF16: java.lang.String = js.native
  /**
  		 * UTF-16 character encoding with big endian byte order.
  		 */
  val CHARSET_UTF16BE: java.lang.String = js.native
  /**
  		 * UTF-16 character encoding with little endian byte order.
  		 */
  val CHARSET_UTF16LE: java.lang.String = js.native
  /**
  		 * UTF-8 character encoding.
  		 */
  val CHARSET_UTF8: java.lang.String = js.native
  /**
  		 * Little endian byte order -- that is, the least significant byte first.
  		 */
  val LITTLE_ENDIAN: scala.Double = js.native
  /**
  		 * 8-bit integer encoding type.
  		 */
  val TYPE_BYTE: java.lang.String = js.native
  /**
  		 * 64-bit double precision floating-point type.
  		 */
  val TYPE_DOUBLE: java.lang.String = js.native
  /**
  		 * 32-bit single precision floating-point type.
  		 */
  val TYPE_FLOAT: java.lang.String = js.native
  /**
  		 * 32-bit integer encoding type.
  		 */
  val TYPE_INT: java.lang.String = js.native
  /**
  		 * 64-bit integer encoding type.
  		 */
  val TYPE_LONG: java.lang.String = js.native
  /**
  		 * 16-bit integer encoding type.
  		 */
  val TYPE_SHORT: java.lang.String = js.native
  /**
  		 * The name of the API that this proxy corresponds to.
  		 */
  val apiName: java.lang.String = js.native
  /**
  		 * Indicates if the proxy will bubble an event to its parent.
  		 */
  var bubbleParent: scala.Boolean = js.native
  /**
  		 * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
  		 */
  var lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = js.native
  /**
  		 * Adds the specified callback as an event listener for the named event.
  		 */
  def addEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  		 * Applies the properties to the proxy.
  		 */
  def applyProperties(props: js.Any): scala.Unit = js.native
  /**
  		 * Decodes a number from the `source` buffer using the specified data type.
  		 */
  def decodeNumber(options: titaniumLib.DecodeNumberDict): scala.Double = js.native
  /**
  		 * Decodes the source buffer into a String using the supplied character set.
  		 */
  def decodeString(options: titaniumLib.DecodeStringDict): java.lang.String = js.native
  /**
  		 * Encodes a number and writes it to a buffer.
  		 */
  def encodeNumber(options: titaniumLib.EncodeNumberDict): scala.Double = js.native
  /**
  		 * Encodes a string into a series of bytes in a buffer using the specified character set.
  		 */
  def encodeString(options: js.Any): scala.Double = js.native
  /**
  		 * Fires a synthesized event to any registered listeners.
  		 */
  def fireEvent(name: java.lang.String, event: js.Any): scala.Unit = js.native
  /**
  		 * Gets the value of the <Titanium.Codec.apiName> property.
  		 */
  def getApiName(): java.lang.String = js.native
  /**
  		 * Gets the value of the <Titanium.Codec.bubbleParent> property.
  		 */
  def getBubbleParent(): scala.Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.Codec.lifecycleContainer> property.
  		 */
  def getLifecycleContainer(): titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = js.native
  /**
  		 * Get the OS native byte order (either <Titanium.Codec.BIG_ENDIAN> or
  		 * <Titanium.Codec.LITTLE_ENDIAN>).
  		 */
  def getNativeByteOrder(): scala.Double = js.native
  /**
  		 * Removes the specified callback as an event listener for the named event.
  		 */
  def removeEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Codec.bubbleParent> property.
  		 */
  def setBubbleParent(bubbleParent: scala.Boolean): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Codec.lifecycleContainer> property.
  		 */
  def setLifecycleContainer(lifecycleContainer: titaniumLib.TitaniumNs.UINs.TabGroup): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Codec.lifecycleContainer> property.
  		 */
  def setLifecycleContainer(lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window): scala.Unit = js.native
}

