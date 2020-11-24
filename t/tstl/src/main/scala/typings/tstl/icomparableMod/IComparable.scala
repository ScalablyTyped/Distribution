package typings.tstl.icomparableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IComparable[T] extends js.Object {
  
  /**
    * Test whether less than some object.
    *
    * @param obj The object to compare.
    * @return Whether less or not.
    */
  def less(obj: T): Boolean = js.native
}
object IComparable {
  
  @scala.inline
  def apply[T](less: T => Boolean): IComparable[T] = {
    val __obj = js.Dynamic.literal(less = js.Any.fromFunction1(less))
    __obj.asInstanceOf[IComparable[T]]
  }
  
  @scala.inline
  implicit class IComparableOps[Self <: IComparable[_], T] (val x: Self with IComparable[T]) extends AnyVal {
    
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
    def setLess(value: T => Boolean): Self = this.set("less", js.Any.fromFunction1(value))
  }
}
