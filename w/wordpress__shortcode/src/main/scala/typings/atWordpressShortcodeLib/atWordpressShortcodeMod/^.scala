package typings
package atWordpressShortcodeLib.atWordpressShortcodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/shortcode", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def fromMatch(`match`: stdLib.RegExpMatchArray): Shortcode = js.native
  def next(tag: java.lang.String, text: java.lang.String): js.UndefOr[ShortcodeMatch] = js.native
  def next(tag: java.lang.String, text: java.lang.String, index: scala.Double): js.UndefOr[ShortcodeMatch] = js.native
  def regexp(tag: java.lang.String): stdLib.RegExp = js.native
  def replace(
    tag: java.lang.String,
    text: java.lang.String,
    callback: js.Function1[/* shortcode */ Shortcode, java.lang.String]
  ): java.lang.String = js.native
  def string(options: ShortcodeOptions): java.lang.String = js.native
}

