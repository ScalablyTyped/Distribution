package typings.tstl.anon

import typings.tstl.iforwarditeratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<tstl.tstl/iterator/IForwardIterator.IForwardIterator<boolean, tstl.tstl/iterator/IForwardIterator.IForwardIterator<boolean, any>>> */
@js.native
trait ReadonlyIForwardIteratorb extends js.Object {
  
  def equals(obj: IForwardIterator[Boolean, _]): Boolean = js.native
  
  def next(): IForwardIterator[Boolean, _] = js.native
  
  val value: Boolean = js.native
}
object ReadonlyIForwardIteratorb {
  
  @scala.inline
  def apply(
    equals: IForwardIterator[Boolean, _] => Boolean,
    next: () => IForwardIterator[Boolean, _],
    value: Boolean
  ): ReadonlyIForwardIteratorb = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), next = js.Any.fromFunction0(next), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyIForwardIteratorb]
  }
  
  @scala.inline
  implicit class ReadonlyIForwardIteratorbOps[Self <: ReadonlyIForwardIteratorb] (val x: Self) extends AnyVal {
    
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
    def setEquals(value: IForwardIterator[Boolean, _] => Boolean): Self = this.set("equals", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNext(value: () => IForwardIterator[Boolean, _]): Self = this.set("next", js.Any.fromFunction0(value))
    
    @scala.inline
    def setValue(value: Boolean): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
