package typings.vis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MoveToOptions
  extends StObject
     with ViewPortOptions {
  
  /**
    * The position (in canvas units!) is the position of the central focus point of the camera.
    */
  var position: js.UndefOr[Position] = js.undefined
}
object MoveToOptions {
  
  inline def apply(): MoveToOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MoveToOptions]
  }
  
  extension [Self <: MoveToOptions](x: Self) {
    
    inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
