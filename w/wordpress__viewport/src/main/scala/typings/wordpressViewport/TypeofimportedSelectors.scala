package typings.wordpressViewport

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofimportedSelectors extends js.Object {
  def isViewportMatch(query: String): Boolean
}

object TypeofimportedSelectors {
  @scala.inline
  def apply(isViewportMatch: String => Boolean): TypeofimportedSelectors = {
    val __obj = js.Dynamic.literal(isViewportMatch = js.Any.fromFunction1(isViewportMatch))
  
    __obj.asInstanceOf[TypeofimportedSelectors]
  }
}

