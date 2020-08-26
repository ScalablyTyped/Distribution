package typings.wordpressViewport.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofimportedSelectors extends js.Object {
  def isViewportMatch(query: String): Boolean = js.native
}

object TypeofimportedSelectors {
  @scala.inline
  def apply(isViewportMatch: String => Boolean): TypeofimportedSelectors = {
    val __obj = js.Dynamic.literal(isViewportMatch = js.Any.fromFunction1(isViewportMatch))
    __obj.asInstanceOf[TypeofimportedSelectors]
  }
  @scala.inline
  implicit class TypeofimportedSelectorsOps[Self <: TypeofimportedSelectors] (val x: Self) extends AnyVal {
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
    def setIsViewportMatch(value: String => Boolean): Self = this.set("isViewportMatch", js.Any.fromFunction1(value))
  }
  
}

