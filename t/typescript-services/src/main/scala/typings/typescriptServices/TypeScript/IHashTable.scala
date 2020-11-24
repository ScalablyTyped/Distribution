package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHashTable[T] extends js.Object {
  
  def add(key: String, data: T): Boolean = js.native
  
  def addOrUpdate(key: String, data: T): Boolean = js.native
  
  def count(): Double = js.native
  
  def every(fn: js.Function3[/* k */ String, /* value */ T, /* context */ js.Any, Unit], context: js.Any): Boolean = js.native
  
  def getAllKeys(): js.Array[String] = js.native
  
  def lookup(key: String): T = js.native
  
  def map(fn: js.Function3[/* k */ String, /* value */ T, /* context */ js.Any, Unit], context: js.Any): Unit = js.native
  
  def some(fn: js.Function3[/* k */ String, /* value */ T, /* context */ js.Any, Unit], context: js.Any): Boolean = js.native
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
  
  @scala.inline
  implicit class IHashTableOps[Self <: IHashTable[_], T] (val x: Self with IHashTable[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdd(value: (String, T) => Boolean): Self = this.set("add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAddOrUpdate(value: (String, T) => Boolean): Self = this.set("addOrUpdate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCount(value: () => Double): Self = this.set("count", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEvery(
      value: (js.Function3[/* k */ String, /* value */ T, /* context */ js.Any, Unit], js.Any) => Boolean
    ): Self = this.set("every", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetAllKeys(value: () => js.Array[String]): Self = this.set("getAllKeys", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLookup(value: String => T): Self = this.set("lookup", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMap(value: (js.Function3[/* k */ String, /* value */ T, /* context */ js.Any, Unit], js.Any) => Unit): Self = this.set("map", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSome(
      value: (js.Function3[/* k */ String, /* value */ T, /* context */ js.Any, Unit], js.Any) => Boolean
    ): Self = this.set("some", js.Any.fromFunction2(value))
  }
}
