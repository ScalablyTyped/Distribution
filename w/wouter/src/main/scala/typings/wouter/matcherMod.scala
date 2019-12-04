package typings.wouter

import typings.std.RegExp
import typings.wouter.wouterMod.MatcherFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wouter/matcher", JSImport.Namespace)
@js.native
object matcherMod extends js.Object {
  def default(): MatcherFn = js.native
  def default(
    makeRegexpFn: js.Function2[/* pattern */ String, /* keys */ js.UndefOr[js.Array[Anon_Name]], RegExp]
  ): MatcherFn = js.native
}

