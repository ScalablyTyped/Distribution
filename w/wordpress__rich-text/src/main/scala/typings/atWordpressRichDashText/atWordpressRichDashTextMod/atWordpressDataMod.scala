package typings.atWordpressRichDashText.atWordpressRichDashTextMod

import typings.atWordpressRichDashText.Typeofimported_actions
import typings.atWordpressRichDashText.Typeofimported_selectors
import typings.atWordpressRichDashText.atWordpressRichDashTextStrings.`core/rich-text`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("@wordpress/data", JSImport.Namespace)
@js.native
object atWordpressDataMod extends js.Object {
  @JSName("dispatch")
  def dispatch_corerichtext(key: `core/rich-text`): Typeofimported_actions = js.native
  @JSName("select")
  def select_corerichtext(key: `core/rich-text`): Typeofimported_selectors = js.native
}

