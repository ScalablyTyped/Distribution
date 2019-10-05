package typings.atWordpressCoreDashData.atWordpressCoreDashDataMod

import typings.atWordpressCoreDashData.Typeofimported_actions
import typings.atWordpressCoreDashData.Typeofimported_selectors
import typings.atWordpressCoreDashData.atWordpressCoreDashDataStrings.core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("@wordpress/data", JSImport.Namespace)
@js.native
object atWordpressDataMod extends js.Object {
  @JSName("dispatch")
  def dispatch_core(key: core): Typeofimported_actions = js.native
  @JSName("select")
  def select_core(key: core): Typeofimported_selectors = js.native
}

