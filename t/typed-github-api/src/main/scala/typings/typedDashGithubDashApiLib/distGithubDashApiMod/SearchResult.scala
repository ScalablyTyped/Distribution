package typings
package typedDashGithubDashApiLib.distGithubDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResult[T] extends js.Object {
  var result: T
  var score: scala.Double
}

object SearchResult {
  @scala.inline
  def apply[T](result: T, score: scala.Double): SearchResult[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.updateDynamic("score")(score)
    __obj.asInstanceOf[SearchResult[T]]
  }
}

