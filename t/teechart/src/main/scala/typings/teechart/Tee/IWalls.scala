package typings.teechart.Tee

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWalls extends StObject {
  
  var back: IWall
  
  var bottom: IWall
  
  var left: IWall
  
  var right: IWall
  
  var visible: Boolean
}
object IWalls {
  
  inline def apply(back: IWall, bottom: IWall, left: IWall, right: IWall, visible: Boolean): IWalls = {
    val __obj = js.Dynamic.literal(back = back.asInstanceOf[js.Any], bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWalls]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IWalls] (val x: Self) extends AnyVal {
    
    inline def setBack(value: IWall): Self = StObject.set(x, "back", value.asInstanceOf[js.Any])
    
    inline def setBottom(value: IWall): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: IWall): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: IWall): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
