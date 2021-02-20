package typings.yallist

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("yallist", JSImport.Namespace)
  @js.native
  class ^[T] () extends Yallist[T] {
    def this(items: T*) = this()
    def this(list: ForEachIterable[T]) = this()
  }
  
  @js.native
  trait Node[T] extends StObject {
    
    var list: js.UndefOr[Yallist[T]] = js.native
    
    var next: Node[T] | Null = js.native
    
    var prev: Node[T] | Null = js.native
    
    var value: T = js.native
  }
  object Node {
    
    /* static member */
    @JSImport("yallist", "Node")
    @js.native
    val ^ : NodeConstructor = js.native
    
    @scala.inline
    implicit class NodeMutableBuilder[Self <: Node[_], T] (val x: Self with Node[T]) extends AnyVal {
      
      @scala.inline
      def setList(value: Yallist[T]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListUndefined: Self = StObject.set(x, "list", js.undefined)
      
      @scala.inline
      def setNext(value: Node[T]): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextNull: Self = StObject.set(x, "next", null)
      
      @scala.inline
      def setPrev(value: Node[T]): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevNull: Self = StObject.set(x, "prev", null)
      
      @scala.inline
      def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("yallist", "Node")
  @js.native
  class NodeCls[T] protected () extends Node[T] {
    def this(value: T) = this()
    def this(value: T, prev: Node[T]) = this()
    def this(value: T, prev: js.UndefOr[scala.Nothing], next: Node[T]) = this()
    def this(value: T, prev: Node[T], next: Node[T]) = this()
    def this(value: T, prev: js.UndefOr[scala.Nothing], next: js.UndefOr[scala.Nothing], list: Yallist[T]) = this()
    def this(value: T, prev: js.UndefOr[scala.Nothing], next: Node[T], list: Yallist[T]) = this()
    def this(value: T, prev: Node[T], next: js.UndefOr[scala.Nothing], list: Yallist[T]) = this()
    def this(value: T, prev: Node[T], next: Node[T], list: Yallist[T]) = this()
  }
  
  /* static member */
  @JSImport("yallist", "create")
  @js.native
  def create[T](): Yallist[T] = js.native
  /* static member */
  @JSImport("yallist", "create")
  @js.native
  def create[T](items: T*): Yallist[T] = js.native
  /* static member */
  @JSImport("yallist", "create")
  @js.native
  def create[T](list: ForEachIterable[T]): Yallist[T] = js.native
  
  @js.native
  trait ForEachIterable[T] extends StObject {
    
    def forEach(callbackFn: js.Function1[/* item */ T, Unit]): Unit = js.native
  }
  object ForEachIterable {
    
    @scala.inline
    def apply[T](forEach: js.Function1[/* item */ T, Unit] => Unit): ForEachIterable[T] = {
      val __obj = js.Dynamic.literal(forEach = js.Any.fromFunction1(forEach))
      __obj.asInstanceOf[ForEachIterable[T]]
    }
    
    @scala.inline
    implicit class ForEachIterableMutableBuilder[Self <: ForEachIterable[_], T] (val x: Self with ForEachIterable[T]) extends AnyVal {
      
      @scala.inline
      def setForEach(value: js.Function1[/* item */ T, Unit] => Unit): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait NodeConstructor
    extends Instantiable1[/* value */ js.Object, Node[js.Object]]
       with Instantiable2[/* value */ js.Object, /* prev */ Node[js.Object], Node[js.Object]]
       with Instantiable3[
          /* value */ js.Object, 
          js.UndefOr[/* prev */ Node[js.Object]], 
          /* next */ Node[js.Object], 
          Node[js.Object]
        ]
       with Instantiable4[
          /* value */ js.Object, 
          js.UndefOr[/* prev */ Node[js.Object]], 
          js.UndefOr[/* next */ Node[js.Object]], 
          /* list */ Yallist[js.Object], 
          Node[js.Object]
        ] {
    
    def apply[T](value: T): Node[T] = js.native
    def apply[T](value: T, prev: js.UndefOr[scala.Nothing], next: js.UndefOr[scala.Nothing], list: Yallist[T]): Node[T] = js.native
    def apply[T](value: T, prev: js.UndefOr[scala.Nothing], next: Node[T]): Node[T] = js.native
    def apply[T](value: T, prev: js.UndefOr[scala.Nothing], next: Node[T], list: Yallist[T]): Node[T] = js.native
    def apply[T](value: T, prev: Node[T]): Node[T] = js.native
    def apply[T](value: T, prev: Node[T], next: js.UndefOr[scala.Nothing], list: Yallist[T]): Node[T] = js.native
    def apply[T](value: T, prev: Node[T], next: Node[T]): Node[T] = js.native
    def apply[T](value: T, prev: Node[T], next: Node[T], list: Yallist[T]): Node[T] = js.native
  }
  
  @js.native
  trait Yallist[T] extends Iterable[T] {
    
    def forEach[U](
      callbackFn: js.ThisFunction3[/* this */ U, /* value */ T, /* index */ Double, /* list */ this.type, Unit]
    ): Unit = js.native
    def forEach[U](
      callbackFn: js.ThisFunction3[/* this */ U, /* value */ T, /* index */ Double, /* list */ this.type, Unit],
      thisArg: U
    ): Unit = js.native
    
    def forEachReverse[U](
      callbackFn: js.ThisFunction3[/* this */ U, /* value */ T, /* index */ Double, /* list */ this.type, Unit]
    ): Unit = js.native
    def forEachReverse[U](
      callbackFn: js.ThisFunction3[/* this */ U, /* value */ T, /* index */ Double, /* list */ this.type, Unit],
      thisArg: U
    ): Unit = js.native
    
    def get(n: Double): js.UndefOr[T] = js.native
    
    def getReverse(n: Double): js.UndefOr[T] = js.native
    
    var head: Node[T] | Null = js.native
    
    var length: Double = js.native
    
    def map[U, R](callbackFn: js.ThisFunction2[/* this */ U, /* value */ T, /* list */ this.type, R]): Yallist[R] = js.native
    def map[U, R](callbackFn: js.ThisFunction2[/* this */ U, /* value */ T, /* list */ this.type, R], thisArg: U): Yallist[R] = js.native
    
    def mapReverse[U, R](callbackFn: js.ThisFunction2[/* this */ U, /* value */ T, /* list */ this.type, R]): Yallist[R] = js.native
    def mapReverse[U, R](callbackFn: js.ThisFunction2[/* this */ U, /* value */ T, /* list */ this.type, R], thisArg: U): Yallist[R] = js.native
    
    def pop(): js.UndefOr[T] = js.native
    
    def push(items: T*): Double = js.native
    
    def pushNode(node: Node[T]): Unit = js.native
    
    def reduce[U](fn: js.Function3[/* previousValue */ U, /* currentValue */ T, /* index */ Double, U]): U = js.native
    def reduce[U](
      fn: js.Function3[/* previousValue */ U, /* currentValue */ T, /* index */ Double, U],
      initialValue: U
    ): U = js.native
    
    def reduceReverse[U](fn: js.Function3[/* previousValue */ U, /* currentValue */ T, /* index */ Double, U]): U = js.native
    def reduceReverse[U](
      fn: js.Function3[/* previousValue */ U, /* currentValue */ T, /* index */ Double, U],
      initialValue: U
    ): U = js.native
    
    def removeNode(node: Node[T]): Unit = js.native
    
    def reverse(): this.type = js.native
    
    def shift(): js.UndefOr[T] = js.native
    
    def slice(): Yallist[T] = js.native
    def slice(from: js.UndefOr[scala.Nothing], to: Double): Yallist[T] = js.native
    def slice(from: Double): Yallist[T] = js.native
    def slice(from: Double, to: Double): Yallist[T] = js.native
    
    def sliceReverse(): Yallist[T] = js.native
    def sliceReverse(from: js.UndefOr[scala.Nothing], to: Double): Yallist[T] = js.native
    def sliceReverse(from: Double): Yallist[T] = js.native
    def sliceReverse(from: Double, to: Double): Yallist[T] = js.native
    
    var tail: Node[T] | Null = js.native
    
    def toArray(): js.Array[T] = js.native
    
    def toArrayReverse(): js.Array[T] = js.native
    
    def unshift(items: T*): Double = js.native
    
    def unshiftNode(node: Node[T]): Unit = js.native
  }
}
