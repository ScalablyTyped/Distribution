package typings.tsmonad.maybeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaybePatterns[T, U] extends js.Object {
  
  def just(t: T): U = js.native
  
  def nothing(): U = js.native
}
object MaybePatterns {
  
  @scala.inline
  def apply[T, U](just: T => U, nothing: () => U): MaybePatterns[T, U] = {
    val __obj = js.Dynamic.literal(just = js.Any.fromFunction1(just), nothing = js.Any.fromFunction0(nothing))
    __obj.asInstanceOf[MaybePatterns[T, U]]
  }
  
  @scala.inline
  implicit class MaybePatternsOps[Self <: MaybePatterns[_, _], T, U] (val x: Self with (MaybePatterns[T, U])) extends AnyVal {
    
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
    def setJust(value: T => U): Self = this.set("just", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNothing(value: () => U): Self = this.set("nothing", js.Any.fromFunction0(value))
  }
}
