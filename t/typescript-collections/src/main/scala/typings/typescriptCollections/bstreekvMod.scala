package typings.typescriptCollections

import typings.typescriptCollections.utilMod.ICompareFunction
import typings.typescriptCollections.utilMod.ILoopFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bstreekvMod {
  
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
  class default[K, V /* <: K */] ()
    extends StObject
       with BSTreeKV[K, V] {
    def this(compareFunction: ICompareFunction[K]) = this()
    
    /**
      * Adds the specified element to this tree if it is not already present.
      * @param {Object} element the element to insert.
      * @return {boolean} true if this tree did not already contain the specified element.
      */
    /* CompleteClass */
    override def add(element: V): Boolean = js.native
    
    /**
      * Removes all of the elements from this tree.
      */
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /* private */ /* CompleteClass */
    var compare: js.Any = js.native
    
    /**
      * Returns true if this tree contains the specified element.
      * @param {Object} element element to search for.
      * @return {boolean} true if this tree contains the specified element,
      * false otherwise.
      */
    /* CompleteClass */
    override def contains(element: K): Boolean = js.native
    
    /**
      * @private
      */
    /* private */ /* CompleteClass */
    override def createNode(element: js.Any): js.Any = js.native
    
    /**
      * Executes the provided function once for each element present in this tree in inorder.
      * Equivalent to inorderTraversal.
      * @param {function(Object):*} callback function to execute, it is
      * invoked with one argument: the element value, to break the iteration you can
      * optionally return false.
      */
    /* CompleteClass */
    override def forEach(callback: ILoopFunction[V]): Unit = js.native
    
    /**
      * Returns the height of this tree.
      * @return {number} the height of this tree or -1 if is empty.
      */
    /* CompleteClass */
    override def height(): Double = js.native
    
    /**
      * @private
      */
    /* private */ /* CompleteClass */
    override def heightAux(node: js.Any): js.Any = js.native
    
    /**
      * Executes the provided function once for each element present in this tree in
      * in-order.
      * @param {function(Object):*} callback function to execute, it is invoked with one
      * argument: the element value, to break the iteration you can optionally return false.
      */
    /* CompleteClass */
    override def inorderTraversal(callback: ILoopFunction[V]): Unit = js.native
    
    /**
      * @private
      */
    /* private */ /* CompleteClass */
    override def inorderTraversalAux(node: js.Any, callback: js.Any, signal: js.Any): js.Any = js.native
    
    /* private */ /* CompleteClass */
    override def insertNode(node: js.Any): js.Any = js.native
    
    /**
      * Returns true if this tree contains no elements.
      * @return {boolean} true if this tree contains no elements.
      */
    /* CompleteClass */
    override def isEmpty(): Boolean = js.native
    
    /**
      * Executes the provided function once for each element present in this tree in
      * level-order.
      * @param {function(Object):*} callback function to execute, it is invoked with one
      * argument: the element value, to break the iteration you can optionally return false.
      */
    /* CompleteClass */
    override def levelTraversal(callback: ILoopFunction[V]): Unit = js.native
    
    /**
      * @private
      */
    /* private */ /* CompleteClass */
    override def levelTraversalAux(node: js.Any, callback: js.Any): js.Any = js.native
    
    /**
      * Returns the maximum element of this tree.
      * @return {*} the maximum element of this tree or undefined if this tree is
      * is empty.
      */
    /* CompleteClass */
    override def maximum(): js.UndefOr[V] = js.native
    
    /**
      * @private
      */
    /* private */ /* CompleteClass */
    override def maximumAux(node: js.Any): js.Any = js.native
    
    /**
      * Returns the minimum element of this tree.
      * @return {*} the minimum element of this tree or undefined if this tree is
      * is empty.
      */
    /* CompleteClass */
    override def minimum(): js.UndefOr[V] = js.native
    
    /**
      * @private
      */
    /* private */ /* CompleteClass */
    override def minimumAux(node: js.Any): js.Any = js.native
    
    /* private */ /* CompleteClass */
    var nElements: js.Any = js.native
    
    /**
      * Executes the provided function once for each element present in this tree in post-order.
      * @param {function(Object):*} callback function to execute, it is invoked with one
      * argument: the element value, to break the iteration you can optionally return false.
      */
    /* CompleteClass */
    override def postorderTraversal(callback: ILoopFunction[V]): Unit = js.native
    
    /**
      * @private
      */
    /* private */ /* CompleteClass */
    override def postorderTraversalAux(node: js.Any, callback: js.Any, signal: js.Any): js.Any = js.native
    
    /**
      * Executes the provided function once for each element present in this tree in pre-order.
      * @param {function(Object):*} callback function to execute, it is invoked with one
      * argument: the element value, to break the iteration you can optionally return false.
      */
    /* CompleteClass */
    override def preorderTraversal(callback: ILoopFunction[V]): Unit = js.native
    
    /**
      * @private
      */
    /* private */ /* CompleteClass */
    override def preorderTraversalAux(node: js.Any, callback: js.Any, signal: js.Any): js.Any = js.native
    
    /**
      * Removes the specified element from this tree if it is present.
      * @return {boolean} true if this tree contained the specified element.
      */
    /* CompleteClass */
    override def remove(element: K): Boolean = js.native
    
    /**
      * @private
      */
    /* private */ /* CompleteClass */
    override def removeNode(node: js.Any): js.Any = js.native
    
    /* private */ /* CompleteClass */
    var root: js.Any = js.native
    
    /**
      * Looks for the value with the provided search key.
      * @param {Object} element The key to look for
      * @return {Object} The value found or undefined if it was not found.
      */
    /* CompleteClass */
    override def search(element: K): js.UndefOr[V] = js.native
    
    /**
      * @private
      */
    /* private */ /* CompleteClass */
    override def searchNode(node: js.Any, element: js.Any): js.Any = js.native
    
    /**
      * Returns the number of elements in this tree.
      * @return {number} the number of elements in this tree.
      */
    /* CompleteClass */
    override def size(): Double = js.native
    
    /**
      * Returns an array containing all of the elements in this tree in in-order.
      * @return {Array} an array containing all of the elements in this tree in in-order.
      */
    /* CompleteClass */
    override def toArray(): js.Array[V] = js.native
    
    /**
      * @private
      */
    /* private */ /* CompleteClass */
    override def transplant(n1: js.Any, n2: js.Any): js.Any = js.native
  }
  
  trait BSTreeKV[K, V /* <: K */] extends StObject {
    
    /**
      * Adds the specified element to this tree if it is not already present.
      * @param {Object} element the element to insert.
      * @return {boolean} true if this tree did not already contain the specified element.
      */
    def add(element: V): Boolean
    
    /**
      * Removes all of the elements from this tree.
      */
    def clear(): Unit
    
    /* private */ var compare: js.Any
    
    /**
      * Returns true if this tree contains the specified element.
      * @param {Object} element element to search for.
      * @return {boolean} true if this tree contains the specified element,
      * false otherwise.
      */
    def contains(element: K): Boolean
    
    /**
      * @private
      */
    /* private */ def createNode(element: js.Any): js.Any
    
    /**
      * Executes the provided function once for each element present in this tree in inorder.
      * Equivalent to inorderTraversal.
      * @param {function(Object):*} callback function to execute, it is
      * invoked with one argument: the element value, to break the iteration you can
      * optionally return false.
      */
    def forEach(callback: ILoopFunction[V]): Unit
    
    /**
      * Returns the height of this tree.
      * @return {number} the height of this tree or -1 if is empty.
      */
    def height(): Double
    
    /**
      * @private
      */
    /* private */ def heightAux(node: js.Any): js.Any
    
    /**
      * Executes the provided function once for each element present in this tree in
      * in-order.
      * @param {function(Object):*} callback function to execute, it is invoked with one
      * argument: the element value, to break the iteration you can optionally return false.
      */
    def inorderTraversal(callback: ILoopFunction[V]): Unit
    
    /**
      * @private
      */
    /* private */ def inorderTraversalAux(node: js.Any, callback: js.Any, signal: js.Any): js.Any
    
    /* private */ def insertNode(node: js.Any): js.Any
    
    /**
      * Returns true if this tree contains no elements.
      * @return {boolean} true if this tree contains no elements.
      */
    def isEmpty(): Boolean
    
    /**
      * Executes the provided function once for each element present in this tree in
      * level-order.
      * @param {function(Object):*} callback function to execute, it is invoked with one
      * argument: the element value, to break the iteration you can optionally return false.
      */
    def levelTraversal(callback: ILoopFunction[V]): Unit
    
    /**
      * @private
      */
    /* private */ def levelTraversalAux(node: js.Any, callback: js.Any): js.Any
    
    /**
      * Returns the maximum element of this tree.
      * @return {*} the maximum element of this tree or undefined if this tree is
      * is empty.
      */
    def maximum(): js.UndefOr[V]
    
    /**
      * @private
      */
    /* private */ def maximumAux(node: js.Any): js.Any
    
    /**
      * Returns the minimum element of this tree.
      * @return {*} the minimum element of this tree or undefined if this tree is
      * is empty.
      */
    def minimum(): js.UndefOr[V]
    
    /**
      * @private
      */
    /* private */ def minimumAux(node: js.Any): js.Any
    
    /* private */ var nElements: js.Any
    
    /**
      * Executes the provided function once for each element present in this tree in post-order.
      * @param {function(Object):*} callback function to execute, it is invoked with one
      * argument: the element value, to break the iteration you can optionally return false.
      */
    def postorderTraversal(callback: ILoopFunction[V]): Unit
    
    /**
      * @private
      */
    /* private */ def postorderTraversalAux(node: js.Any, callback: js.Any, signal: js.Any): js.Any
    
    /**
      * Executes the provided function once for each element present in this tree in pre-order.
      * @param {function(Object):*} callback function to execute, it is invoked with one
      * argument: the element value, to break the iteration you can optionally return false.
      */
    def preorderTraversal(callback: ILoopFunction[V]): Unit
    
    /**
      * @private
      */
    /* private */ def preorderTraversalAux(node: js.Any, callback: js.Any, signal: js.Any): js.Any
    
    /**
      * Removes the specified element from this tree if it is present.
      * @return {boolean} true if this tree contained the specified element.
      */
    def remove(element: K): Boolean
    
    /**
      * @private
      */
    /* private */ def removeNode(node: js.Any): js.Any
    
    /* private */ var root: js.Any
    
    /**
      * Looks for the value with the provided search key.
      * @param {Object} element The key to look for
      * @return {Object} The value found or undefined if it was not found.
      */
    def search(element: K): js.UndefOr[V]
    
    /**
      * @private
      */
    /* private */ def searchNode(node: js.Any, element: js.Any): js.Any
    
    /**
      * Returns the number of elements in this tree.
      * @return {number} the number of elements in this tree.
      */
    def size(): Double
    
    /**
      * Returns an array containing all of the elements in this tree in in-order.
      * @return {Array} an array containing all of the elements in this tree in in-order.
      */
    def toArray(): js.Array[V]
    
    /**
      * @private
      */
    /* private */ def transplant(n1: js.Any, n2: js.Any): js.Any
  }
  object BSTreeKV {
    
    inline def apply[K, V /* <: K */](
      add: V => Boolean,
      clear: () => Unit,
      compare: js.Any,
      contains: K => Boolean,
      createNode: js.Any => js.Any,
      forEach: ILoopFunction[V] => Unit,
      height: () => Double,
      heightAux: js.Any => js.Any,
      inorderTraversal: ILoopFunction[V] => Unit,
      inorderTraversalAux: (js.Any, js.Any, js.Any) => js.Any,
      insertNode: js.Any => js.Any,
      isEmpty: () => Boolean,
      levelTraversal: ILoopFunction[V] => Unit,
      levelTraversalAux: (js.Any, js.Any) => js.Any,
      maximum: () => js.UndefOr[V],
      maximumAux: js.Any => js.Any,
      minimum: () => js.UndefOr[V],
      minimumAux: js.Any => js.Any,
      nElements: js.Any,
      postorderTraversal: ILoopFunction[V] => Unit,
      postorderTraversalAux: (js.Any, js.Any, js.Any) => js.Any,
      preorderTraversal: ILoopFunction[V] => Unit,
      preorderTraversalAux: (js.Any, js.Any, js.Any) => js.Any,
      remove: K => Boolean,
      removeNode: js.Any => js.Any,
      root: js.Any,
      search: K => js.UndefOr[V],
      searchNode: (js.Any, js.Any) => js.Any,
      size: () => Double,
      toArray: () => js.Array[V],
      transplant: (js.Any, js.Any) => js.Any
    ): BSTreeKV[K, V] = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), clear = js.Any.fromFunction0(clear), compare = compare.asInstanceOf[js.Any], contains = js.Any.fromFunction1(contains), createNode = js.Any.fromFunction1(createNode), forEach = js.Any.fromFunction1(forEach), height = js.Any.fromFunction0(height), heightAux = js.Any.fromFunction1(heightAux), inorderTraversal = js.Any.fromFunction1(inorderTraversal), inorderTraversalAux = js.Any.fromFunction3(inorderTraversalAux), insertNode = js.Any.fromFunction1(insertNode), isEmpty = js.Any.fromFunction0(isEmpty), levelTraversal = js.Any.fromFunction1(levelTraversal), levelTraversalAux = js.Any.fromFunction2(levelTraversalAux), maximum = js.Any.fromFunction0(maximum), maximumAux = js.Any.fromFunction1(maximumAux), minimum = js.Any.fromFunction0(minimum), minimumAux = js.Any.fromFunction1(minimumAux), nElements = nElements.asInstanceOf[js.Any], postorderTraversal = js.Any.fromFunction1(postorderTraversal), postorderTraversalAux = js.Any.fromFunction3(postorderTraversalAux), preorderTraversal = js.Any.fromFunction1(preorderTraversal), preorderTraversalAux = js.Any.fromFunction3(preorderTraversalAux), remove = js.Any.fromFunction1(remove), removeNode = js.Any.fromFunction1(removeNode), root = root.asInstanceOf[js.Any], search = js.Any.fromFunction1(search), searchNode = js.Any.fromFunction2(searchNode), size = js.Any.fromFunction0(size), toArray = js.Any.fromFunction0(toArray), transplant = js.Any.fromFunction2(transplant))
      __obj.asInstanceOf[BSTreeKV[K, V]]
    }
    
    extension [Self <: BSTreeKV[?, ?], K, V /* <: K */](x: Self & (BSTreeKV[K, V])) {
      
      inline def setAdd(value: V => Boolean): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setCompare(value: js.Any): Self = StObject.set(x, "compare", value.asInstanceOf[js.Any])
      
      inline def setContains(value: K => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
      
      inline def setCreateNode(value: js.Any => js.Any): Self = StObject.set(x, "createNode", js.Any.fromFunction1(value))
      
      inline def setForEach(value: ILoopFunction[V] => Unit): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
      
      inline def setHeight(value: () => Double): Self = StObject.set(x, "height", js.Any.fromFunction0(value))
      
      inline def setHeightAux(value: js.Any => js.Any): Self = StObject.set(x, "heightAux", js.Any.fromFunction1(value))
      
      inline def setInorderTraversal(value: ILoopFunction[V] => Unit): Self = StObject.set(x, "inorderTraversal", js.Any.fromFunction1(value))
      
      inline def setInorderTraversalAux(value: (js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "inorderTraversalAux", js.Any.fromFunction3(value))
      
      inline def setInsertNode(value: js.Any => js.Any): Self = StObject.set(x, "insertNode", js.Any.fromFunction1(value))
      
      inline def setIsEmpty(value: () => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction0(value))
      
      inline def setLevelTraversal(value: ILoopFunction[V] => Unit): Self = StObject.set(x, "levelTraversal", js.Any.fromFunction1(value))
      
      inline def setLevelTraversalAux(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "levelTraversalAux", js.Any.fromFunction2(value))
      
      inline def setMaximum(value: () => js.UndefOr[V]): Self = StObject.set(x, "maximum", js.Any.fromFunction0(value))
      
      inline def setMaximumAux(value: js.Any => js.Any): Self = StObject.set(x, "maximumAux", js.Any.fromFunction1(value))
      
      inline def setMinimum(value: () => js.UndefOr[V]): Self = StObject.set(x, "minimum", js.Any.fromFunction0(value))
      
      inline def setMinimumAux(value: js.Any => js.Any): Self = StObject.set(x, "minimumAux", js.Any.fromFunction1(value))
      
      inline def setNElements(value: js.Any): Self = StObject.set(x, "nElements", value.asInstanceOf[js.Any])
      
      inline def setPostorderTraversal(value: ILoopFunction[V] => Unit): Self = StObject.set(x, "postorderTraversal", js.Any.fromFunction1(value))
      
      inline def setPostorderTraversalAux(value: (js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "postorderTraversalAux", js.Any.fromFunction3(value))
      
      inline def setPreorderTraversal(value: ILoopFunction[V] => Unit): Self = StObject.set(x, "preorderTraversal", js.Any.fromFunction1(value))
      
      inline def setPreorderTraversalAux(value: (js.Any, js.Any, js.Any) => js.Any): Self = StObject.set(x, "preorderTraversalAux", js.Any.fromFunction3(value))
      
      inline def setRemove(value: K => Boolean): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      inline def setRemoveNode(value: js.Any => js.Any): Self = StObject.set(x, "removeNode", js.Any.fromFunction1(value))
      
      inline def setRoot(value: js.Any): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setSearch(value: K => js.UndefOr[V]): Self = StObject.set(x, "search", js.Any.fromFunction1(value))
      
      inline def setSearchNode(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "searchNode", js.Any.fromFunction2(value))
      
      inline def setSize(value: () => Double): Self = StObject.set(x, "size", js.Any.fromFunction0(value))
      
      inline def setToArray(value: () => js.Array[V]): Self = StObject.set(x, "toArray", js.Any.fromFunction0(value))
      
      inline def setTransplant(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "transplant", js.Any.fromFunction2(value))
    }
  }
}
