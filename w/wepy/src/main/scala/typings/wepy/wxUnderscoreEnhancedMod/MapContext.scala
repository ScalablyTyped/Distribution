package typings.wepy.wxUnderscoreEnhancedMod

import typings.wepy.Anon_AnimationEnd
import typings.wepy.Anon_Complete
import typings.wepy.Anon_Northeast
import typings.wepy.Anon_Padding
import typings.wepy.Anon_Scale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapContext extends js.Object {
  @JSName("getCenterLocation")
  var getCenterLocation_Original: CallbackFunction[LagLng] = js.native
  @JSName("getRegion")
  var getRegion_Original: CallbackFunction[Anon_Northeast] = js.native
  @JSName("getScale")
  var getScale_Original: CallbackFunction[Anon_Scale] = js.native
  def getCenterLocation(callbacks: Anon_Complete[LagLng]): Unit = js.native
  def getRegion(callbacks: Anon_Complete[Anon_Northeast]): Unit = js.native
  def getScale(callbacks: Anon_Complete[Anon_Scale]): Unit = js.native
  def includePoints(params: Anon_Padding): Unit = js.native
  def moveToLocation(): Unit = js.native
  def translateMarker(params: Anon_AnimationEnd): Unit = js.native
}

