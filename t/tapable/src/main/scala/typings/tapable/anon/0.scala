package typings.tapable.anon

import typings.tapable.mod.TapFunction
import typings.tapable.mod.TapType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `0`[TTapType /* <: TapType */, TArg1, TArg2, TArg3, THookResult] extends js.Object {
  
  var fn: js.UndefOr[TapFunction[TTapType, TArg1, TArg2, TArg3, THookResult]] = js.native
  
  var `type`: js.UndefOr[TTapType] = js.native
}
object `0` {
  
  @scala.inline
  def apply[TTapType /* <: TapType */, TArg1, TArg2, TArg3, THookResult](): `0`[TTapType, TArg1, TArg2, TArg3, THookResult] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`0`[TTapType, TArg1, TArg2, TArg3, THookResult]]
  }
  
  @scala.inline
  implicit class `0Ops`[Self <: `0`[_, _, _, _, _], TTapType /* <: TapType */, TArg1, TArg2, TArg3, THookResult] (val x: Self with (`0`[TTapType, TArg1, TArg2, TArg3, THookResult])) extends AnyVal {
    
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
    def setType(value: TTapType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
