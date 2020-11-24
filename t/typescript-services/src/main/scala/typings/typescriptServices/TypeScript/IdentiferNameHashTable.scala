package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentiferNameHashTable[T] extends StringHashTable[T]
object IdentiferNameHashTable {
  
  @scala.inline
  def apply[T](
    add: (String, T) => Boolean,
    addOrUpdate: (String, T) => Boolean,
    count: () => Double,
    every: (js.Function3[/* k */ String, T, /* context */ js.Any, Unit], js.Any) => Boolean,
    getAllKeys: () => js.Array[String],
    itemCount: js.Any,
    lookup: String => T,
    map: (js.Function3[/* k */ String, T, /* context */ js.Any, Unit], js.Any) => Unit,
    remove: String => Unit,
    some: (js.Function3[/* k */ String, T, /* context */ js.Any, Unit], js.Any) => Boolean,
    table: js.Any
  ): IdentiferNameHashTable[T] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), addOrUpdate = js.Any.fromFunction2(addOrUpdate), count = js.Any.fromFunction0(count), every = js.Any.fromFunction2(every), getAllKeys = js.Any.fromFunction0(getAllKeys), itemCount = itemCount.asInstanceOf[js.Any], lookup = js.Any.fromFunction1(lookup), map = js.Any.fromFunction2(map), remove = js.Any.fromFunction1(remove), some = js.Any.fromFunction2(some), table = table.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentiferNameHashTable[T]]
  }
}
