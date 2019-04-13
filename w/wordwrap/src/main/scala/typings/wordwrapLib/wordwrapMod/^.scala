package typings
package wordwrapLib.wordwrapMod

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
  def apply(params: Options): wordwrapLib.Wrap = js.native
  /**
    * Pad out lines with spaces out to column `start` and then wrap until column
    * `stop`. If a word is longer than `stop - start` characters it will overflow.
    */
  def apply(start: scala.Double, stop: scala.Double): wordwrapLib.Wrap = js.native
  def apply(start: scala.Double, stop: scala.Double, params: wordwrapLib.Anon_Mode): wordwrapLib.Wrap = js.native
  /**
    * Wrap lines until column `stop`. If a word is longer than `stop` characters
    * it will overflow.
    */
  def apply(stop: scala.Double): wordwrapLib.Wrap = js.native
  def apply(stop: scala.Double, params: wordwrapLib.Anon_Mode): wordwrapLib.Wrap = js.native
  /**
    * Wrap lines until column `stop`. Break up chunks longer than `stop - start`.
    */
  def hard(start: scala.Double, stop: scala.Double): wordwrapLib.Wrap = js.native
  /**
    * Wrap lines until column `stop`. Break up chunks longer than `stop`.
    */
  def hard(stop: scala.Double): wordwrapLib.Wrap = js.native
}

