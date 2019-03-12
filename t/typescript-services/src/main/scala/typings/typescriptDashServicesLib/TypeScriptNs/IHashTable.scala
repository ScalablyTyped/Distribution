package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHashTable[T] extends js.Object {
  def add(key: java.lang.String, data: T): scala.Boolean
  def addOrUpdate(key: java.lang.String, data: T): scala.Boolean
  def count(): scala.Double
  def every(
    fn: js.Function3[/* k */ java.lang.String, /* value */ T, /* context */ js.Any, scala.Unit],
    context: js.Any
  ): scala.Boolean
  def getAllKeys(): js.Array[java.lang.String]
  def lookup(key: java.lang.String): T
  def map(
    fn: js.Function3[/* k */ java.lang.String, /* value */ T, /* context */ js.Any, scala.Unit],
    context: js.Any
  ): scala.Unit
  def some(
    fn: js.Function3[/* k */ java.lang.String, /* value */ T, /* context */ js.Any, scala.Unit],
    context: js.Any
  ): scala.Boolean
}

object IHashTable {
  @scala.inline
  def apply[T](
    add: (java.lang.String, T) => scala.Boolean,
    addOrUpdate: (java.lang.String, T) => scala.Boolean,
    count: () => scala.Double,
    every: (js.Function3[/* k */ java.lang.String, /* value */ T, /* context */ js.Any, scala.Unit], js.Any) => scala.Boolean,
    getAllKeys: () => js.Array[java.lang.String],
    lookup: java.lang.String => T,
    map: (js.Function3[/* k */ java.lang.String, /* value */ T, /* context */ js.Any, scala.Unit], js.Any) => scala.Unit,
    some: (js.Function3[/* k */ java.lang.String, /* value */ T, /* context */ js.Any, scala.Unit], js.Any) => scala.Boolean
  ): IHashTable[T] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), addOrUpdate = js.Any.fromFunction2(addOrUpdate), count = js.Any.fromFunction0(count), every = js.Any.fromFunction2(every), getAllKeys = js.Any.fromFunction0(getAllKeys), lookup = js.Any.fromFunction1(lookup), map = js.Any.fromFunction2(map), some = js.Any.fromFunction2(some))
  
    __obj.asInstanceOf[IHashTable[T]]
  }
}

