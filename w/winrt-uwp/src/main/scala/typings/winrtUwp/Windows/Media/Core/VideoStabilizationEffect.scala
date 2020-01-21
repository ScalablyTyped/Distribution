package typings.winrtUwp.Windows.Media.Core

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.Media.Capture.VideoStreamConfiguration
import typings.winrtUwp.Windows.Media.Devices.VideoDeviceController
import typings.winrtUwp.Windows.Media.MediaProperties.VideoEncodingProperties
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.enabledchanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an effect that stabilizes a video stream. */
@JSGlobal("Windows.Media.Core.VideoStabilizationEffect")
@js.native
abstract class VideoStabilizationEffect () extends js.Object {
  /** Gets or sets a value indicating whether video stabilization is enabled. */
  var enabled: Boolean = js.native
  /** Occurs when the value of the VideoStabilizationEffect::Enabled property changes. */
  @JSName("onenabledchanged")
  var onenabledchanged_Original: TypedEventHandler[VideoStabilizationEffect, VideoStabilizationEffectEnabledChangedEventArgs] = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_enabledchanged(
    `type`: enabledchanged,
    listener: TypedEventHandler[VideoStabilizationEffect, VideoStabilizationEffectEnabledChangedEventArgs]
  ): Unit = js.native
  /**
    * Gets the recommended video stream configuration for video stabilization, given the specified video device controller and encoding properties.
    * @param controller The video device controller.
    * @param desiredProperties The encoding properties.
    * @return An object representing the optimal video stream configuration for video stabilization.
    */
  def getRecommendedStreamConfiguration(controller: VideoDeviceController, desiredProperties: VideoEncodingProperties): VideoStreamConfiguration = js.native
  /** Occurs when the value of the VideoStabilizationEffect::Enabled property changes. */
  def onenabledchanged(ev: VideoStabilizationEffectEnabledChangedEventArgs with WinRTEvent[VideoStabilizationEffect]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_enabledchanged(
    `type`: enabledchanged,
    listener: TypedEventHandler[VideoStabilizationEffect, VideoStabilizationEffectEnabledChangedEventArgs]
  ): Unit = js.native
  /**
    * Sets properties on the IMediaExtension .
    * @param configuration The property set.
    */
  def setProperties(configuration: IPropertySet): Unit = js.native
}

