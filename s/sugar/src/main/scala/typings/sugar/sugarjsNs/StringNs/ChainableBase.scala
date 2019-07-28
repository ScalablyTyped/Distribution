package typings.sugar.sugarjsNs.StringNs

import typings.std.IntlNs.CollatorOptions
import typings.std.RegExp
import typings.std.RegExpMatchArray
import typings.sugar.sugarStrings.NFC
import typings.sugar.sugarStrings.NFD
import typings.sugar.sugarStrings.NFKC
import typings.sugar.sugarStrings.NFKD
import typings.sugar.sugarjsNs.SugarDefaultChainable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChainableBase[RawValue] extends js.Object {
  var raw: RawValue = js.native
  def anchor(name: String): SugarDefaultChainable[String] = js.native
  def at[T](index: js.Array[Double]): SugarDefaultChainable[T] = js.native
  def at[T](index: js.Array[Double], loop: Boolean): SugarDefaultChainable[T] = js.native
  def at[T](index: Double): SugarDefaultChainable[T] = js.native
  def at[T](index: Double, loop: Boolean): SugarDefaultChainable[T] = js.native
  def big(): SugarDefaultChainable[String] = js.native
  def blink(): SugarDefaultChainable[String] = js.native
  def bold(): SugarDefaultChainable[String] = js.native
  def camelize(): SugarDefaultChainable[String] = js.native
  def camelize(upper: Boolean): SugarDefaultChainable[String] = js.native
  def capitalize(): SugarDefaultChainable[String] = js.native
  def capitalize(lower: Boolean): SugarDefaultChainable[String] = js.native
  def capitalize(lower: Boolean, all: Boolean): SugarDefaultChainable[String] = js.native
  def charAt(pos: Double): SugarDefaultChainable[String] = js.native
  def charCodeAt(index: Double): SugarDefaultChainable[Double] = js.native
  def chars[T](): SugarDefaultChainable[js.Array[T]] = js.native
  def chars[T](
    eachCharFn: js.Function3[
      /* char */ String, 
      /* i */ Double, 
      /* arr */ js.Array[String], 
      SugarDefaultChainable[Unit]
    ]
  ): SugarDefaultChainable[js.Array[T]] = js.native
  def codePointAt(pos: Double): SugarDefaultChainable[js.UndefOr[Double]] = js.native
  def codes[T](): SugarDefaultChainable[js.Array[T]] = js.native
  def codes[T](
    eachCodeFn: js.Function3[/* code */ Double, /* i */ Double, /* str */ String, SugarDefaultChainable[Unit]]
  ): SugarDefaultChainable[js.Array[T]] = js.native
  def compact(): SugarDefaultChainable[String] = js.native
  def concat(strings: String*): SugarDefaultChainable[String] = js.native
  def dasherize(): SugarDefaultChainable[String] = js.native
  def decodeBase64(): SugarDefaultChainable[String] = js.native
  def encodeBase64(): SugarDefaultChainable[String] = js.native
  def endsWith(searchString: String): SugarDefaultChainable[Boolean] = js.native
  def endsWith(searchString: String, endPosition: Double): SugarDefaultChainable[Boolean] = js.native
  def escapeHTML(): SugarDefaultChainable[String] = js.native
  def escapeURL(): SugarDefaultChainable[String] = js.native
  def escapeURL(param: Boolean): SugarDefaultChainable[String] = js.native
  def first(): SugarDefaultChainable[String] = js.native
  def first(n: Double): SugarDefaultChainable[String] = js.native
  def fixed(): SugarDefaultChainable[String] = js.native
  def fontcolor(color: String): SugarDefaultChainable[String] = js.native
  def fontsize(size: String): SugarDefaultChainable[String] = js.native
  def fontsize(size: Double): SugarDefaultChainable[String] = js.native
  def forEach[T](): SugarDefaultChainable[js.Array[T]] = js.native
  def forEach[T](
    eachFn: js.Function3[
      /* match */ String, 
      /* i */ Double, 
      /* arr */ js.Array[String], 
      SugarDefaultChainable[Unit]
    ]
  ): SugarDefaultChainable[js.Array[T]] = js.native
  def forEach[T](search: String): SugarDefaultChainable[js.Array[T]] = js.native
  def forEach[T](
    search: String,
    eachFn: js.Function3[
      /* match */ String, 
      /* i */ Double, 
      /* arr */ js.Array[String], 
      SugarDefaultChainable[Unit]
    ]
  ): SugarDefaultChainable[js.Array[T]] = js.native
  def forEach[T](search: RegExp): SugarDefaultChainable[js.Array[T]] = js.native
  def forEach[T](
    search: RegExp,
    eachFn: js.Function3[
      /* match */ String, 
      /* i */ Double, 
      /* arr */ js.Array[String], 
      SugarDefaultChainable[Unit]
    ]
  ): SugarDefaultChainable[js.Array[T]] = js.native
  def format(args: js.Any*): SugarDefaultChainable[String] = js.native
  def from(): SugarDefaultChainable[String] = js.native
  def from(index: Double): SugarDefaultChainable[String] = js.native
  def hankaku(): SugarDefaultChainable[String] = js.native
  def hankaku(mode: String): SugarDefaultChainable[String] = js.native
  def hasArabic(): SugarDefaultChainable[Boolean] = js.native
  def hasCyrillic(): SugarDefaultChainable[Boolean] = js.native
  def hasDevanagari(): SugarDefaultChainable[Boolean] = js.native
  def hasGreek(): SugarDefaultChainable[Boolean] = js.native
  def hasHan(): SugarDefaultChainable[Boolean] = js.native
  def hasHangul(): SugarDefaultChainable[Boolean] = js.native
  def hasHebrew(): SugarDefaultChainable[Boolean] = js.native
  def hasHiragana(): SugarDefaultChainable[Boolean] = js.native
  def hasKana(): SugarDefaultChainable[Boolean] = js.native
  def hasKanji(): SugarDefaultChainable[Boolean] = js.native
  def hasKatakana(): SugarDefaultChainable[Boolean] = js.native
  def hasLatin(): SugarDefaultChainable[Boolean] = js.native
  def hasThai(): SugarDefaultChainable[Boolean] = js.native
  def hiragana(): SugarDefaultChainable[String] = js.native
  def hiragana(all: Boolean): SugarDefaultChainable[String] = js.native
  def humanize(): SugarDefaultChainable[String] = js.native
  def includes(searchString: String): SugarDefaultChainable[Boolean] = js.native
  def includes(searchString: String, position: Double): SugarDefaultChainable[Boolean] = js.native
  def indexOf(searchString: String): SugarDefaultChainable[Double] = js.native
  def indexOf(searchString: String, position: Double): SugarDefaultChainable[Double] = js.native
  def insert(str: String): SugarDefaultChainable[String] = js.native
  def insert(str: String, index: Double): SugarDefaultChainable[String] = js.native
  def isArabic(): SugarDefaultChainable[Boolean] = js.native
  def isBlank(): SugarDefaultChainable[Boolean] = js.native
  def isCyrillic(): SugarDefaultChainable[Boolean] = js.native
  def isDevanagari(): SugarDefaultChainable[Boolean] = js.native
  def isEmpty(): SugarDefaultChainable[Boolean] = js.native
  def isGreek(): SugarDefaultChainable[Boolean] = js.native
  def isHan(): SugarDefaultChainable[Boolean] = js.native
  def isHangul(): SugarDefaultChainable[Boolean] = js.native
  def isHebrew(): SugarDefaultChainable[Boolean] = js.native
  def isHiragana(): SugarDefaultChainable[Boolean] = js.native
  def isKana(): SugarDefaultChainable[Boolean] = js.native
  def isKanji(): SugarDefaultChainable[Boolean] = js.native
  def isKatakana(): SugarDefaultChainable[Boolean] = js.native
  def isLatin(): SugarDefaultChainable[Boolean] = js.native
  def isThai(): SugarDefaultChainable[Boolean] = js.native
  def italics(): SugarDefaultChainable[String] = js.native
  def katakana(): SugarDefaultChainable[String] = js.native
  def last(): SugarDefaultChainable[String] = js.native
  def last(n: Double): SugarDefaultChainable[String] = js.native
  def lastIndexOf(searchString: String): SugarDefaultChainable[Double] = js.native
  def lastIndexOf(searchString: String, position: Double): SugarDefaultChainable[Double] = js.native
  def lines[T](): SugarDefaultChainable[js.Array[T]] = js.native
  def lines[T](
    eachLineFn: js.Function3[
      /* line */ String, 
      /* i */ Double, 
      /* arr */ js.Array[String], 
      SugarDefaultChainable[Unit]
    ]
  ): SugarDefaultChainable[js.Array[T]] = js.native
  def link(url: String): SugarDefaultChainable[String] = js.native
  def localeCompare(that: String): SugarDefaultChainable[Double] = js.native
  def localeCompare(that: String, locales: String): SugarDefaultChainable[Double] = js.native
  def localeCompare(that: String, locales: String, options: CollatorOptions): SugarDefaultChainable[Double] = js.native
  def localeCompare(that: String, locales: js.Array[String]): SugarDefaultChainable[Double] = js.native
  def localeCompare(that: String, locales: js.Array[String], options: CollatorOptions): SugarDefaultChainable[Double] = js.native
  def `match`(regexp: String): SugarDefaultChainable[RegExpMatchArray | Null] = js.native
  def `match`(regexp: RegExp): SugarDefaultChainable[RegExpMatchArray | Null] = js.native
  def normalize(): SugarDefaultChainable[String] = js.native
  def normalize(form: String): SugarDefaultChainable[String] = js.native
  @JSName("normalize")
  def normalize_NFC(form: NFC): SugarDefaultChainable[String] = js.native
  @JSName("normalize")
  def normalize_NFD(form: NFD): SugarDefaultChainable[String] = js.native
  @JSName("normalize")
  def normalize_NFKC(form: NFKC): SugarDefaultChainable[String] = js.native
  @JSName("normalize")
  def normalize_NFKD(form: NFKD): SugarDefaultChainable[String] = js.native
  def pad(num: Double): SugarDefaultChainable[String] = js.native
  def pad(num: Double, padding: String): SugarDefaultChainable[String] = js.native
  def padLeft(num: Double): SugarDefaultChainable[String] = js.native
  def padLeft(num: Double, padding: String): SugarDefaultChainable[String] = js.native
  def padRight(num: Double): SugarDefaultChainable[String] = js.native
  def padRight(num: Double, padding: String): SugarDefaultChainable[String] = js.native
  def parameterize(): SugarDefaultChainable[String] = js.native
  def pluralize(): SugarDefaultChainable[String] = js.native
  def pluralize(num: Double): SugarDefaultChainable[String] = js.native
  def remove(f: String): SugarDefaultChainable[String] = js.native
  def remove(f: RegExp): SugarDefaultChainable[String] = js.native
  def removeAll(f: String): SugarDefaultChainable[String] = js.native
  def removeAll(f: RegExp): SugarDefaultChainable[String] = js.native
  def removeTags(): SugarDefaultChainable[String] = js.native
  def removeTags(tag: String): SugarDefaultChainable[String] = js.native
  def removeTags(tag: String, replace: String): SugarDefaultChainable[String] = js.native
  def removeTags(tag: String, replace: replaceFn): SugarDefaultChainable[String] = js.native
  def repeat(count: Double): SugarDefaultChainable[String] = js.native
  def replace(searchValue: String, replaceValue: String): SugarDefaultChainable[String] = js.native
  def replace(searchValue: String, replacer: js.Function2[/* substring */ String, /* repeated */ js.Any, String]): SugarDefaultChainable[String] = js.native
  def replace(searchValue: RegExp, replaceValue: String): SugarDefaultChainable[String] = js.native
  def replace(searchValue: RegExp, replacer: js.Function2[/* substring */ String, /* repeated */ js.Any, String]): SugarDefaultChainable[String] = js.native
  def replaceAll(f: String, args: js.Any*): SugarDefaultChainable[String] = js.native
  def replaceAll(f: RegExp, args: js.Any*): SugarDefaultChainable[String] = js.native
  def reverse(): SugarDefaultChainable[String] = js.native
  def search(regexp: String): SugarDefaultChainable[Double] = js.native
  def search(regexp: RegExp): SugarDefaultChainable[Double] = js.native
  def shift[T](n: Double): SugarDefaultChainable[js.Array[T]] = js.native
  def singularize(): SugarDefaultChainable[String] = js.native
  def slice(): SugarDefaultChainable[String] = js.native
  def slice(start: Double): SugarDefaultChainable[String] = js.native
  def slice(start: Double, end: Double): SugarDefaultChainable[String] = js.native
  def small(): SugarDefaultChainable[String] = js.native
  def spacify(): SugarDefaultChainable[String] = js.native
  def split(separator: String): SugarDefaultChainable[js.Array[String]] = js.native
  def split(separator: String, limit: Double): SugarDefaultChainable[js.Array[String]] = js.native
  def split(separator: RegExp): SugarDefaultChainable[js.Array[String]] = js.native
  def split(separator: RegExp, limit: Double): SugarDefaultChainable[js.Array[String]] = js.native
  def startsWith(searchString: String): SugarDefaultChainable[Boolean] = js.native
  def startsWith(searchString: String, position: Double): SugarDefaultChainable[Boolean] = js.native
  def strike(): SugarDefaultChainable[String] = js.native
  def stripTags(): SugarDefaultChainable[String] = js.native
  def stripTags(tag: String): SugarDefaultChainable[String] = js.native
  def stripTags(tag: String, replace: String): SugarDefaultChainable[String] = js.native
  def stripTags(tag: String, replace: replaceFn): SugarDefaultChainable[String] = js.native
  def sub(): SugarDefaultChainable[String] = js.native
  def substr(from: Double): SugarDefaultChainable[String] = js.native
  def substr(from: Double, length: Double): SugarDefaultChainable[String] = js.native
  def substring(start: Double): SugarDefaultChainable[String] = js.native
  def substring(start: Double, end: Double): SugarDefaultChainable[String] = js.native
  def sup(): SugarDefaultChainable[String] = js.native
  def titleize(): SugarDefaultChainable[String] = js.native
  def to(): SugarDefaultChainable[String] = js.native
  def to(index: Double): SugarDefaultChainable[String] = js.native
  def toLocaleLowerCase(): SugarDefaultChainable[String] = js.native
  def toLocaleUpperCase(): SugarDefaultChainable[String] = js.native
  def toLowerCase(): SugarDefaultChainable[String] = js.native
  def toNumber(): SugarDefaultChainable[Double] = js.native
  def toNumber(base: Double): SugarDefaultChainable[Double] = js.native
  def toUpperCase(): SugarDefaultChainable[String] = js.native
  def trim(): SugarDefaultChainable[String] = js.native
  def trimLeft(): SugarDefaultChainable[String] = js.native
  def trimRight(): SugarDefaultChainable[String] = js.native
  def truncate(length: Double): SugarDefaultChainable[String] = js.native
  def truncate(length: Double, from: String): SugarDefaultChainable[String] = js.native
  def truncate(length: Double, from: String, ellipsis: String): SugarDefaultChainable[String] = js.native
  def truncateOnWord(length: Double): SugarDefaultChainable[String] = js.native
  def truncateOnWord(length: Double, from: String): SugarDefaultChainable[String] = js.native
  def truncateOnWord(length: Double, from: String, ellipsis: String): SugarDefaultChainable[String] = js.native
  def underscore(): SugarDefaultChainable[String] = js.native
  def unescapeHTML(): SugarDefaultChainable[String] = js.native
  def unescapeURL(): SugarDefaultChainable[String] = js.native
  def unescapeURL(partial: Boolean): SugarDefaultChainable[String] = js.native
  def words[T](): SugarDefaultChainable[js.Array[T]] = js.native
  def words[T](
    eachWordFn: js.Function3[
      /* word */ String, 
      /* i */ Double, 
      /* arr */ js.Array[String], 
      SugarDefaultChainable[Unit]
    ]
  ): SugarDefaultChainable[js.Array[T]] = js.native
  def zenkaku(): SugarDefaultChainable[String] = js.native
  def zenkaku(mode: String): SugarDefaultChainable[String] = js.native
}

