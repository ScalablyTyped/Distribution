package typings.tapable.anon

import typings.tapable.mod.TapFunction
import typings.tapable.tapableStrings.promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnType[TArg1, TArg2, TArg3, THookResult] extends js.Object {
  
  var fn: js.UndefOr[TapFunction[promise, TArg1, TArg2, TArg3, THookResult]] = js.native
  
  var `type`: js.UndefOr[promise] = js.native
}
object FnType {
  
  @scala.inline
  def apply[TArg1, TArg2, TArg3, THookResult](): FnType[TArg1, TArg2, TArg3, THookResult] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FnType[TArg1, TArg2, TArg3, THookResult]]
  }
  
  @scala.inline
  implicit class FnTypeOps[Self <: FnType[_, _, _, _], TArg1, TArg2, TArg3, THookResult] (val x: Self with (FnType[TArg1, TArg2, TArg3, THookResult])) extends AnyVal {
    
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
    def setFn(
      value: (TArg1, TArg2, TArg3, /* repeated */ js.Any) => js.Promise[THookResult] | THookResult | Unit
    ): Self = this.set("fn", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteFn: Self = this.set("fn", js.undefined)
    
    @scala.inline
    def setType(value: promise): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
