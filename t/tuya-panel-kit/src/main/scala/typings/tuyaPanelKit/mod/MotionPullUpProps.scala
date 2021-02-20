package typings.tuyaPanelKit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MotionPullUpProps extends MotionProps {
  
  var dropHeight: js.UndefOr[Double] = js.native
}
object MotionPullUpProps {
  
  @scala.inline
  def apply(): MotionPullUpProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MotionPullUpProps]
  }
  
  @scala.inline
  implicit class MotionPullUpPropsMutableBuilder[Self <: MotionPullUpProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDropHeight(value: Double): Self = StObject.set(x, "dropHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropHeightUndefined: Self = StObject.set(x, "dropHeight", js.undefined)
  }
}
