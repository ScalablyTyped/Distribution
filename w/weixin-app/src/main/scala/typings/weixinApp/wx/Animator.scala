package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Animator extends StObject {
  
  var actions: js.Array[AnimationAction]
}
object Animator {
  
  @scala.inline
  def apply(actions: js.Array[AnimationAction]): Animator = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animator]
  }
  
  @scala.inline
  implicit class AnimatorMutableBuilder[Self <: Animator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: js.Array[AnimationAction]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsVarargs(value: AnimationAction*): Self = StObject.set(x, "actions", js.Array(value :_*))
  }
}
