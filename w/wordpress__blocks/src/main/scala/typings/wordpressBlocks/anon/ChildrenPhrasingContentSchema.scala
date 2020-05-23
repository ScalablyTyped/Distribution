package typings.wordpressBlocks.anon

import typings.wordpressBlocks.rawHandlingMod.PhrasingContentSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChildrenPhrasingContentSchema extends js.Object {
  val children: PhrasingContentSchema
}

object ChildrenPhrasingContentSchema {
  @scala.inline
  def apply(children: PhrasingContentSchema): ChildrenPhrasingContentSchema = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildrenPhrasingContentSchema]
  }
}

