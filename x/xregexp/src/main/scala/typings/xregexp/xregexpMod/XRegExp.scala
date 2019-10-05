package typings.xregexp.xregexpMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import typings.std.RegExpExecArray
import typings.xregexp.Anon_Backref
import typings.xregexp.Anon_BackrefRegex
import typings.xregexp.xregexpStrings.all
import typings.xregexp.xregexpStrings.one
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// end API definitions
@JSImport("xregexp", "XRegExp")
@js.native
object XRegExp extends js.Object {
  var version: String = js.native
  def apply(pattern: String): RegExp = js.native
  def apply(pattern: String, flags: String): RegExp = js.native
  def apply(pattern: RegExp): RegExp = js.native
  // begin API definitions
  def addToken(regex: RegExp, handler: js.Function2[/* matchArr */ RegExpExecArray, /* scope */ String, String]): Unit = js.native
  def addToken(
    regex: RegExp,
    handler: js.Function2[/* matchArr */ RegExpExecArray, /* scope */ String, String],
    options: TokenOpts
  ): Unit = js.native
  def build(pattern: String, subs: js.Array[String]): RegExp = js.native
  def build(pattern: String, subs: js.Array[String], flags: String): RegExp = js.native
  def build(pattern: String, subs: StringDictionary[RegExp]): RegExp = js.native
  def build(pattern: String, subs: StringDictionary[RegExp], flags: String): RegExp = js.native
  def cache(pattern: String): RegExp = js.native
  def cache(pattern: String, flags: String): RegExp = js.native
  def escape(str: String): String = js.native
  def exec(str: String, regex: RegExp): RegExpExecArray = js.native
  def exec(str: String, regex: RegExp, pos: Double): RegExpExecArray = js.native
  def exec(str: String, regex: RegExp, pos: Double, sticky: Boolean): RegExpExecArray = js.native
  def forEach(
    str: String,
    regex: RegExp,
    callback: js.Function4[
      /* matchArr */ RegExpExecArray, 
      /* index */ Double, 
      /* input */ String, 
      /* regexp */ RegExp, 
      Unit
    ]
  ): js.Any = js.native
  def globalize(regex: RegExp): RegExp = js.native
  def install(options: String): Unit = js.native
  def install(options: js.Object): Unit = js.native
  def isInstalled(feature: String): Boolean = js.native
  def isRegExp(value: js.Any): Boolean = js.native
  def `match`(str: String, regex: RegExp): js.Array[String] = js.native
  def `match`(str: String, regex: RegExp, scope: String): js.Any = js.native
  def matchChain(str: String, chain: js.Array[Anon_Backref | Anon_BackrefRegex | RegExp]): js.Array[String] = js.native
  def matchRecursive(str: String, left: String, right: String): js.Array[String] = js.native
  def matchRecursive(str: String, left: String, right: String, flags: String): js.Array[String] = js.native
  def matchRecursive(str: String, left: String, right: String, flags: String, options: js.Object): js.Array[String] = js.native
  @JSName("match")
  def match_all(str: String, regex: RegExp, scope: all): js.Array[String] = js.native
  @JSName("match")
  def match_one(str: String, regex: RegExp, scope: one): String = js.native
  def replace(str: String, search: String, replacement: String): String = js.native
  def replace(str: String, search: String, replacement: String, scope: String): String = js.native
  def replace(str: String, search: String, replacement: js.Function): String = js.native
  def replace(str: String, search: String, replacement: js.Function, scope: String): String = js.native
  def replace(str: String, search: RegExp, replacement: String): String = js.native
  def replace(str: String, search: RegExp, replacement: String, scope: String): String = js.native
  def replace(str: String, search: RegExp, replacement: js.Function): String = js.native
  def replace(str: String, search: RegExp, replacement: js.Function, scope: String): String = js.native
  def replaceEach(str: String, replacements: js.Array[js.Array[RegExp | String]]): String = js.native
  def split(str: String, separator: String): js.Array[String] = js.native
  def split(str: String, separator: String, limit: Double): js.Array[String] = js.native
  def split(str: String, separator: RegExp): js.Array[String] = js.native
  def split(str: String, separator: RegExp, limit: Double): js.Array[String] = js.native
  def test(str: String, regex: RegExp): Boolean = js.native
  def test(str: String, regex: RegExp, pos: Double): Boolean = js.native
  def test(str: String, regex: RegExp, pos: Double, sticky: Boolean): Boolean = js.native
  def uninstall(options: String): Unit = js.native
  def uninstall(options: js.Object): Unit = js.native
  def union(patterns: js.Array[String | RegExp]): RegExp = js.native
  def union(patterns: js.Array[String | RegExp], flags: String): RegExp = js.native
}

