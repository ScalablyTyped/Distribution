package typings.atWordpressShortcode.atWordpressShortcodeMod

import typings.std.RegExp
import typings.std.RegExpMatchArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/shortcode", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def fromMatch(`match`: RegExpMatchArray): Shortcode = js.native
  def next(tag: String, text: String): js.UndefOr[ShortcodeMatch] = js.native
  def next(tag: String, text: String, index: Double): js.UndefOr[ShortcodeMatch] = js.native
  def regexp(tag: String): RegExp = js.native
  def replace(tag: String, text: String, callback: js.Function1[/* shortcode */ Shortcode, String]): String = js.native
  def string(options: ShortcodeOptions): String = js.native
}

