package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofStream extends js.Object {
  /**
  		 * Use with [createStream](Titanium.Stream.createStream) to open a stream in append
  		 * mode.
  		 */
  val MODE_APPEND: scala.Double = js.native
  /**
  		 * Use with [createStream](Titanium.Stream.createStream) to open a stream in read
  		 * mode.
  		 */
  val MODE_READ: scala.Double = js.native
  /**
  		 * Use with [createStream](Titanium.Stream.createStream) to open a stream in write
  		 * mode.
  		 */
  val MODE_WRITE: scala.Double = js.native
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
  		 * Creates stream from a `Buffer` or `Blob` object.
  		 */
  def createStream(params: CreateStreamArgs): titaniumLib.TitaniumNs.IOStream = js.native
  /**
  		 * Fires a synthesized event to any registered listeners.
  		 */
  def fireEvent(name: java.lang.String, event: js.Any): scala.Unit = js.native
  /**
  		 * Gets the value of the <Titanium.Stream.apiName> property.
  		 */
  def getApiName(): java.lang.String = js.native
  /**
  		 * Gets the value of the <Titanium.Stream.bubbleParent> property.
  		 */
  def getBubbleParent(): scala.Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.Stream.lifecycleContainer> property.
  		 */
  def getLifecycleContainer(): titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = js.native
  /**
  		 * Reads data from input stream and passes it to a handler method.
  		 */
  def pump(
    inputStream: titaniumLib.TitaniumNs.IOStream,
    handler: js.Function1[/* param0 */ PumpCallbackArgs, _],
    maxChunkSize: scala.Double
  ): scala.Unit = js.native
  def pump(
    inputStream: titaniumLib.TitaniumNs.IOStream,
    handler: js.Function1[/* param0 */ PumpCallbackArgs, _],
    maxChunkSize: scala.Double,
    isAsync: scala.Boolean
  ): scala.Unit = js.native
  /**
  		 * Asynchronously reads data from an [IOStream](Titanium.IOStream) into a buffer.
  		 */
  def read(sourceStream: titaniumLib.TitaniumNs.IOStream, buffer: titaniumLib.TitaniumNs.Buffer): scala.Unit = js.native
  def read(
    sourceStream: titaniumLib.TitaniumNs.IOStream,
    buffer: titaniumLib.TitaniumNs.Buffer,
    offset: scala.Double
  ): scala.Unit = js.native
  def read(
    sourceStream: titaniumLib.TitaniumNs.IOStream,
    buffer: titaniumLib.TitaniumNs.Buffer,
    offset: scala.Double,
    length: scala.Double
  ): scala.Unit = js.native
  def read(
    sourceStream: titaniumLib.TitaniumNs.IOStream,
    buffer: titaniumLib.TitaniumNs.Buffer,
    offset: scala.Double,
    length: scala.Double,
    resultsCallback: js.Function1[/* param0 */ ReadCallbackArgs, _]
  ): scala.Unit = js.native
  /**
  		 * Reads all data from the specified [IOStream](Titanium.IOStream).
  		 */
  def readAll(sourceStream: titaniumLib.TitaniumNs.IOStream): titaniumLib.TitaniumNs.Buffer | scala.Unit = js.native
  def readAll(sourceStream: titaniumLib.TitaniumNs.IOStream, buffer: titaniumLib.TitaniumNs.Buffer): titaniumLib.TitaniumNs.Buffer | scala.Unit = js.native
  def readAll(
    sourceStream: titaniumLib.TitaniumNs.IOStream,
    buffer: titaniumLib.TitaniumNs.Buffer,
    resultsCallback: js.Function1[/* param0 */ ReadCallbackArgs, _]
  ): titaniumLib.TitaniumNs.Buffer | scala.Unit = js.native
  /**
  		 * Removes the specified callback as an event listener for the named event.
  		 */
  def removeEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Stream.bubbleParent> property.
  		 */
  def setBubbleParent(bubbleParent: scala.Boolean): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Stream.lifecycleContainer> property.
  		 */
  def setLifecycleContainer(lifecycleContainer: titaniumLib.TitaniumNs.UINs.TabGroup): scala.Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Stream.lifecycleContainer> property.
  		 */
  def setLifecycleContainer(lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window): scala.Unit = js.native
  /**
  		 * Asynchronously writes data from a buffer to an [IOStream](Titanium.IOStream).
  		 */
  def write(outputStream: titaniumLib.TitaniumNs.IOStream, buffer: titaniumLib.TitaniumNs.Buffer): scala.Unit = js.native
  def write(
    outputStream: titaniumLib.TitaniumNs.IOStream,
    buffer: titaniumLib.TitaniumNs.Buffer,
    offset: scala.Double
  ): scala.Unit = js.native
  def write(
    outputStream: titaniumLib.TitaniumNs.IOStream,
    buffer: titaniumLib.TitaniumNs.Buffer,
    offset: scala.Double,
    length: scala.Double
  ): scala.Unit = js.native
  def write(
    outputStream: titaniumLib.TitaniumNs.IOStream,
    buffer: titaniumLib.TitaniumNs.Buffer,
    offset: scala.Double,
    length: scala.Double,
    resultsCallback: js.Function1[/* param0 */ WriteCallbackArgs, _]
  ): scala.Unit = js.native
  /**
  		 * Writes all data from an input stream to an output stream.
  		 */
  def writeStream(
    inputStream: titaniumLib.TitaniumNs.IOStream,
    outputStream: titaniumLib.TitaniumNs.IOStream,
    maxChunkSize: scala.Double
  ): scala.Unit = js.native
  def writeStream(
    inputStream: titaniumLib.TitaniumNs.IOStream,
    outputStream: titaniumLib.TitaniumNs.IOStream,
    maxChunkSize: scala.Double,
    resultsCallback: js.Function1[/* param0 */ WriteStreamCallbackArgs, _]
  ): scala.Unit = js.native
}

