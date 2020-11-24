package typings.styledComponents.anon

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait As[C /* <: String | ComponentType[_] */] extends js.Object {
  
  var as: js.UndefOr[C] = js.native
  
  var forwardedAs: js.UndefOr[C] = js.native
}
object As {
  
  @scala.inline
  def apply[C /* <: String | ComponentType[_] */](): As[C] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[As[C]]
  }
  
  @scala.inline
  implicit class AsOps[Self <: As[_], C /* <: String | ComponentType[_] */] (val x: Self with As[C]) extends AnyVal {
    
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
    def setAs(value: C): Self = this.set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    
    @scala.inline
    def setForwardedAs(value: C): Self = this.set("forwardedAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForwardedAs: Self = this.set("forwardedAs", js.undefined)
  }
}
