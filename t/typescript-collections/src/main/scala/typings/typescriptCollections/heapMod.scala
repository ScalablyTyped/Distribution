package typings.typescriptCollections

import typings.typescriptCollections.utilMod.ICompareFunction
import typings.typescriptCollections.utilMod.ILoopFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object heapMod {
  
  @JSImport("typescript-collections/dist/lib/Heap", JSImport.Default)
  @js.native
  /**
    * Creates an empty Heap.
    * @class
    * <p>A heap is a binary tree, where the nodes maintain the heap property:
    * each node is smaller than each of its children and therefore a MinHeap
    * This implementation uses an array to store elements.</p>
    * <p>If the inserted elements are custom objects a compare function must be provided,
    *  at construction time, otherwise the <=, === and >= operators are
    * used to compare elements. Example:</p>
    *
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
    *
    * <p>If a Max-Heap is wanted (greater elements on top) you can a provide a
    * reverse compare function to accomplish that behavior. Example:</p>
    *
    * <pre>
    * function reverseCompare(a, b) {
    *  if (a is less than b by some ordering criterion) {
    *     return 1;
    *  } if (a is greater than b by the ordering criterion) {
    *     return -1;
    *  }
    *  // a must be equal to b
    *  return 0;
    * }
    * </pre>
    *
    * @constructor
    * @param {function(Object,Object):number=} compareFunction optional
    * function used to compare two elements. Must return a negative integer,
    * zero, or a positive integer as the first argument is less than, equal to,
    * or greater than the second.
    */
  class default[T] () extends Heap[T] {
    def this(compareFunction: ICompareFunction[T]) = this()
  }
  
  @js.native
  trait Heap[T] extends StObject {
    
    /**
      * Adds the given element into the heap.
      * @param {*} element the element.
      * @return true if the element was added or fals if it is undefined.
      */
    def add(element: T): Boolean = js.native
    
    /**
      * Removes all of the elements from this heap.
      */
    def clear(): Unit = js.native
    
    /**
      * Function used to compare elements.
      * @type {function(Object,Object):number}
      * @private
      */
    var compare: js.Any = js.native
    
    /**
      * Returns true if this heap contains the specified element.
      * @param {Object} element element to search for.
      * @return {boolean} true if this Heap contains the specified element, false
      * otherwise.
      */
    def contains(element: T): Boolean = js.native
    
    /**
      * Array used to store the elements of the heap.
      * @type {Array.<Object>}
      * @private
      */
    var data: js.Any = js.native
    
    /**
      * Executes the provided function once for each element present in this heap in
      * no particular order.
      * @param {function(Object):*} callback function to execute, it is
      * invoked with one argument: the element value, to break the iteration you can
      * optionally return false.
      */
    def forEach(callback: ILoopFunction[T]): Unit = js.native
    
    /**
      * Checks if this heap is empty.
      * @return {boolean} true if and only if this heap contains no items; false
      * otherwise.
      */
    def isEmpty(): Boolean = js.native
    
    /**
      * Returns the index of the left child of the node at the given index.
      * @param {number} nodeIndex The index of the node to get the left child
      * for.
      * @return {number} The index of the left child.
      * @private
      */
    /* private */ def leftChildIndex(nodeIndex: js.Any): js.Any = js.native
    
    /**
      * Returns the index of the smaller child node (if it exists).
      * @param {number} leftChild left child index.
      * @param {number} rightChild right child index.
      * @return {number} the index with the minimum value or -1 if it doesn't
      * exists.
      * @private
      */
    /* private */ def minIndex(leftChild: js.Any, rightChild: js.Any): js.Any = js.native
    
    /**
      * Returns the index of the parent of the node at the given index.
      * @param {number} nodeIndex The index of the node to get the parent for.
      * @return {number} The index of the parent.
      * @private
      */
    /* private */ def parentIndex(nodeIndex: js.Any): js.Any = js.native
    
    /**
      * Retrieves but does not remove the root element of this heap.
      * @return {*} The value at the root of the heap. Returns undefined if the
      * heap is empty.
      */
    def peek(): js.UndefOr[T] = js.native
    
    /**
      * Retrieves and removes the root element of this heap.
      * @return {*} The value removed from the root of the heap. Returns
      * undefined if the heap is empty.
      */
    def removeRoot(): js.UndefOr[T] = js.native
    
    /**
      * Returns the index of the right child of the node at the given index.
      * @param {number} nodeIndex The index of the node to get the right child
      * for.
      * @return {number} The index of the right child.
      * @private
      */
    /* private */ def rightChildIndex(nodeIndex: js.Any): js.Any = js.native
    
    /**
      * Moves the node at the given index down to its proper place in the heap.
      * @param {number} nodeIndex The index of the node to move down.
      * @private
      */
    /* private */ def siftDown(nodeIndex: js.Any): js.Any = js.native
    
    /**
      * Moves the node at the given index up to its proper place in the heap.
      * @param {number} index The index of the node to move up.
      * @private
      */
    /* private */ def siftUp(index: js.Any): js.Any = js.native
    
    /**
      * Returns the number of elements in this heap.
      * @return {number} the number of elements in this heap.
      */
    def size(): Double = js.native
  }
  object Heap {
    
    @scala.inline
    def apply[T](
      add: T => Boolean,
      clear: () => Unit,
      compare: js.Any,
      contains: T => Boolean,
      data: js.Any,
      forEach: ILoopFunction[T] => Unit,
      isEmpty: () => Boolean,
      leftChildIndex: js.Any => js.Any,
      minIndex: (js.Any, js.Any) => js.Any,
      parentIndex: js.Any => js.Any,
      peek: () => js.UndefOr[T],
      removeRoot: () => js.UndefOr[T],
      rightChildIndex: js.Any => js.Any,
      siftDown: js.Any => js.Any,
      siftUp: js.Any => js.Any,
      size: () => Double
    ): Heap[T] = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), clear = js.Any.fromFunction0(clear), compare = compare.asInstanceOf[js.Any], contains = js.Any.fromFunction1(contains), data = data.asInstanceOf[js.Any], forEach = js.Any.fromFunction1(forEach), isEmpty = js.Any.fromFunction0(isEmpty), leftChildIndex = js.Any.fromFunction1(leftChildIndex), minIndex = js.Any.fromFunction2(minIndex), parentIndex = js.Any.fromFunction1(parentIndex), peek = js.Any.fromFunction0(peek), removeRoot = js.Any.fromFunction0(removeRoot), rightChildIndex = js.Any.fromFunction1(rightChildIndex), siftDown = js.Any.fromFunction1(siftDown), siftUp = js.Any.fromFunction1(siftUp), size = js.Any.fromFunction0(size))
      __obj.asInstanceOf[Heap[T]]
    }
    
    @scala.inline
    implicit class HeapMutableBuilder[Self <: Heap[_], T] (val x: Self with Heap[T]) extends AnyVal {
      
      @scala.inline
      def setAdd(value: T => Boolean): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCompare(value: js.Any): Self = StObject.set(x, "compare", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContains(value: T => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForEach(value: ILoopFunction[T] => Unit): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsEmpty(value: () => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLeftChildIndex(value: js.Any => js.Any): Self = StObject.set(x, "leftChildIndex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMinIndex(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "minIndex", js.Any.fromFunction2(value))
      
      @scala.inline
      def setParentIndex(value: js.Any => js.Any): Self = StObject.set(x, "parentIndex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPeek(value: () => js.UndefOr[T]): Self = StObject.set(x, "peek", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemoveRoot(value: () => js.UndefOr[T]): Self = StObject.set(x, "removeRoot", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRightChildIndex(value: js.Any => js.Any): Self = StObject.set(x, "rightChildIndex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSiftDown(value: js.Any => js.Any): Self = StObject.set(x, "siftDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSiftUp(value: js.Any => js.Any): Self = StObject.set(x, "siftUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSize(value: () => Double): Self = StObject.set(x, "size", js.Any.fromFunction0(value))
    }
  }
}
