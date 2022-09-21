package typings.typescriptCollections

import typings.typescriptCollections.utilMod.ICompareFunction
import typings.typescriptCollections.utilMod.ILoopFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  open class default[T] ()
    extends StObject
       with Heap[T] {
    def this(compareFunction: ICompareFunction[T]) = this()
    
    /**
      * Adds the given element into the heap.
      * @param {*} element the element.
      * @return true if the element was added or fals if it is undefined.
      */
    /* CompleteClass */
    override def add(element: T): Boolean = js.native
    
    /**
      * Removes all of the elements from this heap.
      */
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /**
      * Function used to compare elements.
      * @type {function(Object,Object):number}
      * @private
      */
    /* private */ /* CompleteClass */
    var compare: Any = js.native
    
    /**
      * Returns true if this heap contains the specified element.
      * @param {Object} element element to search for.
      * @return {boolean} true if this Heap contains the specified element, false
      * otherwise.
      */
    /* CompleteClass */
    override def contains(element: T): Boolean = js.native
    
    /**
      * Array used to store the elements of the heap.
      * @type {Array.<Object>}
      * @private
      */
    /* private */ /* CompleteClass */
    var data: Any = js.native
    
    /**
      * Executes the provided function once for each element present in this heap in
      * no particular order.
      * @param {function(Object):*} callback function to execute, it is
      * invoked with one argument: the element value, to break the iteration you can
      * optionally return false.
      */
    /* CompleteClass */
    override def forEach(callback: ILoopFunction[T]): Unit = js.native
    
    /**
      * Checks if this heap is empty.
      * @return {boolean} true if and only if this heap contains no items; false
      * otherwise.
      */
    /* CompleteClass */
    override def isEmpty(): Boolean = js.native
    
    /**
      * Returns the index of the left child of the node at the given index.
      * @param {number} nodeIndex The index of the node to get the left child
      * for.
      * @return {number} The index of the left child.
      * @private
      */
    /* private */ /* CompleteClass */
    override def leftChildIndex(nodeIndex: Any): Any = js.native
    
    /**
      * Returns the index of the smaller child node (if it exists).
      * @param {number} leftChild left child index.
      * @param {number} rightChild right child index.
      * @return {number} the index with the minimum value or -1 if it doesn't
      * exists.
      * @private
      */
    /* private */ /* CompleteClass */
    override def minIndex(leftChild: Any, rightChild: Any): Any = js.native
    
    /**
      * Returns the index of the parent of the node at the given index.
      * @param {number} nodeIndex The index of the node to get the parent for.
      * @return {number} The index of the parent.
      * @private
      */
    /* private */ /* CompleteClass */
    override def parentIndex(nodeIndex: Any): Any = js.native
    
    /**
      * Retrieves but does not remove the root element of this heap.
      * @return {*} The value at the root of the heap. Returns undefined if the
      * heap is empty.
      */
    /* CompleteClass */
    override def peek(): js.UndefOr[T] = js.native
    
    /**
      * Retrieves and removes the root element of this heap.
      * @return {*} The value removed from the root of the heap. Returns
      * undefined if the heap is empty.
      */
    /* CompleteClass */
    override def removeRoot(): js.UndefOr[T] = js.native
    
    /**
      * Returns the index of the right child of the node at the given index.
      * @param {number} nodeIndex The index of the node to get the right child
      * for.
      * @return {number} The index of the right child.
      * @private
      */
    /* private */ /* CompleteClass */
    override def rightChildIndex(nodeIndex: Any): Any = js.native
    
    /**
      * Moves the node at the given index down to its proper place in the heap.
      * @param {number} nodeIndex The index of the node to move down.
      * @private
      */
    /* private */ /* CompleteClass */
    override def siftDown(nodeIndex: Any): Any = js.native
    
    /**
      * Moves the node at the given index up to its proper place in the heap.
      * @param {number} index The index of the node to move up.
      * @private
      */
    /* private */ /* CompleteClass */
    override def siftUp(index: Any): Any = js.native
    
    /**
      * Returns the number of elements in this heap.
      * @return {number} the number of elements in this heap.
      */
    /* CompleteClass */
    override def size(): Double = js.native
  }
  
  trait Heap[T] extends StObject {
    
    /**
      * Adds the given element into the heap.
      * @param {*} element the element.
      * @return true if the element was added or fals if it is undefined.
      */
    def add(element: T): Boolean
    
    /**
      * Removes all of the elements from this heap.
      */
    def clear(): Unit
    
    /**
      * Function used to compare elements.
      * @type {function(Object,Object):number}
      * @private
      */
    /* private */ var compare: Any
    
    /**
      * Returns true if this heap contains the specified element.
      * @param {Object} element element to search for.
      * @return {boolean} true if this Heap contains the specified element, false
      * otherwise.
      */
    def contains(element: T): Boolean
    
    /**
      * Array used to store the elements of the heap.
      * @type {Array.<Object>}
      * @private
      */
    /* private */ var data: Any
    
    /**
      * Executes the provided function once for each element present in this heap in
      * no particular order.
      * @param {function(Object):*} callback function to execute, it is
      * invoked with one argument: the element value, to break the iteration you can
      * optionally return false.
      */
    def forEach(callback: ILoopFunction[T]): Unit
    
    /**
      * Checks if this heap is empty.
      * @return {boolean} true if and only if this heap contains no items; false
      * otherwise.
      */
    def isEmpty(): Boolean
    
    /**
      * Returns the index of the left child of the node at the given index.
      * @param {number} nodeIndex The index of the node to get the left child
      * for.
      * @return {number} The index of the left child.
      * @private
      */
    /* private */ def leftChildIndex(nodeIndex: Any): Any
    
    /**
      * Returns the index of the smaller child node (if it exists).
      * @param {number} leftChild left child index.
      * @param {number} rightChild right child index.
      * @return {number} the index with the minimum value or -1 if it doesn't
      * exists.
      * @private
      */
    /* private */ def minIndex(leftChild: Any, rightChild: Any): Any
    
    /**
      * Returns the index of the parent of the node at the given index.
      * @param {number} nodeIndex The index of the node to get the parent for.
      * @return {number} The index of the parent.
      * @private
      */
    /* private */ def parentIndex(nodeIndex: Any): Any
    
    /**
      * Retrieves but does not remove the root element of this heap.
      * @return {*} The value at the root of the heap. Returns undefined if the
      * heap is empty.
      */
    def peek(): js.UndefOr[T]
    
    /**
      * Retrieves and removes the root element of this heap.
      * @return {*} The value removed from the root of the heap. Returns
      * undefined if the heap is empty.
      */
    def removeRoot(): js.UndefOr[T]
    
    /**
      * Returns the index of the right child of the node at the given index.
      * @param {number} nodeIndex The index of the node to get the right child
      * for.
      * @return {number} The index of the right child.
      * @private
      */
    /* private */ def rightChildIndex(nodeIndex: Any): Any
    
    /**
      * Moves the node at the given index down to its proper place in the heap.
      * @param {number} nodeIndex The index of the node to move down.
      * @private
      */
    /* private */ def siftDown(nodeIndex: Any): Any
    
    /**
      * Moves the node at the given index up to its proper place in the heap.
      * @param {number} index The index of the node to move up.
      * @private
      */
    /* private */ def siftUp(index: Any): Any
    
    /**
      * Returns the number of elements in this heap.
      * @return {number} the number of elements in this heap.
      */
    def size(): Double
  }
  object Heap {
    
    inline def apply[T](
      add: T => Boolean,
      clear: () => Unit,
      compare: Any,
      contains: T => Boolean,
      data: Any,
      forEach: ILoopFunction[T] => Unit,
      isEmpty: () => Boolean,
      leftChildIndex: Any => Any,
      minIndex: (Any, Any) => Any,
      parentIndex: Any => Any,
      peek: () => js.UndefOr[T],
      removeRoot: () => js.UndefOr[T],
      rightChildIndex: Any => Any,
      siftDown: Any => Any,
      siftUp: Any => Any,
      size: () => Double
    ): Heap[T] = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), clear = js.Any.fromFunction0(clear), compare = compare.asInstanceOf[js.Any], contains = js.Any.fromFunction1(contains), data = data.asInstanceOf[js.Any], forEach = js.Any.fromFunction1(forEach), isEmpty = js.Any.fromFunction0(isEmpty), leftChildIndex = js.Any.fromFunction1(leftChildIndex), minIndex = js.Any.fromFunction2(minIndex), parentIndex = js.Any.fromFunction1(parentIndex), peek = js.Any.fromFunction0(peek), removeRoot = js.Any.fromFunction0(removeRoot), rightChildIndex = js.Any.fromFunction1(rightChildIndex), siftDown = js.Any.fromFunction1(siftDown), siftUp = js.Any.fromFunction1(siftUp), size = js.Any.fromFunction0(size))
      __obj.asInstanceOf[Heap[T]]
    }
    
    extension [Self <: Heap[?], T](x: Self & Heap[T]) {
      
      inline def setAdd(value: T => Boolean): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setCompare(value: Any): Self = StObject.set(x, "compare", value.asInstanceOf[js.Any])
      
      inline def setContains(value: T => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setForEach(value: ILoopFunction[T] => Unit): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
      
      inline def setIsEmpty(value: () => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction0(value))
      
      inline def setLeftChildIndex(value: Any => Any): Self = StObject.set(x, "leftChildIndex", js.Any.fromFunction1(value))
      
      inline def setMinIndex(value: (Any, Any) => Any): Self = StObject.set(x, "minIndex", js.Any.fromFunction2(value))
      
      inline def setParentIndex(value: Any => Any): Self = StObject.set(x, "parentIndex", js.Any.fromFunction1(value))
      
      inline def setPeek(value: () => js.UndefOr[T]): Self = StObject.set(x, "peek", js.Any.fromFunction0(value))
      
      inline def setRemoveRoot(value: () => js.UndefOr[T]): Self = StObject.set(x, "removeRoot", js.Any.fromFunction0(value))
      
      inline def setRightChildIndex(value: Any => Any): Self = StObject.set(x, "rightChildIndex", js.Any.fromFunction1(value))
      
      inline def setSiftDown(value: Any => Any): Self = StObject.set(x, "siftDown", js.Any.fromFunction1(value))
      
      inline def setSiftUp(value: Any => Any): Self = StObject.set(x, "siftUp", js.Any.fromFunction1(value))
      
      inline def setSize(value: () => Double): Self = StObject.set(x, "size", js.Any.fromFunction0(value))
    }
  }
}
