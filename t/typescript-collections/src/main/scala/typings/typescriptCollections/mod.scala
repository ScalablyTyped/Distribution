package typings.typescriptCollections

import org.scalablytyped.runtime.StringDictionary
import typings.typescriptCollections.bstreeMod.default
import typings.typescriptCollections.utilMod.ICompareFunction
import typings.typescriptCollections.utilMod.IEqualsFunction
import typings.typescriptCollections.utilMod.ILoopFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("typescript-collections", "BSTree")
  @js.native
  class BSTree[T] () extends default[T]
  
  @JSImport("typescript-collections", "BSTreeKV")
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
  class BSTreeKV[K, V /* <: K */] ()
    extends typings.typescriptCollections.bstreekvMod.default[K, V] {
    def this(compareFunction: ICompareFunction[K]) = this()
  }
  
  @JSImport("typescript-collections", "Bag")
  @js.native
  /**
    * Creates an empty bag.
    * @class <p>A bag is a special kind of set in which members are
    * allowed to appear more than once.</p>
    * <p>If the inserted elements are custom objects a function
    * which converts elements to unique strings must be provided. Example:</p>
    *
    * <pre>
    * function petToString(pet) {
    *  return pet.name;
    * }
    * </pre>
    *
    * @constructor
    * @param {function(Object):string=} toStrFunction optional function used
    * to convert elements to strings. If the elements aren't strings or if toString()
    * is not appropriate, a custom function which receives an object and returns a
    * unique string must be provided.
    */
  class Bag[T] ()
    extends typings.typescriptCollections.bagMod.default[T] {
    def this(toStrFunction: js.Function1[/* item */ T, String]) = this()
  }
  
  @JSImport("typescript-collections", "DefaultDictionary")
  @js.native
  class DefaultDictionary[K, V] protected ()
    extends typings.typescriptCollections.factoryDictionaryMod.default[K, V] {
    /**
      * Creates an empty dictionary.
      * @class <p>Dictionaries map keys to values; each key can map to at most one value.
      * This implementation accepts any kind of objects as keys.</p>
      *
      * <p>The default factory function should return a new object of the provided
      * type. Example:</p>
      * <pre>
      * function petFactory() {
      *  return new Pet();
      * }
      * </pre>
      *
      * <p>If the keys are custom objects a function which converts keys to unique
      * strings must be provided. Example:</p>
      * <pre>
      * function petToString(pet) {
      *  return pet.name;
      * }
      * </pre>
      * @constructor
      * @param {function():V=} defaultFactoryFunction function used to create a
      * default object.
      * @param {function(Object):string=} toStrFunction optional function used
      * to convert keys to strings. If the keys aren't strings or if toString()
      * is not appropriate, a custom function which receives a key and returns a
      * unique string must be provided.
      */
    def this(defaultFactoryFunction: js.Function0[V]) = this()
    def this(defaultFactoryFunction: js.Function0[V], toStrFunction: js.Function1[/* key */ K, String]) = this()
  }
  
  @JSImport("typescript-collections", "Dictionary")
  @js.native
  /**
    * Creates an empty dictionary.
    * @class <p>Dictionaries map keys to values; each key can map to at most one value.
    * This implementation accepts any kind of objects as keys.</p>
    *
    * <p>If the keys are custom objects a function which converts keys to unique
    * strings must be provided. Example:</p>
    * <pre>
    * function petToString(pet) {
    *  return pet.name;
    * }
    * </pre>
    * @constructor
    * @param {function(Object):string=} toStrFunction optional function used
    * to convert keys to strings. If the keys aren't strings or if toString()
    * is not appropriate, a custom function which receives a key and returns a
    * unique string must be provided.
    */
  class Dictionary[K, V] ()
    extends typings.typescriptCollections.dictionaryMod.default[K, V] {
    def this(toStrFunction: js.Function1[/* key */ K, String]) = this()
  }
  
  @JSImport("typescript-collections", "FactoryDictionary")
  @js.native
  class FactoryDictionary[K, V] protected ()
    extends typings.typescriptCollections.factoryDictionaryMod.default[K, V] {
    /**
      * Creates an empty dictionary.
      * @class <p>Dictionaries map keys to values; each key can map to at most one value.
      * This implementation accepts any kind of objects as keys.</p>
      *
      * <p>The default factory function should return a new object of the provided
      * type. Example:</p>
      * <pre>
      * function petFactory() {
      *  return new Pet();
      * }
      * </pre>
      *
      * <p>If the keys are custom objects a function which converts keys to unique
      * strings must be provided. Example:</p>
      * <pre>
      * function petToString(pet) {
      *  return pet.name;
      * }
      * </pre>
      * @constructor
      * @param {function():V=} defaultFactoryFunction function used to create a
      * default object.
      * @param {function(Object):string=} toStrFunction optional function used
      * to convert keys to strings. If the keys aren't strings or if toString()
      * is not appropriate, a custom function which receives a key and returns a
      * unique string must be provided.
      */
    def this(defaultFactoryFunction: js.Function0[V]) = this()
    def this(defaultFactoryFunction: js.Function0[V], toStrFunction: js.Function1[/* key */ K, String]) = this()
  }
  
  @JSImport("typescript-collections", "Heap")
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
  class Heap[T] ()
    extends typings.typescriptCollections.heapMod.default[T] {
    def this(compareFunction: ICompareFunction[T]) = this()
  }
  
  @JSImport("typescript-collections", "LinkedDictionary")
  @js.native
  class LinkedDictionary[K, V] ()
    extends typings.typescriptCollections.linkedDictionaryMod.default[K, V] {
    def this(toStrFunction: js.Function1[/* key */ K, String]) = this()
  }
  
  @JSImport("typescript-collections", "LinkedList")
  @js.native
  /**
    * Creates an empty Linked List.
    * @class A linked list is a data structure consisting of a group of nodes
    * which together represent a sequence.
    * @constructor
    */
  class LinkedList[T] ()
    extends typings.typescriptCollections.linkedListMod.default[T]
  
  @JSImport("typescript-collections", "MultiDictionary")
  @js.native
  /**
    * Creates an empty multi dictionary.
    * @class <p>A multi dictionary is a special kind of dictionary that holds
    * multiple values against each key. Setting a value into the dictionary will
    * add the value to an array at that key. Getting a key will return an array,
    * holding all the values set to that key.
    * You can configure to allow duplicates in the values.
    * This implementation accepts any kind of objects as keys.</p>
    *
    * <p>If the keys are custom objects a function which converts keys to strings must be
    * provided. Example:</p>
    *
    * <pre>
    * function petToString(pet) {
    *     return pet.name;
    * }
    * </pre>
    * <p>If the values are custom objects a function to check equality between values
    * must be provided. Example:</p>
    *
    * <pre>
    * function petsAreEqualByAge(pet1,pet2) {
    *     return pet1.age === pet2.age;
    * }
    * </pre>
    * @constructor
    * @param {function(Object):string=} toStrFunction optional function
    * to convert keys to strings. If the keys aren't strings or if toString()
    * is not appropriate, a custom function which receives a key and returns a
    * unique string must be provided.
    * @param {function(Object,Object):boolean=} valuesEqualsFunction optional
    * function to check if two values are equal.
    *
    * @param allowDuplicateValues
    */
  class MultiDictionary[K, V] ()
    extends typings.typescriptCollections.multiDictionaryMod.default[K, V] {
    def this(toStrFunction: js.Function1[/* key */ K, String]) = this()
    def this(toStrFunction: js.Function1[/* key */ K, String], valuesEqualsFunction: IEqualsFunction[V]) = this()
    def this(toStrFunction: Unit, valuesEqualsFunction: IEqualsFunction[V]) = this()
    def this(
      toStrFunction: js.Function1[/* key */ K, String],
      valuesEqualsFunction: Unit,
      allowDuplicateValues: Boolean
    ) = this()
    def this(
      toStrFunction: js.Function1[/* key */ K, String],
      valuesEqualsFunction: IEqualsFunction[V],
      allowDuplicateValues: Boolean
    ) = this()
    def this(toStrFunction: Unit, valuesEqualsFunction: Unit, allowDuplicateValues: Boolean) = this()
    def this(toStrFunction: Unit, valuesEqualsFunction: IEqualsFunction[V], allowDuplicateValues: Boolean) = this()
  }
  
  @JSImport("typescript-collections", "MultiRootTree")
  @js.native
  class MultiRootTree ()
    extends typings.typescriptCollections.multiRootTreeMod.default {
    def this(rootIds: js.Array[String]) = this()
    def this(rootIds: js.Array[String], nodes: StringDictionary[js.Array[String]]) = this()
    def this(rootIds: Unit, nodes: StringDictionary[js.Array[String]]) = this()
  }
  
  @JSImport("typescript-collections", "PriorityQueue")
  @js.native
  /**
    * Creates an empty priority queue.
    * @class <p>In a priority queue each element is associated with a "priority",
    * elements are dequeued in highest-priority-first order (the elements with the
    * highest priority are dequeued first). Priority Queues are implemented as heaps.
    * If the inserted elements are custom objects a compare function must be provided,
    * otherwise the <=, === and >= operators are used to compare object priority.</p>
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
    * function used to compare two element priorities. Must return a negative integer,
    * zero, or a positive integer as the first argument is less than, equal to,
    * or greater than the second.
    */
  class PriorityQueue[T] ()
    extends typings.typescriptCollections.priorityQueueMod.default[T] {
    def this(compareFunction: ICompareFunction[T]) = this()
  }
  
  @JSImport("typescript-collections", "Queue")
  @js.native
  /**
    * Creates an empty queue.
    * @class A queue is a First-In-First-Out (FIFO) data structure, the first
    * element added to the queue will be the first one to be removed. This
    * implementation uses a linked list as a container.
    * @constructor
    */
  class Queue[T] ()
    extends typings.typescriptCollections.queueMod.default[T]
  
  @JSImport("typescript-collections", "Set")
  @js.native
  /**
    * Creates an empty set.
    * @class <p>A set is a data structure that contains no duplicate items.</p>
    * <p>If the inserted elements are custom objects a function
    * which converts elements to strings must be provided. Example:</p>
    *
    * <pre>
    * function petToString(pet) {
    *  return pet.name;
    * }
    * </pre>
    *
    * @constructor
    * @param {function(Object):string=} toStringFunction optional function used
    * to convert elements to strings. If the elements aren't strings or if toString()
    * is not appropriate, a custom function which receives an object and returns a
    * unique string must be provided.
    */
  class Set[T] ()
    extends typings.typescriptCollections.setMod.default[T] {
    def this(toStringFunction: js.Function1[/* item */ T, String]) = this()
  }
  
  @JSImport("typescript-collections", "Stack")
  @js.native
  /**
    * Creates an empty Stack.
    * @class A Stack is a Last-In-First-Out (LIFO) data structure, the last
    * element added to the stack will be the first one to be removed. This
    * implementation uses a linked list as a container.
    * @constructor
    */
  class Stack[T] ()
    extends typings.typescriptCollections.stackMod.default[T]
  
  object arrays {
    
    @JSImport("typescript-collections", "arrays")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def contains[T](array: js.Array[T], item: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def contains[T](array: js.Array[T], item: T, equalsFunction: IEqualsFunction[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], equalsFunction.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def copy[T](array: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("copy")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
    
    @scala.inline
    def equals_[T](array1: js.Array[T], array2: js.Array[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def equals_[T](array1: js.Array[T], array2: js.Array[T], equalsFunction: IEqualsFunction[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], equalsFunction.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def forEach[T](array: js.Array[T], callback: ILoopFunction[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(array.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def frequency[T](array: js.Array[T], item: T): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("frequency")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def frequency[T](array: js.Array[T], item: T, equalsFunction: IEqualsFunction[T]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("frequency")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], equalsFunction.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @scala.inline
    def indexOf[T](array: js.Array[T], item: T): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def indexOf[T](array: js.Array[T], item: T, equalsFunction: IEqualsFunction[T]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], equalsFunction.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @scala.inline
    def lastIndexOf[T](array: js.Array[T], item: T): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lastIndexOf")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def lastIndexOf[T](array: js.Array[T], item: T, equalsFunction: IEqualsFunction[T]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lastIndexOf")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], equalsFunction.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @scala.inline
    def remove[T](array: js.Array[T], item: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def remove[T](array: js.Array[T], item: T, equalsFunction: IEqualsFunction[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], equalsFunction.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def swap[T](array: js.Array[T], i: Double, j: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("swap")(array.asInstanceOf[js.Any], i.asInstanceOf[js.Any], j.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def toString_[T](array: js.Array[T]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(array.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  object util {
    
    @JSImport("typescript-collections", "util")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def compareToEquals[T](compareFunction: ICompareFunction[T]): IEqualsFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("compareToEquals")(compareFunction.asInstanceOf[js.Any]).asInstanceOf[IEqualsFunction[T]]
    
    @scala.inline
    def defaultCompare[T](a: T, b: T): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultCompare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @scala.inline
    def defaultEquals[T](a: T, b: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultEquals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def defaultToString(item: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultToString")(item.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def has(obj: js.Any, prop: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(obj.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def isFunction(func: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(func.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def isString(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def isUndefined(obj: js.Any): /* is undefined */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUndefined")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is undefined */ Boolean]
    
    @scala.inline
    def makeString[T](item: T): String = ^.asInstanceOf[js.Dynamic].applyDynamic("makeString")(item.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def makeString[T](item: T, join: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("makeString")(item.asInstanceOf[js.Any], join.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def reverseCompareFunction[T](): ICompareFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("reverseCompareFunction")().asInstanceOf[ICompareFunction[T]]
    @scala.inline
    def reverseCompareFunction[T](compareFunction: ICompareFunction[T]): ICompareFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("reverseCompareFunction")(compareFunction.asInstanceOf[js.Any]).asInstanceOf[ICompareFunction[T]]
  }
}
