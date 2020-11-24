package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Simple object passed to <Titanium.UI.createMatrix3D> to initialize a matrix.
  */
@js.native
trait Matrix3DCreationDict extends js.Object {
  
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
  implicit class Matrix3DCreationDictOps[Self <: Matrix3DCreationDict] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
  }
}
