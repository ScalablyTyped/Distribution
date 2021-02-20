package typings.tuyaPanelKit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MotionFadeProps extends MotionProps {
  
  var fadeOpacity: js.UndefOr[Double] = js.native
}
object MotionFadeProps {
  
  @scala.inline
  def apply(): MotionFadeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MotionFadeProps]
  }
  
  @scala.inline
  implicit class MotionFadePropsMutableBuilder[Self <: MotionFadeProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFadeOpacity(value: Double): Self = StObject.set(x, "fadeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFadeOpacityUndefined: Self = StObject.set(x, "fadeOpacity", js.undefined)
  }
}
