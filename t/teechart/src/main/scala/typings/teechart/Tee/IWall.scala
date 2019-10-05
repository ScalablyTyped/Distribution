package typings.teechart.Tee

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWall extends js.Object {
  var bounds: IRectangle
  var format: IFormat
  var visible: Boolean
}

object IWall {
  @scala.inline
  def apply(bounds: IRectangle, format: IFormat, visible: Boolean): IWall = {
    val __obj = js.Dynamic.literal(bounds = bounds, format = format, visible = visible)
  
    __obj.asInstanceOf[IWall]
  }
}

