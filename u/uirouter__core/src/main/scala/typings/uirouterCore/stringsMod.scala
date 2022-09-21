package typings.uirouterCore

import typings.uirouterCore.commonCommonMod.IInjectable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stringsMod {
  
  @JSImport("@uirouter/core/lib/common/strings", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def beforeAfterSubstr(char: String): js.Function1[/* str */ String, js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeAfterSubstr")(char.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* str */ String, js.Array[String]]]
  
  inline def fnToString(fn: IInjectable): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fnToString")(fn.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def functionToString(fn: js.Function): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("functionToString")(fn.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@uirouter/core/lib/common/strings", "hostRegex")
  @js.native
  val hostRegex: js.RegExp = js.native
  
  inline def joinNeighborsR(acc: js.Array[Any], x: Any): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("joinNeighborsR")(acc.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def kebobString(camelCase: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("kebobString")(camelCase.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def maxLength(max: Double, str: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("maxLength")(max.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def padString(length: Double, str: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("padString")(length.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def splitEqual(str: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitEqual")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def splitHash(str: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitHash")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def splitOnDelim(delim: String): js.Function1[/* str */ String, js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitOnDelim")(delim.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* str */ String, js.Array[String]]]
  
  inline def splitQuery(str: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitQuery")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def stringify(o: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(o.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def stripLastPathElement(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripLastPathElement")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def trimHashVal(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("trimHashVal")(str.asInstanceOf[js.Any]).asInstanceOf[String]
}
