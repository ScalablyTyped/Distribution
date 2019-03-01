package typings
package teechartLib.TeeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWalls extends js.Object {
  var back: IWall
  var bottom: IWall
  var left: IWall
  var right: IWall
  var visible: scala.Boolean
}

object IWalls {
  @scala.inline
  def apply(back: IWall, bottom: IWall, left: IWall, right: IWall, visible: scala.Boolean): IWalls = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("back")(back)
    __obj.updateDynamic("bottom")(bottom)
    __obj.updateDynamic("left")(left)
    __obj.updateDynamic("right")(right)
    __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[IWalls]
  }
}

