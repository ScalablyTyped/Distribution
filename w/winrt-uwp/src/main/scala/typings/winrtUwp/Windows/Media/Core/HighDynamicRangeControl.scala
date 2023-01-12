package typings.winrtUwp.Windows.Media.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides the ability to enable and disable High Dynamic Range (HDR) analysis for the SceneAnalysisEffect . */
trait HighDynamicRangeControl extends StObject {
  
  /** Gets or sets a value that specifies whether High Dynamic Range (HDR) analysis is enabled for the SceneAnalysisEffect . */
  var enabled: Boolean
}
object HighDynamicRangeControl {
  
  inline def apply(enabled: Boolean): HighDynamicRangeControl = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighDynamicRangeControl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HighDynamicRangeControl] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
