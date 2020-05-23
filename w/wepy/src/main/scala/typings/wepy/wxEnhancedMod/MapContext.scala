package typings.wepy.wxEnhancedMod

import typings.wepy.anon.AnimationEnd
import typings.wepy.anon.Complete
import typings.wepy.anon.Northeast
import typings.wepy.anon.Padding
import typings.wepy.anon.Scale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapContext extends js.Object {
  @JSName("getCenterLocation")
  var getCenterLocation_Original: CallbackFunction[LagLng] = js.native
  @JSName("getRegion")
  var getRegion_Original: CallbackFunction[Northeast] = js.native
  @JSName("getScale")
  var getScale_Original: CallbackFunction[Scale] = js.native
  def getCenterLocation(callbacks: Complete[LagLng]): Unit = js.native
  def getRegion(callbacks: Complete[Northeast]): Unit = js.native
  def getScale(callbacks: Complete[Scale]): Unit = js.native
  def includePoints(params: Padding): Unit = js.native
  def moveToLocation(): Unit = js.native
  def translateMarker(params: AnimationEnd): Unit = js.native
}

