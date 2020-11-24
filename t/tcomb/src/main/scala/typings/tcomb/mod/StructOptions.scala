package typings.tcomb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StructOptions extends js.Object {
  
  var defaultProps: js.UndefOr[js.Object] = js.native
  
  var name: js.UndefOr[java.lang.String] = js.native
  
  var strict: js.UndefOr[scala.Boolean] = js.native
}
object StructOptions {
  
  @scala.inline
  def apply(): StructOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StructOptions]
  }
  
  @scala.inline
  implicit class StructOptionsOps[Self <: StructOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDefaultProps(value: js.Object): Self = this.set("defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultProps: Self = this.set("defaultProps", js.undefined)
    
    @scala.inline
    def setName(value: java.lang.String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setStrict(value: scala.Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
  }
}
