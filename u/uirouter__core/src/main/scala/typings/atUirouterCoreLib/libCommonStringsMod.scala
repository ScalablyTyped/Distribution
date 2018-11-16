package typings
package atUirouterCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/common/strings", JSImport.Namespace)
@js.native
object libCommonStringsMod extends js.Object {
  val beforeAfterSubstr: js.Function1[
    /* char */ java.lang.String, 
    js.Function1[/* str */ java.lang.String, js.Array[java.lang.String]]
  ] = js.native
  val hostRegex: stdLib.RegExp = js.native
  val splitEqual: js.Function1[/* str */ java.lang.String, js.Array[java.lang.String]] = js.native
  val splitHash: js.Function1[/* str */ java.lang.String, js.Array[java.lang.String]] = js.native
  val splitQuery: js.Function1[/* str */ java.lang.String, js.Array[java.lang.String]] = js.native
  val stripLastPathElement: js.Function1[/* str */ java.lang.String, java.lang.String] = js.native
  val trimHashVal: js.Function1[/* str */ java.lang.String, java.lang.String] = js.native
  def fnToString(fn: atUirouterCoreLib.libCommonCommonMod.IInjectable): js.Any = js.native
  def functionToString(fn: js.Function): js.Any = js.native
  def joinNeighborsR(acc: js.Array[_], x: js.Any): js.Array[_] = js.native
  def kebobString(camelCase: java.lang.String): java.lang.String = js.native
  def maxLength(max: scala.Double, str: java.lang.String): java.lang.String = js.native
  def padString(length: scala.Double, str: java.lang.String): java.lang.String = js.native
  def splitOnDelim(delim: java.lang.String): js.Function1[/* str */ java.lang.String, js.Array[java.lang.String]] = js.native
  def stringify(o: js.Any): java.lang.String = js.native
}

