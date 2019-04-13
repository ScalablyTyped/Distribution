package typings
package yallistLib.yallistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Yallist[T]
  extends stdLib.Iterable[T] {
  var head: Node[T] | scala.Null = js.native
  var length: scala.Double = js.native
  var tail: Node[T] | scala.Null = js.native
  def forEach[U](
    callbackFn: js.ThisFunction3[/* this */ U, /* value */ T, /* index */ scala.Double, /* list */ this.type, scala.Unit]
  ): scala.Unit = js.native
  def forEach[U](
    callbackFn: js.ThisFunction3[/* this */ U, /* value */ T, /* index */ scala.Double, /* list */ this.type, scala.Unit],
    thisArg: U
  ): scala.Unit = js.native
  def forEachReverse[U](
    callbackFn: js.ThisFunction3[/* this */ U, /* value */ T, /* index */ scala.Double, /* list */ this.type, scala.Unit]
  ): scala.Unit = js.native
  def forEachReverse[U](
    callbackFn: js.ThisFunction3[/* this */ U, /* value */ T, /* index */ scala.Double, /* list */ this.type, scala.Unit],
    thisArg: U
  ): scala.Unit = js.native
  def get(n: scala.Double): js.UndefOr[T] = js.native
  def getReverse(n: scala.Double): js.UndefOr[T] = js.native
  def map[U, R](callbackFn: js.ThisFunction2[/* this */ U, /* value */ T, /* list */ this.type, R]): Yallist[R] = js.native
  def map[U, R](callbackFn: js.ThisFunction2[/* this */ U, /* value */ T, /* list */ this.type, R], thisArg: U): Yallist[R] = js.native
  def mapReverse[U, R](callbackFn: js.ThisFunction2[/* this */ U, /* value */ T, /* list */ this.type, R]): Yallist[R] = js.native
  def mapReverse[U, R](callbackFn: js.ThisFunction2[/* this */ U, /* value */ T, /* list */ this.type, R], thisArg: U): Yallist[R] = js.native
  def pop(): js.UndefOr[T] = js.native
  def push(items: T*): scala.Double = js.native
  def pushNode(node: Node[T]): scala.Unit = js.native
  def reduce[U](fn: js.Function3[/* previousValue */ U, /* currentValue */ T, /* index */ scala.Double, U]): U = js.native
  def reduce[U](
    fn: js.Function3[/* previousValue */ U, /* currentValue */ T, /* index */ scala.Double, U],
    initialValue: U
  ): U = js.native
  def reduceReverse[U](fn: js.Function3[/* previousValue */ U, /* currentValue */ T, /* index */ scala.Double, U]): U = js.native
  def reduceReverse[U](
    fn: js.Function3[/* previousValue */ U, /* currentValue */ T, /* index */ scala.Double, U],
    initialValue: U
  ): U = js.native
  def removeNode(node: Node[T]): scala.Unit = js.native
  def reverse(): this.type = js.native
  def shift(): js.UndefOr[T] = js.native
  def slice(): Yallist[T] = js.native
  def slice(from: scala.Double): Yallist[T] = js.native
  def slice(from: scala.Double, to: scala.Double): Yallist[T] = js.native
  def sliceReverse(): Yallist[T] = js.native
  def sliceReverse(from: scala.Double): Yallist[T] = js.native
  def sliceReverse(from: scala.Double, to: scala.Double): Yallist[T] = js.native
  def toArray(): js.Array[T] = js.native
  def toArrayReverse(): js.Array[T] = js.native
  def unshift(items: T*): scala.Double = js.native
  def unshiftNode(node: Node[T]): scala.Unit = js.native
}

