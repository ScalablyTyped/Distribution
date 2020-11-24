package typings.urlToolkit.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlwaysNormalize extends js.Object {
  
  var alwaysNormalize: js.UndefOr[Boolean] = js.native
}
object AlwaysNormalize {
  
  @scala.inline
  def apply(): AlwaysNormalize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlwaysNormalize]
  }
  
  @scala.inline
  implicit class AlwaysNormalizeOps[Self <: AlwaysNormalize] (val x: Self) extends AnyVal {
    
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
    def setAlwaysNormalize(value: Boolean): Self = this.set("alwaysNormalize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlwaysNormalize: Self = this.set("alwaysNormalize", js.undefined)
  }
}
