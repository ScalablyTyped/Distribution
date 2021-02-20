package typings.titanium.global.Titanium

import typings.titanium.CreateStreamArgs
import typings.titanium.PumpCallbackArgs
import typings.titanium.ReadCallbackArgs
import typings.titanium.Titanium.Event
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import typings.titanium.WriteCallbackArgs
import typings.titanium.WriteStreamCallbackArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Stream module containing stream utility methods.
  */
@JSGlobal("Titanium.Stream")
@js.native
class Stream ()
  extends typings.titanium.Titanium.Proxy
object Stream {
  
  @JSGlobal("Titanium.Stream")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Use with [createStream](Titanium.Stream.createStream) to open a stream in append
    * mode.
    */
  /* static member */
  @JSGlobal("Titanium.Stream.MODE_APPEND")
  @js.native
  val MODE_APPEND: Double = js.native
  
  /**
    * Use with [createStream](Titanium.Stream.createStream) to open a stream in read
    * mode.
    */
  /* static member */
  @JSGlobal("Titanium.Stream.MODE_READ")
  @js.native
  val MODE_READ: Double = js.native
  
  /**
    * Use with [createStream](Titanium.Stream.createStream) to open a stream in write
    * mode.
    */
  /* static member */
  @JSGlobal("Titanium.Stream.MODE_WRITE")
  @js.native
  val MODE_WRITE: Double = js.native
  
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  /* static member */
  @JSGlobal("Titanium.Stream.addEventListener")
  @js.native
  def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  
  /**
    * The name of the API that this proxy corresponds to.
    */
  /* static member */
  @JSGlobal("Titanium.Stream.apiName")
  @js.native
  val apiName: String = js.native
  
  /**
    * Applies the properties to the proxy.
    */
  /* static member */
  @JSGlobal("Titanium.Stream.applyProperties")
  @js.native
  def applyProperties(props: js.Any): Unit = js.native
  
  /**
    * Indicates if the proxy will bubble an event to its parent.
    */
  /* static member */
  @JSGlobal("Titanium.Stream.bubbleParent")
  @js.native
  def bubbleParent: Boolean = js.native
  @scala.inline
  def bubbleParent_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bubbleParent")(x.asInstanceOf[js.Any])
  
  /**
    * Creates stream from a `Buffer` or `Blob` object.
    */
  /* static member */
  @JSGlobal("Titanium.Stream.createStream")
  @js.native
  def createStream(params: CreateStreamArgs): typings.titanium.Titanium.IOStream = js.native
  
  /**
    * Fires a synthesized event to any registered listeners.
    */
  /* static member */
  @JSGlobal("Titanium.Stream.fireEvent")
  @js.native
  def fireEvent(name: String): Unit = js.native
  @JSGlobal("Titanium.Stream.fireEvent")
  @js.native
  def fireEvent(name: String, event: js.Any): Unit = js.native
  
  /**
    * Gets the value of the <Titanium.Stream.apiName> property.
    * @deprecated Access <Titanium.Stream.apiName> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Stream.getApiName")
  @js.native
  def getApiName(): String = js.native
  
  /**
    * Gets the value of the <Titanium.Stream.bubbleParent> property.
    * @deprecated Access <Titanium.Stream.bubbleParent> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Stream.getBubbleParent")
  @js.native
  def getBubbleParent(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.Stream.lifecycleContainer> property.
    * @deprecated Access <Titanium.Stream.lifecycleContainer> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Stream.getLifecycleContainer")
  @js.native
  def getLifecycleContainer(): Window | TabGroup = js.native
  
  /**
    * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
    */
  /* static member */
  @JSGlobal("Titanium.Stream.lifecycleContainer")
  @js.native
  def lifecycleContainer: Window | TabGroup = js.native
  @scala.inline
  def lifecycleContainer_=(x: Window | TabGroup): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lifecycleContainer")(x.asInstanceOf[js.Any])
  
  /**
    * Reads data from input stream and passes it to a handler method.
    */
  /* static member */
  @JSGlobal("Titanium.Stream.pump")
  @js.native
  def pump(
    inputStream: typings.titanium.Titanium.IOStream,
    handler: js.Function1[/* param0 */ PumpCallbackArgs, Unit],
    maxChunkSize: Double
  ): Unit = js.native
  @JSGlobal("Titanium.Stream.pump")
  @js.native
  def pump(
    inputStream: typings.titanium.Titanium.IOStream,
    handler: js.Function1[/* param0 */ PumpCallbackArgs, Unit],
    maxChunkSize: Double,
    isAsync: Boolean
  ): Unit = js.native
  
  /**
    * Asynchronously reads data from an [IOStream](Titanium.IOStream) into a buffer.
    */
  /* static member */
  @JSGlobal("Titanium.Stream.read")
  @js.native
  def read(sourceStream: typings.titanium.Titanium.IOStream, buffer: typings.titanium.Titanium.Buffer): Unit = js.native
  @JSGlobal("Titanium.Stream.read")
  @js.native
  def read(
    sourceStream: typings.titanium.Titanium.IOStream,
    buffer: typings.titanium.Titanium.Buffer,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    resultsCallback: js.Function1[/* param0 */ ReadCallbackArgs, Unit]
  ): Unit = js.native
  @JSGlobal("Titanium.Stream.read")
  @js.native
  def read(
    sourceStream: typings.titanium.Titanium.IOStream,
    buffer: typings.titanium.Titanium.Buffer,
    offset: js.UndefOr[scala.Nothing],
    length: Double
  ): Unit = js.native
  @JSGlobal("Titanium.Stream.read")
  @js.native
  def read(
    sourceStream: typings.titanium.Titanium.IOStream,
    buffer: typings.titanium.Titanium.Buffer,
    offset: js.UndefOr[scala.Nothing],
    length: Double,
    resultsCallback: js.Function1[/* param0 */ ReadCallbackArgs, Unit]
  ): Unit = js.native
  @JSGlobal("Titanium.Stream.read")
  @js.native
  def read(
    sourceStream: typings.titanium.Titanium.IOStream,
    buffer: typings.titanium.Titanium.Buffer,
    offset: Double
  ): Unit = js.native
  @JSGlobal("Titanium.Stream.read")
  @js.native
  def read(
    sourceStream: typings.titanium.Titanium.IOStream,
    buffer: typings.titanium.Titanium.Buffer,
    offset: Double,
    length: js.UndefOr[scala.Nothing],
    resultsCallback: js.Function1[/* param0 */ ReadCallbackArgs, Unit]
  ): Unit = js.native
  @JSGlobal("Titanium.Stream.read")
  @js.native
  def read(
    sourceStream: typings.titanium.Titanium.IOStream,
    buffer: typings.titanium.Titanium.Buffer,
    offset: Double,
    length: Double
  ): Unit = js.native
  @JSGlobal("Titanium.Stream.read")
  @js.native
  def read(
    sourceStream: typings.titanium.Titanium.IOStream,
    buffer: typings.titanium.Titanium.Buffer,
    offset: Double,
    length: Double,
    resultsCallback: js.Function1[/* param0 */ ReadCallbackArgs, Unit]
  ): Unit = js.native
  
  /**
    * Reads all data from the specified [IOStream](Titanium.IOStream).
    */
  /* static member */
  @JSGlobal("Titanium.Stream.readAll")
  @js.native
  def readAll(sourceStream: typings.titanium.Titanium.IOStream): typings.titanium.Titanium.Buffer | Unit = js.native
  @JSGlobal("Titanium.Stream.readAll")
  @js.native
  def readAll(
    sourceStream: typings.titanium.Titanium.IOStream,
    buffer: js.UndefOr[scala.Nothing],
    resultsCallback: js.Function1[/* param0 */ ReadCallbackArgs, Unit]
  ): typings.titanium.Titanium.Buffer | Unit = js.native
  @JSGlobal("Titanium.Stream.readAll")
  @js.native
  def readAll(sourceStream: typings.titanium.Titanium.IOStream, buffer: typings.titanium.Titanium.Buffer): typings.titanium.Titanium.Buffer | Unit = js.native
  @JSGlobal("Titanium.Stream.readAll")
  @js.native
  def readAll(
    sourceStream: typings.titanium.Titanium.IOStream,
    buffer: typings.titanium.Titanium.Buffer,
    resultsCallback: js.Function1[/* param0 */ ReadCallbackArgs, Unit]
  ): typings.titanium.Titanium.Buffer | Unit = js.native
  
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  /* static member */
  @JSGlobal("Titanium.Stream.removeEventListener")
  @js.native
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.Stream.bubbleParent> property.
    * @deprecated Set the value using <Titanium.Stream.bubbleParent> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Stream.setBubbleParent")
  @js.native
  def setBubbleParent(bubbleParent: Boolean): Unit = js.native
  
  @JSGlobal("Titanium.Stream.setLifecycleContainer")
  @js.native
  def setLifecycleContainer(lifecycleContainer: TabGroup): Unit = js.native
  /**
    * Sets the value of the <Titanium.Stream.lifecycleContainer> property.
    * @deprecated Set the value using <Titanium.Stream.lifecycleContainer> instead.
    */
  /* static member */
  @JSGlobal("Titanium.Stream.setLifecycleContainer")
  @js.native
  def setLifecycleContainer(lifecycleContainer: Window): Unit = js.native
  
  /**
    * Asynchronously writes data from a buffer to an [IOStream](Titanium.IOStream).
    */
  /* static member */
  @JSGlobal("Titanium.Stream.write")
  @js.native
  def write(outputStream: typings.titanium.Titanium.IOStream, buffer: typings.titanium.Titanium.Buffer): Unit = js.native
  @JSGlobal("Titanium.Stream.write")
  @js.native
  def write(
    outputStream: typings.titanium.Titanium.IOStream,
    buffer: typings.titanium.Titanium.Buffer,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    resultsCallback: js.Function1[/* param0 */ WriteCallbackArgs, Unit]
  ): Unit = js.native
  @JSGlobal("Titanium.Stream.write")
  @js.native
  def write(
    outputStream: typings.titanium.Titanium.IOStream,
    buffer: typings.titanium.Titanium.Buffer,
    offset: js.UndefOr[scala.Nothing],
    length: Double
  ): Unit = js.native
  @JSGlobal("Titanium.Stream.write")
  @js.native
  def write(
    outputStream: typings.titanium.Titanium.IOStream,
    buffer: typings.titanium.Titanium.Buffer,
    offset: js.UndefOr[scala.Nothing],
    length: Double,
    resultsCallback: js.Function1[/* param0 */ WriteCallbackArgs, Unit]
  ): Unit = js.native
  @JSGlobal("Titanium.Stream.write")
  @js.native
  def write(
    outputStream: typings.titanium.Titanium.IOStream,
    buffer: typings.titanium.Titanium.Buffer,
    offset: Double
  ): Unit = js.native
  @JSGlobal("Titanium.Stream.write")
  @js.native
  def write(
    outputStream: typings.titanium.Titanium.IOStream,
    buffer: typings.titanium.Titanium.Buffer,
    offset: Double,
    length: js.UndefOr[scala.Nothing],
    resultsCallback: js.Function1[/* param0 */ WriteCallbackArgs, Unit]
  ): Unit = js.native
  @JSGlobal("Titanium.Stream.write")
  @js.native
  def write(
    outputStream: typings.titanium.Titanium.IOStream,
    buffer: typings.titanium.Titanium.Buffer,
    offset: Double,
    length: Double
  ): Unit = js.native
  @JSGlobal("Titanium.Stream.write")
  @js.native
  def write(
    outputStream: typings.titanium.Titanium.IOStream,
    buffer: typings.titanium.Titanium.Buffer,
    offset: Double,
    length: Double,
    resultsCallback: js.Function1[/* param0 */ WriteCallbackArgs, Unit]
  ): Unit = js.native
  
  /**
    * Writes all data from an input stream to an output stream.
    */
  /* static member */
  @JSGlobal("Titanium.Stream.writeStream")
  @js.native
  def writeStream(
    inputStream: typings.titanium.Titanium.IOStream,
    outputStream: typings.titanium.Titanium.IOStream,
    maxChunkSize: Double
  ): Unit = js.native
  @JSGlobal("Titanium.Stream.writeStream")
  @js.native
  def writeStream(
    inputStream: typings.titanium.Titanium.IOStream,
    outputStream: typings.titanium.Titanium.IOStream,
    maxChunkSize: Double,
    resultsCallback: js.Function1[/* param0 */ WriteStreamCallbackArgs, Unit]
  ): Unit = js.native
}
