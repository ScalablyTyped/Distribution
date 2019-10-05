package typings.tinymce.tinymceMod.dom

import typings.tinymce.tinymceMod.html.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeWalker extends js.Object {
  def current(): Node
  def next(): Node
  def prev(): Node
}

object TreeWalker {
  @scala.inline
  def apply(current: () => Node, next: () => Node, prev: () => Node): TreeWalker = {
    val __obj = js.Dynamic.literal(current = js.Any.fromFunction0(current), next = js.Any.fromFunction0(next), prev = js.Any.fromFunction0(prev))
  
    __obj.asInstanceOf[TreeWalker]
  }
}

