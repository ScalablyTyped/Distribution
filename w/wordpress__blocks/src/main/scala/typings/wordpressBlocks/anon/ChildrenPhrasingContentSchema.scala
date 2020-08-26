package typings.wordpressBlocks.anon

import typings.wordpressBlocks.rawHandlingMod.PhrasingContentSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChildrenPhrasingContentSchema extends js.Object {
  val children: PhrasingContentSchema = js.native
}

object ChildrenPhrasingContentSchema {
  @scala.inline
  def apply(children: PhrasingContentSchema): ChildrenPhrasingContentSchema = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildrenPhrasingContentSchema]
  }
  @scala.inline
  implicit class ChildrenPhrasingContentSchemaOps[Self <: ChildrenPhrasingContentSchema] (val x: Self) extends AnyVal {
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
    def setChildren(value: PhrasingContentSchema): Self = this.set("children", value.asInstanceOf[js.Any])
  }
  
}

