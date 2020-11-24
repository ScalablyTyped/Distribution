package typings.yayson.mod

import typings.yayson.yaysonStrings.default
import typings.yayson.yaysonStrings.sequelize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait YaysonOptions extends js.Object {
  
  var adapter: js.UndefOr[default | sequelize] = js.native
}
object YaysonOptions {
  
  @scala.inline
  def apply(): YaysonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[YaysonOptions]
  }
  
  @scala.inline
  implicit class YaysonOptionsOps[Self <: YaysonOptions] (val x: Self) extends AnyVal {
    
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
    def setAdapter(value: default | sequelize): Self = this.set("adapter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdapter: Self = this.set("adapter", js.undefined)
  }
}
