package typings.atWordpressNotices

import typings.atWordpressNotices.atWordpressNoticesMod.Notice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/notices/store/selectors", JSImport.Namespace)
@js.native
object storeSelectorsMod extends js.Object {
  def getNotices(): js.Array[Notice] = js.native
  def getNotices(context: String): js.Array[Notice] = js.native
}

