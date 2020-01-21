package typings.wordpressShortcode.mod

import typings.std.Partial
import typings.std.RegExp
import typings.std.RegExpMatchArray
import typings.wordpressShortcode.AnonClear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/shortcode", JSImport.Default)
@js.native
class default () extends shortcode {
  def this(options: Partial[ShortcodeOptions]) = this()
}

/* static members */
@JSImport("@wordpress/shortcode", JSImport.Default)
@js.native
object default extends js.Object {
  @JSName("attrs")
  var attrs_Original: AnonClear = js.native
  @JSName("fromMatch")
  var fromMatch_Original: js.Function1[/* match */ RegExpMatchArray, Shortcode_] = js.native
  @JSName("next")
  var next_Original: js.Function3[
    /* tag */ String, 
    /* text */ String, 
    /* index */ js.UndefOr[Double], 
    js.UndefOr[ShortcodeMatch]
  ] = js.native
  @JSName("regexp")
  var regexp_Original: js.Function1[/* tag */ String, RegExp] = js.native
  @JSName("replace")
  var replace_Original: js.Function3[
    /* tag */ String, 
    /* text */ String, 
    /* callback */ js.Function1[/* shortcode */ Shortcode_, String], 
    String
  ] = js.native
  // NOTE: this refers to the function, not `string` type. Bad naming choice.
  var string: String = js.native
  /**
    * Parse shortcode attributes.
    *
    * @remarks
    * Shortcodes accept many types of attributes. These can chiefly be divided into
    * named and numeric attributes:
    *
    * Named attributes are assigned on a key/value basis, while numeric attributes
    * are treated as an array.
    *
    * Named attributes can be formatted as either `name="value"`, `name='value'`,
    * or `name=value`. Numeric attributes can be formatted as `"value"` or just
    * `value`.
    *
    * @param text - Serialised shortcode attributes.
    *
    * @returns Parsed shortcode attributes.
    */
  def attrs(text: String): ShortcodeAttrs = js.native
  def fromMatch(`match`: RegExpMatchArray): Shortcode_ = js.native
  def next(tag: String, text: String): js.UndefOr[ShortcodeMatch] = js.native
  def next(tag: String, text: String, index: Double): js.UndefOr[ShortcodeMatch] = js.native
  def regexp(tag: String): RegExp = js.native
  def replace(tag: String, text: String, callback: js.Function1[/* shortcode */ Shortcode_, String]): String = js.native
}

