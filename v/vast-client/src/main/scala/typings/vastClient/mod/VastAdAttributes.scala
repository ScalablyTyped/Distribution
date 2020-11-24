package typings.vastClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VastAdAttributes extends js.Object {
  
  var fallback_index: String | Null = js.native
  
  var `type`: String = js.native
}
object VastAdAttributes {
  
  @scala.inline
  def apply(`type`: String): VastAdAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VastAdAttributes]
  }
  
  @scala.inline
  implicit class VastAdAttributesOps[Self <: VastAdAttributes] (val x: Self) extends AnyVal {
    
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
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFallback_index(value: String): Self = this.set("fallback_index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFallback_indexNull: Self = this.set("fallback_index", null)
  }
}
