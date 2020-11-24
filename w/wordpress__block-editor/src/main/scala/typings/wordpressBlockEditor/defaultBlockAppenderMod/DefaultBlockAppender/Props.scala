package typings.wordpressBlockEditor.defaultBlockAppenderMod.DefaultBlockAppender

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Props extends js.Object {
  
  var lastBlockClientId: String = js.native
  
  var rootClientId: String = js.native
}
object Props {
  
  @scala.inline
  def apply(lastBlockClientId: String, rootClientId: String): Props = {
    val __obj = js.Dynamic.literal(lastBlockClientId = lastBlockClientId.asInstanceOf[js.Any], rootClientId = rootClientId.asInstanceOf[js.Any])
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
    def setLastBlockClientId(value: String): Self = this.set("lastBlockClientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootClientId(value: String): Self = this.set("rootClientId", value.asInstanceOf[js.Any])
  }
}
