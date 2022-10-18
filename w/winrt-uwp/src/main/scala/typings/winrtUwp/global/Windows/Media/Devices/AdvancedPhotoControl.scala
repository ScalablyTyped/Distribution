package typings.winrtUwp.global.Windows.Media.Devices

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides functionality for controlling the advanced photo capture behavior on a capture device. */
/* note: abstract class */ @JSGlobal("Windows.Media.Devices.AdvancedPhotoControl")
@js.native
open class AdvancedPhotoControl ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Devices.AdvancedPhotoControl {
  
  /**
    * Configures the AdvancedPhotoControl object with the specified settings.
    * @param settings The object defining the configuration settings.
    */
  /* CompleteClass */
  override def configure(settings: typings.winrtUwp.Windows.Media.Devices.AdvancedPhotoCaptureSettings): Unit = js.native
  
  /** Gets the current advanced capture mode of the AdvancedPhotoControl . */
  /* CompleteClass */
  var mode: typings.winrtUwp.Windows.Media.Devices.AdvancedPhotoMode = js.native
  
  /** Gets a value indicating whether the AdvancedPhotoControl is supported on the current capture device. */
  /* CompleteClass */
  var supported: Boolean = js.native
  
  /** Gets a list of the advanced capture modes supported by the current capture device. */
  /* CompleteClass */
  var supportedModes: IVectorView[typings.winrtUwp.Windows.Media.Devices.AdvancedPhotoMode] = js.native
}
