package typings
package atWordpressNuxLib.storeSelectorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/nux/store/selectors", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def areTipsEnabled(): scala.Boolean = js.native
  def getAssociatedGuide(tipId: java.lang.String): js.UndefOr[GuideInfo] = js.native
  def isTipVisible(tipId: java.lang.String): scala.Boolean = js.native
}

