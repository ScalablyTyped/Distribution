package typings.atWordpressNux.storeSelectorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/nux/store/selectors", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def areTipsEnabled(): Boolean = js.native
  def getAssociatedGuide(tipId: String): js.UndefOr[GuideInfo] = js.native
  def isTipVisible(tipId: String): Boolean = js.native
}

