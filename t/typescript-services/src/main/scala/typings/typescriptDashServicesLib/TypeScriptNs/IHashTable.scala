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
    add: js.Function2[java.lang.String, T, scala.Boolean],
    addOrUpdate: js.Function2[java.lang.String, T, scala.Boolean],
    count: js.Function0[scala.Double],
    every: js.Function2[
      js.Function3[/* k */ java.lang.String, /* value */ T, /* context */ js.Any, scala.Unit], 
      js.Any, 
      scala.Boolean
    ],
    getAllKeys: js.Function0[js.Array[java.lang.String]],
    lookup: js.Function1[java.lang.String, T],
    map: js.Function2[
      js.Function3[/* k */ java.lang.String, /* value */ T, /* context */ js.Any, scala.Unit], 
      js.Any, 
      scala.Unit
    ],
    some: js.Function2[
      js.Function3[/* k */ java.lang.String, /* value */ T, /* context */ js.Any, scala.Unit], 
      js.Any, 
      scala.Boolean
    ]
  ): IHashTable[T] = {
    val __obj = js.Dynamic.literal(add = add, addOrUpdate = addOrUpdate, count = count, every = every, getAllKeys = getAllKeys, lookup = lookup, map = map, some = some)
  
    __obj.asInstanceOf[IHashTable[T]]
  }
}

