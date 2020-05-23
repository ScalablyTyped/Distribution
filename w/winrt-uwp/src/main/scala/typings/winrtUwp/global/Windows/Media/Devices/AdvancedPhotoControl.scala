package typings.winrtUwp.global.Windows.Media.Devices

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality for controlling the advanced photo capture behavior on a capture device. */
@JSGlobal("Windows.Media.Devices.AdvancedPhotoControl")
@js.native
abstract class AdvancedPhotoControl ()
  extends typings.winrtUwp.Windows.Media.Devices.AdvancedPhotoControl {
  /** Gets the current advanced capture mode of the AdvancedPhotoControl . */
  /* CompleteClass */
  override var mode: typings.winrtUwp.Windows.Media.Devices.AdvancedPhotoMode = js.native
  /** Gets a value indicating whether the AdvancedPhotoControl is supported on the current capture device. */
  /* CompleteClass */
  override var supported: Boolean = js.native
  /** Gets a list of the advanced capture modes supported by the current capture device. */
  /* CompleteClass */
  override var supportedModes: IVectorView[typings.winrtUwp.Windows.Media.Devices.AdvancedPhotoMode] = js.native
  /**
    * Configures the AdvancedPhotoControl object with the specified settings.
    * @param settings The object defining the configuration settings.
    */
  /* CompleteClass */
  override def configure(settings: typings.winrtUwp.Windows.Media.Devices.AdvancedPhotoCaptureSettings): Unit = js.native
}

