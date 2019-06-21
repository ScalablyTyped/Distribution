package typings
package wouterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wouter/matcher", JSImport.Namespace)
@js.native
object matcherMod extends js.Object {
  def default(): wouterLib.wouterMod.MatcherFn = js.native
  def default(
    makeRegexpFn: js.Function2[
      /* pattern */ java.lang.String, 
      /* keys */ js.UndefOr[js.Array[wouterLib.Anon_Name]], 
      stdLib.RegExp
    ]
  ): wouterLib.wouterMod.MatcherFn = js.native
}

