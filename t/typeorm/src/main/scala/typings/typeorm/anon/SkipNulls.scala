package typings.typeorm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SkipNulls extends js.Object {
  
  var skipNulls: js.UndefOr[Boolean] = js.native
}
object SkipNulls {
  
  @scala.inline
  def apply(): SkipNulls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SkipNulls]
  }
  
  @scala.inline
  implicit class SkipNullsOps[Self <: SkipNulls] (val x: Self) extends AnyVal {
    
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
    def setSkipNulls(value: Boolean): Self = this.set("skipNulls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipNulls: Self = this.set("skipNulls", js.undefined)
  }
}
