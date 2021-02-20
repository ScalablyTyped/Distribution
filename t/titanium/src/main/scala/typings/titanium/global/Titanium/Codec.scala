package typings.titanium.global.Titanium

import typings.titanium.DecodeNumberDict
import typings.titanium.DecodeStringDict
import typings.titanium.Dictionary
import typings.titanium.EncodeNumberDict
import typings.titanium.EncodeStringDict
import typings.titanium.Titanium.Event
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A module for translating between primitive types and raw byte streams.
  */
@JSGlobal("Titanium.Codec")
@js.native
class Codec ()
  extends typings.titanium.Titanium.Proxy
object Codec {
  
  @JSGlobal("Titanium.Codec")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Big endian (network) byte order -- that is, the most significant byte first.
    */
  /* static member */
  @JSGlobal("Titanium.Codec.BIG_ENDIAN")
  @js.native
  val BIG_ENDIAN: Double = js.native
  
  /**
    * ASCII character encoding..
    */
  /* static member */
  @JSGlobal("Titanium.Codec.CHARSET_ASCII")
  @js.native
  val CHARSET_ASCII: String = js.native
  
  /**
    * ISO 8859-1 (Latin-1) character encoding.
    */
  /* static member */
  @JSGlobal("Titanium.Codec.CHARSET_ISO_LATIN_1")
  @js.native
  val CHARSET_ISO_LATIN_1: String = js.native
  
  /**
    * UTF-16 character encoding with default byte order.
    */
  /* static member */
  @JSGlobal("Titanium.Codec.CHARSET_UTF16")
  @js.native
  val CHARSET_UTF16: String = js.native
  
  /**
    * UTF-16 character encoding with big endian byte order.
    */
  /* static member */
  @JSGlobal("Titanium.Codec.CHARSET_UTF16BE")
  @js.native
  val CHARSET_UTF16BE: String = js.native
  
  /**
    * UTF-16 character encoding with little endian byte order.
    */
  /* static member */
  @JSGlobal("Titanium.Codec.CHARSET_UTF16LE")
  @js.native
  val CHARSET_UTF16LE: String = js.native
  
  /**
    * UTF-8 character encoding.
    */
  /* static member */
  @JSGlobal("Titanium.Codec.CHARSET_UTF8")
  @js.native
  val CHARSET_UTF8: String = js.native
  
  /**
    * Little endian byte order -- that is, the least significant byte first.
    */
  /* static member */
  @JSGlobal("Titanium.Codec.LITTLE_ENDIAN")
  @js.native
  val LITTLE_ENDIAN: Double = js.native
  
  /**
    * 8-bit integer encoding type.
    */
  /* static member */
  @JSGlobal("Titanium.Codec.TYPE_BYTE")
  @js.native
  val TYPE_BYTE: String = js.native
  
  /**
    * 64-bit double precision floating-point type.
    */
  /* static member */
  @JSGlobal("Titanium.Codec.TYPE_DOUBLE")
  @js.native
  val TYPE_DOUBLE: String = js.native
  
  /**
    * 32-bit single precision floating-point type.
    */
  /* static member */
  @JSGlobal("Titanium.Codec.TYPE_FLOAT")
  @js.native
  val TYPE_FLOAT: String = js.native
  
  /**
    * 32-bit integer encoding type.
    */
  /* static member */
  @JSGlobal("Titanium.Codec.TYPE_INT")
  @js.native
  val TYPE_INT: String = js.native
  
  /**
    * 64-bit integer encoding type.
    */
  /* static member */
  @JSGlobal("Titanium.Codec.TYPE_LONG")
  @js.native
  val TYPE_LONG: String = js.native
  
  /**
    * 16-bit integer encoding type.
    */
  /* static member */
  @JSGlobal("Titanium.Codec.TYPE_SHORT")
  @js.native
  val TYPE_SHORT: String = js.native
  
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  /* static member */
  @JSGlobal("Titanium.Codec.addEventListener")
  @js.native
  def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  
  /**
    * The name of the API that this proxy corresponds to.
    */
  /* static member */
  @JSGlobal("Titanium.Codec.apiName")
  @js.native
  val apiName: String = js.native
  
  /**
    * Applies the properties to the proxy.
    */
  /* static member */
  @JSGlobal("Titanium.Codec.applyProperties")
  @js.native
  def applyProperties(props: js.Any): Unit = js.native
  
  /**
    * Indicates if the proxy will bubble an event to its parent.
    */
  /* static member */
  @JSGlobal("Titanium.Codec.bubbleParent")
  @js.native
  def bubbleParent: Boolean = js.native
  @scala.inline
  def bubbleParent_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bubbleParent")(x.asInstanceOf[js.Any])
  
  /**
    * Decodes a number from the `source` buffer using the specified data type.
    */
  /* static member */
  @JSGlobal("Titanium.Codec.decodeNumber")
  @js.native
  def decodeNumber(options: DecodeNumberDict): Double = js.native
  
  /**
    * Decodes the source buffer into a String using the supplied character set.
    */
  /* static member */
  @JSGlobal("Titanium.Codec.decodeString")
  @js.native
  def decodeString(options: DecodeStringDict): String = js.native
  
  /**
    * Encodes a number and writes it to a buffer.
    */
  /* static member */
  @JSGlobal("Titanium.Codec.encodeNumber")
  @js.native
  def encodeNumber(options: EncodeNumberDict): Double = js.native
  
  /**
    * Encodes a string into a series of bytes in a buffer using the specified character set.
    */
  /* static member */
  @JSGlobal("Titanium.Codec.encodeString")
  @js.native
  def encodeString(options: Dictionary[EncodeStringDict]): Double = js.native
  
  /**
    * Fires a synthesized event to any registered listeners.
    */
  /* static member */
  @JSGlobal("Titanium.Codec.fireEvent")
  @js.native
  def fireEvent(name: String): Unit = js.native
  @JSGlobal("Titanium.Codec.fireEvent")
  @js.native
  def fireEvent(name: String, event: js.Any): Unit = js.native
  
  /**
    * Gets the value of the <Titanium.Codec.apiName> property.
    * @deprecated Access <Titanium.Codec.apiName> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Codec.getApiName")
  @js.native
  def getApiName(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Codec.bubbleParent> property.
    * @deprecated Access <Titanium.Codec.bubbleParent> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Codec.getBubbleParent")
  @js.native
  def getBubbleParent(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.Codec.lifecycleContainer> property.
    * @deprecated Access <Titanium.Codec.lifecycleContainer> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Codec.getLifecycleContainer")
  @js.native
  def getLifecycleContainer(): Window | TabGroup = js.native
  
  /**
    * Get the OS native byte order (either <Titanium.Codec.BIG_ENDIAN> or
    * <Titanium.Codec.LITTLE_ENDIAN>).
    */
  /* static member */
  @JSGlobal("Titanium.Codec.getNativeByteOrder")
  @js.native
  def getNativeByteOrder(): Double = js.native
  
  /**
    * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
    */
  /* static member */
  @JSGlobal("Titanium.Codec.lifecycleContainer")
  @js.native
  def lifecycleContainer: Window | TabGroup = js.native
  @scala.inline
  def lifecycleContainer_=(x: Window | TabGroup): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lifecycleContainer")(x.asInstanceOf[js.Any])
  
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  /* static member */
  @JSGlobal("Titanium.Codec.removeEventListener")
  @js.native
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Codec.bubbleParent> property.
    * @deprecated Set the value using <Titanium.Codec.bubbleParent> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Codec.setBubbleParent")
  @js.native
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  
  @JSGlobal("Titanium.Codec.setLifecycleContainer")
  @js.native
  def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
  /**
    * Sets the value of the <Titanium.Codec.lifecycleContainer> property.
    * @deprecated Set the value using <Titanium.Codec.lifecycleContainer> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Codec.setLifecycleContainer")
  @js.native
  def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
}
