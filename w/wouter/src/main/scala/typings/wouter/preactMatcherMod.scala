package typings.wouter

import typings.std.RegExp
import typings.wouter.preactMod.MatcherFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wouter/preact/matcher", JSImport.Namespace)
@js.native
object preactMatcherMod extends js.Object {
  def default(): MatcherFn = js.native
  def default(
    makeRegexpFn: js.Function2[/* pattern */ String, /* keys */ js.UndefOr[js.Array[AnonName]], RegExp]
  ): MatcherFn = js.native
}

