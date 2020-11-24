package typings.winrt.Windows.Foundation.Collections

import typings.winrt.anon.Items
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IIterator[T] extends js.Object {
  
  var current: T = js.native
  
  def getMany(): Items[T] = js.native
  
  var hasCurrent: Boolean = js.native
  
  def moveNext(): Boolean = js.native
}
object IIterator {
  
  @scala.inline
  def apply[T](current: T, getMany: () => Items[T], hasCurrent: Boolean, moveNext: () => Boolean): IIterator[T] = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], getMany = js.Any.fromFunction0(getMany), hasCurrent = hasCurrent.asInstanceOf[js.Any], moveNext = js.Any.fromFunction0(moveNext))
    __obj.asInstanceOf[IIterator[T]]
  }
  
  @scala.inline
  implicit class IIteratorOps[Self <: IIterator[_], T] (val x: Self with IIterator[T]) extends AnyVal {
    
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
    def setCurrent(value: T): Self = this.set("current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetMany(value: () => Items[T]): Self = this.set("getMany", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasCurrent(value: Boolean): Self = this.set("hasCurrent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveNext(value: () => Boolean): Self = this.set("moveNext", js.Any.fromFunction0(value))
  }
}
