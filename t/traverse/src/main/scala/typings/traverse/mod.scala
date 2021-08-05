package typings.traverse

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T](obj: T): Traverse[T] = ^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any]).asInstanceOf[Traverse[T]]
  
  @JSImport("traverse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Create a deep clone of the object.
    */
  inline def clone_[T](obj: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(obj.asInstanceOf[js.Any]).asInstanceOf[T]
  
  /**
    * Execute `fn` for each node in the object but unlike `.map()`, when `this.update()` is called it updates the object in-place.
    */
  inline def forEach(obj: js.Any, cb: js.ThisFunction1[/* this */ TraverseContext, /* v */ js.Any, Unit]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(obj.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /**
    * Get the element at the array `path`.
    */
  inline def get(obj: js.Any, path: js.Array[String]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /**
    * Return whether the element at the array `path` exists.
    */
  inline def has(obj: js.Any, path: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Execute `fn` for each node in the object and return a new object with the results of the walk. To update nodes in the result use `this.update(value)`.
    */
  inline def map(obj: js.Any, cb: js.ThisFunction1[/* this */ TraverseContext, /* v */ js.Any, Unit]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(obj.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /**
    * Return an `Array` of every node in the object.
    */
  inline def nodes(obj: js.Any): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("nodes")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
  
  /**
    * Return an `Array` of every possible non-cyclic path in the object. 
    * Paths are `Array`s of string keys.
    */
  inline def paths(obj: js.Any): js.Array[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("paths")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[String]]]
  
  /**
    * For each node in the object, perform a [left-fold](http://en.wikipedia.org/wiki/Fold_(higher-order_function)) with the return value of `fn(acc, node)`.
    * 
    * If `init` isn't specified, `init` is set to the root object for the first step and the root element is skipped.
    */
  inline def reduce(
    obj: js.Any,
    cb: js.ThisFunction2[/* this */ TraverseContext, /* acc */ js.Any, /* v */ js.Any, Unit]
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(obj.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def reduce(
    obj: js.Any,
    cb: js.ThisFunction2[/* this */ TraverseContext, /* acc */ js.Any, /* v */ js.Any, Unit],
    init: js.Any
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(obj.asInstanceOf[js.Any], cb.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /**
    * Set the element at the array `path` to `value`.
    */
  inline def set(obj: js.Any, path: js.Array[String], value: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @js.native
  trait Traverse[T] extends StObject {
    
    /**
      * Execute `fn` for each node in the object but unlike `.map()`, when `this.update()` is called it updates the object in-place.
      */
    def forEach(cb: js.ThisFunction1[/* this */ TraverseContext, /* v */ js.Any, Unit]): js.Any = js.native
    
    /**
      * Get the element at the array `path`.
      */
    def get(path: js.Array[String]): js.Any = js.native
    
    /**
      * Return whether the element at the array `path` exists.
      */
    def has(path: js.Array[String]): Boolean = js.native
    
    /**
      * Execute `fn` for each node in the object and return a new object with the results of the walk. To update nodes in the result use `this.update(value)`.
      */
    def map(cb: js.ThisFunction1[/* this */ TraverseContext, /* v */ js.Any, Unit]): js.Any = js.native
    
    /**
      * Return an `Array` of every node in the object.
      */
    def nodes(): js.Array[js.Any] = js.native
    
    /**
      * Return an `Array` of every possible non-cyclic path in the object. 
      * Paths are `Array`s of string keys.
      */
    def paths(): js.Array[js.Array[String]] = js.native
    
    /**
      * For each node in the object, perform a [left-fold](http://en.wikipedia.org/wiki/Fold_(higher-order_function)) with the return value of `fn(acc, node)`.
      * 
      * If `init` isn't specified, `init` is set to the root object for the first step and the root element is skipped.
      */
    def reduce(cb: js.ThisFunction2[/* this */ TraverseContext, /* acc */ js.Any, /* v */ js.Any, Unit]): js.Any = js.native
    def reduce(
      cb: js.ThisFunction2[/* this */ TraverseContext, /* acc */ js.Any, /* v */ js.Any, Unit],
      init: js.Any
    ): js.Any = js.native
    
    /**
      * Set the element at the array `path` to `value`.
      */
    def set(path: js.Array[String], value: js.Any): js.Any = js.native
  }
  
  @js.native
  trait TraverseContext extends StObject {
    
    /**
      * Call this function after all of the children are traversed.
      */
    def after(callback: js.ThisFunction1[/* this */ this.type, /* value */ js.Any, Unit]): Unit = js.native
    
    /**
      * Call this function before all of the children are traversed.
      * You can assign into `this.keys` here to traverse in a custom order.
      */
    def before(callback: js.ThisFunction1[/* this */ this.type, /* value */ js.Any, Unit]): Unit = js.native
    
    /**
      * Prevents traversing descendents of the current node.
      */
    def block(): Unit = js.native
    
    /**
      * If the node equals one of its parents, the `circular` attribute is set to the context of that parent and the traversal progresses no deeper.
      */
    var circular: js.UndefOr[TraverseContext] = js.native
    
    /**
      * Delete the current element from its parent in the output. Calls `delete` even on Arrays.
      */
    def delete(): Unit = js.native
    def delete(stopHere: Boolean): Unit = js.native
    
    /**
      * Whether or not the present node is a leaf node (has no children)
      */
    var isLeaf: Boolean = js.native
    
    /**
      * Whether the present node is the root node
      */
    var isRoot: Boolean = js.native
    
    /**
      * The name of the key of the present node in its parent.
      * This is `undefined` for the root node.
      */
    var key: js.UndefOr[String] = js.native
    
    /**
      * Object keys of the node.
      */
    var keys: js.Array[String] | Null = js.native
    
    /**
      * Depth of the node within the traversal
      */
    var level: Double = js.native
    
    /**
      * The present node on the recursive walk
      */
    var node: js.Any = js.native
    
    /**
      * Whether or not the present node is not a leaf node (has children)
      */
    var notLeaf: Boolean = js.native
    
    /**
      * Whether the present node is not the root node
      */
    var notRoot: Boolean = js.native
    
    /**
      * The context of the node's parent.
      * This is `undefined` for the root node.
      */
    var parent: js.UndefOr[TraverseContext] = js.native
    
    /**
      * The contexts of the node's parents.
      */
    var parents: js.Array[TraverseContext] = js.native
    
    /**
      * An array of string keys from the root to the present node
      */
    var path: js.Array[String] = js.native
    
    /**
      * Call this function after each of the children are traversed.
      */
    def post(callback: js.ThisFunction1[/* this */ this.type, /* child */ js.Any, Unit]): Unit = js.native
    
    /**
      * Call this function before each of the children are traversed.
      */
    def pre(callback: js.ThisFunction1[/* this */ this.type, /* child */ js.Any, Unit]): Unit = js.native
    
    /**
      * Remove the current element from the output. If the node is in an Array it will be spliced off. Otherwise it will be deleted from its parent.
      */
    def remove(): Unit = js.native
    def remove(stopHere: Boolean): Unit = js.native
    
    /**
      * Stops traversal entirely.
      */
    def stop(): Unit = js.native
    
    /**
      * Set a new value for the present node.
      * 
      * All the elements in `value` will be recursively traversed unless `stopHere` is true (false by default).
      */
    def update(value: js.Any): Unit = js.native
    def update(value: js.Any, stopHere: Boolean): Unit = js.native
  }
}
