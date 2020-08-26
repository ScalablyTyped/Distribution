package typings.typescriptCollections

import org.scalablytyped.runtime.StringDictionary
import typings.typescriptCollections.bstreekvMod.default
import typings.typescriptCollections.utilMod.ICompareFunction
import typings.typescriptCollections.utilMod.IEqualsFunction
import typings.typescriptCollections.utilMod.ILoopFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-collections", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class BSTree[T] () extends default[T, T]
  
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
  class BSTreeKV[K, V /* <: K */] () extends default[K, V] {
    def this(compareFunction: ICompareFunction[K]) = this()
  }
  
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
  
  @js.native
  class LinkedDictionary[K, V] ()
    extends typings.typescriptCollections.linkedDictionaryMod.default[K, V] {
    def this(toStrFunction: js.Function1[/* key */ K, String]) = this()
  }
  
  @js.native
  /**
    * Creates an empty Linked List.
    * @class A linked list is a data structure consisting of a group of nodes
    * which together represent a sequence.
    * @constructor
    */
  class LinkedList[T] ()
    extends typings.typescriptCollections.linkedListMod.default[T]
  
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
    def this(toStrFunction: js.UndefOr[scala.Nothing], valuesEqualsFunction: IEqualsFunction[V]) = this()
    def this(toStrFunction: js.Function1[/* key */ K, String], valuesEqualsFunction: IEqualsFunction[V]) = this()
    def this(
      toStrFunction: js.UndefOr[scala.Nothing],
      valuesEqualsFunction: js.UndefOr[scala.Nothing],
      allowDuplicateValues: Boolean
    ) = this()
    def this(
      toStrFunction: js.UndefOr[scala.Nothing],
      valuesEqualsFunction: IEqualsFunction[V],
      allowDuplicateValues: Boolean
    ) = this()
    def this(
      toStrFunction: js.Function1[/* key */ K, String],
      valuesEqualsFunction: js.UndefOr[scala.Nothing],
      allowDuplicateValues: Boolean
    ) = this()
    def this(
      toStrFunction: js.Function1[/* key */ K, String],
      valuesEqualsFunction: IEqualsFunction[V],
      allowDuplicateValues: Boolean
    ) = this()
  }
  
  @js.native
  class MultiRootTree ()
    extends typings.typescriptCollections.multiRootTreeMod.default {
    def this(rootIds: js.Array[String]) = this()
    def this(rootIds: js.UndefOr[scala.Nothing], nodes: StringDictionary[js.Array[String]]) = this()
    def this(rootIds: js.Array[String], nodes: StringDictionary[js.Array[String]]) = this()
  }
  
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
  
  @js.native
  object arrays extends js.Object {
    def contains[T](array: js.Array[T], item: T): Boolean = js.native
    def contains[T](array: js.Array[T], item: T, equalsFunction: IEqualsFunction[T]): Boolean = js.native
    def copy[T](array: js.Array[T]): js.Array[T] = js.native
    def equals[T](array1: js.Array[T], array2: js.Array[T]): Boolean = js.native
    def equals[T](array1: js.Array[T], array2: js.Array[T], equalsFunction: IEqualsFunction[T]): Boolean = js.native
    def forEach[T](array: js.Array[T], callback: ILoopFunction[T]): Unit = js.native
    def frequency[T](array: js.Array[T], item: T): Double = js.native
    def frequency[T](array: js.Array[T], item: T, equalsFunction: IEqualsFunction[T]): Double = js.native
    def indexOf[T](array: js.Array[T], item: T): Double = js.native
    def indexOf[T](array: js.Array[T], item: T, equalsFunction: IEqualsFunction[T]): Double = js.native
    def lastIndexOf[T](array: js.Array[T], item: T): Double = js.native
    def lastIndexOf[T](array: js.Array[T], item: T, equalsFunction: IEqualsFunction[T]): Double = js.native
    def remove[T](array: js.Array[T], item: T): Boolean = js.native
    def remove[T](array: js.Array[T], item: T, equalsFunction: IEqualsFunction[T]): Boolean = js.native
    def swap[T](array: js.Array[T], i: Double, j: Double): Boolean = js.native
    def toString[T](array: js.Array[T]): String = js.native
  }
  
  @js.native
  object util extends js.Object {
    def compareToEquals[T](compareFunction: ICompareFunction[T]): IEqualsFunction[T] = js.native
    def defaultCompare[T](a: T, b: T): Double = js.native
    def defaultEquals[T](a: T, b: T): Boolean = js.native
    def defaultToString(item: js.Any): String = js.native
    def has(obj: js.Any, prop: js.Any): js.Any = js.native
    def isFunction(func: js.Any): Boolean = js.native
    def isString(obj: js.Any): Boolean = js.native
    def isUndefined(obj: js.Any): /* is undefined */ Boolean = js.native
    def makeString[T](item: T): String = js.native
    def makeString[T](item: T, join: String): String = js.native
    def reverseCompareFunction[T](): ICompareFunction[T] = js.native
    def reverseCompareFunction[T](compareFunction: ICompareFunction[T]): ICompareFunction[T] = js.native
  }
  
}

