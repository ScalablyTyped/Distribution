package typings.winrtUwp.global.Windows.Media.Devices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** When supported, allows an app to specify whether the camera driver can dynamically adjust the frame rate of video capture in order to improve video quality in low-light conditions. */
/* note: abstract class */ @JSGlobal("Windows.Media.Devices.ExposurePriorityVideoControl")
@js.native
open class ExposurePriorityVideoControl ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Devices.ExposurePriorityVideoControl {
  
  /** Gets or sets a value that specifies if ExposurePriorityVideoControl is enabled. */
  /* CompleteClass */
  var enabled: Boolean = js.native
  
  /** Gets or sets a value that specifies if ExposurePriorityVideoControl is supported on the current device. */
  /* CompleteClass */
  var supported: Boolean = js.native
}
