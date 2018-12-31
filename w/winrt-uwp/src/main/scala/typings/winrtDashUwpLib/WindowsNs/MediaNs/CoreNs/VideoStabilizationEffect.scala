package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an effect that stabilizes a video stream. */
@JSGlobal("Windows.Media.Core.VideoStabilizationEffect")
@js.native
abstract class VideoStabilizationEffect () extends js.Object {
  /** Gets or sets a value indicating whether video stabilization is enabled. */
  var enabled: scala.Boolean = js.native
  /** Occurs when the value of the VideoStabilizationEffect::Enabled property changes. */
  @JSName("onenabledchanged")
  var onenabledchanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[VideoStabilizationEffect, VideoStabilizationEffectEnabledChangedEventArgs] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_enabledchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.enabledchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[VideoStabilizationEffect, VideoStabilizationEffectEnabledChangedEventArgs]
  ): scala.Unit = js.native
  /**
    * Gets the recommended video stream configuration for video stabilization, given the specified video device controller and encoding properties.
    * @param controller The video device controller.
    * @param desiredProperties The encoding properties.
    * @return An object representing the optimal video stream configuration for video stabilization.
    */
  def getRecommendedStreamConfiguration(
    controller: winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.VideoDeviceController,
    desiredProperties: winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.VideoEncodingProperties
  ): winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.VideoStreamConfiguration = js.native
  /** Occurs when the value of the VideoStabilizationEffect::Enabled property changes. */
  def onenabledchanged(
    ev: VideoStabilizationEffectEnabledChangedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[VideoStabilizationEffect]
  ): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_enabledchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.enabledchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[VideoStabilizationEffect, VideoStabilizationEffectEnabledChangedEventArgs]
  ): scala.Unit = js.native
  /**
    * Sets properties on the IMediaExtension .
    * @param configuration The property set.
    */
  def setProperties(configuration: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IPropertySet): scala.Unit = js.native
}

