package typings.atStyledDashSystemCss

import typings.csstype.csstypeMod.BottomProperty
import typings.csstype.csstypeMod.LeftProperty
import typings.csstype.csstypeMod.RightProperty
import typings.csstype.csstypeMod.TopProperty
import typings.csstype.csstypeMod.ZIndexProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bottom extends js.Object {
  var bottom: BottomProperty[Double]
  var left: LeftProperty[Double]
  var right: RightProperty[Double]
  var top: TopProperty[Double]
  var zIndex: ZIndexProperty | String
}

object Anon_Bottom {
  @scala.inline
  def apply(
    bottom: BottomProperty[Double],
    left: LeftProperty[Double],
    right: RightProperty[Double],
    top: TopProperty[Double],
    zIndex: ZIndexProperty | String
  ): Anon_Bottom = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Bottom]
  }
}

