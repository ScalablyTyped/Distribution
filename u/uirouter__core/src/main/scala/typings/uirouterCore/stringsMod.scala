package typings.uirouterCore

import typings.std.RegExp
import typings.uirouterCore.commonCommonMod.IInjectable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stringsMod {
  
  @JSImport("@uirouter/core/lib/common/strings", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def beforeAfterSubstr(char: String): js.Function1[/* str */ String, js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeAfterSubstr")(char.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* str */ String, js.Array[String]]]
  
  @scala.inline
  def fnToString(fn: IInjectable): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fnToString")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def functionToString(fn: js.Function): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("functionToString")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @JSImport("@uirouter/core/lib/common/strings", "hostRegex")
  @js.native
  val hostRegex: RegExp = js.native
  
  @scala.inline
  def joinNeighborsR(acc: js.Array[js.Any], x: js.Any): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("joinNeighborsR")(acc.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  
  @scala.inline
  def kebobString(camelCase: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("kebobString")(camelCase.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def maxLength(max: Double, str: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("maxLength")(max.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def padString(length: Double, str: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("padString")(length.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def splitEqual(str: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitEqual")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def splitHash(str: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitHash")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def splitOnDelim(delim: String): js.Function1[/* str */ String, js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitOnDelim")(delim.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* str */ String, js.Array[String]]]
  
  @scala.inline
  def splitQuery(str: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitQuery")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def stringify(o: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(o.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def stripLastPathElement(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripLastPathElement")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def trimHashVal(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("trimHashVal")(str.asInstanceOf[js.Any]).asInstanceOf[String]
}
