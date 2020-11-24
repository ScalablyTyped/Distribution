package typings.wordpressBlockEditor.blockSettingsMenuMod.BlockSettingsMenu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Props extends js.Object {
  
  var children: js.UndefOr[scala.Nothing] = js.native
  
  var clientIds: js.Array[String] = js.native
}
object Props {
  
  @scala.inline
  def apply(clientIds: js.Array[String]): Props = {
    val __obj = js.Dynamic.literal(clientIds = clientIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    
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
    def setClientIdsVarargs(value: String*): Self = this.set("clientIds", js.Array(value :_*))
    
    @scala.inline
    def setClientIds(value: js.Array[String]): Self = this.set("clientIds", value.asInstanceOf[js.Any])
  }
}
