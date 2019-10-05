package typings.winrtDashUwp.Windows.Media.Core

import typings.winrtDashUwp.Windows.Foundation.Collections.IPropertySet
import typings.winrtDashUwp.Windows.Foundation.EventHandler
import typings.winrtDashUwp.Windows.Foundation.TypedEventHandler
import typings.winrtDashUwp.Windows.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.facedetected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an effect that attempts to detect faces in a video stream. */
@JSGlobal("Windows.Media.Core.FaceDetectionEffect")
@js.native
abstract class FaceDetectionEffect () extends js.Object {
  /** Gets or sets the time span for which face detection should be performed. */
  var desiredDetectionInterval: Double = js.native
  /** Gets or sets a value indicating whether face detection is enabled. */
  var enabled: Boolean = js.native
  /** Occurs when a face is detected. */
  @JSName("onfacedetected")
  var onfacedetected_Original: TypedEventHandler[FaceDetectionEffect, FaceDetectedEventArgs] = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_facedetected(`type`: facedetected, listener: TypedEventHandler[FaceDetectionEffect, FaceDetectedEventArgs]): Unit = js.native
  /** Occurs when a face is detected. */
  def onfacedetected(ev: FaceDetectedEventArgs with WinRTEvent[FaceDetectionEffect]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_facedetected(`type`: facedetected, listener: TypedEventHandler[FaceDetectionEffect, FaceDetectedEventArgs]): Unit = js.native
  /**
    * Sets properties on the IMediaExtension .
    * @param configuration The property set.
    */
  def setProperties(configuration: IPropertySet): Unit = js.native
}

