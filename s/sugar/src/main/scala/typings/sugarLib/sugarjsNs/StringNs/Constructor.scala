package typings
package sugarLib.sugarjsNs.StringNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Constructor
  extends sugarLib.sugarjsNs.SugarNamespace
     with ScalablyTyped.runtime.Instantiable0[Chainable[java.lang.String]]
     with ScalablyTyped.runtime.Instantiable1[/* raw */ java.lang.String, Chainable[java.lang.String]] {
  def apply(): Chainable[java.lang.String] = js.native
  def apply(raw: java.lang.String): Chainable[java.lang.String] = js.native
  def addAcronym(src: java.lang.String): scala.Unit = js.native
  def addHuman(src: java.lang.String, human: java.lang.String): scala.Unit = js.native
  def addHuman(src: stdLib.RegExp, human: java.lang.String): scala.Unit = js.native
  def addPlural(singular: java.lang.String): scala.Unit = js.native
  def addPlural(singular: java.lang.String, plural: java.lang.String): scala.Unit = js.native
  def at[T](instance: java.lang.String, index: js.Array[scala.Double]): T = js.native
  def at[T](instance: java.lang.String, index: js.Array[scala.Double], loop: scala.Boolean): T = js.native
  def at[T](instance: java.lang.String, index: scala.Double): T = js.native
  def at[T](instance: java.lang.String, index: scala.Double, loop: scala.Boolean): T = js.native
  def camelize(instance: java.lang.String): java.lang.String = js.native
  def camelize(instance: java.lang.String, upper: scala.Boolean): java.lang.String = js.native
  def capitalize(instance: java.lang.String): java.lang.String = js.native
  def capitalize(instance: java.lang.String, lower: scala.Boolean): java.lang.String = js.native
  def capitalize(instance: java.lang.String, lower: scala.Boolean, all: scala.Boolean): java.lang.String = js.native
  def chars[T](instance: java.lang.String): js.Array[T] = js.native
  def chars[T](
    instance: java.lang.String,
    callback: js.Function3[
      /* char */ java.lang.String, 
      /* i */ scala.Double, 
      /* arr */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): js.Array[T] = js.native
  def codes[T](instance: java.lang.String): js.Array[T] = js.native
  def codes[T](
    instance: java.lang.String,
    callback: js.Function3[/* code */ scala.Double, /* i */ scala.Double, /* str */ java.lang.String, scala.Unit]
  ): js.Array[T] = js.native
  def compact(instance: java.lang.String): java.lang.String = js.native
  def dasherize(instance: java.lang.String): java.lang.String = js.native
  def decodeBase64(instance: java.lang.String): java.lang.String = js.native
  def encodeBase64(instance: java.lang.String): java.lang.String = js.native
  def escapeHTML(instance: java.lang.String): java.lang.String = js.native
  def escapeURL(instance: java.lang.String): java.lang.String = js.native
  def escapeURL(instance: java.lang.String, param: scala.Boolean): java.lang.String = js.native
  def first(instance: java.lang.String): java.lang.String = js.native
  def first(instance: java.lang.String, n: scala.Double): java.lang.String = js.native
  def forEach[T](instance: java.lang.String): js.Array[T] = js.native
  def forEach[T](
    instance: java.lang.String,
    callback: js.Function3[
      /* match */ java.lang.String, 
      /* i */ scala.Double, 
      /* arr */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): js.Array[T] = js.native
  def forEach[T](instance: java.lang.String, search: java.lang.String): js.Array[T] = js.native
  def forEach[T](
    instance: java.lang.String,
    search: java.lang.String,
    callback: js.Function3[
      /* match */ java.lang.String, 
      /* i */ scala.Double, 
      /* arr */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): js.Array[T] = js.native
  def forEach[T](instance: java.lang.String, search: stdLib.RegExp): js.Array[T] = js.native
  def forEach[T](
    instance: java.lang.String,
    search: stdLib.RegExp,
    callback: js.Function3[
      /* match */ java.lang.String, 
      /* i */ scala.Double, 
      /* arr */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): js.Array[T] = js.native
  def format(instance: java.lang.String, args: js.Any*): java.lang.String = js.native
  def from(instance: java.lang.String): java.lang.String = js.native
  def from(instance: java.lang.String, index: scala.Double): java.lang.String = js.native
  def hankaku(instance: java.lang.String): java.lang.String = js.native
  def hankaku(instance: java.lang.String, mode: java.lang.String): java.lang.String = js.native
  def hasArabic(instance: java.lang.String): scala.Boolean = js.native
  def hasCyrillic(instance: java.lang.String): scala.Boolean = js.native
  def hasDevanagari(instance: java.lang.String): scala.Boolean = js.native
  def hasGreek(instance: java.lang.String): scala.Boolean = js.native
  def hasHan(instance: java.lang.String): scala.Boolean = js.native
  def hasHangul(instance: java.lang.String): scala.Boolean = js.native
  def hasHebrew(instance: java.lang.String): scala.Boolean = js.native
  def hasHiragana(instance: java.lang.String): scala.Boolean = js.native
  def hasKana(instance: java.lang.String): scala.Boolean = js.native
  def hasKanji(instance: java.lang.String): scala.Boolean = js.native
  def hasKatakana(instance: java.lang.String): scala.Boolean = js.native
  def hasLatin(instance: java.lang.String): scala.Boolean = js.native
  def hasThai(instance: java.lang.String): scala.Boolean = js.native
  def hiragana(instance: java.lang.String): java.lang.String = js.native
  def hiragana(instance: java.lang.String, all: scala.Boolean): java.lang.String = js.native
  def humanize(instance: java.lang.String): java.lang.String = js.native
  def insert(instance: java.lang.String, str: java.lang.String): java.lang.String = js.native
  def insert(instance: java.lang.String, str: java.lang.String, index: scala.Double): java.lang.String = js.native
  def isArabic(instance: java.lang.String): scala.Boolean = js.native
  def isBlank(instance: java.lang.String): scala.Boolean = js.native
  def isCyrillic(instance: java.lang.String): scala.Boolean = js.native
  def isDevanagari(instance: java.lang.String): scala.Boolean = js.native
  def isEmpty(instance: java.lang.String): scala.Boolean = js.native
  def isGreek(instance: java.lang.String): scala.Boolean = js.native
  def isHan(instance: java.lang.String): scala.Boolean = js.native
  def isHangul(instance: java.lang.String): scala.Boolean = js.native
  def isHebrew(instance: java.lang.String): scala.Boolean = js.native
  def isHiragana(instance: java.lang.String): scala.Boolean = js.native
  def isKana(instance: java.lang.String): scala.Boolean = js.native
  def isKanji(instance: java.lang.String): scala.Boolean = js.native
  def isKatakana(instance: java.lang.String): scala.Boolean = js.native
  def isLatin(instance: java.lang.String): scala.Boolean = js.native
  def isThai(instance: java.lang.String): scala.Boolean = js.native
  def katakana(instance: java.lang.String): java.lang.String = js.native
  def last(instance: java.lang.String): java.lang.String = js.native
  def last(instance: java.lang.String, n: scala.Double): java.lang.String = js.native
  def lines[T](instance: java.lang.String): js.Array[T] = js.native
  def lines[T](
    instance: java.lang.String,
    callback: js.Function3[
      /* line */ java.lang.String, 
      /* i */ scala.Double, 
      /* arr */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): js.Array[T] = js.native
  def pad(instance: java.lang.String, num: scala.Double): java.lang.String = js.native
  def pad(instance: java.lang.String, num: scala.Double, padding: java.lang.String): java.lang.String = js.native
  def padLeft(instance: java.lang.String, num: scala.Double): java.lang.String = js.native
  def padLeft(instance: java.lang.String, num: scala.Double, padding: java.lang.String): java.lang.String = js.native
  def padRight(instance: java.lang.String, num: scala.Double): java.lang.String = js.native
  def padRight(instance: java.lang.String, num: scala.Double, padding: java.lang.String): java.lang.String = js.native
  def parameterize(instance: java.lang.String): java.lang.String = js.native
  def pluralize(instance: java.lang.String): java.lang.String = js.native
  def pluralize(instance: java.lang.String, num: scala.Double): java.lang.String = js.native
  def range(): sugarLib.sugarjsNs.Range = js.native
  def range(start: java.lang.String): sugarLib.sugarjsNs.Range = js.native
  def range(start: java.lang.String, end: java.lang.String): sugarLib.sugarjsNs.Range = js.native
  def remove(instance: java.lang.String, f: java.lang.String): java.lang.String = js.native
  def remove(instance: java.lang.String, f: stdLib.RegExp): java.lang.String = js.native
  def removeAll(instance: java.lang.String, f: java.lang.String): java.lang.String = js.native
  def removeAll(instance: java.lang.String, f: stdLib.RegExp): java.lang.String = js.native
  def removeTags(instance: java.lang.String): java.lang.String = js.native
  def removeTags(instance: java.lang.String, tag: java.lang.String): java.lang.String = js.native
  def removeTags(instance: java.lang.String, tag: java.lang.String, replace: java.lang.String): java.lang.String = js.native
  def removeTags(instance: java.lang.String, tag: java.lang.String, replace: tagReplaceFn): java.lang.String = js.native
  def replaceAll(instance: java.lang.String, f: java.lang.String, args: js.Any*): java.lang.String = js.native
  def replaceAll(instance: java.lang.String, f: stdLib.RegExp, args: js.Any*): java.lang.String = js.native
  def reverse(instance: java.lang.String): java.lang.String = js.native
  def shift[T](instance: java.lang.String, n: scala.Double): js.Array[T] = js.native
  def singularize(instance: java.lang.String): java.lang.String = js.native
  def spacify(instance: java.lang.String): java.lang.String = js.native
  def stripTags(instance: java.lang.String): java.lang.String = js.native
  def stripTags(instance: java.lang.String, tag: java.lang.String): java.lang.String = js.native
  def stripTags(instance: java.lang.String, tag: java.lang.String, replace: java.lang.String): java.lang.String = js.native
  def stripTags(instance: java.lang.String, tag: java.lang.String, replace: tagReplaceFn): java.lang.String = js.native
  def titleize(instance: java.lang.String): java.lang.String = js.native
  def to(instance: java.lang.String): java.lang.String = js.native
  def to(instance: java.lang.String, index: scala.Double): java.lang.String = js.native
  def toNumber(instance: java.lang.String): scala.Double = js.native
  def toNumber(instance: java.lang.String, base: scala.Double): scala.Double = js.native
  def trimLeft(instance: java.lang.String): java.lang.String = js.native
  def trimRight(instance: java.lang.String): java.lang.String = js.native
  def truncate(instance: java.lang.String, length: scala.Double): java.lang.String = js.native
  def truncate(instance: java.lang.String, length: scala.Double, from: java.lang.String): java.lang.String = js.native
  def truncate(
    instance: java.lang.String,
    length: scala.Double,
    from: java.lang.String,
    ellipsis: java.lang.String
  ): java.lang.String = js.native
  def truncateOnWord(instance: java.lang.String, length: scala.Double): java.lang.String = js.native
  def truncateOnWord(instance: java.lang.String, length: scala.Double, from: java.lang.String): java.lang.String = js.native
  def truncateOnWord(
    instance: java.lang.String,
    length: scala.Double,
    from: java.lang.String,
    ellipsis: java.lang.String
  ): java.lang.String = js.native
  def underscore(instance: java.lang.String): java.lang.String = js.native
  def unescapeHTML(instance: java.lang.String): java.lang.String = js.native
  def unescapeURL(instance: java.lang.String): java.lang.String = js.native
  def unescapeURL(instance: java.lang.String, partial: scala.Boolean): java.lang.String = js.native
  def words[T](instance: java.lang.String): js.Array[T] = js.native
  def words[T](
    instance: java.lang.String,
    callback: js.Function3[
      /* word */ java.lang.String, 
      /* i */ scala.Double, 
      /* arr */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): js.Array[T] = js.native
  def zenkaku(instance: java.lang.String): java.lang.String = js.native
  def zenkaku(instance: java.lang.String, mode: java.lang.String): java.lang.String = js.native
}

