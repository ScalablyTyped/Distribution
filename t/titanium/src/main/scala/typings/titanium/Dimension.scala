package typings.titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A simple object consisting of the position and size measurements. Effectively combines <Size> and <Point> but ensures numeric x/y values.
  */
@js.native
trait Dimension extends Size {
  
  /**
    * The x-axis coordinate of the position. When returned by <Titanium.UI.View.rect> the position is relative to it's parent.
    */
  var x: js.UndefOr[Double] = js.native
  
  /**
    * The y-axis coordinate of the position. When returned by <Titanium.UI.View.rect> the position is relative to it's parent.
    */
  var y: js.UndefOr[Double] = js.native
}
object Dimension {
  
  @scala.inline
  def apply(): Dimension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dimension]
  }
  
  @scala.inline
  implicit class DimensionMutableBuilder[Self <: Dimension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
