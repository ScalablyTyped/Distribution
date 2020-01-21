package typings.wordwrap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wordwrap", "hard")
@js.native
object hard extends js.Object {
  /**
    * Wrap lines until column `stop`. Break up chunks longer than `stop - start`.
    */
  def apply(start: Double, stop: Double): Wrap = js.native
  /**
    * Wrap lines until column `stop`. Break up chunks longer than `stop`.
    */
  def apply(stop: Double): Wrap = js.native
}

