package typings
package xregexpLib.xregexpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xregexp", JSImport.Namespace)
@js.native
object xregexpModMembers extends js.Object {
  var version: java.lang.String = js.native
  def apply(pattern: java.lang.String): stdLib.RegExp = js.native
  def apply(pattern: java.lang.String, flags: java.lang.String): stdLib.RegExp = js.native
  def apply(pattern: stdLib.RegExp): stdLib.RegExp = js.native
  def XRegExp(pattern: java.lang.String): stdLib.RegExp = js.native
  def XRegExp(pattern: java.lang.String, flags: java.lang.String): stdLib.RegExp = js.native
  def XRegExp(pattern: stdLib.RegExp): stdLib.RegExp = js.native
  /* Since xregexp 3.0.0 can be used either via
  
              import X = require('xregexp');
              X();
  
          or via
  
              import XRegExp = X.XRegExp;
              XRegExp()
  
          I had to duplicate the function declarations. I could simply not
          find another way to accomplish this with TypeScript.
      */
  
  // begin API definitions
  def addToken(
    regex: stdLib.RegExp,
    handler: js.Function2[
      /* matchArr */ stdLib.RegExpExecArray, 
      /* scope */ java.lang.String, 
      java.lang.String
    ]
  ): scala.Unit = js.native
  /* Since xregexp 3.0.0 can be used either via
  
              import X = require('xregexp');
              X();
  
          or via
  
              import XRegExp = X.XRegExp;
              XRegExp()
  
          I had to duplicate the function declarations. I could simply not
          find another way to accomplish this with TypeScript.
      */
  
  // begin API definitions
  def addToken(
    regex: stdLib.RegExp,
    handler: js.Function2[
      /* matchArr */ stdLib.RegExpExecArray, 
      /* scope */ java.lang.String, 
      java.lang.String
    ],
    options: xregexpLib.xregexpMod.OuterXRegExpNs.TokenOpts
  ): scala.Unit = js.native
  def build(pattern: java.lang.String, subs: js.Array[java.lang.String]): stdLib.RegExp = js.native
  def build(pattern: java.lang.String, subs: js.Array[java.lang.String], flags: java.lang.String): stdLib.RegExp = js.native
  def cache(pattern: java.lang.String): stdLib.RegExp = js.native
  def cache(pattern: java.lang.String, flags: java.lang.String): stdLib.RegExp = js.native
  def escape(str: java.lang.String): java.lang.String = js.native
  def exec(str: java.lang.String, regex: stdLib.RegExp): stdLib.RegExpExecArray = js.native
  def exec(str: java.lang.String, regex: stdLib.RegExp, pos: scala.Double): stdLib.RegExpExecArray = js.native
  def exec(str: java.lang.String, regex: stdLib.RegExp, pos: scala.Double, sticky: scala.Boolean): stdLib.RegExpExecArray = js.native
  def forEach(
    str: java.lang.String,
    regex: stdLib.RegExp,
    callback: js.Function4[
      /* matchArr */ stdLib.RegExpExecArray, 
      /* index */ scala.Double, 
      /* input */ java.lang.String, 
      /* regexp */ stdLib.RegExp, 
      scala.Unit
    ]
  ): js.Any = js.native
  def globalize(regex: stdLib.RegExp): stdLib.RegExp = js.native
  def install(options: java.lang.String): scala.Unit = js.native
  def install(options: js.Object): scala.Unit = js.native
  def isInstalled(feature: java.lang.String): scala.Boolean = js.native
  def isRegExp(value: js.Any): scala.Boolean = js.native
  def `match`(str: java.lang.String, regex: stdLib.RegExp): js.Array[java.lang.String] = js.native
  def `match`(str: java.lang.String, regex: stdLib.RegExp, scope: java.lang.String): js.Any = js.native
  def matchChain(
    str: java.lang.String,
    chain: js.Array[stdLib.RegExp | xregexpLib.Anon_Backref | xregexpLib.Anon_BackrefRegex]
  ): js.Array[java.lang.String] = js.native
  def matchRecursive(str: java.lang.String, left: java.lang.String, right: java.lang.String): js.Array[java.lang.String] = js.native
  def matchRecursive(str: java.lang.String, left: java.lang.String, right: java.lang.String, flags: java.lang.String): js.Array[java.lang.String] = js.native
  def matchRecursive(
    str: java.lang.String,
    left: java.lang.String,
    right: java.lang.String,
    flags: java.lang.String,
    options: js.Object
  ): js.Array[java.lang.String] = js.native
  @JSName("match")
  def match_all(str: java.lang.String, regex: stdLib.RegExp, scope: xregexpLib.xregexpLibStrings.all): js.Array[java.lang.String] = js.native
  @JSName("match")
  def match_one(str: java.lang.String, regex: stdLib.RegExp, scope: xregexpLib.xregexpLibStrings.one): java.lang.String = js.native
  def replace(str: java.lang.String, search: java.lang.String, replacement: java.lang.String): java.lang.String = js.native
  def replace(
    str: java.lang.String,
    search: java.lang.String,
    replacement: java.lang.String,
    scope: java.lang.String
  ): java.lang.String = js.native
  def replace(str: java.lang.String, search: java.lang.String, replacement: js.Function): java.lang.String = js.native
  def replace(str: java.lang.String, search: java.lang.String, replacement: js.Function, scope: java.lang.String): java.lang.String = js.native
  def replace(str: java.lang.String, search: stdLib.RegExp, replacement: java.lang.String): java.lang.String = js.native
  def replace(
    str: java.lang.String,
    search: stdLib.RegExp,
    replacement: java.lang.String,
    scope: java.lang.String
  ): java.lang.String = js.native
  def replace(str: java.lang.String, search: stdLib.RegExp, replacement: js.Function): java.lang.String = js.native
  def replace(str: java.lang.String, search: stdLib.RegExp, replacement: js.Function, scope: java.lang.String): java.lang.String = js.native
  def replaceEach(str: java.lang.String, replacements: js.Array[js.Array[stdLib.RegExp | java.lang.String]]): java.lang.String = js.native
  def split(str: java.lang.String, separator: java.lang.String): js.Array[java.lang.String] = js.native
  def split(str: java.lang.String, separator: java.lang.String, limit: scala.Double): js.Array[java.lang.String] = js.native
  def split(str: java.lang.String, separator: stdLib.RegExp): js.Array[java.lang.String] = js.native
  def split(str: java.lang.String, separator: stdLib.RegExp, limit: scala.Double): js.Array[java.lang.String] = js.native
  def test(str: java.lang.String, regex: stdLib.RegExp): scala.Boolean = js.native
  def test(str: java.lang.String, regex: stdLib.RegExp, pos: scala.Double): scala.Boolean = js.native
  def test(str: java.lang.String, regex: stdLib.RegExp, pos: scala.Double, sticky: scala.Boolean): scala.Boolean = js.native
  def uninstall(options: java.lang.String): scala.Unit = js.native
  def uninstall(options: js.Object): scala.Unit = js.native
  def union(patterns: js.Array[java.lang.String | stdLib.RegExp]): stdLib.RegExp = js.native
  def union(patterns: js.Array[java.lang.String | stdLib.RegExp], flags: java.lang.String): stdLib.RegExp = js.native
}

