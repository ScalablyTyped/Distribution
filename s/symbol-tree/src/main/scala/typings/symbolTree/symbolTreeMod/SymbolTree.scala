package typings.symbolTree.symbolTreeMod

import typings.symbolTree.anon.Filter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SymbolTree[T /* <: js.Object */] extends js.Object {
  /**
    * Iterate over all inclusive ancestors of the given object
    *
    * * `O(1)` for a single iteration
    *
    * @return An iterable iterator (ES6)
    */
  def ancestorsIterator(`object`: T): typings.symbolTree.treeIteratorMod.^[T] = js.native
  def ancestorsToArray(`object`: T): js.Array[T] = js.native
  def ancestorsToArray(`object`: T, options: ToArrayOptions[T]): js.Array[T] = js.native
  /**
    * Append all inclusive ancestors of the given object to an array.
    *
    * * `O(n)` where `n` is the amount of ancestors of the given `object`
    */
  @JSName("ancestorsToArray")
  def ancestorsToArray_THIS[THIS](`object`: T): js.Array[T] = js.native
  @JSName("ancestorsToArray")
  def ancestorsToArray_THIS[THIS](`object`: T, options: ToArrayOptions[T] with (Filter[THIS, T])): js.Array[T] = js.native
  /**
    * Insert the given object as the last child of the given reference object.
    * `newObject` is now the last child of `referenceObject`.
    *
    * * `O(1)`
    *
    * @throws {Error} If the newObject is already present in this SymbolTree
    */
  def appendChild[U /* <: T */](referenceObject: T, newObject: U): U = js.native
  /**
    * Calculate the number of children.
    *
    * * `O(n)` where `n` is the amount of children
    * * `O(1)` (amortized, if the tree is not modified)
    */
  def childrenCount(`object`: T): Double = js.native
  /**
    * Iterate over all children of the given object
    *
    * * `O(1)` for a single iteration
    *
    * @return An iterable iterator (ES6)
    */
  def childrenIterator(parent: T): typings.symbolTree.treeIteratorMod.^[T] = js.native
  def childrenIterator(parent: T, options: IteratorOptions): typings.symbolTree.treeIteratorMod.^[T] = js.native
  def childrenToArray(parent: T): js.Array[T] = js.native
  def childrenToArray(parent: T, options: ToArrayOptions[T]): js.Array[T] = js.native
  /**
    * Append all children of the given object to an array.
    *
    * * `O(n)` where `n` is the amount of children of the given `parent`
    */
  @JSName("childrenToArray")
  def childrenToArray_THIS[THIS](parent: T): js.Array[T] = js.native
  @JSName("childrenToArray")
  def childrenToArray_THIS[THIS](parent: T, options: ToArrayOptions[T] with (Filter[THIS, T])): js.Array[T] = js.native
  /**
    * Compare the position of an object relative to another object. A bit set is returned:
    *
    * <ul>
    *     <li>DISCONNECTED : 1</li>
    *     <li>PRECEDING : 2</li>
    *     <li>FOLLOWING : 4</li>
    *     <li>CONTAINS : 8</li>
    *     <li>CONTAINED_BY : 16</li>
    * </ul>
    *
    * The semantics are the same as compareDocumentPosition in DOM, with the exception that
    * DISCONNECTED never occurs with any other bit.
    *
    * where `n` and `m` are the amount of ancestors of `left` and `right`;
    * where `o` is the amount of children of the lowest common ancestor of `left` and `right`:
    *
    * * `O(n + m + o)` (worst case)
    * * `O(n + m)` (amortized, if the tree is not modified)
    */
  def compareTreePosition(left: T, right: T): Double = js.native
  /**
    * Returns the first child of the given object.
    *
    * * `O(1)`
    */
  def firstChild(`object`: T): T | Null = js.native
  /**
    * Find the following object (A) of the given object (B).
    * An object A is following an object B if A and B are in the same tree
    * and A comes after B in tree order.
    *
    * * `O(n)` (worst case) where `n` is the amount of objects in the entire tree
    * * `O(1)` (amortized when walking the entire tree)
    */
  def following(`object`: T): T | Null = js.native
  def following(`object`: T, options: SiblingOptions[T]): T | Null = js.native
  /**
    * Returns `true` if the object has any children. Otherwise it returns `false`.
    *
    * * `O(1)`
    */
  def hasChildren(`object`: T): Boolean = js.native
  /**
    * Find the index of the given object (the number of preceding siblings).
    *
    * * `O(n)` where `n` is the amount of preceding siblings
    * * `O(1)` (amortized, if the tree is not modified)
    *
    * @return The number of preceding siblings, or -1 if the object has no parent
    */
  def index(`object`: T): Double = js.native
  /**
    * You can use this function to (optionally) initialize an object right after its creation,
    * to take advantage of V8's fast properties. Also useful if you would like to
    * freeze your object.
    *
    * * `O(1)`
    */
  def initialize[O /* <: js.UndefOr[T | Null] */](`object`: O): O = js.native
  /**
    * Insert the given object after the reference object.
    * `newObject` is now the next sibling of `referenceObject`.
    *
    * * `O(1)`
    *
    * @throws {Error} If the newObject is already present in this SymbolTree
    */
  def insertAfter[U /* <: T */](referenceObject: T, newObject: U): U = js.native
  /**
    * Insert the given object before the reference object.
    * `newObject` is now the previous sibling of `referenceObject`.
    *
    * * `O(1)`
    *
    * @throws {Error} If the newObject is already present in this SymbolTree
    */
  def insertBefore[U /* <: T */](referenceObject: T, newObject: U): U = js.native
  /**
    * Returns the last child of the given object.
    *
    * * `O(1)`
    */
  def lastChild(`object`: T): T | Null = js.native
  /**
    * Find the inclusive descendant that is last in tree order of the given object.
    *
    * * `O(n)` (worst case) where `n` is the depth of the subtree of `object`
    */
  def lastInclusiveDescendant(`object`: T): T | Null = js.native
  /**
    * Returns the next sibling of the given object.
    *
    * * `O(1)`
    */
  def nextSibling(`object`: T): T | Null = js.native
  /**
    * Iterate over all the next siblings of the given object. (in tree order)
    *
    * * `O(1)` for a single iteration
    *
    * @return An iterable iterator (ES6)
    */
  def nextSiblingsIterator(`object`: T): typings.symbolTree.treeIteratorMod.^[T] = js.native
  /**
    * Return the parent of the given object.
    *
    * * `O(1)`
    */
  def parent(`object`: T): T | Null = js.native
  /**
    * Find the preceding object (A) of the given object (B).
    * An object A is preceding an object B if A and B are in the same tree
    * and A comes before B in tree order.
    *
    * * `O(n)` (worst case)
    * * `O(1)` (amortized when walking the entire tree)
    */
  def preceding(`object`: T): T | Null = js.native
  def preceding(`object`: T, options: SiblingOptions[T]): T | Null = js.native
  /**
    * Insert the given object as the first child of the given reference object.
    * `newObject` is now the first child of `referenceObject`.
    *
    * * `O(1)`
    *
    * @throws {Error} If the newObject is already present in this SymbolTree
    */
  def prependChild[U /* <: T */](referenceObject: T, newObject: U): U = js.native
  /**
    * Returns the previous sibling of the given object.
    *
    * * `O(1)`
    */
  def previousSibling(`object`: T): T | Null = js.native
  /**
    * Iterate over all the previous siblings of the given object. (in reverse tree order)
    *
    * * `O(1)` for a single iteration
    *
    * @return An iterable iterator (ES6)
    */
  def previousSiblingsIterator(`object`: T): typings.symbolTree.treeIteratorMod.^[T] = js.native
  /**
    * Remove the object from this tree.
    * Has no effect if already removed.
    *
    * * `O(1)`
    */
  def remove[U /* <: T */](`object`: U): U = js.native
  /**
    * Iterate over all descendants of the given object (in tree order).
    *
    * Where `n` is the amount of objects in the sub-tree of the given `root`:
    *
    * * `O(n)` (worst case for a single iteration)
    * * `O(n)` (amortized, when completing the iterator)
    *
    * @return An iterable iterator (ES6)
    */
  def treeIterator(`object`: T): typings.symbolTree.treeIteratorMod.^[T] = js.native
  def treeIterator(`object`: T, options: IteratorOptions): typings.symbolTree.treeIteratorMod.^[T] = js.native
  def treeToArray(`object`: T): js.Array[T] = js.native
  def treeToArray(`object`: T, options: ToArrayOptions[T]): js.Array[T] = js.native
  /**
    * Append all descendants of the given object to an array (in tree order).
    *
    * * `O(n)` where `n` is the amount of objects in the sub-tree of the given `object`
    */
  @JSName("treeToArray")
  def treeToArray_THIS[THIS](`object`: T): js.Array[T] = js.native
  @JSName("treeToArray")
  def treeToArray_THIS[THIS](`object`: T, options: ToArrayOptions[T] with (Filter[THIS, T])): js.Array[T] = js.native
}

