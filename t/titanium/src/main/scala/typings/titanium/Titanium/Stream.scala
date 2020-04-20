package typings.titanium.Titanium

import typings.titanium.CreateStreamArgs
import typings.titanium.PumpCallbackArgs
import typings.titanium.ReadCallbackArgs
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import typings.titanium.WriteCallbackArgs
import typings.titanium.WriteStreamCallbackArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Stream module containing stream utility methods.
	 */
@JSGlobal("Titanium.Stream")
@js.native
class Stream () extends Module

/* static members */
@JSGlobal("Titanium.Stream")
@js.native
object Stream extends js.Object {
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
  def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
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
  def fireEvent(name: String): Unit = js.native
  def fireEvent(name: String, event: js.Any): Unit = js.native
  /**
  		 * Gets the value of the <Titanium.Stream.apiName> property.
  		 * @deprecated Access <Titanium.Stream.apiName> instead.
  		 */
  def getApiName(): String = js.native
  /**
  		 * Gets the value of the <Titanium.Stream.bubbleParent> property.
  		 * @deprecated Access <Titanium.Stream.bubbleParent> instead.
  		 */
  def getBubbleParent(): Boolean = js.native
  /**
  		 * Gets the value of the <Titanium.Stream.lifecycleContainer> property.
  		 * @deprecated Access <Titanium.Stream.lifecycleContainer> instead.
  		 */
  def getLifecycleContainer(): Window | TabGroup = js.native
  /**
  		 * Reads data from input stream and passes it to a handler method.
  		 */
  def pump(
    inputStream: IOStream,
    handler: js.Function1[/* param0 */ PumpCallbackArgs, Unit],
    maxChunkSize: Double
  ): Unit = js.native
  def pump(
    inputStream: IOStream,
    handler: js.Function1[/* param0 */ PumpCallbackArgs, Unit],
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
    resultsCallback: js.Function1[/* param0 */ ReadCallbackArgs, Unit]
  ): Unit = js.native
  /**
  		 * Reads all data from the specified [IOStream](Titanium.IOStream).
  		 */
  def readAll(sourceStream: IOStream): Buffer | Unit = js.native
  def readAll(sourceStream: IOStream, buffer: Buffer): Buffer | Unit = js.native
  def readAll(
    sourceStream: IOStream,
    buffer: Buffer,
    resultsCallback: js.Function1[/* param0 */ ReadCallbackArgs, Unit]
  ): Buffer | Unit = js.native
  /**
  		 * Removes the specified callback as an event listener for the named event.
  		 */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Stream.bubbleParent> property.
  		 * @deprecated Set the value using <Titanium.Stream.bubbleParent> instead.
  		 */
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
  /**
  		 * Sets the value of the <Titanium.Stream.lifecycleContainer> property.
  		 * @deprecated Set the value using <Titanium.Stream.lifecycleContainer> instead.
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
    resultsCallback: js.Function1[/* param0 */ WriteCallbackArgs, Unit]
  ): Unit = js.native
  /**
  		 * Writes all data from an input stream to an output stream.
  		 */
  def writeStream(inputStream: IOStream, outputStream: IOStream, maxChunkSize: Double): Unit = js.native
  def writeStream(
    inputStream: IOStream,
    outputStream: IOStream,
    maxChunkSize: Double,
    resultsCallback: js.Function1[/* param0 */ WriteStreamCallbackArgs, Unit]
  ): Unit = js.native
}

