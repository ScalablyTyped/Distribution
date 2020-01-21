package typings.wordpressDom.mod

import typings.std.Element
import typings.std.ParentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Focusable extends js.Object {
  def find(context: ParentNode): js.Array[Element]
}

object Focusable {
  @scala.inline
  def apply(find: ParentNode => js.Array[Element]): Focusable = {
    val __obj = js.Dynamic.literal(find = js.Any.fromFunction1(find))
  
    __obj.asInstanceOf[Focusable]
  }
}

