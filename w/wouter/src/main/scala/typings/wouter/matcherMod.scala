package typings.wouter

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import typings.wouter.anon.Name
import typings.wouter.wouterBooleans.`false`
import typings.wouter.wouterBooleans.`true`
import typings.wouter.wouterUseLocationMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object matcherMod {
  
  @JSImport("wouter/matcher", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(): MatcherFn = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[MatcherFn]
  @scala.inline
  def default(makeRegexpFn: js.Function2[/* pattern */ String, /* keys */ js.UndefOr[js.Array[Name]], RegExp]): MatcherFn = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(makeRegexpFn.asInstanceOf[js.Any]).asInstanceOf[MatcherFn]
  
  type DefaultParams = StringDictionary[String]
  
  type Match[T /* <: DefaultParams */] = MatchWithParams[T] | NoMatch
  
  type MatchWithParams[T /* <: DefaultParams */] = js.Tuple2[`true`, Params[T]]
  
  type MatcherFn = js.Function2[/* pattern */ Path, /* path */ Path, Match[DefaultParams]]
  
  type NoMatch = js.Tuple2[`false`, Null]
  
  type Params[T /* <: DefaultParams */] = T
}
