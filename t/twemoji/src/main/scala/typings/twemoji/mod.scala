package typings.twemoji

import typings.std.HTMLElement
import typings.std.Partial
import typings.twemoji.twemojiBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twemoji", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait ParseObject extends js.Object {
    /**
      * default: MaxCDN
      */
    var base: String = js.native
    /**
      * the callback to invoke per each found emoji.
      *
      * default: the common replacer
      */
    @JSName("callback")
    var callback_Original: ParseCallback = js.native
    /**
      * default: "emoji"
      */
    var className: String = js.native
    /**
      * default: ".png"
      */
    var ext: String = js.native
    /**
      * in case it's specified it replaces .size info, if any
      */
    var folder: String = js.native
    /**
      * default: "72x72"
      */
    var size: String | Double = js.native
    /**
      * The function to invoke in order to generate additional, custom attributes for the image tag.
      *
      * @param the lower case HEX code point i.e. "1f4a9"
      * @param variant the optional \\uFE0F ("as image") variant, in case this info is anyhow meaningful. By default this is ignored.
      */
    def attributes(icon: String, variant: String): js.Object = js.native
    /**
      * the callback to invoke per each found emoji.
      *
      * default: the common replacer
      */
    def callback(icon: String, options: js.Object, variant: String): String | `false` = js.native
  }
  
  val base: String = js.native
  val className: String = js.native
  val ext: String = js.native
  val size: String = js.native
  def onerror(): Unit = js.native
  def parse(what: String): String = js.native
  def parse(what: String, how: Partial[ParseObject]): String = js.native
  def parse(what: String, how: ParseCallback): String = js.native
  def parse(what: HTMLElement): String = js.native
  def parse(what: HTMLElement, how: Partial[ParseObject]): String = js.native
  def parse(what: HTMLElement, how: ParseCallback): String = js.native
  def replace(text: String, callback: js.Function0[Unit]): String = js.native
  def test(text: String): Boolean = js.native
  @js.native
  object convert extends js.Object {
    /**
      * Given an HEX codepoint, returns UTF16 surrogate pairs.
      *
      * @param   codepoint string  generic codepoint, i.e. '1F4A9'
      * @return  string  codepoint transformed into utf16 surrogates pair,
      *          i.e. \\uD83D\\uDCA9
      *
      * @example
      *  twemoji.convert.fromCodePoint('1f1e8');
      *  // "\\ud83c\\udde8"
      *
      *  '1f1e8-1f1f3'.split('-').map(twemoji.convert.fromCodePoint).join('')
      *  // "\\ud83c\\udde8\\ud83c\\uddf3"
      */
    def fromCodePoint(codepoint: String): String = js.native
    /**
      * Given UTF16 surrogate pairs, returns the equivalent HEX codepoint.
      *
      * @param   unicodeSurrogates   string  generic utf16 surrogates pair, i.e. \\uD83D\\uDCA9
      * @param   sep                 string  optional separator for double code points, default='-'
      * @return  string  utf16 transformed into codepoint, i.e. '1F4A9'
      *
      * @example
      *  twemoji.convert.toCodePoint('\\ud83c\\udde8\\ud83c\\uddf3');
      *  // "1f1e8-1f1f3"
      *
      *  twemoji.convert.toCodePoint('\\ud83c\\udde8\\ud83c\\uddf3', '~');
      *  // "1f1e8~1f1f3"
      */
    def toCodePoint(unicodeSurrogates: String): String = js.native
    def toCodePoint(unicodeSurrogates: String, sep: String): String = js.native
  }
  
  type ParseCallback = js.Function3[/* icon */ String, /* options */ js.Object, /* variant */ String, String | `false`]
}

