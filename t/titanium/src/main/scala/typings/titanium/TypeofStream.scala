package typings.titanium

import typings.titanium.Titanium.Buffer
import typings.titanium.Titanium.IOStream
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofStream extends js.Object {
  /**
  		 * Use with [createStream](Titanium.Stream.createStream) to open a stream in append
  		 * mode.
  		 */
  val MODE_APPEND: Double = js.native
  /**
  		 * Use with [createStream](Titanium.Stream.createStream) to open a stream in read
  		 * mode.
  		 */
  val MODE_READ: Double = js.native
  /**
  		 * Use with [createStream](Titanium.Stream.createStream) to open a stream in write
  		 * mode.
  		 */
  val MODE_WRITE: Double = js.native
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
  		 * Creates stream from a `Buffer` or `Blob` object.
  		 */
  def createStream(params: CreateStreamArgs): IOStream = js.native
  /**
  		 * Fires a synthesized event to any registered listeners.
  		 */
  def fireEvent(name: String, event: js.Any): Unit = js.native
  /**
  		 * Gets the value of the <Titanium.Stream.apiName> property.
  		 */
  def getApiName(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Stream.bubbleParent> property.
  		 */
  def getBubbleParent(): Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.Stream.lifecycleContainer> property.
  		 */
  def getLifecycleContainer(): Window | TabGroup = js.native
  /**
  		 * Reads data from input stream and passes it to a handler method.
  		 */
  def pump(
    inputStream: IOStream,
    handler: js.Function1[/* param0 */ PumpCallbackArgs, _],
    maxChunkSize: Double
  ): Unit = js.native
  def pump(
    inputStream: IOStream,
    handler: js.Function1[/* param0 */ PumpCallbackArgs, _],
    maxChunkSize: Double,
    isAsync: Boolean
  ): Unit = js.native
  /**
  		 * Asynchronously reads data from an [IOStream](Titanium.IOStream) into a buffer.
  		 */
  def read(sourceStream: IOStream, buffer: Buffer): Unit = js.native
  def read(sourceStream: IOStream, buffer: Buffer, offset: Double): Unit = js.native
  def read(sourceStream: IOStream, buffer: Buffer, offset: Double, length: Double): Unit = js.native
  def read(
    sourceStream: IOStream,
    buffer: Buffer,
    offset: Double,
    length: Double,
    resultsCallback: js.Function1[/* param0 */ ReadCallbackArgs, _]
  ): Unit = js.native
  /**
  		 * Reads all data from the specified [IOStream](Titanium.IOStream).
  		 */
  def readAll(sourceStream: IOStream): Buffer | Unit = js.native
  def readAll(sourceStream: IOStream, buffer: Buffer): Buffer | Unit = js.native
  def readAll(
    sourceStream: IOStream,
    buffer: Buffer,
    resultsCallback: js.Function1[/* param0 */ ReadCallbackArgs, _]
  ): Buffer | Unit = js.native
  /**
  		 * Removes the specified callback as an event listener for the named event.
  		 */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Stream.bubbleParent> property.
  		 */
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Stream.lifecycleContainer> property.
  		 */
  def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Stream.lifecycleContainer> property.
  		 */
  def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
  /**
  		 * Asynchronously writes data from a buffer to an [IOStream](Titanium.IOStream).
  		 */
  def write(outputStream: IOStream, buffer: Buffer): Unit = js.native
  def write(outputStream: IOStream, buffer: Buffer, offset: Double): Unit = js.native
  def write(outputStream: IOStream, buffer: Buffer, offset: Double, length: Double): Unit = js.native
  def write(
    outputStream: IOStream,
    buffer: Buffer,
    offset: Double,
    length: Double,
    resultsCallback: js.Function1[/* param0 */ WriteCallbackArgs, _]
  ): Unit = js.native
  /**
  		 * Writes all data from an input stream to an output stream.
  		 */
  def writeStream(inputStream: IOStream, outputStream: IOStream, maxChunkSize: Double): Unit = js.native
  def writeStream(
    inputStream: IOStream,
    outputStream: IOStream,
    maxChunkSize: Double,
    resultsCallback: js.Function1[/* param0 */ WriteStreamCallbackArgs, _]
  ): Unit = js.native
}

