package typings.testingLibraryReactHooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@testing-library/react-hooks.@testing-library/react-hooks.WaitOptions, 'timeout' | 'suppressErrors'> */
@js.native
trait PickWaitOptionstimeoutsup extends js.Object {
  
  var suppressErrors: js.UndefOr[Boolean] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
}
object PickWaitOptionstimeoutsup {
  
  @scala.inline
  def apply(): PickWaitOptionstimeoutsup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickWaitOptionstimeoutsup]
  }
  
  @scala.inline
  implicit class PickWaitOptionstimeoutsupOps[Self <: PickWaitOptionstimeoutsup] (val x: Self) extends AnyVal {
    
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
    def setSuppressErrors(value: Boolean): Self = this.set("suppressErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppressErrors: Self = this.set("suppressErrors", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
