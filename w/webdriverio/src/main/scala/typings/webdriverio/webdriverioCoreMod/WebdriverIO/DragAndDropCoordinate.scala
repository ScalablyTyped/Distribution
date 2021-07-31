package typings.webdriverio.webdriverioCoreMod.WebdriverIO

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragAndDropCoordinate extends StObject {
  
  var x: Double
  
  var y: Double
}
object DragAndDropCoordinate {
  
  @scala.inline
  def apply(x: Double, y: Double): DragAndDropCoordinate = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragAndDropCoordinate]
  }
  
  @scala.inline
  implicit class DragAndDropCoordinateMutableBuilder[Self <: DragAndDropCoordinate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
