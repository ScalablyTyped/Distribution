package typings
package atUirouterCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/common/strings", JSImport.Namespace)
@js.native
object libCommonStringsMod extends js.Object {
  val hostRegex: stdLib.RegExp = js.native
  def beforeAfterSubstr(char: java.lang.String): js.Function1[/* str */ java.lang.String, js.Array[java.lang.String]] = js.native
  def fnToString(fn: atUirouterCoreLib.libCommonCommonMod.IInjectable): js.Any = js.native
  def functionToString(fn: js.Function): js.Any = js.native
  def joinNeighborsR(acc: js.Array[_], x: js.Any): js.Array[_] = js.native
  def kebobString(camelCase: java.lang.String): java.lang.String = js.native
  def maxLength(max: scala.Double, str: java.lang.String): java.lang.String = js.native
  def padString(length: scala.Double, str: java.lang.String): java.lang.String = js.native
  def splitEqual(str: java.lang.String): js.Array[java.lang.String] = js.native
  def splitHash(str: java.lang.String): js.Array[java.lang.String] = js.native
  def splitOnDelim(delim: java.lang.String): js.Function1[/* str */ java.lang.String, js.Array[java.lang.String]] = js.native
  def splitQuery(str: java.lang.String): js.Array[java.lang.String] = js.native
  def stringify(o: js.Any): java.lang.String = js.native
  def stripLastPathElement(str: java.lang.String): java.lang.String = js.native
  def trimHashVal(str: java.lang.String): java.lang.String = js.native
}

