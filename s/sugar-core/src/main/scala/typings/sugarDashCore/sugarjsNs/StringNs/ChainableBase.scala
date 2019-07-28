package typings.sugarDashCore.sugarjsNs.StringNs

import typings.std.IntlNs.CollatorOptions
import typings.std.RegExp
import typings.std.RegExpMatchArray
import typings.sugarDashCore.sugarDashCoreStrings.NFC
import typings.sugarDashCore.sugarDashCoreStrings.NFD
import typings.sugarDashCore.sugarDashCoreStrings.NFKC
import typings.sugarDashCore.sugarDashCoreStrings.NFKD
import typings.sugarDashCore.sugarjsNs.SugarDefaultChainable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChainableBase[RawValue] extends js.Object {
  var raw: RawValue = js.native
  def anchor(name: String): SugarDefaultChainable[String] = js.native
  def big(): SugarDefaultChainable[String] = js.native
  def blink(): SugarDefaultChainable[String] = js.native
  def bold(): SugarDefaultChainable[String] = js.native
  def charAt(pos: Double): SugarDefaultChainable[String] = js.native
  def charCodeAt(index: Double): SugarDefaultChainable[Double] = js.native
  def codePointAt(pos: Double): SugarDefaultChainable[js.UndefOr[Double]] = js.native
  def concat(strings: String*): SugarDefaultChainable[String] = js.native
  def endsWith(searchString: String): SugarDefaultChainable[Boolean] = js.native
  def endsWith(searchString: String, endPosition: Double): SugarDefaultChainable[Boolean] = js.native
  def fixed(): SugarDefaultChainable[String] = js.native
  def fontcolor(color: String): SugarDefaultChainable[String] = js.native
  def fontsize(size: String): SugarDefaultChainable[String] = js.native
  def fontsize(size: Double): SugarDefaultChainable[String] = js.native
  def includes(searchString: String): SugarDefaultChainable[Boolean] = js.native
  def includes(searchString: String, position: Double): SugarDefaultChainable[Boolean] = js.native
  def indexOf(searchString: String): SugarDefaultChainable[Double] = js.native
  def indexOf(searchString: String, position: Double): SugarDefaultChainable[Double] = js.native
  def italics(): SugarDefaultChainable[String] = js.native
  def lastIndexOf(searchString: String): SugarDefaultChainable[Double] = js.native
  def lastIndexOf(searchString: String, position: Double): SugarDefaultChainable[Double] = js.native
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
  def repeat(count: Double): SugarDefaultChainable[String] = js.native
  def replace(searchValue: String, replaceValue: String): SugarDefaultChainable[String] = js.native
  def replace(searchValue: String, replacer: js.Function2[/* substring */ String, /* repeated */ js.Any, String]): SugarDefaultChainable[String] = js.native
  def replace(searchValue: RegExp, replaceValue: String): SugarDefaultChainable[String] = js.native
  def replace(searchValue: RegExp, replacer: js.Function2[/* substring */ String, /* repeated */ js.Any, String]): SugarDefaultChainable[String] = js.native
  def search(regexp: String): SugarDefaultChainable[Double] = js.native
  def search(regexp: RegExp): SugarDefaultChainable[Double] = js.native
  def slice(): SugarDefaultChainable[String] = js.native
  def slice(start: Double): SugarDefaultChainable[String] = js.native
  def slice(start: Double, end: Double): SugarDefaultChainable[String] = js.native
  def small(): SugarDefaultChainable[String] = js.native
  def split(separator: String): SugarDefaultChainable[js.Array[String]] = js.native
  def split(separator: String, limit: Double): SugarDefaultChainable[js.Array[String]] = js.native
  def split(separator: RegExp): SugarDefaultChainable[js.Array[String]] = js.native
  def split(separator: RegExp, limit: Double): SugarDefaultChainable[js.Array[String]] = js.native
  def startsWith(searchString: String): SugarDefaultChainable[Boolean] = js.native
  def startsWith(searchString: String, position: Double): SugarDefaultChainable[Boolean] = js.native
  def strike(): SugarDefaultChainable[String] = js.native
  def sub(): SugarDefaultChainable[String] = js.native
  def substr(from: Double): SugarDefaultChainable[String] = js.native
  def substr(from: Double, length: Double): SugarDefaultChainable[String] = js.native
  def substring(start: Double): SugarDefaultChainable[String] = js.native
  def substring(start: Double, end: Double): SugarDefaultChainable[String] = js.native
  def sup(): SugarDefaultChainable[String] = js.native
  def toLocaleLowerCase(): SugarDefaultChainable[String] = js.native
  def toLocaleUpperCase(): SugarDefaultChainable[String] = js.native
  def toLowerCase(): SugarDefaultChainable[String] = js.native
  def toUpperCase(): SugarDefaultChainable[String] = js.native
  def trim(): SugarDefaultChainable[String] = js.native
}

