package typings.useDebounce.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EqualityFn[T] extends js.Object {
  
  var equalityFn: js.UndefOr[js.Function2[/* left */ T, /* right */ T, Boolean]] = js.native
  
  var leading: js.UndefOr[Boolean] = js.native
  
  var maxWait: js.UndefOr[Double] = js.native
  
  var trailing: js.UndefOr[Boolean] = js.native
}
object EqualityFn {
  
  @scala.inline
  def apply[T](): EqualityFn[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EqualityFn[T]]
  }
  
  @scala.inline
  implicit class EqualityFnOps[Self <: EqualityFn[_], T] (val x: Self with EqualityFn[T]) extends AnyVal {
    
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
    def setEqualityFn(value: (/* left */ T, /* right */ T) => Boolean): Self = this.set("equalityFn", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteEqualityFn: Self = this.set("equalityFn", js.undefined)
    
    @scala.inline
    def setLeading(value: Boolean): Self = this.set("leading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeading: Self = this.set("leading", js.undefined)
    
    @scala.inline
    def setMaxWait(value: Double): Self = this.set("maxWait", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxWait: Self = this.set("maxWait", js.undefined)
    
    @scala.inline
    def setTrailing(value: Boolean): Self = this.set("trailing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrailing: Self = this.set("trailing", js.undefined)
  }
}
