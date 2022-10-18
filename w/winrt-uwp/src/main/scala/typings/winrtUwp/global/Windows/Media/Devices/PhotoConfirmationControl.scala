package typings.winrtUwp.global.Windows.Media.Devices

import typings.winrtUwp.Windows.Media.MediaProperties.MediaPixelFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides functionality for controlling the photo confirmation settings on a capture device. */
/* note: abstract class */ @JSGlobal("Windows.Media.Devices.PhotoConfirmationControl")
@js.native
open class PhotoConfirmationControl ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Devices.PhotoConfirmationControl {
  
  /** Gets or sets a value indicating whether photo confirmation is enabled. */
  /* CompleteClass */
  var enabled: Boolean = js.native
  
  /** Gets or sets the desired pixel format for photo confirmation frames. */
  /* CompleteClass */
  var pixelFormat: MediaPixelFormat = js.native
  
  /** Gets a value indicating whether photo confirmation is supported by the capture device. */
  /* CompleteClass */
  var supported: Boolean = js.native
}
