package typings.atWordpressViewport

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofimported_selectors extends js.Object {
  def isViewportMatch(query: String): Boolean
}

object Typeofimported_selectors {
  @scala.inline
  def apply(isViewportMatch: String => Boolean): Typeofimported_selectors = {
    val __obj = js.Dynamic.literal(isViewportMatch = js.Any.fromFunction1(isViewportMatch))
  
    __obj.asInstanceOf[Typeofimported_selectors]
  }
}

