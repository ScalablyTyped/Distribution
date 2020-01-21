package typings.wepy.wxEnhancedMod

import typings.wepy.AnonAnimationEnd
import typings.wepy.AnonComplete
import typings.wepy.AnonNortheast
import typings.wepy.AnonPadding
import typings.wepy.AnonScale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapContext extends js.Object {
  @JSName("getCenterLocation")
  var getCenterLocation_Original: CallbackFunction[LagLng] = js.native
  @JSName("getRegion")
  var getRegion_Original: CallbackFunction[AnonNortheast] = js.native
  @JSName("getScale")
  var getScale_Original: CallbackFunction[AnonScale] = js.native
  def getCenterLocation(callbacks: AnonComplete[LagLng]): Unit = js.native
  def getRegion(callbacks: AnonComplete[AnonNortheast]): Unit = js.native
  def getScale(callbacks: AnonComplete[AnonScale]): Unit = js.native
  def includePoints(params: AnonPadding): Unit = js.native
  def moveToLocation(): Unit = js.native
  def translateMarker(params: AnonAnimationEnd): Unit = js.native
}

