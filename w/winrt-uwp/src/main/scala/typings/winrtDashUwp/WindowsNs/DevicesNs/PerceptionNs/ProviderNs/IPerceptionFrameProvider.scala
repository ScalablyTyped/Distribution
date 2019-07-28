package typings.winrtDashUwp.WindowsNs.DevicesNs.PerceptionNs.ProviderNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IPropertySet
import typings.winrtDashUwp.WindowsNs.FoundationNs.IClosable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an object that can produce PerceptionFrames. */
trait IPerceptionFrameProvider extends IClosable {
  /** Gets a value indicating whether or not the device is ready to start producing PerceptionFrames. */
  var available: Boolean
  /** Gets the PerceptionFrameProviderInfo describing this device. */
  var frameProviderInfo: PerceptionFrameProviderInfo
  /** The properties describing the device and the frames produced by the device. */
  var properties: IPropertySet
  /**
    * The device is requested to update one of its Properties to a new value.
    * @param value Success or failure will be conveyed to the app.
    */
  def setProperty(value: PerceptionPropertyChangeRequest): Unit
  /** Tells the device to start producing frames. If success is returned, PerceptionFrameProviderManagerService::PublishFrameForProvider is expected to be called by this Provider. */
  def start(): Unit
  /** Tells the device to stop producing frames. Called only after Start is called and only if Start returns success. */
  def stop(): Unit
}

object IPerceptionFrameProvider {
  @scala.inline
  def apply(
    available: Boolean,
    close: () => Unit,
    frameProviderInfo: PerceptionFrameProviderInfo,
    properties: IPropertySet,
    setProperty: PerceptionPropertyChangeRequest => Unit,
    start: () => Unit,
    stop: () => Unit
  ): IPerceptionFrameProvider = {
    val __obj = js.Dynamic.literal(available = available, close = js.Any.fromFunction0(close), frameProviderInfo = frameProviderInfo, properties = properties, setProperty = js.Any.fromFunction1(setProperty), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
  
    __obj.asInstanceOf[IPerceptionFrameProvider]
  }
}

