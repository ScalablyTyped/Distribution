package typings.vuex.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionSubscribersObject[P, S] extends js.Object {
  
  var after: js.UndefOr[ActionSubscriber[P, S]] = js.native
  
  var before: js.UndefOr[ActionSubscriber[P, S]] = js.native
  
  var error: js.UndefOr[ActionErrorSubscriber[P, S]] = js.native
}
object ActionSubscribersObject {
  
  @scala.inline
  def apply[P, S](): ActionSubscribersObject[P, S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionSubscribersObject[P, S]]
  }
  
  @scala.inline
  implicit class ActionSubscribersObjectOps[Self <: ActionSubscribersObject[_, _], P, S] (val x: Self with (ActionSubscribersObject[P, S])) extends AnyVal {
    
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
    def setAfter(value: (P, S) => js.Any): Self = this.set("after", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAfter: Self = this.set("after", js.undefined)
    
    @scala.inline
    def setBefore(value: (P, S) => js.Any): Self = this.set("before", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteBefore: Self = this.set("before", js.undefined)
    
    @scala.inline
    def setError(value: (P, S, /* error */ Error) => js.Any): Self = this.set("error", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
  }
}
