package typings.vis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Graph2dDrawPointsOption extends StObject {
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var onRender: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  // TODO
  var size: js.UndefOr[Double] = js.undefined
  
  var style: Graph2dDrawPointsStyle
}
object Graph2dDrawPointsOption {
  
  inline def apply(style: Graph2dDrawPointsStyle): Graph2dDrawPointsOption = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Graph2dDrawPointsOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Graph2dDrawPointsOption] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setOnRender(value: () => Boolean): Self = StObject.set(x, "onRender", js.Any.fromFunction0(value))
    
    inline def setOnRenderUndefined: Self = StObject.set(x, "onRender", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStyle(value: Graph2dDrawPointsStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
