package typings.typescriptDashServices.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHashTable[T] extends js.Object {
  def add(key: String, data: T): Boolean
  def addOrUpdate(key: String, data: T): Boolean
  def count(): Double
  def every(fn: js.Function3[/* k */ String, /* value */ T, /* context */ js.Any, Unit], context: js.Any): Boolean
  def getAllKeys(): js.Array[String]
  def lookup(key: String): T
  def map(fn: js.Function3[/* k */ String, /* value */ T, /* context */ js.Any, Unit], context: js.Any): Unit
  def some(fn: js.Function3[/* k */ String, /* value */ T, /* context */ js.Any, Unit], context: js.Any): Boolean
}

object IHashTable {
  @scala.inline
  def apply[T](
    add: (String, T) => Boolean,
    addOrUpdate: (String, T) => Boolean,
    count: () => Double,
    every: (js.Function3[/* k */ String, /* value */ T, /* context */ js.Any, Unit], js.Any) => Boolean,
    getAllKeys: () => js.Array[String],
    lookup: String => T,
    map: (js.Function3[/* k */ String, /* value */ T, /* context */ js.Any, Unit], js.Any) => Unit,
    some: (js.Function3[/* k */ String, /* value */ T, /* context */ js.Any, Unit], js.Any) => Boolean
  ): IHashTable[T] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), addOrUpdate = js.Any.fromFunction2(addOrUpdate), count = js.Any.fromFunction0(count), every = js.Any.fromFunction2(every), getAllKeys = js.Any.fromFunction0(getAllKeys), lookup = js.Any.fromFunction1(lookup), map = js.Any.fromFunction2(map), some = js.Any.fromFunction2(some))
  
    __obj.asInstanceOf[IHashTable[T]]
  }
}

