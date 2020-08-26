package typings.typescriptCollections.bstreekvMod

import typings.typescriptCollections.utilMod.ICompareFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-collections/dist/lib/BSTreeKV", JSImport.Default)
@js.native
/**
  * Creates an empty binary search tree.
  * @class <p>A binary search tree is a binary tree in which each
  * internal node stores an element such that the elements stored in the
  * left subtree are less than it and the elements
  * stored in the right subtree are greater.</p>
  * <p>Formally, a binary search tree is a node-based binary tree data structure which
  * has the following properties:</p>
  * <ul>
  * <li>The left subtree of a node contains only nodes with elements less
  * than the node's element</li>
  * <li>The right subtree of a node contains only nodes with elements greater
  * than the node's element</li>
  * <li>Both the left and right subtrees must also be binary search trees.</li>
  * </ul>
  * <p>If the inserted elements are custom objects a compare function must
  * be provided at construction time, otherwise the <=, === and >= operators are
  * used to compare elements. Example:</p>
  * <pre>
  * function compare(a, b) {
  *  if (a is less than b by some ordering criterion) {
  *     return -1;
  *  } if (a is greater than b by the ordering criterion) {
  *     return 1;
  *  }
  *  // a must be equal to b
  *  return 0;
  * }
  * </pre>
  * @constructor
  * @param {function(Object,Object):number=} compareFunction optional
  * function used to compare two elements. Must return a negative integer,
  * zero, or a positive integer as the first argument is less than, equal to,
  * or greater than the second.
  */
class default[K, V /* <: K */] () extends BSTreeKV[K, V] {
  def this(compareFunction: ICompareFunction[K]) = this()
}

