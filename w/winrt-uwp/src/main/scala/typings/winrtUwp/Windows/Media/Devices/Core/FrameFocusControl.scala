package typings.winrtUwp.Windows.Media.Devices.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the focus settings for a frame in a variable photo sequence. */
trait FrameFocusControl extends StObject {
  
  /** Gets or sets the focus value for a frame in a variable photo sequence. */
  var value: Double
}
object FrameFocusControl {
  
  @scala.inline
  def apply(value: Double): FrameFocusControl = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameFocusControl]
  }
  
  @scala.inline
  implicit class FrameFocusControlMutableBuilder[Self <: FrameFocusControl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
