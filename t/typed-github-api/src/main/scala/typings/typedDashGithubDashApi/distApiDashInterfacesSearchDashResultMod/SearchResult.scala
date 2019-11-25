package typings.typedDashGithubDashApi.distApiDashInterfacesSearchDashResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResult extends js.Object {
  var score: Double
}

object SearchResult {
  @scala.inline
  def apply(score: Double): SearchResult = {
    val __obj = js.Dynamic.literal(score = score.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SearchResult]
  }
}

