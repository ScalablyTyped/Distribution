package typings.wepy.anon

import typings.wepy.wxEnhancedMod.LagLng
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationEnd extends StObject {
  
  def animationEnd(): Unit = js.native
  
  var autoRotate: Boolean = js.native
  
  var destination: LagLng = js.native
  
  var duration: Double = js.native
  
  var markerId: Double = js.native
}
object AnimationEnd {
  
  @scala.inline
  def apply(
    animationEnd: () => Unit,
    autoRotate: Boolean,
    destination: LagLng,
    duration: Double,
    markerId: Double
  ): AnimationEnd = {
    val __obj = js.Dynamic.literal(animationEnd = js.Any.fromFunction0(animationEnd), autoRotate = autoRotate.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], markerId = markerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationEnd]
  }
  
  @scala.inline
  implicit class AnimationEndMutableBuilder[Self <: AnimationEnd] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimationEnd(value: () => Unit): Self = StObject.set(x, "animationEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAutoRotate(value: Boolean): Self = StObject.set(x, "autoRotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestination(value: LagLng): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerId(value: Double): Self = StObject.set(x, "markerId", value.asInstanceOf[js.Any])
  }
}
