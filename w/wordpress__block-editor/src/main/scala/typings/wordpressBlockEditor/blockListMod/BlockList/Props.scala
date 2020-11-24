package typings.wordpressBlockEditor.blockListMod.BlockList

import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Props extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  /**
    * A 'render prop' function that can be used to customize the block's appender.
    */
  var renderAppender: js.UndefOr[js.Function0[Element]] = js.native
  
  var rootClientId: js.UndefOr[String] = js.native
}
object Props {
  
  @scala.inline
  def apply(): Props = {
    val __obj = js.Dynamic.literal()
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setRenderAppender(value: () => Element): Self = this.set("renderAppender", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteRenderAppender: Self = this.set("renderAppender", js.undefined)
    
    @scala.inline
    def setRootClientId(value: String): Self = this.set("rootClientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootClientId: Self = this.set("rootClientId", js.undefined)
  }
}
