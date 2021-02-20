package typings.titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Simple object passed to <Titanium.UI.createMatrix3D> to initialize a matrix.
  */
@js.native
trait Matrix3DCreationDict extends StObject {
  
  /**
    * Scale the matrix by the specified scaling factor.
    */
  var scale: js.UndefOr[Double] = js.native
}
object Matrix3DCreationDict {
  
  @scala.inline
  def apply(): Matrix3DCreationDict = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Matrix3DCreationDict]
  }
  
  @scala.inline
  implicit class Matrix3DCreationDictMutableBuilder[Self <: Matrix3DCreationDict] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
  }
}
