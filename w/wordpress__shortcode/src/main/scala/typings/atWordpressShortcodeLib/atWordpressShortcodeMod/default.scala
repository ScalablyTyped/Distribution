package typings
package atWordpressShortcodeLib.atWordpressShortcodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/shortcode", JSImport.Default)
@js.native
class default () extends shortcode {
  def this(options: stdLib.Partial[ShortcodeOptions]) = this()
}

/* static members */
@JSImport("@wordpress/shortcode", JSImport.Default)
@js.native
object default extends js.Object {
  @JSName("attrs")
  var attrs_Original: atWordpressShortcodeLib.Anon_Clear = js.native
  @JSName("fromMatch")
  var fromMatch_Original: js.Function1[
    /* match */ stdLib.RegExpMatchArray, 
    atWordpressShortcodeLib.atWordpressShortcodeMod.Shortcode
  ] = js.native
  @JSName("next")
  var next_Original: js.Function3[
    /* tag */ java.lang.String, 
    /* text */ java.lang.String, 
    /* index */ js.UndefOr[scala.Double], 
    js.UndefOr[atWordpressShortcodeLib.atWordpressShortcodeMod.ShortcodeMatch]
  ] = js.native
  @JSName("regexp")
  var regexp_Original: js.Function1[/* tag */ java.lang.String, stdLib.RegExp] = js.native
  @JSName("replace")
  var replace_Original: js.Function3[
    /* tag */ java.lang.String, 
    /* text */ java.lang.String, 
    /* callback */ js.Function1[
      /* shortcode */ atWordpressShortcodeLib.atWordpressShortcodeMod.Shortcode, 
      java.lang.String
    ], 
    java.lang.String
  ] = js.native
  // NOTE: this refers to the function, not `string` type. Bad naming choice.
  var string: java.lang.String = js.native
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
  def attrs(text: java.lang.String): atWordpressShortcodeLib.atWordpressShortcodeMod.ShortcodeAttrs = js.native
  def fromMatch(`match`: stdLib.RegExpMatchArray): atWordpressShortcodeLib.atWordpressShortcodeMod.Shortcode = js.native
  def next(tag: java.lang.String, text: java.lang.String): js.UndefOr[atWordpressShortcodeLib.atWordpressShortcodeMod.ShortcodeMatch] = js.native
  def next(tag: java.lang.String, text: java.lang.String, index: scala.Double): js.UndefOr[atWordpressShortcodeLib.atWordpressShortcodeMod.ShortcodeMatch] = js.native
  def regexp(tag: java.lang.String): stdLib.RegExp = js.native
  def replace(
    tag: java.lang.String,
    text: java.lang.String,
    callback: js.Function1[
      /* shortcode */ atWordpressShortcodeLib.atWordpressShortcodeMod.Shortcode, 
      java.lang.String
    ]
  ): java.lang.String = js.native
}

