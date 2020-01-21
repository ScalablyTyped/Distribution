package typings.tinymce.mod.html

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tinymce", "html.Node")
@js.native
class Node protected () extends js.Object {
  def this(name: String, `type`: Double) = this()
  def append(node: Node): Node = js.native
  def attr(name: String): String | Node = js.native
  def attr(name: String, value: String): String | Node = js.native
  def create(name: String, attrs: js.Object): Unit = js.native
  def empty(): Node = js.native
  def getAll(name: String): js.Array[Node] = js.native
  def insert(node: Node, ref_node: Node): Node = js.native
  def insert(node: Node, ref_node: Node, before: Boolean): Node = js.native
  def isEmpty(elements: js.Object): Boolean = js.native
  def remove(): Node = js.native
  def replace(node: Node): Node = js.native
  def unwrap(): Unit = js.native
  def walk(): Node = js.native
  def walk(prev: Boolean): Node = js.native
  def wrap(wrapperNode: Node): Node = js.native
}

