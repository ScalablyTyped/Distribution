package typings.tinymce.mod.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tools extends js.Object {
  def create(s: String, p: js.Object): Unit = js.native
  def create(s: String, p: js.Object, root: js.Object): Unit = js.native
  def createNS(n: String): js.Object = js.native
  def createNS(n: String, o: js.Object): js.Object = js.native
  def each(o: js.Object, cb: js.Function0[Unit]): Unit = js.native
  def each(o: js.Object, cb: js.Function0[Unit], s: js.Object): Unit = js.native
  def explode(s: String, d: String): Unit = js.native
  def grep[T](a: js.Array[T], f: js.Function0[Unit]): js.Array[T] = js.native
  def inArray[T](item: T, arr: js.Array[T]): Double = js.native
  def is(obj: js.Object, `type`: String): Boolean = js.native
  def isArray(obj: js.Object): Boolean = js.native
  def makeMap[T](items: js.Array[T]): js.Object = js.native
  def makeMap[T](items: js.Array[T], delim: String): js.Object = js.native
  def makeMap[T](items: js.Array[T], delim: String, map: js.Object): js.Object = js.native
  def map[T, S](array: js.Array[T], callback: js.Function1[/* c */ T, S]): js.Array[S] = js.native
  def resolve(n: String): js.Object = js.native
  def resolve(n: String, o: js.Object): js.Object = js.native
  def toArray[T](obj: js.Object): js.Array[T] = js.native
  def trim(s: String): String = js.native
  def walk(o: js.Object, f: js.Function0[Unit]): Unit = js.native
  def walk(o: js.Object, f: js.Function0[Unit], n: String): Unit = js.native
  def walk(o: js.Object, f: js.Function0[Unit], n: String, s: String): Unit = js.native
}

