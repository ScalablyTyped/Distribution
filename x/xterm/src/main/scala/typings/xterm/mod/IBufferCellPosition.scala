package typings.xterm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A position within a buffer.
  */
@js.native
trait IBufferCellPosition extends StObject {
  
  /**
    * The x position within the buffer.
    */
  var x: Double = js.native
  
  /**
    * The y position within the buffer.
    */
  var y: Double = js.native
}
object IBufferCellPosition {
  
  @scala.inline
  def apply(x: Double, y: Double): IBufferCellPosition = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBufferCellPosition]
  }
  
  @scala.inline
  implicit class IBufferCellPositionMutableBuilder[Self <: IBufferCellPosition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
