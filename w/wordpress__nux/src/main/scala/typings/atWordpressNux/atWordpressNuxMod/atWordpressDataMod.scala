package typings.atWordpressNux.atWordpressNuxMod

import typings.atWordpressNux.Typeofimported_actions
import typings.atWordpressNux.Typeofimported_selectors
import typings.atWordpressNux.atWordpressNuxStrings.`core/nux`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/nux", "@wordpress/data")
@js.native
object atWordpressDataMod extends js.Object {
  @JSName("dispatch")
  def dispatch_corenux(key: `core/nux`): Typeofimported_actions = js.native
  @JSName("select")
  def select_corenux(key: `core/nux`): Typeofimported_selectors = js.native
}

