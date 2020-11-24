package typings.tsmonad.maybeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<tsmonad.tsmonad/lib/src/maybe.MaybePatterns<T, U>> */
@js.native
trait OptionalMaybePatterns[T, U] extends js.Object {
  
  var just: js.UndefOr[js.Function1[/* t */ T, U]] = js.native
  
  var nothing: js.UndefOr[js.Function0[U]] = js.native
}
object OptionalMaybePatterns {
  
  @scala.inline
  def apply[T, U](): OptionalMaybePatterns[T, U] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionalMaybePatterns[T, U]]
  }
  
  @scala.inline
  implicit class OptionalMaybePatternsOps[Self <: OptionalMaybePatterns[_, _], T, U] (val x: Self with (OptionalMaybePatterns[T, U])) extends AnyVal {
    
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
    def setJust(value: /* t */ T => U): Self = this.set("just", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteJust: Self = this.set("just", js.undefined)
    
    @scala.inline
    def setNothing(value: () => U): Self = this.set("nothing", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteNothing: Self = this.set("nothing", js.undefined)
  }
}
