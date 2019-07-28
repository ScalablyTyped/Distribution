package typings.wordwrap.wordwrapMod

import typings.wordwrap.Anon_Mode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wordwrap", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Pad out lines with spaces out to column `start` and then wrap until column
    * `stop`. If a word is longer than `stop - start` characters it will overflow.
    */
  def apply(params: Options): Wrap = js.native
  /**
    * Pad out lines with spaces out to column `start` and then wrap until column
    * `stop`. If a word is longer than `stop - start` characters it will overflow.
    */
  def apply(start: Double, stop: Double): Wrap = js.native
  def apply(start: Double, stop: Double, params: Anon_Mode): Wrap = js.native
  /**
    * Wrap lines until column `stop`. If a word is longer than `stop` characters
    * it will overflow.
    */
  def apply(stop: Double): Wrap = js.native
  def apply(stop: Double, params: Anon_Mode): Wrap = js.native
  /**
    * Wrap lines until column `stop`. Break up chunks longer than `stop - start`.
    */
  def hard(start: Double, stop: Double): Wrap = js.native
  /**
    * Wrap lines until column `stop`. Break up chunks longer than `stop`.
    */
  def hard(stop: Double): Wrap = js.native
}

