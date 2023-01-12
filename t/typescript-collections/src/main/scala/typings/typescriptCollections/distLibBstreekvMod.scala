package typings.typescriptCollections

import typings.typescriptCollections.distLibUtilMod.ICompareFunction
import typings.typescriptCollections.distLibUtilMod.ILoopFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibBstreekvMod {
  
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
  open class default[K, V /* <: K */] ()
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
    var compare: Any = js.native
    
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
    override def createNode(element: Any): Any = js.native
    
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
    override def heightAux(node: Any): Any = js.native
    
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
    override def inorderTraversalAux(node: Any, callback: Any, signal: Any): Any = js.native
    
    /* private */ /* CompleteClass */
    override def insertNode(node: Any): Any = js.native
    
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
    override def levelTraversalAux(node: Any, callback: Any): Any = js.native
    
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
    override def maximumAux(node: Any): Any = js.native
    
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
    override def minimumAux(node: Any): Any = js.native
    
    /* private */ /* CompleteClass */
    var nElements: Any = js.native
    
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
    override def postorderTraversalAux(node: Any, callback: Any, signal: Any): Any = js.native
    
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
    override def preorderTraversalAux(node: Any, callback: Any, signal: Any): Any = js.native
    
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
    override def removeNode(node: Any): Any = js.native
    
    /* private */ /* CompleteClass */
    var root: Any = js.native
    
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
    override def searchNode(node: Any, element: Any): Any = js.native
    
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
    override def transplant(n1: Any, n2: Any): Any = js.native
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
    
    /* private */ var compare: Any
    
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
    /* private */ def createNode(element: Any): Any
    
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
    /* private */ def heightAux(node: Any): Any
    
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
    /* private */ def inorderTraversalAux(node: Any, callback: Any, signal: Any): Any
    
    /* private */ def insertNode(node: Any): Any
    
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
    /* private */ def levelTraversalAux(node: Any, callback: Any): Any
    
    /**
      * Returns the maximum element of this tree.
      * @return {*} the maximum element of this tree or undefined if this tree is
      * is empty.
      */
    def maximum(): js.UndefOr[V]
    
    /**
      * @private
      */
    /* private */ def maximumAux(node: Any): Any
    
    /**
      * Returns the minimum element of this tree.
      * @return {*} the minimum element of this tree or undefined if this tree is
      * is empty.
      */
    def minimum(): js.UndefOr[V]
    
    /**
      * @private
      */
    /* private */ def minimumAux(node: Any): Any
    
    /* private */ var nElements: Any
    
    /**
      * Executes the provided function once for each element present in this tree in post-order.
      * @param {function(Object):*} callback function to execute, it is invoked with one
      * argument: the element value, to break the iteration you can optionally return false.
      */
    def postorderTraversal(callback: ILoopFunction[V]): Unit
    
    /**
      * @private
      */
    /* private */ def postorderTraversalAux(node: Any, callback: Any, signal: Any): Any
    
    /**
      * Executes the provided function once for each element present in this tree in pre-order.
      * @param {function(Object):*} callback function to execute, it is invoked with one
      * argument: the element value, to break the iteration you can optionally return false.
      */
    def preorderTraversal(callback: ILoopFunction[V]): Unit
    
    /**
      * @private
      */
    /* private */ def preorderTraversalAux(node: Any, callback: Any, signal: Any): Any
    
    /**
      * Removes the specified element from this tree if it is present.
      * @return {boolean} true if this tree contained the specified element.
      */
    def remove(element: K): Boolean
    
    /**
      * @private
      */
    /* private */ def removeNode(node: Any): Any
    
    /* private */ var root: Any
    
    /**
      * Looks for the value with the provided search key.
      * @param {Object} element The key to look for
      * @return {Object} The value found or undefined if it was not found.
      */
    def search(element: K): js.UndefOr[V]
    
    /**
      * @private
      */
    /* private */ def searchNode(node: Any, element: Any): Any
    
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
    /* private */ def transplant(n1: Any, n2: Any): Any
  }
  object BSTreeKV {
    
    inline def apply[K, V /* <: K */](
      add: V => Boolean,
      clear: () => Unit,
      compare: Any,
      contains: K => Boolean,
      createNode: Any => Any,
      forEach: ILoopFunction[V] => Unit,
      height: () => Double,
      heightAux: Any => Any,
      inorderTraversal: ILoopFunction[V] => Unit,
      inorderTraversalAux: (Any, Any, Any) => Any,
      insertNode: Any => Any,
      isEmpty: () => Boolean,
      levelTraversal: ILoopFunction[V] => Unit,
      levelTraversalAux: (Any, Any) => Any,
      maximum: () => js.UndefOr[V],
      maximumAux: Any => Any,
      minimum: () => js.UndefOr[V],
      minimumAux: Any => Any,
      nElements: Any,
      postorderTraversal: ILoopFunction[V] => Unit,
      postorderTraversalAux: (Any, Any, Any) => Any,
      preorderTraversal: ILoopFunction[V] => Unit,
      preorderTraversalAux: (Any, Any, Any) => Any,
      remove: K => Boolean,
      removeNode: Any => Any,
      root: Any,
      search: K => js.UndefOr[V],
      searchNode: (Any, Any) => Any,
      size: () => Double,
      toArray: () => js.Array[V],
      transplant: (Any, Any) => Any
    ): BSTreeKV[K, V] = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), clear = js.Any.fromFunction0(clear), compare = compare.asInstanceOf[js.Any], contains = js.Any.fromFunction1(contains), createNode = js.Any.fromFunction1(createNode), forEach = js.Any.fromFunction1(forEach), height = js.Any.fromFunction0(height), heightAux = js.Any.fromFunction1(heightAux), inorderTraversal = js.Any.fromFunction1(inorderTraversal), inorderTraversalAux = js.Any.fromFunction3(inorderTraversalAux), insertNode = js.Any.fromFunction1(insertNode), isEmpty = js.Any.fromFunction0(isEmpty), levelTraversal = js.Any.fromFunction1(levelTraversal), levelTraversalAux = js.Any.fromFunction2(levelTraversalAux), maximum = js.Any.fromFunction0(maximum), maximumAux = js.Any.fromFunction1(maximumAux), minimum = js.Any.fromFunction0(minimum), minimumAux = js.Any.fromFunction1(minimumAux), nElements = nElements.asInstanceOf[js.Any], postorderTraversal = js.Any.fromFunction1(postorderTraversal), postorderTraversalAux = js.Any.fromFunction3(postorderTraversalAux), preorderTraversal = js.Any.fromFunction1(preorderTraversal), preorderTraversalAux = js.Any.fromFunction3(preorderTraversalAux), remove = js.Any.fromFunction1(remove), removeNode = js.Any.fromFunction1(removeNode), root = root.asInstanceOf[js.Any], search = js.Any.fromFunction1(search), searchNode = js.Any.fromFunction2(searchNode), size = js.Any.fromFunction0(size), toArray = js.Any.fromFunction0(toArray), transplant = js.Any.fromFunction2(transplant))
      __obj.asInstanceOf[BSTreeKV[K, V]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BSTreeKV[?, ?], K, V /* <: K */] (val x: Self & (BSTreeKV[K, V])) extends AnyVal {
      
      inline def setAdd(value: V => Boolean): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setCompare(value: Any): Self = StObject.set(x, "compare", value.asInstanceOf[js.Any])
      
      inline def setContains(value: K => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
      
      inline def setCreateNode(value: Any => Any): Self = StObject.set(x, "createNode", js.Any.fromFunction1(value))
      
      inline def setForEach(value: ILoopFunction[V] => Unit): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
      
      inline def setHeight(value: () => Double): Self = StObject.set(x, "height", js.Any.fromFunction0(value))
      
      inline def setHeightAux(value: Any => Any): Self = StObject.set(x, "heightAux", js.Any.fromFunction1(value))
      
      inline def setInorderTraversal(value: ILoopFunction[V] => Unit): Self = StObject.set(x, "inorderTraversal", js.Any.fromFunction1(value))
      
      inline def setInorderTraversalAux(value: (Any, Any, Any) => Any): Self = StObject.set(x, "inorderTraversalAux", js.Any.fromFunction3(value))
      
      inline def setInsertNode(value: Any => Any): Self = StObject.set(x, "insertNode", js.Any.fromFunction1(value))
      
      inline def setIsEmpty(value: () => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction0(value))
      
      inline def setLevelTraversal(value: ILoopFunction[V] => Unit): Self = StObject.set(x, "levelTraversal", js.Any.fromFunction1(value))
      
      inline def setLevelTraversalAux(value: (Any, Any) => Any): Self = StObject.set(x, "levelTraversalAux", js.Any.fromFunction2(value))
      
      inline def setMaximum(value: () => js.UndefOr[V]): Self = StObject.set(x, "maximum", js.Any.fromFunction0(value))
      
      inline def setMaximumAux(value: Any => Any): Self = StObject.set(x, "maximumAux", js.Any.fromFunction1(value))
      
      inline def setMinimum(value: () => js.UndefOr[V]): Self = StObject.set(x, "minimum", js.Any.fromFunction0(value))
      
      inline def setMinimumAux(value: Any => Any): Self = StObject.set(x, "minimumAux", js.Any.fromFunction1(value))
      
      inline def setNElements(value: Any): Self = StObject.set(x, "nElements", value.asInstanceOf[js.Any])
      
      inline def setPostorderTraversal(value: ILoopFunction[V] => Unit): Self = StObject.set(x, "postorderTraversal", js.Any.fromFunction1(value))
      
      inline def setPostorderTraversalAux(value: (Any, Any, Any) => Any): Self = StObject.set(x, "postorderTraversalAux", js.Any.fromFunction3(value))
      
      inline def setPreorderTraversal(value: ILoopFunction[V] => Unit): Self = StObject.set(x, "preorderTraversal", js.Any.fromFunction1(value))
      
      inline def setPreorderTraversalAux(value: (Any, Any, Any) => Any): Self = StObject.set(x, "preorderTraversalAux", js.Any.fromFunction3(value))
      
      inline def setRemove(value: K => Boolean): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      inline def setRemoveNode(value: Any => Any): Self = StObject.set(x, "removeNode", js.Any.fromFunction1(value))
      
      inline def setRoot(value: Any): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setSearch(value: K => js.UndefOr[V]): Self = StObject.set(x, "search", js.Any.fromFunction1(value))
      
      inline def setSearchNode(value: (Any, Any) => Any): Self = StObject.set(x, "searchNode", js.Any.fromFunction2(value))
      
      inline def setSize(value: () => Double): Self = StObject.set(x, "size", js.Any.fromFunction0(value))
      
      inline def setToArray(value: () => js.Array[V]): Self = StObject.set(x, "toArray", js.Any.fromFunction0(value))
      
      inline def setTransplant(value: (Any, Any) => Any): Self = StObject.set(x, "transplant", js.Any.fromFunction2(value))
    }
  }
}
