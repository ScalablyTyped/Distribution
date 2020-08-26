package typings.testingLibraryDom.suggestionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Suggestion extends js.Object {
  var queryName: String = js.native
}

object Suggestion {
  @scala.inline
  def apply(queryName: String): Suggestion = {
    val __obj = js.Dynamic.literal(queryName = queryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Suggestion]
  }
  @scala.inline
  implicit class SuggestionOps[Self <: Suggestion] (val x: Self) extends AnyVal {
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
    def setQueryName(value: String): Self = this.set("queryName", value.asInstanceOf[js.Any])
  }
  
}

