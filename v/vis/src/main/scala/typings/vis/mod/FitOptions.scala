package typings.vis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FitOptions extends StObject {
  
  /**
    * For animation you can either use a Boolean to use it with the default options or
    * disable it or you can define the duration (in milliseconds) and easing function manually.
    */
  var animation: TimelineAnimationType
  
  /**
    * The nodes can be used to zoom to fit only specific nodes in the view.
    */
  var nodes: js.UndefOr[js.Array[String]] = js.undefined
}
object FitOptions {
  
  @scala.inline
  def apply(animation: TimelineAnimationType): FitOptions = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any])
    __obj.asInstanceOf[FitOptions]
  }
  
  @scala.inline
  implicit class FitOptionsMutableBuilder[Self <: FitOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: TimelineAnimationType): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodes(value: js.Array[String]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
    
    @scala.inline
    def setNodesVarargs(value: String*): Self = StObject.set(x, "nodes", js.Array(value :_*))
  }
}
