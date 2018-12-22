package typings
package timmLib.timmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("timm", JSImport.Namespace)
@js.native
object timmModMembers extends js.Object {
  def addDefaults(a: js.Object): js.Object = js.native
  def addDefaults(a: js.Object, b: js.Object): js.Object = js.native
  def addDefaults(a: js.Object, b: js.Object, c: js.Object): js.Object = js.native
  def addDefaults(a: js.Object, b: js.Object, c: js.Object, d: js.Object): js.Object = js.native
  def addDefaults(a: js.Object, b: js.Object, c: js.Object, d: js.Object, e: js.Object): js.Object = js.native
  def addDefaults(
    a: js.Object,
    b: js.Object,
    c: js.Object,
    d: js.Object,
    e: js.Object,
    f: js.Object,
    rest: js.Object*
  ): js.Object = js.native
  def addFirst[T](array: js.Array[T], `val`: T): js.Array[T] = js.native
  def addFirst[T](array: js.Array[T], `val`: js.Array[T]): js.Array[T] = js.native
  def addLast[T](array: js.Array[T], `val`: T): js.Array[T] = js.native
  def addLast[T](array: js.Array[T], `val`: js.Array[T]): js.Array[T] = js.native
  def clone[T](obj: T): T = js.native
  def getIn(obj: ArrayOrObject | js.UndefOr[scala.Nothing], path: js.Array[Key]): js.Any = js.native
  def insert[T](array: js.Array[T], idx: scala.Double, `val`: T): js.Array[T] = js.native
  def insert[T](array: js.Array[T], idx: scala.Double, `val`: js.Array[T]): js.Array[T] = js.native
  def merge(a: js.Object): js.Object = js.native
  def merge(a: js.Object, b: js.Object): js.Object = js.native
  def merge(a: js.Object, b: js.Object, c: js.Object): js.Object = js.native
  def merge(a: js.Object, b: js.Object, c: js.Object, d: js.Object): js.Object = js.native
  def merge(a: js.Object, b: js.Object, c: js.Object, d: js.Object, e: js.Object): js.Object = js.native
  def merge(
    a: js.Object,
    b: js.Object,
    c: js.Object,
    d: js.Object,
    e: js.Object,
    f: js.Object,
    rest: js.Object*
  ): js.Object = js.native
  def mergeDeep(a: js.Object): js.Object = js.native
  def mergeDeep(a: js.Object, b: js.Object): js.Object = js.native
  def mergeDeep(a: js.Object, b: js.Object, c: js.Object): js.Object = js.native
  def mergeDeep(a: js.Object, b: js.Object, c: js.Object, d: js.Object): js.Object = js.native
  def mergeDeep(a: js.Object, b: js.Object, c: js.Object, d: js.Object, e: js.Object): js.Object = js.native
  def mergeDeep(
    a: js.Object,
    b: js.Object,
    c: js.Object,
    d: js.Object,
    e: js.Object,
    f: js.Object,
    rest: js.Object*
  ): js.Object = js.native
  def mergeIn[T](a: T, path: js.Array[Key]): T = js.native
  def mergeIn[T](a: T, path: js.Array[Key], b: js.Object): T = js.native
  def mergeIn[T](a: T, path: js.Array[Key], b: js.Object, c: js.Object): T = js.native
  def mergeIn[T](a: T, path: js.Array[Key], b: js.Object, c: js.Object, d: js.Object): T = js.native
  def mergeIn[T](a: T, path: js.Array[Key], b: js.Object, c: js.Object, d: js.Object, e: js.Object): T = js.native
  def mergeIn[T](
    a: T,
    path: js.Array[Key],
    b: js.Object,
    c: js.Object,
    d: js.Object,
    e: js.Object,
    f: js.Object,
    rest: js.Object*
  ): T = js.native
  def omit(obj: js.Object, attrs: java.lang.String): js.Object = js.native
  def omit(obj: js.Object, attrs: js.Array[java.lang.String]): js.Object = js.native
  def removeAt[T](array: js.Array[T], idx: scala.Double): js.Array[T] = js.native
  def removeFirst[T](array: js.Array[T]): js.Array[T] = js.native
  def removeLast[T](array: js.Array[T]): js.Array[T] = js.native
  def replaceAt[T](array: js.Array[T], idx: scala.Double, newItem: T): js.Array[T] = js.native
  def set[T](obj: T, key: Key, `val`: js.Any): T = js.native
  def set[T](obj: js.UndefOr[scala.Nothing], key: Key, `val`: js.Any): T = js.native
  def setIn[T](obj: T, path: js.Array[Key], `val`: js.Any): T = js.native
  def update[T](obj: T, key: Key, fnUpdate: js.Function1[/* prevValue */ js.Any, _]): T = js.native
  def updateIn[T](obj: T, path: js.Array[Key], fnUpdate: js.Function1[/* prevValue */ js.Any, _]): T = js.native
}

