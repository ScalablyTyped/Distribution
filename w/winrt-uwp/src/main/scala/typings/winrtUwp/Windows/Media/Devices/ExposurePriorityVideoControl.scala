package typings.winrtUwp.Windows.Media.Devices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** When supported, allows an app to specify whether the camera driver can dynamically adjust the frame rate of video capture in order to improve video quality in low-light conditions. */
@js.native
trait ExposurePriorityVideoControl extends StObject {
  
  /** Gets or sets a value that specifies if ExposurePriorityVideoControl is enabled. */
  var enabled: Boolean = js.native
  
  /** Gets or sets a value that specifies if ExposurePriorityVideoControl is supported on the current device. */
  var supported: Boolean = js.native
}
object ExposurePriorityVideoControl {
  
  @scala.inline
  def apply(enabled: Boolean, supported: Boolean): ExposurePriorityVideoControl = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExposurePriorityVideoControl]
  }
  
  @scala.inline
  implicit class ExposurePriorityVideoControlMutableBuilder[Self <: ExposurePriorityVideoControl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupported(value: Boolean): Self = StObject.set(x, "supported", value.asInstanceOf[js.Any])
  }
}
