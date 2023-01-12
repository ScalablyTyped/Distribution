package typings.vis.anon

import typings.vis.mod.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Canvas extends StObject {
  
  var DOM: Position
  
  var canvas: Position
}
object Canvas {
  
  inline def apply(DOM: Position, canvas: Position): Canvas = {
    val __obj = js.Dynamic.literal(DOM = DOM.asInstanceOf[js.Any], canvas = canvas.asInstanceOf[js.Any])
    __obj.asInstanceOf[Canvas]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Canvas] (val x: Self) extends AnyVal {
    
    inline def setCanvas(value: Position): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
    
    inline def setDOM(value: Position): Self = StObject.set(x, "DOM", value.asInstanceOf[js.Any])
  }
}
