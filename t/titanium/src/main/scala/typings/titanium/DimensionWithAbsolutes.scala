package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An extension of <Dimension> where Android returns additional absolute X/Y values/properties for <Titanium.UI.View.rect>
  */
@js.native
trait DimensionWithAbsolutes extends Dimension {
  /**
    * The x-axis coordinate of the position relative to the main window.
    */
  var absoluteX: js.UndefOr[Double] = js.native
  /**
    * The y-axis coordinate of the position relative to the main window.
    */
  var absoluteY: js.UndefOr[Double] = js.native
}

object DimensionWithAbsolutes {
  @scala.inline
  def apply(): DimensionWithAbsolutes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DimensionWithAbsolutes]
  }
  @scala.inline
  implicit class DimensionWithAbsolutesOps[Self <: DimensionWithAbsolutes] (val x: Self) extends AnyVal {
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
    def setAbsoluteX(value: Double): Self = this.set("absoluteX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbsoluteX: Self = this.set("absoluteX", js.undefined)
    @scala.inline
    def setAbsoluteY(value: Double): Self = this.set("absoluteY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbsoluteY: Self = this.set("absoluteY", js.undefined)
  }
  
}

