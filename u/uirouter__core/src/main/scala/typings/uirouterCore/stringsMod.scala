package typings.uirouterCore

import typings.std.RegExp
import typings.uirouterCore.commonCommonMod.IInjectable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stringsMod {
  
  @JSImport("@uirouter/core/lib/common/strings", "beforeAfterSubstr")
  @js.native
  def beforeAfterSubstr(char: String): js.Function1[/* str */ String, js.Array[String]] = js.native
  
  @JSImport("@uirouter/core/lib/common/strings", "fnToString")
  @js.native
  def fnToString(fn: IInjectable): js.Any = js.native
  
  @JSImport("@uirouter/core/lib/common/strings", "functionToString")
  @js.native
  def functionToString(fn: js.Function): js.Any = js.native
  
  @JSImport("@uirouter/core/lib/common/strings", "hostRegex")
  @js.native
  val hostRegex: RegExp = js.native
  
  @JSImport("@uirouter/core/lib/common/strings", "joinNeighborsR")
  @js.native
  def joinNeighborsR(acc: js.Array[_], x: js.Any): js.Array[_] = js.native
  
  @JSImport("@uirouter/core/lib/common/strings", "kebobString")
  @js.native
  def kebobString(camelCase: String): String = js.native
  
  @JSImport("@uirouter/core/lib/common/strings", "maxLength")
  @js.native
  def maxLength(max: Double, str: String): String = js.native
  
  @JSImport("@uirouter/core/lib/common/strings", "padString")
  @js.native
  def padString(length: Double, str: String): String = js.native
  
  @JSImport("@uirouter/core/lib/common/strings", "splitEqual")
  @js.native
  def splitEqual(str: String): js.Array[String] = js.native
  
  @JSImport("@uirouter/core/lib/common/strings", "splitHash")
  @js.native
  def splitHash(str: String): js.Array[String] = js.native
  
  @JSImport("@uirouter/core/lib/common/strings", "splitOnDelim")
  @js.native
  def splitOnDelim(delim: String): js.Function1[/* str */ String, js.Array[String]] = js.native
  
  @JSImport("@uirouter/core/lib/common/strings", "splitQuery")
  @js.native
  def splitQuery(str: String): js.Array[String] = js.native
  
  @JSImport("@uirouter/core/lib/common/strings", "stringify")
  @js.native
  def stringify(o: js.Any): String = js.native
  
  @JSImport("@uirouter/core/lib/common/strings", "stripLastPathElement")
  @js.native
  def stripLastPathElement(str: String): String = js.native
  
  @JSImport("@uirouter/core/lib/common/strings", "trimHashVal")
  @js.native
  def trimHashVal(str: String): String = js.native
}
