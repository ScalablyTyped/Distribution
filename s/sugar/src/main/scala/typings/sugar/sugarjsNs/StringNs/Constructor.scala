package typings.sugar.sugarjsNs.StringNs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.std.RegExp
import typings.sugar.sugarjsNs.Range
import typings.sugar.sugarjsNs.SugarNamespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Constructor
  extends SugarNamespace
     with Instantiable0[Chainable[String]]
     with Instantiable1[/* raw */ String, Chainable[String]] {
  def apply(): Chainable[String] = js.native
  def apply(raw: String): Chainable[String] = js.native
  def addAcronym(src: String): Unit = js.native
  def addHuman(src: String, human: String): Unit = js.native
  def addHuman(src: RegExp, human: String): Unit = js.native
  def addPlural(singular: String): Unit = js.native
  def addPlural(singular: String, plural: String): Unit = js.native
  def at[T](instance: String, index: js.Array[Double]): T = js.native
  def at[T](instance: String, index: js.Array[Double], loop: Boolean): T = js.native
  def at[T](instance: String, index: Double): T = js.native
  def at[T](instance: String, index: Double, loop: Boolean): T = js.native
  def camelize(instance: String): String = js.native
  def camelize(instance: String, upper: Boolean): String = js.native
  def capitalize(instance: String): String = js.native
  def capitalize(instance: String, lower: Boolean): String = js.native
  def capitalize(instance: String, lower: Boolean, all: Boolean): String = js.native
  def chars[T](instance: String): js.Array[T] = js.native
  def chars[T](
    instance: String,
    eachCharFn: js.Function3[/* char */ String, /* i */ Double, /* arr */ js.Array[String], Unit]
  ): js.Array[T] = js.native
  def codes[T](instance: String): js.Array[T] = js.native
  def codes[T](
    instance: String,
    eachCodeFn: js.Function3[/* code */ Double, /* i */ Double, /* str */ String, Unit]
  ): js.Array[T] = js.native
  def compact(instance: String): String = js.native
  def dasherize(instance: String): String = js.native
  def decodeBase64(instance: String): String = js.native
  def encodeBase64(instance: String): String = js.native
  def escapeHTML(instance: String): String = js.native
  def escapeURL(instance: String): String = js.native
  def escapeURL(instance: String, param: Boolean): String = js.native
  def first(instance: String): String = js.native
  def first(instance: String, n: Double): String = js.native
  def forEach[T](instance: String): js.Array[T] = js.native
  def forEach[T](
    instance: String,
    eachFn: js.Function3[/* match */ String, /* i */ Double, /* arr */ js.Array[String], Unit]
  ): js.Array[T] = js.native
  def forEach[T](instance: String, search: String): js.Array[T] = js.native
  def forEach[T](
    instance: String,
    search: String,
    eachFn: js.Function3[/* match */ String, /* i */ Double, /* arr */ js.Array[String], Unit]
  ): js.Array[T] = js.native
  def forEach[T](instance: String, search: RegExp): js.Array[T] = js.native
  def forEach[T](
    instance: String,
    search: RegExp,
    eachFn: js.Function3[/* match */ String, /* i */ Double, /* arr */ js.Array[String], Unit]
  ): js.Array[T] = js.native
  def format(instance: String, args: js.Any*): String = js.native
  def from(instance: String): String = js.native
  def from(instance: String, index: Double): String = js.native
  def hankaku(instance: String): String = js.native
  def hankaku(instance: String, mode: String): String = js.native
  def hasArabic(instance: String): Boolean = js.native
  def hasCyrillic(instance: String): Boolean = js.native
  def hasDevanagari(instance: String): Boolean = js.native
  def hasGreek(instance: String): Boolean = js.native
  def hasHan(instance: String): Boolean = js.native
  def hasHangul(instance: String): Boolean = js.native
  def hasHebrew(instance: String): Boolean = js.native
  def hasHiragana(instance: String): Boolean = js.native
  def hasKana(instance: String): Boolean = js.native
  def hasKanji(instance: String): Boolean = js.native
  def hasKatakana(instance: String): Boolean = js.native
  def hasLatin(instance: String): Boolean = js.native
  def hasThai(instance: String): Boolean = js.native
  def hiragana(instance: String): String = js.native
  def hiragana(instance: String, all: Boolean): String = js.native
  def humanize(instance: String): String = js.native
  def insert(instance: String, str: String): String = js.native
  def insert(instance: String, str: String, index: Double): String = js.native
  def isArabic(instance: String): Boolean = js.native
  def isBlank(instance: String): Boolean = js.native
  def isCyrillic(instance: String): Boolean = js.native
  def isDevanagari(instance: String): Boolean = js.native
  def isEmpty(instance: String): Boolean = js.native
  def isGreek(instance: String): Boolean = js.native
  def isHan(instance: String): Boolean = js.native
  def isHangul(instance: String): Boolean = js.native
  def isHebrew(instance: String): Boolean = js.native
  def isHiragana(instance: String): Boolean = js.native
  def isKana(instance: String): Boolean = js.native
  def isKanji(instance: String): Boolean = js.native
  def isKatakana(instance: String): Boolean = js.native
  def isLatin(instance: String): Boolean = js.native
  def isThai(instance: String): Boolean = js.native
  def katakana(instance: String): String = js.native
  def last(instance: String): String = js.native
  def last(instance: String, n: Double): String = js.native
  def lines[T](instance: String): js.Array[T] = js.native
  def lines[T](
    instance: String,
    eachLineFn: js.Function3[/* line */ String, /* i */ Double, /* arr */ js.Array[String], Unit]
  ): js.Array[T] = js.native
  def pad(instance: String, num: Double): String = js.native
  def pad(instance: String, num: Double, padding: String): String = js.native
  def padLeft(instance: String, num: Double): String = js.native
  def padLeft(instance: String, num: Double, padding: String): String = js.native
  def padRight(instance: String, num: Double): String = js.native
  def padRight(instance: String, num: Double, padding: String): String = js.native
  def parameterize(instance: String): String = js.native
  def pluralize(instance: String): String = js.native
  def pluralize(instance: String, num: Double): String = js.native
  def range(): Range = js.native
  def range(start: String): Range = js.native
  def range(start: String, end: String): Range = js.native
  def remove(instance: String, f: String): String = js.native
  def remove(instance: String, f: RegExp): String = js.native
  def removeAll(instance: String, f: String): String = js.native
  def removeAll(instance: String, f: RegExp): String = js.native
  def removeTags(instance: String): String = js.native
  def removeTags(instance: String, tag: String): String = js.native
  def removeTags(instance: String, tag: String, replace: String): String = js.native
  def removeTags(instance: String, tag: String, replace: replaceFn): String = js.native
  def replaceAll(instance: String, f: String, args: js.Any*): String = js.native
  def replaceAll(instance: String, f: RegExp, args: js.Any*): String = js.native
  def reverse(instance: String): String = js.native
  def shift[T](instance: String, n: Double): js.Array[T] = js.native
  def singularize(instance: String): String = js.native
  def spacify(instance: String): String = js.native
  def stripTags(instance: String): String = js.native
  def stripTags(instance: String, tag: String): String = js.native
  def stripTags(instance: String, tag: String, replace: String): String = js.native
  def stripTags(instance: String, tag: String, replace: replaceFn): String = js.native
  def titleize(instance: String): String = js.native
  def to(instance: String): String = js.native
  def to(instance: String, index: Double): String = js.native
  def toNumber(instance: String): Double = js.native
  def toNumber(instance: String, base: Double): Double = js.native
  def trimLeft(instance: String): String = js.native
  def trimRight(instance: String): String = js.native
  def truncate(instance: String, length: Double): String = js.native
  def truncate(instance: String, length: Double, from: String): String = js.native
  def truncate(instance: String, length: Double, from: String, ellipsis: String): String = js.native
  def truncateOnWord(instance: String, length: Double): String = js.native
  def truncateOnWord(instance: String, length: Double, from: String): String = js.native
  def truncateOnWord(instance: String, length: Double, from: String, ellipsis: String): String = js.native
  def underscore(instance: String): String = js.native
  def unescapeHTML(instance: String): String = js.native
  def unescapeURL(instance: String): String = js.native
  def unescapeURL(instance: String, partial: Boolean): String = js.native
  def words[T](instance: String): js.Array[T] = js.native
  def words[T](
    instance: String,
    eachWordFn: js.Function3[/* word */ String, /* i */ Double, /* arr */ js.Array[String], Unit]
  ): js.Array[T] = js.native
  def zenkaku(instance: String): String = js.native
  def zenkaku(instance: String, mode: String): String = js.native
}

