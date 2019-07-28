package typings.sylvesterDashEs6.sylvesterDashEs6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sylvester-es6", "CircularLinkedList")
@js.native
class CircularLinkedList () extends LinkedList {
  /**
    * Appends a node into the list.
    */
  def append(node: LinkedListNode): Unit = js.native
  /**
    * Inserts a node before another node.
    */
  def insertAfter(node: LinkedListNode, newNode: LinkedListNode): Unit = js.native
  /**
    * Inserts a node after another node.
    */
  def insertBefore(node: LinkedListNode, newNode: LinkedListNode): Unit = js.native
  /**
    * Prepend a node into the list.
    */
  def prepend(node: LinkedListNode): Unit = js.native
  /**
    * Removes the given node.
    */
  def remove(node: LinkedListNode): Unit = js.native
  /**
    * Retrieves a node given a data. Returns `null` upon no matches.
    */
  def withData(data: js.Any): LinkedListNode | Null = js.native
}

/* static members */
@JSImport("sylvester-es6", "CircularLinkedList")
@js.native
object CircularLinkedList extends js.Object {
  /**
    * Creates a linked list from an array
    */
  def fromArray(list: js.Array[_], useNodes: Boolean): CircularLinkedList = js.native
}

