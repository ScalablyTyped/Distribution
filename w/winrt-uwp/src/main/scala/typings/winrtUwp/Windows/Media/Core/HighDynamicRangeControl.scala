package typings.winrtUwp.Windows.Media.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides the ability to enable and disable High Dynamic Range (HDR) analysis for the SceneAnalysisEffect . */
@js.native
trait HighDynamicRangeControl extends StObject {
  
  /** Gets or sets a value that specifies whether High Dynamic Range (HDR) analysis is enabled for the SceneAnalysisEffect . */
  var enabled: Boolean = js.native
}
object HighDynamicRangeControl {
  
  @scala.inline
  def apply(enabled: Boolean): HighDynamicRangeControl = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighDynamicRangeControl]
  }
  
  @scala.inline
  implicit class HighDynamicRangeControlMutableBuilder[Self <: HighDynamicRangeControl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
