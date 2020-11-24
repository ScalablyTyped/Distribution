package typings.xlsx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OriginOption extends js.Object {
  
  /** Top-Left cell for operation (CellAddress or A1 string or row) */
  var origin: js.UndefOr[Double | String | CellAddress] = js.native
}
object OriginOption {
  
  @scala.inline
  def apply(): OriginOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OriginOption]
  }
  
  @scala.inline
  implicit class OriginOptionOps[Self <: OriginOption] (val x: Self) extends AnyVal {
    
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
    def setOrigin(value: Double | String | CellAddress): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
  }
}
