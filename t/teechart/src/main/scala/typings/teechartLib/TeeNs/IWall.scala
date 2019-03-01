package typings
package teechartLib.TeeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWall extends js.Object {
  var bounds: IRectangle
  var format: IFormat
  var visible: scala.Boolean
}

object IWall {
  @scala.inline
  def apply(bounds: IRectangle, format: IFormat, visible: scala.Boolean): IWall = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bounds")(bounds)
    __obj.updateDynamic("format")(format)
    __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[IWall]
  }
}

