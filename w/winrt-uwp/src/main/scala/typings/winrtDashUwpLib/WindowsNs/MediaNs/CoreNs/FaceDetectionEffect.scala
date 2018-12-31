package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an effect that attempts to detect faces in a video stream. */
@JSGlobal("Windows.Media.Core.FaceDetectionEffect")
@js.native
abstract class FaceDetectionEffect () extends js.Object {
  /** Gets or sets the time span for which face detection should be performed. */
  var desiredDetectionInterval: scala.Double = js.native
  /** Gets or sets a value indicating whether face detection is enabled. */
  var enabled: scala.Boolean = js.native
  /** Occurs when a face is detected. */
  @JSName("onfacedetected")
  var onfacedetected_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[FaceDetectionEffect, FaceDetectedEventArgs] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_facedetected(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.facedetected,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[FaceDetectionEffect, FaceDetectedEventArgs]
  ): scala.Unit = js.native
  /** Occurs when a face is detected. */
  def onfacedetected(ev: FaceDetectedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[FaceDetectionEffect]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_facedetected(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.facedetected,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[FaceDetectionEffect, FaceDetectedEventArgs]
  ): scala.Unit = js.native
  /**
    * Sets properties on the IMediaExtension .
    * @param configuration The property set.
    */
  def setProperties(configuration: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IPropertySet): scala.Unit = js.native
}

