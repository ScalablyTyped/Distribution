package typings.vis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Graph2dDrawPointsOption extends StObject {
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var onRender: js.UndefOr[js.Function0[Boolean]] = js.native
  
  // TODO
  var size: js.UndefOr[Double] = js.native
  
  var style: Graph2dDrawPointsStyle = js.native
}
object Graph2dDrawPointsOption {
  
  @scala.inline
  def apply(style: Graph2dDrawPointsStyle): Graph2dDrawPointsOption = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Graph2dDrawPointsOption]
  }
  
  @scala.inline
  implicit class Graph2dDrawPointsOptionMutableBuilder[Self <: Graph2dDrawPointsOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setOnRender(value: () => Boolean): Self = StObject.set(x, "onRender", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnRenderUndefined: Self = StObject.set(x, "onRender", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setStyle(value: Graph2dDrawPointsStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
