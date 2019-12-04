package typings.sugar

import typings.sugar.sugarjs.String.replaceFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait String extends js.Object {
  def at[T](index: Double): T = js.native
  def at[T](index: Double, loop: Boolean): T = js.native
  def at[T](index: Array[Double]): T = js.native
  def at[T](index: Array[Double], loop: Boolean): T = js.native
  def camelize(): java.lang.String = js.native
  def camelize(upper: Boolean): java.lang.String = js.native
  def capitalize(): java.lang.String = js.native
  def capitalize(lower: Boolean): java.lang.String = js.native
  def capitalize(lower: Boolean, all: Boolean): java.lang.String = js.native
  def chars[T](): Array[T] = js.native
  def chars[T](
    eachCharFn: js.Function3[/* char */ java.lang.String, /* i */ Double, /* arr */ Array[java.lang.String], Unit]
  ): Array[T] = js.native
  def codes[T](): Array[T] = js.native
  def codes[T](eachCodeFn: js.Function3[/* code */ Double, /* i */ Double, /* str */ java.lang.String, Unit]): Array[T] = js.native
  def compact(): java.lang.String = js.native
  def dasherize(): java.lang.String = js.native
  def decodeBase64(): java.lang.String = js.native
  def encodeBase64(): java.lang.String = js.native
  def escapeHTML(): java.lang.String = js.native
  def escapeURL(): java.lang.String = js.native
  def escapeURL(param: Boolean): java.lang.String = js.native
  def first(): java.lang.String = js.native
  def first(n: Double): java.lang.String = js.native
  def forEach[T](): Array[T] = js.native
  def forEach[T](
    eachFn: js.Function3[/* match */ java.lang.String, /* i */ Double, /* arr */ Array[java.lang.String], Unit]
  ): Array[T] = js.native
  def forEach[T](search: java.lang.String): Array[T] = js.native
  def forEach[T](
    search: java.lang.String,
    eachFn: js.Function3[/* match */ java.lang.String, /* i */ Double, /* arr */ Array[java.lang.String], Unit]
  ): Array[T] = js.native
  def forEach[T](search: RegExp): Array[T] = js.native
  def forEach[T](
    search: RegExp,
    eachFn: js.Function3[/* match */ java.lang.String, /* i */ Double, /* arr */ Array[java.lang.String], Unit]
  ): Array[T] = js.native
  def format(args: js.Any*): java.lang.String = js.native
  def from(): java.lang.String = js.native
  def from(index: Double): java.lang.String = js.native
  def hankaku(): java.lang.String = js.native
  def hankaku(mode: java.lang.String): java.lang.String = js.native
  def hasArabic(): Boolean = js.native
  def hasCyrillic(): Boolean = js.native
  def hasDevanagari(): Boolean = js.native
  def hasGreek(): Boolean = js.native
  def hasHan(): Boolean = js.native
  def hasHangul(): Boolean = js.native
  def hasHebrew(): Boolean = js.native
  def hasHiragana(): Boolean = js.native
  def hasKana(): Boolean = js.native
  def hasKanji(): Boolean = js.native
  def hasKatakana(): Boolean = js.native
  def hasLatin(): Boolean = js.native
  def hasThai(): Boolean = js.native
  def hiragana(): java.lang.String = js.native
  def hiragana(all: Boolean): java.lang.String = js.native
  def humanize(): java.lang.String = js.native
  def insert(str: java.lang.String): java.lang.String = js.native
  def insert(str: java.lang.String, index: Double): java.lang.String = js.native
  def isArabic(): Boolean = js.native
  def isBlank(): Boolean = js.native
  def isCyrillic(): Boolean = js.native
  def isDevanagari(): Boolean = js.native
  def isEmpty(): Boolean = js.native
  def isGreek(): Boolean = js.native
  def isHan(): Boolean = js.native
  def isHangul(): Boolean = js.native
  def isHebrew(): Boolean = js.native
  def isHiragana(): Boolean = js.native
  def isKana(): Boolean = js.native
  def isKanji(): Boolean = js.native
  def isKatakana(): Boolean = js.native
  def isLatin(): Boolean = js.native
  def isThai(): Boolean = js.native
  def katakana(): java.lang.String = js.native
  def last(): java.lang.String = js.native
  def last(n: Double): java.lang.String = js.native
  def lines[T](): Array[T] = js.native
  def lines[T](
    eachLineFn: js.Function3[/* line */ java.lang.String, /* i */ Double, /* arr */ Array[java.lang.String], Unit]
  ): Array[T] = js.native
  def pad(num: Double): java.lang.String = js.native
  def pad(num: Double, padding: java.lang.String): java.lang.String = js.native
  def padLeft(num: Double): java.lang.String = js.native
  def padLeft(num: Double, padding: java.lang.String): java.lang.String = js.native
  def padRight(num: Double): java.lang.String = js.native
  def padRight(num: Double, padding: java.lang.String): java.lang.String = js.native
  def parameterize(): java.lang.String = js.native
  def pluralize(): java.lang.String = js.native
  def pluralize(num: Double): java.lang.String = js.native
  def remove(f: java.lang.String): java.lang.String = js.native
  def remove(f: RegExp): java.lang.String = js.native
  def removeAll(f: java.lang.String): java.lang.String = js.native
  def removeAll(f: RegExp): java.lang.String = js.native
  def removeTags(): java.lang.String = js.native
  def removeTags(tag: java.lang.String): java.lang.String = js.native
  def removeTags(tag: java.lang.String, replace: java.lang.String): java.lang.String = js.native
  def removeTags(tag: java.lang.String, replace: replaceFn): java.lang.String = js.native
  def replaceAll(f: java.lang.String, args: js.Any*): java.lang.String = js.native
  def replaceAll(f: RegExp, args: js.Any*): java.lang.String = js.native
  def reverse(): java.lang.String = js.native
  def shift[T](n: Double): Array[T] = js.native
  def singularize(): java.lang.String = js.native
  def spacify(): java.lang.String = js.native
  def stripTags(): java.lang.String = js.native
  def stripTags(tag: java.lang.String): java.lang.String = js.native
  def stripTags(tag: java.lang.String, replace: java.lang.String): java.lang.String = js.native
  def stripTags(tag: java.lang.String, replace: replaceFn): java.lang.String = js.native
  def titleize(): java.lang.String = js.native
  def to(): java.lang.String = js.native
  def to(index: Double): java.lang.String = js.native
  def toNumber(): Double = js.native
  def toNumber(base: Double): Double = js.native
  def trimLeft(): java.lang.String = js.native
  def trimRight(): java.lang.String = js.native
  def truncate(length: Double): java.lang.String = js.native
  def truncate(length: Double, from: java.lang.String): java.lang.String = js.native
  def truncate(length: Double, from: java.lang.String, ellipsis: java.lang.String): java.lang.String = js.native
  def truncateOnWord(length: Double): java.lang.String = js.native
  def truncateOnWord(length: Double, from: java.lang.String): java.lang.String = js.native
  def truncateOnWord(length: Double, from: java.lang.String, ellipsis: java.lang.String): java.lang.String = js.native
  def underscore(): java.lang.String = js.native
  def unescapeHTML(): java.lang.String = js.native
  def unescapeURL(): java.lang.String = js.native
  def unescapeURL(partial: Boolean): java.lang.String = js.native
  def words[T](): Array[T] = js.native
  def words[T](
    eachWordFn: js.Function3[/* word */ java.lang.String, /* i */ Double, /* arr */ Array[java.lang.String], Unit]
  ): Array[T] = js.native
  def zenkaku(): java.lang.String = js.native
  def zenkaku(mode: java.lang.String): java.lang.String = js.native
}

