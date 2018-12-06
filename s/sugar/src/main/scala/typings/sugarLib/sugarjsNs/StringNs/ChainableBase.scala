package typings
package sugarLib.sugarjsNs.StringNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChainableBase[RawValue] extends js.Object {
  var raw: RawValue = js.native
  def anchor(name: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def at[T](index: js.Array[scala.Double]): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def at[T](index: js.Array[scala.Double], loop: scala.Boolean): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def at[T](index: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def at[T](index: scala.Double, loop: scala.Boolean): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def big(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def blink(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def bold(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def camelize(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def camelize(upper: scala.Boolean): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def capitalize(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def capitalize(lower: scala.Boolean): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def capitalize(lower: scala.Boolean, all: scala.Boolean): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def charAt(pos: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def charCodeAt(index: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def chars[T](): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def chars[T](
    eachCharFn: js.Function3[
      /* char */ java.lang.String, 
      /* i */ scala.Double, 
      /* arr */ js.Array[java.lang.String], 
      sugarLib.sugarjsNs.SugarDefaultChainable[scala.Unit]
    ]
  ): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def codePointAt(pos: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[js.UndefOr[scala.Double]] = js.native
  def codes[T](): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def codes[T](
    eachCodeFn: js.Function3[
      /* code */ scala.Double, 
      /* i */ scala.Double, 
      /* str */ java.lang.String, 
      sugarLib.sugarjsNs.SugarDefaultChainable[scala.Unit]
    ]
  ): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def compact(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def concat(strings: java.lang.String*): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def dasherize(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def decodeBase64(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def encodeBase64(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def endsWith(searchString: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def endsWith(searchString: java.lang.String, endPosition: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def escapeHTML(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def escapeURL(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def escapeURL(param: scala.Boolean): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def first(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def first(n: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def fixed(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def fontcolor(color: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def fontsize(size: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def fontsize(size: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def forEach[T](): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def forEach[T](
    eachFn: js.Function3[
      /* match */ java.lang.String, 
      /* i */ scala.Double, 
      /* arr */ js.Array[java.lang.String], 
      sugarLib.sugarjsNs.SugarDefaultChainable[scala.Unit]
    ]
  ): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def forEach[T](search: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def forEach[T](
    search: java.lang.String,
    eachFn: js.Function3[
      /* match */ java.lang.String, 
      /* i */ scala.Double, 
      /* arr */ js.Array[java.lang.String], 
      sugarLib.sugarjsNs.SugarDefaultChainable[scala.Unit]
    ]
  ): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def forEach[T](search: stdLib.RegExp): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def forEach[T](
    search: stdLib.RegExp,
    eachFn: js.Function3[
      /* match */ java.lang.String, 
      /* i */ scala.Double, 
      /* arr */ js.Array[java.lang.String], 
      sugarLib.sugarjsNs.SugarDefaultChainable[scala.Unit]
    ]
  ): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def format(args: js.Any*): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def from(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def from(index: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def hankaku(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def hankaku(mode: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def hasArabic(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def hasCyrillic(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def hasDevanagari(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def hasGreek(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def hasHan(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def hasHangul(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def hasHebrew(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def hasHiragana(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def hasKana(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def hasKanji(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def hasKatakana(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def hasLatin(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def hasThai(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def hiragana(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def hiragana(all: scala.Boolean): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def humanize(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def includes(searchString: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def includes(searchString: java.lang.String, position: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def indexOf(searchString: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def indexOf(searchString: java.lang.String, position: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def insert(str: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def insert(str: java.lang.String, index: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def isArabic(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isBlank(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isCyrillic(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isDevanagari(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isEmpty(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isGreek(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isHan(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isHangul(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isHebrew(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isHiragana(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isKana(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isKanji(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isKatakana(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isLatin(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isThai(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def italics(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def katakana(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def last(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def last(n: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def lastIndexOf(searchString: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def lastIndexOf(searchString: java.lang.String, position: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def lines[T](): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def lines[T](
    eachLineFn: js.Function3[
      /* line */ java.lang.String, 
      /* i */ scala.Double, 
      /* arr */ js.Array[java.lang.String], 
      sugarLib.sugarjsNs.SugarDefaultChainable[scala.Unit]
    ]
  ): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def link(url: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def localeCompare(that: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def localeCompare(that: java.lang.String, locales: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def localeCompare(that: java.lang.String, locales: java.lang.String, options: stdLib.IntlNs.CollatorOptions): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def localeCompare(that: java.lang.String, locales: js.Array[java.lang.String]): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def localeCompare(
    that: java.lang.String,
    locales: js.Array[java.lang.String],
    options: stdLib.IntlNs.CollatorOptions
  ): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def `match`(regexp: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.RegExpMatchArray | scala.Null] = js.native
  def `match`(regexp: stdLib.RegExp): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.RegExpMatchArray | scala.Null] = js.native
  def normalize(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def normalize(form: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  @JSName("normalize")
  def normalize_NFC(form: sugarLib.sugarLibStrings.NFC): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  @JSName("normalize")
  def normalize_NFD(form: sugarLib.sugarLibStrings.NFD): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  @JSName("normalize")
  def normalize_NFKC(form: sugarLib.sugarLibStrings.NFKC): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  @JSName("normalize")
  def normalize_NFKD(form: sugarLib.sugarLibStrings.NFKD): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def pad(num: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def pad(num: scala.Double, padding: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def padLeft(num: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def padLeft(num: scala.Double, padding: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def padRight(num: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def padRight(num: scala.Double, padding: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def parameterize(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def pluralize(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def pluralize(num: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def remove(f: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def remove(f: stdLib.RegExp): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def removeAll(f: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def removeAll(f: stdLib.RegExp): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def removeTags(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def removeTags(tag: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def removeTags(tag: java.lang.String, replace: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def removeTags(tag: java.lang.String, replace: replaceFn): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def repeat(count: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def replace(searchValue: java.lang.String, replaceValue: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def replace(
    searchValue: java.lang.String,
    replacer: js.Function2[/* substring */ java.lang.String, /* repeated */js.Any, java.lang.String]
  ): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def replace(searchValue: stdLib.RegExp, replaceValue: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def replace(
    searchValue: stdLib.RegExp,
    replacer: js.Function2[/* substring */ java.lang.String, /* repeated */js.Any, java.lang.String]
  ): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def replaceAll(f: java.lang.String, args: js.Any*): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def replaceAll(f: stdLib.RegExp, args: js.Any*): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def reverse(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def search(regexp: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def search(regexp: stdLib.RegExp): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def shift[T](n: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def singularize(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def slice(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def slice(start: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def slice(start: scala.Double, end: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def small(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def spacify(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def split(separator: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[java.lang.String]] = js.native
  def split(separator: java.lang.String, limit: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[java.lang.String]] = js.native
  def split(separator: stdLib.RegExp): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[java.lang.String]] = js.native
  def split(separator: stdLib.RegExp, limit: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[java.lang.String]] = js.native
  def startsWith(searchString: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def startsWith(searchString: java.lang.String, position: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def strike(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def stripTags(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def stripTags(tag: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def stripTags(tag: java.lang.String, replace: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def stripTags(tag: java.lang.String, replace: replaceFn): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def sub(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def substr(from: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def substr(from: scala.Double, length: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def substring(start: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def substring(start: scala.Double, end: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def sup(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def titleize(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def to(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def to(index: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def toLocaleLowerCase(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def toLocaleUpperCase(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def toLowerCase(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def toNumber(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def toNumber(base: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def toUpperCase(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def trim(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def trimLeft(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def trimRight(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def truncate(length: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def truncate(length: scala.Double, from: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def truncate(length: scala.Double, from: java.lang.String, ellipsis: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def truncateOnWord(length: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def truncateOnWord(length: scala.Double, from: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def truncateOnWord(length: scala.Double, from: java.lang.String, ellipsis: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def underscore(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def unescapeHTML(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def unescapeURL(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def unescapeURL(partial: scala.Boolean): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def words[T](): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def words[T](
    eachWordFn: js.Function3[
      /* word */ java.lang.String, 
      /* i */ scala.Double, 
      /* arr */ js.Array[java.lang.String], 
      sugarLib.sugarjsNs.SugarDefaultChainable[scala.Unit]
    ]
  ): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def zenkaku(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def zenkaku(mode: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
}

