package typings
package typedDashGithubDashApiLib.distApiDashInterfacesSearchDashResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResult extends js.Object {
  var score: scala.Double
}

object SearchResult {
  @scala.inline
  def apply(score: scala.Double): SearchResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("score")(score)
    __obj.asInstanceOf[SearchResult]
  }
}

