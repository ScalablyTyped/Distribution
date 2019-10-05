package typings.atWordpressNotices.atWordpressNoticesMod

import typings.atWordpressNotices.Typeofimported_actions
import typings.atWordpressNotices.Typeofimported_selectors
import typings.atWordpressNotices.atWordpressNoticesStrings.`core/notices`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("@wordpress/data", JSImport.Namespace)
@js.native
object atWordpressDataMod extends js.Object {
  @JSName("dispatch")
  def dispatch_corenotices(key: `core/notices`): Typeofimported_actions = js.native
  @JSName("select")
  def select_corenotices(key: `core/notices`): Typeofimported_selectors = js.native
}

