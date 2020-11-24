package typings.yallist.mod

import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
