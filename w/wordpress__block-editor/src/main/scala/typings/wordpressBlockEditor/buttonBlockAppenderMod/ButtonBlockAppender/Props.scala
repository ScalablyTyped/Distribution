package typings.wordpressBlockEditor.buttonBlockAppenderMod.ButtonBlockAppender

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Props extends js.Object {
  
  var children: js.UndefOr[scala.Nothing] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  /**
    * The `clientId` of the Block from who's root new Blocks should be inserted. This prop is
    * required by the block `Inserter` component. Typically this is the `clientID` of the Block
    * where the prop is being rendered.
    */
  var rootClientId: String = js.native
}
object Props {
  
  @scala.inline
  def apply(rootClientId: String): Props = {
    val __obj = js.Dynamic.literal(rootClientId = rootClientId.asInstanceOf[js.Any])
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
    def setRootClientId(value: String): Self = this.set("rootClientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
  }
}
