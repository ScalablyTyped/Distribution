package typings.useAsset.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Clear[T] extends js.Object {
  
  def clear(args: js.Any*): Unit = js.native
  
  def peek(args: js.Any*): Unit | T = js.native
  
  def preload(args: js.Any*): Unit = js.native
  
  /**
    * @throws Suspense Promise if asset is not yet ready
    * @throws Error if the promise rejected for some reason
    */
  def read(args: js.Any*): T = js.native
}
object Clear {
  
  @scala.inline
  def apply[T](
    clear: /* repeated */ js.Any => Unit,
    peek: /* repeated */ js.Any => Unit | T,
    preload: /* repeated */ js.Any => Unit,
    read: /* repeated */ js.Any => T
  ): Clear[T] = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction1(clear), peek = js.Any.fromFunction1(peek), preload = js.Any.fromFunction1(preload), read = js.Any.fromFunction1(read))
    __obj.asInstanceOf[Clear[T]]
  }
  
  @scala.inline
  implicit class ClearOps[Self <: Clear[_], T] (val x: Self with Clear[T]) extends AnyVal {
    
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
    def setClear(value: /* repeated */ js.Any => Unit): Self = this.set("clear", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPeek(value: /* repeated */ js.Any => Unit | T): Self = this.set("peek", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPreload(value: /* repeated */ js.Any => Unit): Self = this.set("preload", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRead(value: /* repeated */ js.Any => T): Self = this.set("read", js.Any.fromFunction1(value))
  }
}
