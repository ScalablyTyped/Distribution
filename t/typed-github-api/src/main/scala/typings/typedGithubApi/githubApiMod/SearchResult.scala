package typings.typedGithubApi.githubApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResult[T] extends js.Object {
  var result: T
  var score: Double
}

object SearchResult {
  @scala.inline
  def apply[T](result: T, score: Double): SearchResult[T] = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResult[T]]
  }
}

