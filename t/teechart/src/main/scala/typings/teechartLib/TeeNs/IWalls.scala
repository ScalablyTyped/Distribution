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
    val __obj = js.Dynamic.literal(back = back, bottom = bottom, left = left, right = right, visible = visible)
  
    __obj.asInstanceOf[IWalls]
  }
}

