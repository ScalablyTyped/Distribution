package typings.winrtDashUwp.WindowsNs.MediaNs.CoreNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IPropertySet
import typings.winrtDashUwp.WindowsNs.FoundationNs.EventHandler
import typings.winrtDashUwp.WindowsNs.FoundationNs.TypedEventHandler
import typings.winrtDashUwp.WindowsNs.MediaNs.CaptureNs.VideoStreamConfiguration
import typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.VideoDeviceController
import typings.winrtDashUwp.WindowsNs.MediaNs.MediaPropertiesNs.VideoEncodingProperties
import typings.winrtDashUwp.WindowsNs.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.enabledchanged
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

