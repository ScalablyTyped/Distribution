package typings.winrtUwp.Windows.Devices.Perception.Provider

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import typings.winrtUwp.Windows.Foundation.IClosable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an object that can produce PerceptionFrames. */
@js.native
trait IPerceptionFrameProvider extends IClosable {
  /** Gets a value indicating whether or not the device is ready to start producing PerceptionFrames. */
  var available: Boolean = js.native
  /** Gets the PerceptionFrameProviderInfo describing this device. */
  var frameProviderInfo: PerceptionFrameProviderInfo = js.native
  /** The properties describing the device and the frames produced by the device. */
  var properties: IPropertySet = js.native
  /**
    * The device is requested to update one of its Properties to a new value.
    * @param value Success or failure will be conveyed to the app.
    */
  def setProperty(value: PerceptionPropertyChangeRequest): Unit = js.native
  /** Tells the device to start producing frames. If success is returned, PerceptionFrameProviderManagerService::PublishFrameForProvider is expected to be called by this Provider. */
  def start(): Unit = js.native
  /** Tells the device to stop producing frames. Called only after Start is called and only if Start returns success. */
  def stop(): Unit = js.native
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
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], close = js.Any.fromFunction0(close), frameProviderInfo = frameProviderInfo.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], setProperty = js.Any.fromFunction1(setProperty), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[IPerceptionFrameProvider]
  }
  @scala.inline
  implicit class IPerceptionFrameProviderOps[Self <: IPerceptionFrameProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAvailable(value: Boolean): Self = this.set("available", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrameProviderInfo(value: PerceptionFrameProviderInfo): Self = this.set("frameProviderInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperties(value: IPropertySet): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetProperty(value: PerceptionPropertyChangeRequest => Unit): Self = this.set("setProperty", js.Any.fromFunction1(value))
    @scala.inline
    def setStart(value: () => Unit): Self = this.set("start", js.Any.fromFunction0(value))
    @scala.inline
    def setStop(value: () => Unit): Self = this.set("stop", js.Any.fromFunction0(value))
  }
  
}

