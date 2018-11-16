package typings
package sugarDashCoreLib.sugarjsNs.StringNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChainableBase[RawValue] extends js.Object {
  var raw: RawValue = js.native
  def anchor(name: java.lang.String): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def big(): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def blink(): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def bold(): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def charAt(pos: scala.Double): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def charCodeAt(index: scala.Double): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def codePointAt(pos: scala.Double): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[js.UndefOr[scala.Double]] = js.native
  def concat(strings: java.lang.String*): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def endsWith(searchString: java.lang.String): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def endsWith(searchString: java.lang.String, endPosition: scala.Double): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def fixed(): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def fontcolor(color: java.lang.String): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def fontsize(size: java.lang.String): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def fontsize(size: scala.Double): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def includes(searchString: java.lang.String): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def includes(searchString: java.lang.String, position: scala.Double): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def indexOf(searchString: java.lang.String): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def indexOf(searchString: java.lang.String, position: scala.Double): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def italics(): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def lastIndexOf(searchString: java.lang.String): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def lastIndexOf(searchString: java.lang.String, position: scala.Double): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def link(url: java.lang.String): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def localeCompare(that: java.lang.String): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def localeCompare(that: java.lang.String, locales: java.lang.String): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def localeCompare(that: java.lang.String, locales: java.lang.String, options: stdLib.IntlNs.CollatorOptions): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def localeCompare(that: java.lang.String, locales: js.Array[java.lang.String]): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def localeCompare(
    that: java.lang.String,
    locales: js.Array[java.lang.String],
    options: stdLib.IntlNs.CollatorOptions
  ): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def `match`(regexp: java.lang.String): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[stdLib.RegExpMatchArray | scala.Null] = js.native
  def `match`(regexp: stdLib.RegExp): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[stdLib.RegExpMatchArray | scala.Null] = js.native
  def normalize(): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def normalize(form: java.lang.String): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  @JSName("normalize")
  def normalize_NFC(form: sugarDashCoreLib.sugarDashCoreLibStrings.NFC): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  @JSName("normalize")
  def normalize_NFD(form: sugarDashCoreLib.sugarDashCoreLibStrings.NFD): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  @JSName("normalize")
  def normalize_NFKC(form: sugarDashCoreLib.sugarDashCoreLibStrings.NFKC): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  @JSName("normalize")
  def normalize_NFKD(form: sugarDashCoreLib.sugarDashCoreLibStrings.NFKD): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def repeat(count: scala.Double): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def replace(searchValue: java.lang.String, replaceValue: java.lang.String): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def replace(
    searchValue: java.lang.String,
    replacer: js.Function2[/* substring */ java.lang.String, /* repeated */js.Any, java.lang.String]
  ): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def replace(searchValue: stdLib.RegExp, replaceValue: java.lang.String): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def replace(
    searchValue: stdLib.RegExp,
    replacer: js.Function2[/* substring */ java.lang.String, /* repeated */js.Any, java.lang.String]
  ): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def search(regexp: java.lang.String): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def search(regexp: stdLib.RegExp): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def slice(): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def slice(start: scala.Double): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def slice(start: scala.Double, end: scala.Double): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def small(): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def split(separator: java.lang.String): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[js.Array[java.lang.String]] = js.native
  def split(separator: java.lang.String, limit: scala.Double): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[js.Array[java.lang.String]] = js.native
  def split(separator: stdLib.RegExp): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[js.Array[java.lang.String]] = js.native
  def split(separator: stdLib.RegExp, limit: scala.Double): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[js.Array[java.lang.String]] = js.native
  def startsWith(searchString: java.lang.String): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def startsWith(searchString: java.lang.String, position: scala.Double): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def strike(): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def sub(): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def substr(from: scala.Double): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def substr(from: scala.Double, length: scala.Double): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def substring(start: scala.Double): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def substring(start: scala.Double, end: scala.Double): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def sup(): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def toLocaleLowerCase(): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def toLocaleUpperCase(): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def toLowerCase(): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def toUpperCase(): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def trim(): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
}

