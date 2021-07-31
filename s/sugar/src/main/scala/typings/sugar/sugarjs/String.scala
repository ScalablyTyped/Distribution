package typings.sugar.sugarjs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.std.Intl.CollatorOptions
import typings.std.RegExpMatchArray
import typings.sugar.sugarStrings.NFC
import typings.sugar.sugarStrings.NFD
import typings.sugar.sugarStrings.NFKC
import typings.sugar.sugarStrings.NFKD
import typings.sugar.sugarjs.Object.ObjectMergeOptions
import typings.sugar.sugarjs.Object.QueryStringOptions
import typings.sugar.sugarjs.Object.mapFn
import typings.sugar.sugarjs.Object.searchFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object String {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.sugar.sugarjs.Object.ChainableBase because var conflicts: raw. Inlined add, add, addAll, addAll, average, average, average, clone, clone, count, count, defaults, defaults, every, every, exclude, exclude, filter, filter, find, find, get, get, has, has, intersect, invert, invert, isArguments, isArray, isBoolean, isDate, isEqual, isError, isFunction, isMap, isNumber, isObject, isRegExp, isSet, isString, keys, least, least, least, least, least, least, least, least, map, map, max, max, max, max, max, max, max, max, median, median, median, merge, merge, mergeAll, mergeAll, min, min, min, min, min, min, min, min, most, most, most, most, most, most, most, most, none, none, reduce, reduce, reject, reject, reject, reject, select, select, select, select, set, size, some, some, subtract, sum, sum, sum, tap, toQueryString, toQueryString, values */ @js.native
  trait Chainable[RawValue]
    extends StObject
       with ChainableBase[RawValue] {
    
    def add[T](obj: js.Object): SugarDefaultChainable[js.Object] = js.native
    def add[T](obj: js.Object, options: ObjectMergeOptions[T]): SugarDefaultChainable[js.Object] = js.native
    
    def addAll[T](sources: typings.sugar.Array[js.Object]): SugarDefaultChainable[js.Object] = js.native
    def addAll[T](sources: typings.sugar.Array[js.Object], options: ObjectMergeOptions[T]): SugarDefaultChainable[js.Object] = js.native
    
    def average[T, U](): SugarDefaultChainable[Double] = js.native
    def average[T, U](map: java.lang.String): SugarDefaultChainable[Double] = js.native
    def average[T, U](map: mapFn[T, U]): SugarDefaultChainable[Double] = js.native
    
    def clone(deep: Boolean): SugarDefaultChainable[js.Object] = js.native
    
    def count[T](search: T): SugarDefaultChainable[Double] = js.native
    def count[T](search: searchFn[T]): SugarDefaultChainable[Double] = js.native
    
    def defaults[T](sources: typings.sugar.Array[js.Object]): SugarDefaultChainable[js.Object] = js.native
    def defaults[T](sources: typings.sugar.Array[js.Object], options: ObjectMergeOptions[T]): SugarDefaultChainable[js.Object] = js.native
    
    def every[T](search: T): SugarDefaultChainable[Boolean] = js.native
    def every[T](search: searchFn[T]): SugarDefaultChainable[Boolean] = js.native
    
    def exclude[T](search: T): SugarDefaultChainable[js.Object] = js.native
    def exclude[T](search: searchFn[T]): SugarDefaultChainable[js.Object] = js.native
    
    def filter[T](search: T): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    def filter[T](search: searchFn[T]): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    
    def find[T](search: T): SugarDefaultChainable[Boolean] = js.native
    def find[T](search: searchFn[T]): SugarDefaultChainable[Boolean] = js.native
    
    def get[T](key: java.lang.String): SugarDefaultChainable[T] = js.native
    def get[T](key: java.lang.String, inherited: Boolean): SugarDefaultChainable[T] = js.native
    
    def has(key: java.lang.String): SugarDefaultChainable[Boolean] = js.native
    def has(key: java.lang.String, inherited: Boolean): SugarDefaultChainable[Boolean] = js.native
    
    def intersect(obj: js.Object): SugarDefaultChainable[js.Object] = js.native
    
    def invert(): SugarDefaultChainable[js.Object] = js.native
    def invert(multi: Boolean): SugarDefaultChainable[js.Object] = js.native
    
    def isArguments(): SugarDefaultChainable[Boolean] = js.native
    
    def isArray(): SugarDefaultChainable[Boolean] = js.native
    
    def isBoolean(): SugarDefaultChainable[Boolean] = js.native
    
    def isDate(): SugarDefaultChainable[Boolean] = js.native
    
    def isEqual(obj: js.Object): SugarDefaultChainable[Boolean] = js.native
    
    def isError(): SugarDefaultChainable[Boolean] = js.native
    
    def isFunction(): SugarDefaultChainable[Boolean] = js.native
    
    def isMap(): SugarDefaultChainable[Boolean] = js.native
    
    def isNumber(): SugarDefaultChainable[Boolean] = js.native
    
    def isObject(): SugarDefaultChainable[Boolean] = js.native
    
    def isRegExp(): SugarDefaultChainable[Boolean] = js.native
    
    def isSet(): SugarDefaultChainable[Boolean] = js.native
    
    def isString(): SugarDefaultChainable[Boolean] = js.native
    
    def keys[T](): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    
    def least[T, U](): SugarDefaultChainable[T] = js.native
    def least[T, U](all: Boolean): SugarDefaultChainable[T] = js.native
    def least[T, U](all: Boolean, map: java.lang.String): SugarDefaultChainable[T] = js.native
    def least[T, U](all: Boolean, map: mapFn[T, U]): SugarDefaultChainable[T] = js.native
    def least[T, U](all: Unit, map: java.lang.String): SugarDefaultChainable[T] = js.native
    def least[T, U](all: Unit, map: mapFn[T, U]): SugarDefaultChainable[T] = js.native
    def least[T, U](map: java.lang.String): SugarDefaultChainable[T] = js.native
    def least[T, U](map: mapFn[T, U]): SugarDefaultChainable[T] = js.native
    
    def map[T, U](map: java.lang.String): SugarDefaultChainable[js.Object] = js.native
    def map[T, U](map: mapFn[T, U]): SugarDefaultChainable[js.Object] = js.native
    
    def max[T, U](): SugarDefaultChainable[T] = js.native
    def max[T, U](all: Boolean): SugarDefaultChainable[T] = js.native
    def max[T, U](all: Boolean, map: java.lang.String): SugarDefaultChainable[T] = js.native
    def max[T, U](all: Boolean, map: mapFn[T, U]): SugarDefaultChainable[T] = js.native
    def max[T, U](all: Unit, map: java.lang.String): SugarDefaultChainable[T] = js.native
    def max[T, U](all: Unit, map: mapFn[T, U]): SugarDefaultChainable[T] = js.native
    def max[T, U](map: java.lang.String): SugarDefaultChainable[T] = js.native
    def max[T, U](map: mapFn[T, U]): SugarDefaultChainable[T] = js.native
    
    def median[T, U](): SugarDefaultChainable[Double] = js.native
    def median[T, U](map: java.lang.String): SugarDefaultChainable[Double] = js.native
    def median[T, U](map: mapFn[T, U]): SugarDefaultChainable[Double] = js.native
    
    def merge[T](source: js.Object): SugarDefaultChainable[js.Object] = js.native
    def merge[T](source: js.Object, options: ObjectMergeOptions[T]): SugarDefaultChainable[js.Object] = js.native
    
    def mergeAll[T](sources: typings.sugar.Array[js.Object]): SugarDefaultChainable[js.Object] = js.native
    def mergeAll[T](sources: typings.sugar.Array[js.Object], options: ObjectMergeOptions[T]): SugarDefaultChainable[js.Object] = js.native
    
    def min[T, U](): SugarDefaultChainable[T] = js.native
    def min[T, U](all: Boolean): SugarDefaultChainable[T] = js.native
    def min[T, U](all: Boolean, map: java.lang.String): SugarDefaultChainable[T] = js.native
    def min[T, U](all: Boolean, map: mapFn[T, U]): SugarDefaultChainable[T] = js.native
    def min[T, U](all: Unit, map: java.lang.String): SugarDefaultChainable[T] = js.native
    def min[T, U](all: Unit, map: mapFn[T, U]): SugarDefaultChainable[T] = js.native
    def min[T, U](map: java.lang.String): SugarDefaultChainable[T] = js.native
    def min[T, U](map: mapFn[T, U]): SugarDefaultChainable[T] = js.native
    
    def most[T, U](): SugarDefaultChainable[T] = js.native
    def most[T, U](all: Boolean): SugarDefaultChainable[T] = js.native
    def most[T, U](all: Boolean, map: java.lang.String): SugarDefaultChainable[T] = js.native
    def most[T, U](all: Boolean, map: mapFn[T, U]): SugarDefaultChainable[T] = js.native
    def most[T, U](all: Unit, map: java.lang.String): SugarDefaultChainable[T] = js.native
    def most[T, U](all: Unit, map: mapFn[T, U]): SugarDefaultChainable[T] = js.native
    def most[T, U](map: java.lang.String): SugarDefaultChainable[T] = js.native
    def most[T, U](map: mapFn[T, U]): SugarDefaultChainable[T] = js.native
    
    def none[T](search: T): SugarDefaultChainable[Boolean] = js.native
    def none[T](search: searchFn[T]): SugarDefaultChainable[Boolean] = js.native
    
    def reduce[T](
      reduceFn: js.Function4[
          /* acc */ T, 
          /* val */ T, 
          /* key */ java.lang.String, 
          /* obj */ js.Object, 
          SugarDefaultChainable[Unit]
        ]
    ): SugarDefaultChainable[T] = js.native
    def reduce[T](
      reduceFn: js.Function4[
          /* acc */ T, 
          /* val */ T, 
          /* key */ java.lang.String, 
          /* obj */ js.Object, 
          SugarDefaultChainable[Unit]
        ],
      init: js.Any
    ): SugarDefaultChainable[T] = js.native
    
    def reject(find: java.lang.String): SugarDefaultChainable[js.Object] = js.native
    def reject(find: js.Object): SugarDefaultChainable[js.Object] = js.native
    def reject(find: typings.sugar.Array[java.lang.String]): SugarDefaultChainable[js.Object] = js.native
    def reject(find: typings.sugar.RegExp): SugarDefaultChainable[js.Object] = js.native
    
    def select(find: java.lang.String): SugarDefaultChainable[js.Object] = js.native
    def select(find: js.Object): SugarDefaultChainable[js.Object] = js.native
    def select(find: typings.sugar.Array[java.lang.String]): SugarDefaultChainable[js.Object] = js.native
    def select(find: typings.sugar.RegExp): SugarDefaultChainable[js.Object] = js.native
    
    def set[T](key: java.lang.String, `val`: T): SugarDefaultChainable[js.Object] = js.native
    
    def size(): SugarDefaultChainable[Double] = js.native
    
    def some[T](search: T): SugarDefaultChainable[Boolean] = js.native
    def some[T](search: searchFn[T]): SugarDefaultChainable[Boolean] = js.native
    
    def subtract(obj: js.Object): SugarDefaultChainable[js.Object] = js.native
    
    def sum[T, U](): SugarDefaultChainable[Double] = js.native
    def sum[T, U](map: java.lang.String): SugarDefaultChainable[Double] = js.native
    def sum[T, U](map: mapFn[T, U]): SugarDefaultChainable[Double] = js.native
    
    def tap(tapFn: js.Function1[/* obj */ js.Object, SugarDefaultChainable[js.Any]]): SugarDefaultChainable[js.Object] = js.native
    
    def toQueryString[T, U](): SugarDefaultChainable[js.Object] = js.native
    def toQueryString[T, U](options: QueryStringOptions[T, U]): SugarDefaultChainable[js.Object] = js.native
    
    def values[T](): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
  }
  
  @js.native
  trait ChainableBase[RawValue] extends StObject {
    
    def anchor(name: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    
    def at[T](index: Double): SugarDefaultChainable[T] = js.native
    def at[T](index: Double, loop: Boolean): SugarDefaultChainable[T] = js.native
    def at[T](index: typings.sugar.Array[Double]): SugarDefaultChainable[T] = js.native
    def at[T](index: typings.sugar.Array[Double], loop: Boolean): SugarDefaultChainable[T] = js.native
    
    def big(): SugarDefaultChainable[java.lang.String] = js.native
    
    def blink(): SugarDefaultChainable[java.lang.String] = js.native
    
    def bold(): SugarDefaultChainable[java.lang.String] = js.native
    
    def camelize(): SugarDefaultChainable[java.lang.String] = js.native
    def camelize(upper: Boolean): SugarDefaultChainable[java.lang.String] = js.native
    
    def capitalize(): SugarDefaultChainable[java.lang.String] = js.native
    def capitalize(lower: Boolean): SugarDefaultChainable[java.lang.String] = js.native
    def capitalize(lower: Boolean, all: Boolean): SugarDefaultChainable[java.lang.String] = js.native
    def capitalize(lower: Unit, all: Boolean): SugarDefaultChainable[java.lang.String] = js.native
    
    def charAt(pos: Double): SugarDefaultChainable[java.lang.String] = js.native
    
    def charCodeAt(index: Double): SugarDefaultChainable[Double] = js.native
    
    def chars[T](): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    def chars[T](
      eachCharFn: js.Function3[
          /* char */ java.lang.String, 
          /* i */ Double, 
          /* arr */ typings.sugar.Array[java.lang.String], 
          SugarDefaultChainable[Unit]
        ]
    ): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    
    def codePointAt(pos: Double): SugarDefaultChainable[js.UndefOr[Double]] = js.native
    
    def codes[T](): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    def codes[T](
      eachCodeFn: js.Function3[
          /* code */ Double, 
          /* i */ Double, 
          /* str */ java.lang.String, 
          SugarDefaultChainable[Unit]
        ]
    ): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    
    def compact(): SugarDefaultChainable[java.lang.String] = js.native
    
    def concat(strings: java.lang.String*): SugarDefaultChainable[java.lang.String] = js.native
    
    def dasherize(): SugarDefaultChainable[java.lang.String] = js.native
    
    def decodeBase64(): SugarDefaultChainable[java.lang.String] = js.native
    
    def encodeBase64(): SugarDefaultChainable[java.lang.String] = js.native
    
    def endsWith(searchString: java.lang.String): SugarDefaultChainable[Boolean] = js.native
    def endsWith(searchString: java.lang.String, endPosition: Double): SugarDefaultChainable[Boolean] = js.native
    
    def escapeHTML(): SugarDefaultChainable[java.lang.String] = js.native
    
    def escapeURL(): SugarDefaultChainable[java.lang.String] = js.native
    def escapeURL(param: Boolean): SugarDefaultChainable[java.lang.String] = js.native
    
    def first(): SugarDefaultChainable[java.lang.String] = js.native
    def first(n: Double): SugarDefaultChainable[java.lang.String] = js.native
    
    def fixed(): SugarDefaultChainable[java.lang.String] = js.native
    
    def fontcolor(color: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    
    def fontsize(size: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    def fontsize(size: Double): SugarDefaultChainable[java.lang.String] = js.native
    
    def forEach[T](): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    def forEach[T](
      eachFn: js.Function3[
          /* match */ java.lang.String, 
          /* i */ Double, 
          /* arr */ typings.sugar.Array[java.lang.String], 
          SugarDefaultChainable[Unit]
        ]
    ): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    def forEach[T](search: java.lang.String): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    def forEach[T](
      search: java.lang.String,
      eachFn: js.Function3[
          /* match */ java.lang.String, 
          /* i */ Double, 
          /* arr */ typings.sugar.Array[java.lang.String], 
          SugarDefaultChainable[Unit]
        ]
    ): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    def forEach[T](
      search: Unit,
      eachFn: js.Function3[
          /* match */ java.lang.String, 
          /* i */ Double, 
          /* arr */ typings.sugar.Array[java.lang.String], 
          SugarDefaultChainable[Unit]
        ]
    ): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    def forEach[T](search: typings.sugar.RegExp): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    def forEach[T](
      search: typings.sugar.RegExp,
      eachFn: js.Function3[
          /* match */ java.lang.String, 
          /* i */ Double, 
          /* arr */ typings.sugar.Array[java.lang.String], 
          SugarDefaultChainable[Unit]
        ]
    ): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    
    def format(args: js.Any*): SugarDefaultChainable[java.lang.String] = js.native
    
    def from(): SugarDefaultChainable[java.lang.String] = js.native
    def from(index: Double): SugarDefaultChainable[java.lang.String] = js.native
    
    def hankaku(): SugarDefaultChainable[java.lang.String] = js.native
    def hankaku(mode: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    
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
    
    def hiragana(): SugarDefaultChainable[java.lang.String] = js.native
    def hiragana(all: Boolean): SugarDefaultChainable[java.lang.String] = js.native
    
    def humanize(): SugarDefaultChainable[java.lang.String] = js.native
    
    def includes(searchString: java.lang.String): SugarDefaultChainable[Boolean] = js.native
    def includes(searchString: java.lang.String, position: Double): SugarDefaultChainable[Boolean] = js.native
    
    def indexOf(searchString: java.lang.String): SugarDefaultChainable[Double] = js.native
    def indexOf(searchString: java.lang.String, position: Double): SugarDefaultChainable[Double] = js.native
    
    def insert(str: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    def insert(str: java.lang.String, index: Double): SugarDefaultChainable[java.lang.String] = js.native
    
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
    
    def italics(): SugarDefaultChainable[java.lang.String] = js.native
    
    def katakana(): SugarDefaultChainable[java.lang.String] = js.native
    
    def last(): SugarDefaultChainable[java.lang.String] = js.native
    def last(n: Double): SugarDefaultChainable[java.lang.String] = js.native
    
    def lastIndexOf(searchString: java.lang.String): SugarDefaultChainable[Double] = js.native
    def lastIndexOf(searchString: java.lang.String, position: Double): SugarDefaultChainable[Double] = js.native
    
    def lines[T](): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    def lines[T](
      eachLineFn: js.Function3[
          /* line */ java.lang.String, 
          /* i */ Double, 
          /* arr */ typings.sugar.Array[java.lang.String], 
          SugarDefaultChainable[Unit]
        ]
    ): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    
    def link(url: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    
    def localeCompare(that: java.lang.String): SugarDefaultChainable[Double] = js.native
    def localeCompare(that: java.lang.String, locales: java.lang.String): SugarDefaultChainable[Double] = js.native
    def localeCompare(that: java.lang.String, locales: java.lang.String, options: CollatorOptions): SugarDefaultChainable[Double] = js.native
    def localeCompare(that: java.lang.String, locales: Unit, options: CollatorOptions): SugarDefaultChainable[Double] = js.native
    def localeCompare(that: java.lang.String, locales: typings.sugar.Array[java.lang.String]): SugarDefaultChainable[Double] = js.native
    def localeCompare(that: java.lang.String, locales: typings.sugar.Array[java.lang.String], options: CollatorOptions): SugarDefaultChainable[Double] = js.native
    
    def `match`(regexp: java.lang.String): SugarDefaultChainable[RegExpMatchArray | Null] = js.native
    def `match`(regexp: typings.sugar.RegExp): SugarDefaultChainable[RegExpMatchArray | Null] = js.native
    
    def normalize(): SugarDefaultChainable[java.lang.String] = js.native
    def normalize(form: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    @JSName("normalize")
    def normalize_NFC(form: NFC): SugarDefaultChainable[java.lang.String] = js.native
    @JSName("normalize")
    def normalize_NFD(form: NFD): SugarDefaultChainable[java.lang.String] = js.native
    @JSName("normalize")
    def normalize_NFKC(form: NFKC): SugarDefaultChainable[java.lang.String] = js.native
    @JSName("normalize")
    def normalize_NFKD(form: NFKD): SugarDefaultChainable[java.lang.String] = js.native
    
    def pad(num: Double): SugarDefaultChainable[java.lang.String] = js.native
    def pad(num: Double, padding: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    
    def padLeft(num: Double): SugarDefaultChainable[java.lang.String] = js.native
    def padLeft(num: Double, padding: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    
    def padRight(num: Double): SugarDefaultChainable[java.lang.String] = js.native
    def padRight(num: Double, padding: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    
    def parameterize(): SugarDefaultChainable[java.lang.String] = js.native
    
    def pluralize(): SugarDefaultChainable[java.lang.String] = js.native
    def pluralize(num: Double): SugarDefaultChainable[java.lang.String] = js.native
    
    var raw: RawValue = js.native
    
    def remove(f: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    def remove(f: typings.sugar.RegExp): SugarDefaultChainable[java.lang.String] = js.native
    
    def removeAll(f: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    def removeAll(f: typings.sugar.RegExp): SugarDefaultChainable[java.lang.String] = js.native
    
    def removeTags(): SugarDefaultChainable[java.lang.String] = js.native
    def removeTags(tag: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    def removeTags(tag: java.lang.String, replace: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    def removeTags(tag: java.lang.String, replace: replaceFn): SugarDefaultChainable[java.lang.String] = js.native
    def removeTags(tag: Unit, replace: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    def removeTags(tag: Unit, replace: replaceFn): SugarDefaultChainable[java.lang.String] = js.native
    
    def repeat(count: Double): SugarDefaultChainable[java.lang.String] = js.native
    
    def replace(searchValue: java.lang.String, replaceValue: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    def replace(
      searchValue: java.lang.String,
      replacer: js.Function2[/* substring */ java.lang.String, /* repeated */ js.Any, java.lang.String]
    ): SugarDefaultChainable[java.lang.String] = js.native
    def replace(searchValue: typings.sugar.RegExp, replaceValue: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    def replace(
      searchValue: typings.sugar.RegExp,
      replacer: js.Function2[/* substring */ java.lang.String, /* repeated */ js.Any, java.lang.String]
    ): SugarDefaultChainable[java.lang.String] = js.native
    
    def replaceAll(f: java.lang.String, args: js.Any*): SugarDefaultChainable[java.lang.String] = js.native
    def replaceAll(f: typings.sugar.RegExp, args: js.Any*): SugarDefaultChainable[java.lang.String] = js.native
    
    def reverse(): SugarDefaultChainable[java.lang.String] = js.native
    
    def search(regexp: java.lang.String): SugarDefaultChainable[Double] = js.native
    def search(regexp: typings.sugar.RegExp): SugarDefaultChainable[Double] = js.native
    
    def shift[T](n: Double): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    
    def singularize(): SugarDefaultChainable[java.lang.String] = js.native
    
    def slice(): SugarDefaultChainable[java.lang.String] = js.native
    def slice(start: Double): SugarDefaultChainable[java.lang.String] = js.native
    def slice(start: Double, end: Double): SugarDefaultChainable[java.lang.String] = js.native
    def slice(start: Unit, end: Double): SugarDefaultChainable[java.lang.String] = js.native
    
    def small(): SugarDefaultChainable[java.lang.String] = js.native
    
    def spacify(): SugarDefaultChainable[java.lang.String] = js.native
    
    def split(separator: java.lang.String): SugarDefaultChainable[typings.sugar.Array[java.lang.String]] = js.native
    def split(separator: java.lang.String, limit: Double): SugarDefaultChainable[typings.sugar.Array[java.lang.String]] = js.native
    def split(separator: typings.sugar.RegExp): SugarDefaultChainable[typings.sugar.Array[java.lang.String]] = js.native
    def split(separator: typings.sugar.RegExp, limit: Double): SugarDefaultChainable[typings.sugar.Array[java.lang.String]] = js.native
    
    def startsWith(searchString: java.lang.String): SugarDefaultChainable[Boolean] = js.native
    def startsWith(searchString: java.lang.String, position: Double): SugarDefaultChainable[Boolean] = js.native
    
    def strike(): SugarDefaultChainable[java.lang.String] = js.native
    
    def stripTags(): SugarDefaultChainable[java.lang.String] = js.native
    def stripTags(tag: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    def stripTags(tag: java.lang.String, replace: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    def stripTags(tag: java.lang.String, replace: replaceFn): SugarDefaultChainable[java.lang.String] = js.native
    def stripTags(tag: Unit, replace: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    def stripTags(tag: Unit, replace: replaceFn): SugarDefaultChainable[java.lang.String] = js.native
    
    def sub(): SugarDefaultChainable[java.lang.String] = js.native
    
    def substr(from: Double): SugarDefaultChainable[java.lang.String] = js.native
    def substr(from: Double, length: Double): SugarDefaultChainable[java.lang.String] = js.native
    
    def substring(start: Double): SugarDefaultChainable[java.lang.String] = js.native
    def substring(start: Double, end: Double): SugarDefaultChainable[java.lang.String] = js.native
    
    def sup(): SugarDefaultChainable[java.lang.String] = js.native
    
    def titleize(): SugarDefaultChainable[java.lang.String] = js.native
    
    def to(): SugarDefaultChainable[java.lang.String] = js.native
    def to(index: Double): SugarDefaultChainable[java.lang.String] = js.native
    
    def toLocaleLowerCase(): SugarDefaultChainable[java.lang.String] = js.native
    
    def toLocaleUpperCase(): SugarDefaultChainable[java.lang.String] = js.native
    
    def toLowerCase(): SugarDefaultChainable[java.lang.String] = js.native
    
    def toNumber(): SugarDefaultChainable[Double] = js.native
    def toNumber(base: Double): SugarDefaultChainable[Double] = js.native
    
    def toUpperCase(): SugarDefaultChainable[java.lang.String] = js.native
    
    def trim(): SugarDefaultChainable[java.lang.String] = js.native
    
    def trimLeft(): SugarDefaultChainable[java.lang.String] = js.native
    
    def trimRight(): SugarDefaultChainable[java.lang.String] = js.native
    
    def truncate(length: Double): SugarDefaultChainable[java.lang.String] = js.native
    def truncate(length: Double, from: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    def truncate(length: Double, from: java.lang.String, ellipsis: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    def truncate(length: Double, from: Unit, ellipsis: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    
    def truncateOnWord(length: Double): SugarDefaultChainable[java.lang.String] = js.native
    def truncateOnWord(length: Double, from: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    def truncateOnWord(length: Double, from: java.lang.String, ellipsis: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    def truncateOnWord(length: Double, from: Unit, ellipsis: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    
    def underscore(): SugarDefaultChainable[java.lang.String] = js.native
    
    def unescapeHTML(): SugarDefaultChainable[java.lang.String] = js.native
    
    def unescapeURL(): SugarDefaultChainable[java.lang.String] = js.native
    def unescapeURL(partial: Boolean): SugarDefaultChainable[java.lang.String] = js.native
    
    def words[T](): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    def words[T](
      eachWordFn: js.Function3[
          /* word */ java.lang.String, 
          /* i */ Double, 
          /* arr */ typings.sugar.Array[java.lang.String], 
          SugarDefaultChainable[Unit]
        ]
    ): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    
    def zenkaku(): SugarDefaultChainable[java.lang.String] = js.native
    def zenkaku(mode: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
  }
  
  @js.native
  trait Constructor
    extends StObject
       with SugarNamespace
       with Instantiable0[Chainable[java.lang.String]]
       with Instantiable1[/* raw */ java.lang.String, Chainable[java.lang.String]] {
    
    def apply(): Chainable[java.lang.String] = js.native
    def apply(raw: java.lang.String): Chainable[java.lang.String] = js.native
    
    def addAcronym(src: java.lang.String): Unit = js.native
    
    def addHuman(src: java.lang.String, human: java.lang.String): Unit = js.native
    def addHuman(src: typings.sugar.RegExp, human: java.lang.String): Unit = js.native
    
    def addPlural(singular: java.lang.String): Unit = js.native
    def addPlural(singular: java.lang.String, plural: java.lang.String): Unit = js.native
    
    def at[T](instance: java.lang.String, index: Double): T = js.native
    def at[T](instance: java.lang.String, index: Double, loop: Boolean): T = js.native
    def at[T](instance: java.lang.String, index: typings.sugar.Array[Double]): T = js.native
    def at[T](instance: java.lang.String, index: typings.sugar.Array[Double], loop: Boolean): T = js.native
    
    def camelize(instance: java.lang.String): java.lang.String = js.native
    def camelize(instance: java.lang.String, upper: Boolean): java.lang.String = js.native
    
    def capitalize(instance: java.lang.String): java.lang.String = js.native
    def capitalize(instance: java.lang.String, lower: Boolean): java.lang.String = js.native
    def capitalize(instance: java.lang.String, lower: Boolean, all: Boolean): java.lang.String = js.native
    def capitalize(instance: java.lang.String, lower: Unit, all: Boolean): java.lang.String = js.native
    
    def chars[T](instance: java.lang.String): typings.sugar.Array[T] = js.native
    def chars[T](
      instance: java.lang.String,
      eachCharFn: js.Function3[
          /* char */ java.lang.String, 
          /* i */ Double, 
          /* arr */ typings.sugar.Array[java.lang.String], 
          Unit
        ]
    ): typings.sugar.Array[T] = js.native
    
    def codes[T](instance: java.lang.String): typings.sugar.Array[T] = js.native
    def codes[T](
      instance: java.lang.String,
      eachCodeFn: js.Function3[/* code */ Double, /* i */ Double, /* str */ java.lang.String, Unit]
    ): typings.sugar.Array[T] = js.native
    
    def compact(instance: java.lang.String): java.lang.String = js.native
    
    def dasherize(instance: java.lang.String): java.lang.String = js.native
    
    def decodeBase64(instance: java.lang.String): java.lang.String = js.native
    
    def encodeBase64(instance: java.lang.String): java.lang.String = js.native
    
    def escapeHTML(instance: java.lang.String): java.lang.String = js.native
    
    def escapeURL(instance: java.lang.String): java.lang.String = js.native
    def escapeURL(instance: java.lang.String, param: Boolean): java.lang.String = js.native
    
    def first(instance: java.lang.String): java.lang.String = js.native
    def first(instance: java.lang.String, n: Double): java.lang.String = js.native
    
    def forEach[T](instance: java.lang.String): typings.sugar.Array[T] = js.native
    def forEach[T](
      instance: java.lang.String,
      eachFn: js.Function3[
          /* match */ java.lang.String, 
          /* i */ Double, 
          /* arr */ typings.sugar.Array[java.lang.String], 
          Unit
        ]
    ): typings.sugar.Array[T] = js.native
    def forEach[T](instance: java.lang.String, search: java.lang.String): typings.sugar.Array[T] = js.native
    def forEach[T](
      instance: java.lang.String,
      search: java.lang.String,
      eachFn: js.Function3[
          /* match */ java.lang.String, 
          /* i */ Double, 
          /* arr */ typings.sugar.Array[java.lang.String], 
          Unit
        ]
    ): typings.sugar.Array[T] = js.native
    def forEach[T](
      instance: java.lang.String,
      search: Unit,
      eachFn: js.Function3[
          /* match */ java.lang.String, 
          /* i */ Double, 
          /* arr */ typings.sugar.Array[java.lang.String], 
          Unit
        ]
    ): typings.sugar.Array[T] = js.native
    def forEach[T](instance: java.lang.String, search: typings.sugar.RegExp): typings.sugar.Array[T] = js.native
    def forEach[T](
      instance: java.lang.String,
      search: typings.sugar.RegExp,
      eachFn: js.Function3[
          /* match */ java.lang.String, 
          /* i */ Double, 
          /* arr */ typings.sugar.Array[java.lang.String], 
          Unit
        ]
    ): typings.sugar.Array[T] = js.native
    
    def format(instance: java.lang.String, args: js.Any*): java.lang.String = js.native
    
    def from(instance: java.lang.String): java.lang.String = js.native
    def from(instance: java.lang.String, index: Double): java.lang.String = js.native
    
    def hankaku(instance: java.lang.String): java.lang.String = js.native
    def hankaku(instance: java.lang.String, mode: java.lang.String): java.lang.String = js.native
    
    def hasArabic(instance: java.lang.String): Boolean = js.native
    
    def hasCyrillic(instance: java.lang.String): Boolean = js.native
    
    def hasDevanagari(instance: java.lang.String): Boolean = js.native
    
    def hasGreek(instance: java.lang.String): Boolean = js.native
    
    def hasHan(instance: java.lang.String): Boolean = js.native
    
    def hasHangul(instance: java.lang.String): Boolean = js.native
    
    def hasHebrew(instance: java.lang.String): Boolean = js.native
    
    def hasHiragana(instance: java.lang.String): Boolean = js.native
    
    def hasKana(instance: java.lang.String): Boolean = js.native
    
    def hasKanji(instance: java.lang.String): Boolean = js.native
    
    def hasKatakana(instance: java.lang.String): Boolean = js.native
    
    def hasLatin(instance: java.lang.String): Boolean = js.native
    
    def hasThai(instance: java.lang.String): Boolean = js.native
    
    def hiragana(instance: java.lang.String): java.lang.String = js.native
    def hiragana(instance: java.lang.String, all: Boolean): java.lang.String = js.native
    
    def humanize(instance: java.lang.String): java.lang.String = js.native
    
    def insert(instance: java.lang.String, str: java.lang.String): java.lang.String = js.native
    def insert(instance: java.lang.String, str: java.lang.String, index: Double): java.lang.String = js.native
    
    def isArabic(instance: java.lang.String): Boolean = js.native
    
    def isBlank(instance: java.lang.String): Boolean = js.native
    
    def isCyrillic(instance: java.lang.String): Boolean = js.native
    
    def isDevanagari(instance: java.lang.String): Boolean = js.native
    
    def isEmpty(instance: java.lang.String): Boolean = js.native
    
    def isGreek(instance: java.lang.String): Boolean = js.native
    
    def isHan(instance: java.lang.String): Boolean = js.native
    
    def isHangul(instance: java.lang.String): Boolean = js.native
    
    def isHebrew(instance: java.lang.String): Boolean = js.native
    
    def isHiragana(instance: java.lang.String): Boolean = js.native
    
    def isKana(instance: java.lang.String): Boolean = js.native
    
    def isKanji(instance: java.lang.String): Boolean = js.native
    
    def isKatakana(instance: java.lang.String): Boolean = js.native
    
    def isLatin(instance: java.lang.String): Boolean = js.native
    
    def isThai(instance: java.lang.String): Boolean = js.native
    
    def katakana(instance: java.lang.String): java.lang.String = js.native
    
    def last(instance: java.lang.String): java.lang.String = js.native
    def last(instance: java.lang.String, n: Double): java.lang.String = js.native
    
    def lines[T](instance: java.lang.String): typings.sugar.Array[T] = js.native
    def lines[T](
      instance: java.lang.String,
      eachLineFn: js.Function3[
          /* line */ java.lang.String, 
          /* i */ Double, 
          /* arr */ typings.sugar.Array[java.lang.String], 
          Unit
        ]
    ): typings.sugar.Array[T] = js.native
    
    def pad(instance: java.lang.String, num: Double): java.lang.String = js.native
    def pad(instance: java.lang.String, num: Double, padding: java.lang.String): java.lang.String = js.native
    
    def padLeft(instance: java.lang.String, num: Double): java.lang.String = js.native
    def padLeft(instance: java.lang.String, num: Double, padding: java.lang.String): java.lang.String = js.native
    
    def padRight(instance: java.lang.String, num: Double): java.lang.String = js.native
    def padRight(instance: java.lang.String, num: Double, padding: java.lang.String): java.lang.String = js.native
    
    def parameterize(instance: java.lang.String): java.lang.String = js.native
    
    def pluralize(instance: java.lang.String): java.lang.String = js.native
    def pluralize(instance: java.lang.String, num: Double): java.lang.String = js.native
    
    def range(): Range = js.native
    def range(start: java.lang.String): Range = js.native
    def range(start: java.lang.String, end: java.lang.String): Range = js.native
    def range(start: Unit, end: java.lang.String): Range = js.native
    
    def remove(instance: java.lang.String, f: java.lang.String): java.lang.String = js.native
    def remove(instance: java.lang.String, f: typings.sugar.RegExp): java.lang.String = js.native
    
    def removeAll(instance: java.lang.String, f: java.lang.String): java.lang.String = js.native
    def removeAll(instance: java.lang.String, f: typings.sugar.RegExp): java.lang.String = js.native
    
    def removeTags(instance: java.lang.String): java.lang.String = js.native
    def removeTags(instance: java.lang.String, tag: java.lang.String): java.lang.String = js.native
    def removeTags(instance: java.lang.String, tag: java.lang.String, replace: java.lang.String): java.lang.String = js.native
    def removeTags(instance: java.lang.String, tag: java.lang.String, replace: replaceFn): java.lang.String = js.native
    def removeTags(instance: java.lang.String, tag: Unit, replace: java.lang.String): java.lang.String = js.native
    def removeTags(instance: java.lang.String, tag: Unit, replace: replaceFn): java.lang.String = js.native
    
    def replaceAll(instance: java.lang.String, f: java.lang.String, args: js.Any*): java.lang.String = js.native
    def replaceAll(instance: java.lang.String, f: typings.sugar.RegExp, args: js.Any*): java.lang.String = js.native
    
    def reverse(instance: java.lang.String): java.lang.String = js.native
    
    def shift[T](instance: java.lang.String, n: Double): typings.sugar.Array[T] = js.native
    
    def singularize(instance: java.lang.String): java.lang.String = js.native
    
    def spacify(instance: java.lang.String): java.lang.String = js.native
    
    def stripTags(instance: java.lang.String): java.lang.String = js.native
    def stripTags(instance: java.lang.String, tag: java.lang.String): java.lang.String = js.native
    def stripTags(instance: java.lang.String, tag: java.lang.String, replace: java.lang.String): java.lang.String = js.native
    def stripTags(instance: java.lang.String, tag: java.lang.String, replace: replaceFn): java.lang.String = js.native
    def stripTags(instance: java.lang.String, tag: Unit, replace: java.lang.String): java.lang.String = js.native
    def stripTags(instance: java.lang.String, tag: Unit, replace: replaceFn): java.lang.String = js.native
    
    def titleize(instance: java.lang.String): java.lang.String = js.native
    
    def to(instance: java.lang.String): java.lang.String = js.native
    def to(instance: java.lang.String, index: Double): java.lang.String = js.native
    
    def toNumber(instance: java.lang.String): Double = js.native
    def toNumber(instance: java.lang.String, base: Double): Double = js.native
    
    def trimLeft(instance: java.lang.String): java.lang.String = js.native
    
    def trimRight(instance: java.lang.String): java.lang.String = js.native
    
    def truncate(instance: java.lang.String, length: Double): java.lang.String = js.native
    def truncate(instance: java.lang.String, length: Double, from: java.lang.String): java.lang.String = js.native
    def truncate(instance: java.lang.String, length: Double, from: java.lang.String, ellipsis: java.lang.String): java.lang.String = js.native
    def truncate(instance: java.lang.String, length: Double, from: Unit, ellipsis: java.lang.String): java.lang.String = js.native
    
    def truncateOnWord(instance: java.lang.String, length: Double): java.lang.String = js.native
    def truncateOnWord(instance: java.lang.String, length: Double, from: java.lang.String): java.lang.String = js.native
    def truncateOnWord(instance: java.lang.String, length: Double, from: java.lang.String, ellipsis: java.lang.String): java.lang.String = js.native
    def truncateOnWord(instance: java.lang.String, length: Double, from: Unit, ellipsis: java.lang.String): java.lang.String = js.native
    
    def underscore(instance: java.lang.String): java.lang.String = js.native
    
    def unescapeHTML(instance: java.lang.String): java.lang.String = js.native
    
    def unescapeURL(instance: java.lang.String): java.lang.String = js.native
    def unescapeURL(instance: java.lang.String, partial: Boolean): java.lang.String = js.native
    
    def words[T](instance: java.lang.String): typings.sugar.Array[T] = js.native
    def words[T](
      instance: java.lang.String,
      eachWordFn: js.Function3[
          /* word */ java.lang.String, 
          /* i */ Double, 
          /* arr */ typings.sugar.Array[java.lang.String], 
          Unit
        ]
    ): typings.sugar.Array[T] = js.native
    
    def zenkaku(instance: java.lang.String): java.lang.String = js.native
    def zenkaku(instance: java.lang.String, mode: java.lang.String): java.lang.String = js.native
  }
  
  type replaceFn = js.Function4[
    /* tag */ java.lang.String, 
    /* inner */ java.lang.String, 
    /* attr */ java.lang.String, 
    /* outer */ java.lang.String, 
    java.lang.String
  ]
}
