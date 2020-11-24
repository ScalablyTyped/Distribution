package typings.whatwgMimetype.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllowParameters extends js.Object {
  
  var allowParameters: js.UndefOr[Boolean] = js.native
}
object AllowParameters {
  
  @scala.inline
  def apply(): AllowParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowParameters]
  }
  
  @scala.inline
  implicit class AllowParametersOps[Self <: AllowParameters] (val x: Self) extends AnyVal {
    
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
    def setAllowParameters(value: Boolean): Self = this.set("allowParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowParameters: Self = this.set("allowParameters", js.undefined)
  }
}
