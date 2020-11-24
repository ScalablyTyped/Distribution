package typings.tsmonad.monadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Monad[T] extends js.Object {
  
  def bind[U](f: js.Function1[/* t */ T, Monad[U]]): Monad[U] = js.native
  
  def chain[U](f: js.Function1[/* t */ T, Monad[U]]): Monad[U] = js.native
  
  def of[U](t: U): Monad[U] = js.native
  
  def unit[U](t: U): Monad[U] = js.native
}
object Monad {
  
  @scala.inline
  def apply[T](
    bind: js.Function1[/* t */ T, Monad[js.Any]] => Monad[js.Any],
    chain: js.Function1[/* t */ T, Monad[js.Any]] => Monad[js.Any],
    of: js.Any => Monad[js.Any],
    unit: js.Any => Monad[js.Any]
  ): Monad[T] = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1(bind), chain = js.Any.fromFunction1(chain), of = js.Any.fromFunction1(of), unit = js.Any.fromFunction1(unit))
    __obj.asInstanceOf[Monad[T]]
  }
  
  @scala.inline
  implicit class MonadOps[Self <: Monad[_], T] (val x: Self with Monad[T]) extends AnyVal {
    
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
    def setBind(value: js.Function1[/* t */ T, Monad[js.Any]] => Monad[js.Any]): Self = this.set("bind", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChain(value: js.Function1[/* t */ T, Monad[js.Any]] => Monad[js.Any]): Self = this.set("chain", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOf(value: js.Any => Monad[js.Any]): Self = this.set("of", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnit(value: js.Any => Monad[js.Any]): Self = this.set("unit", js.Any.fromFunction1(value))
  }
}
