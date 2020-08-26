package typings.wouter

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import typings.wouter.anon.Name
import typings.wouter.useLocationMod.Path
import typings.wouter.wouterBooleans.`false`
import typings.wouter.wouterBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wouter/preact/matcher", JSImport.Namespace)
@js.native
object preactMatcherMod extends js.Object {
  def default(): MatcherFn = js.native
  def default(makeRegexpFn: js.Function2[/* pattern */ String, /* keys */ js.UndefOr[js.Array[Name]], RegExp]): MatcherFn = js.native
  type DefaultParams = StringDictionary[String]
  type Match[T /* <: DefaultParams */] = MatchWithParams[T] | NoMatch
  type MatchWithParams[T /* <: DefaultParams */] = js.Tuple2[`true`, Params[T]]
  type MatcherFn = js.Function2[/* pattern */ Path, /* path */ Path, Match[DefaultParams]]
  type NoMatch = js.Tuple2[`false`, Null]
  type Params[T /* <: DefaultParams */] = T
}

