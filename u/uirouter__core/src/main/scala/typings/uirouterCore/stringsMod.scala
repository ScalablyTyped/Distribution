package typings.uirouterCore

import typings.std.RegExp
import typings.uirouterCore.commonCommonMod.IInjectable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/common/strings", JSImport.Namespace)
@js.native
object stringsMod extends js.Object {
  val hostRegex: RegExp = js.native
  def beforeAfterSubstr(char: String): js.Function1[/* str */ String, js.Array[String]] = js.native
  def fnToString(fn: IInjectable): js.Any = js.native
  def functionToString(fn: js.Function): js.Any = js.native
  def joinNeighborsR(acc: js.Array[_], x: js.Any): js.Array[_] = js.native
  def kebobString(camelCase: String): String = js.native
  def maxLength(max: Double, str: String): String = js.native
  def padString(length: Double, str: String): String = js.native
  def splitEqual(str: String): js.Array[String] = js.native
  def splitHash(str: String): js.Array[String] = js.native
  def splitOnDelim(delim: String): js.Function1[/* str */ String, js.Array[String]] = js.native
  def splitQuery(str: String): js.Array[String] = js.native
  def stringify(o: js.Any): String = js.native
  def stripLastPathElement(str: String): String = js.native
  def trimHashVal(str: String): String = js.native
}

