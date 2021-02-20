package typings.titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Simple object passed to <Titanium.UI.createMatrix2D> to initialize a matrix.
  */
@js.native
trait Matrix2DCreationDict extends StObject {
  
  /**
    * Point to rotate around, specified as a dictionary object with `x` and `y`
    * properties, where { x: 0.5, y: 0.5 } represents the center of whatever is being
    * rotated.
    */
  var anchorPoint: js.UndefOr[Point] = js.native
  
  /**
    * Rotation angle, in degrees. See the [rotate](Titanium.UI.Matrix2D.rotate) method
    * for a discussion of rotation.
    */
  var rotate: js.UndefOr[Double] = js.native
  
  /**
    * Scale the matrix by the specified scaling factor. The same scaling factor is used
    * for both horizontal and vertical scaling.
    */
  var scale: js.UndefOr[Double] = js.native
}
object Matrix2DCreationDict {
  
  @scala.inline
  def apply(): Matrix2DCreationDict = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Matrix2DCreationDict]
  }
  
  @scala.inline
  implicit class Matrix2DCreationDictMutableBuilder[Self <: Matrix2DCreationDict] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnchorPoint(value: Point): Self = StObject.set(x, "anchorPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorPointUndefined: Self = StObject.set(x, "anchorPoint", js.undefined)
    
    @scala.inline
    def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
  }
}
