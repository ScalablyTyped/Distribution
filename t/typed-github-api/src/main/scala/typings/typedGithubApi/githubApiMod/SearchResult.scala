package typings.typedGithubApi.githubApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchResult[T] extends js.Object {
  var result: T = js.native
  var score: Double = js.native
}

object SearchResult {
  @scala.inline
  def apply[T](result: T, score: Double): SearchResult[T] = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResult[T]]
  }
  @scala.inline
  implicit class SearchResultOps[Self <: SearchResult[_], T] (val x: Self with SearchResult[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setResult(value: T): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def setScore(value: Double): Self = this.set("score", value.asInstanceOf[js.Any])
  }
  
}

