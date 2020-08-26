package typings.winjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentTransition extends js.Object {
  /**
    * The animation plays when the Hub is changing its content.
    **/
  var contentTransition: String = js.native
  /**
    * The animation plays when the Hub is first displayed.
    **/
  var entrance: String = js.native
  /**
    * The animation plays when a section is inserted into the Hub.
    **/
  var insert: String = js.native
  /**
    * The animation plays when a section is removed into the Hub.
    **/
  var remove: String = js.native
}

object ContentTransition {
  @scala.inline
  def apply(contentTransition: String, entrance: String, insert: String, remove: String): ContentTransition = {
    val __obj = js.Dynamic.literal(contentTransition = contentTransition.asInstanceOf[js.Any], entrance = entrance.asInstanceOf[js.Any], insert = insert.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentTransition]
  }
  @scala.inline
  implicit class ContentTransitionOps[Self <: ContentTransition] (val x: Self) extends AnyVal {
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
    def setContentTransition(value: String): Self = this.set("contentTransition", value.asInstanceOf[js.Any])
    @scala.inline
    def setEntrance(value: String): Self = this.set("entrance", value.asInstanceOf[js.Any])
    @scala.inline
    def setInsert(value: String): Self = this.set("insert", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemove(value: String): Self = this.set("remove", value.asInstanceOf[js.Any])
  }
  
}

