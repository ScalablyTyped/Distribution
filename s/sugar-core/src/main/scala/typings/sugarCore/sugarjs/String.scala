package typings.sugarCore.sugarjs

import typings.std.Intl.CollatorOptions
import typings.std.RegExpMatchArray
import typings.sugarCore.sugarCoreStrings.NFC
import typings.sugarCore.sugarCoreStrings.NFD
import typings.sugarCore.sugarCoreStrings.NFKC
import typings.sugarCore.sugarCoreStrings.NFKD
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sugarjs.String")
@js.native
object String extends js.Object {
  @js.native
  trait ChainableBase[RawValue] extends js.Object {
    var raw: RawValue = js.native
    def anchor(name: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    def big(): SugarDefaultChainable[java.lang.String] = js.native
    def blink(): SugarDefaultChainable[java.lang.String] = js.native
    def bold(): SugarDefaultChainable[java.lang.String] = js.native
    def charAt(pos: Double): SugarDefaultChainable[java.lang.String] = js.native
    def charCodeAt(index: Double): SugarDefaultChainable[Double] = js.native
    def codePointAt(pos: Double): SugarDefaultChainable[js.UndefOr[Double]] = js.native
    def concat(strings: java.lang.String*): SugarDefaultChainable[java.lang.String] = js.native
    def endsWith(searchString: java.lang.String): SugarDefaultChainable[Boolean] = js.native
    def endsWith(searchString: java.lang.String, endPosition: Double): SugarDefaultChainable[Boolean] = js.native
    def fixed(): SugarDefaultChainable[java.lang.String] = js.native
    def fontcolor(color: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    def fontsize(size: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    def fontsize(size: Double): SugarDefaultChainable[java.lang.String] = js.native
    def includes(searchString: java.lang.String): SugarDefaultChainable[Boolean] = js.native
    def includes(searchString: java.lang.String, position: Double): SugarDefaultChainable[Boolean] = js.native
    def indexOf(searchString: java.lang.String): SugarDefaultChainable[Double] = js.native
    def indexOf(searchString: java.lang.String, position: Double): SugarDefaultChainable[Double] = js.native
    def italics(): SugarDefaultChainable[java.lang.String] = js.native
    def lastIndexOf(searchString: java.lang.String): SugarDefaultChainable[Double] = js.native
    def lastIndexOf(searchString: java.lang.String, position: Double): SugarDefaultChainable[Double] = js.native
    def link(url: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    def localeCompare(that: java.lang.String): SugarDefaultChainable[Double] = js.native
    def localeCompare(that: java.lang.String, locales: js.UndefOr[scala.Nothing], options: CollatorOptions): SugarDefaultChainable[Double] = js.native
    def localeCompare(that: java.lang.String, locales: java.lang.String): SugarDefaultChainable[Double] = js.native
    def localeCompare(that: java.lang.String, locales: java.lang.String, options: CollatorOptions): SugarDefaultChainable[Double] = js.native
    def localeCompare(that: java.lang.String, locales: js.Array[java.lang.String]): SugarDefaultChainable[Double] = js.native
    def localeCompare(that: java.lang.String, locales: js.Array[java.lang.String], options: CollatorOptions): SugarDefaultChainable[Double] = js.native
    def `match`(regexp: java.lang.String): SugarDefaultChainable[RegExpMatchArray | Null] = js.native
    def `match`(regexp: typings.std.RegExp): SugarDefaultChainable[RegExpMatchArray | Null] = js.native
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
    def repeat(count: Double): SugarDefaultChainable[java.lang.String] = js.native
    def replace(searchValue: java.lang.String, replaceValue: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    def replace(
      searchValue: java.lang.String,
      replacer: js.Function2[/* substring */ java.lang.String, /* repeated */ js.Any, java.lang.String]
    ): SugarDefaultChainable[java.lang.String] = js.native
    def replace(searchValue: typings.std.RegExp, replaceValue: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    def replace(
      searchValue: typings.std.RegExp,
      replacer: js.Function2[/* substring */ java.lang.String, /* repeated */ js.Any, java.lang.String]
    ): SugarDefaultChainable[java.lang.String] = js.native
    def search(regexp: java.lang.String): SugarDefaultChainable[Double] = js.native
    def search(regexp: typings.std.RegExp): SugarDefaultChainable[Double] = js.native
    def slice(): SugarDefaultChainable[java.lang.String] = js.native
    def slice(start: js.UndefOr[scala.Nothing], end: Double): SugarDefaultChainable[java.lang.String] = js.native
    def slice(start: Double): SugarDefaultChainable[java.lang.String] = js.native
    def slice(start: Double, end: Double): SugarDefaultChainable[java.lang.String] = js.native
    def small(): SugarDefaultChainable[java.lang.String] = js.native
    def split(separator: java.lang.String): SugarDefaultChainable[js.Array[java.lang.String]] = js.native
    def split(separator: java.lang.String, limit: Double): SugarDefaultChainable[js.Array[java.lang.String]] = js.native
    def split(separator: typings.std.RegExp): SugarDefaultChainable[js.Array[java.lang.String]] = js.native
    def split(separator: typings.std.RegExp, limit: Double): SugarDefaultChainable[js.Array[java.lang.String]] = js.native
    def startsWith(searchString: java.lang.String): SugarDefaultChainable[Boolean] = js.native
    def startsWith(searchString: java.lang.String, position: Double): SugarDefaultChainable[Boolean] = js.native
    def strike(): SugarDefaultChainable[java.lang.String] = js.native
    def sub(): SugarDefaultChainable[java.lang.String] = js.native
    def substr(from: Double): SugarDefaultChainable[java.lang.String] = js.native
    def substr(from: Double, length: Double): SugarDefaultChainable[java.lang.String] = js.native
    def substring(start: Double): SugarDefaultChainable[java.lang.String] = js.native
    def substring(start: Double, end: Double): SugarDefaultChainable[java.lang.String] = js.native
    def sup(): SugarDefaultChainable[java.lang.String] = js.native
    def toLocaleLowerCase(): SugarDefaultChainable[java.lang.String] = js.native
    def toLocaleUpperCase(): SugarDefaultChainable[java.lang.String] = js.native
    def toLowerCase(): SugarDefaultChainable[java.lang.String] = js.native
    def toUpperCase(): SugarDefaultChainable[java.lang.String] = js.native
    def trim(): SugarDefaultChainable[java.lang.String] = js.native
  }
  
  type Chainable[RawValue] = ChainableBase[RawValue] with typings.sugarCore.sugarjs.Object.ChainableBase[RawValue]
}

