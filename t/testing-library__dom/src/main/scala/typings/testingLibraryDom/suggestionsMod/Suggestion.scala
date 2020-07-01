package typings.testingLibraryDom.suggestionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Suggestion extends js.Object {
  var queryName: String
}

object Suggestion {
  @scala.inline
  def apply(queryName: String): Suggestion = {
    val __obj = js.Dynamic.literal(queryName = queryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Suggestion]
  }
}

