package typings.xterm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A position within a buffer.
  */
trait IBufferCellPosition extends StObject {
  
  /**
    * The x position within the buffer (1-based).
    */
  var x: Double
  
  /**
    * The y position within the buffer (1-based).
    */
  var y: Double
}
object IBufferCellPosition {
  
  inline def apply(x: Double, y: Double): IBufferCellPosition = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBufferCellPosition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IBufferCellPosition] (val x: Self) extends AnyVal {
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
