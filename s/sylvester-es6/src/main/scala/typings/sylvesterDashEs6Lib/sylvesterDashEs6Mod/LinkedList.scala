package typings
package sylvesterDashEs6Lib.sylvesterDashEs6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sylvester-es6", "LinkedList")
@js.native
/**
  * Constructor function.
  */
class LinkedList () extends js.Object {
  /**
    * The first element in the linked list.
    */
  var first: LinkedListNode = js.native
  /**
    * The last element in the linked list.
    */
  var last: LinkedListNode = js.native
  /**
    * The length of the linked list.
    */
  var length: scala.Double = js.native
  /**
    * Get the node at a given index.
    */
  def at(i: scala.Double): LinkedListNode = js.native
  def each(fn: js.Function2[/* node */ LinkedListNode, /* i */ scala.Double, _], context: js.Any): scala.Unit = js.native
  /**
    * Executes a function to each of the node.
    */
  def forEach(fn: js.Function2[/* node */ LinkedListNode, /* i */ scala.Double, _], context: js.Any): scala.Unit = js.native
  /**
    * Get a random node in the list.
    */
  def randomNode(): LinkedListNode = js.native
  /**
    * Convert this linked list into an array.
    */
  def toArray(): js.Array[_] = js.native
}

/* static members */
@JSImport("sylvester-es6", "LinkedList")
@js.native
object LinkedList extends js.Object {
  /**
    * Creates a circular linked list
    */
  def Circular(data: js.Any): sylvesterDashEs6Lib.sylvesterDashEs6Mod.CircularLinkedList = js.native
  /**
    * Creates a node given the data.
    */
  def Node(data: js.Any): sylvesterDashEs6Lib.sylvesterDashEs6Mod.LinkedListNode = js.native
}

