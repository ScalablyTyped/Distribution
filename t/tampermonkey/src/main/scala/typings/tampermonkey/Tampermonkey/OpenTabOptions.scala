package typings.tampermonkey.Tampermonkey

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenTabOptions extends js.Object {
  
  /** Decides whether the new tab should be focused */
  var active: js.UndefOr[Boolean] = js.native
  
  /** Inserts the new tab after the current one */
  var insert: js.UndefOr[Boolean] = js.native
  
  /** Makes the browser re-focus the current tab on close */
  var setParent: js.UndefOr[Boolean] = js.native
}
object OpenTabOptions {
  
  @scala.inline
  def apply(): OpenTabOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenTabOptions]
  }
  
  @scala.inline
  implicit class OpenTabOptionsOps[Self <: OpenTabOptions] (val x: Self) extends AnyVal {
    
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setInsert(value: Boolean): Self = this.set("insert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsert: Self = this.set("insert", js.undefined)
    
    @scala.inline
    def setSetParent(value: Boolean): Self = this.set("setParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetParent: Self = this.set("setParent", js.undefined)
  }
}
