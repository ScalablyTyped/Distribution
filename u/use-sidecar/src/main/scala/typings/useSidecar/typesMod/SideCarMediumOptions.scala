package typings.useSidecar.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SideCarMediumOptions extends js.Object {
  
  var async: js.UndefOr[Boolean] = js.native
  
  var ssr: js.UndefOr[Boolean] = js.native
}
object SideCarMediumOptions {
  
  @scala.inline
  def apply(): SideCarMediumOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SideCarMediumOptions]
  }
  
  @scala.inline
  implicit class SideCarMediumOptionsOps[Self <: SideCarMediumOptions] (val x: Self) extends AnyVal {
    
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
    def setAsync(value: Boolean): Self = this.set("async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsync: Self = this.set("async", js.undefined)
    
    @scala.inline
    def setSsr(value: Boolean): Self = this.set("ssr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSsr: Self = this.set("ssr", js.undefined)
  }
}
