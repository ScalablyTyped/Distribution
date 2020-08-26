package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simple object passed to <Titanium.UI.createMatrix2D> to initialize a matrix.
  */
@js.native
trait Matrix2DCreationDict extends js.Object {
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
  implicit class Matrix2DCreationDictOps[Self <: Matrix2DCreationDict] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAnchorPoint(value: Point): Self = this.set("anchorPoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnchorPoint: Self = this.set("anchorPoint", js.undefined)
    @scala.inline
    def setRotate(value: Double): Self = this.set("rotate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotate: Self = this.set("rotate", js.undefined)
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
  }
  
}

