package typings.umbraco.umbraco.services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Node args
  */
@js.native
trait INodeArgs extends js.Object {
  
  var node: js.Any = js.native
  
  var section: js.Any = js.native
}
object INodeArgs {
  
  @scala.inline
  def apply(node: js.Any, section: js.Any): INodeArgs = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any])
    __obj.asInstanceOf[INodeArgs]
  }
  
  @scala.inline
  implicit class INodeArgsOps[Self <: INodeArgs] (val x: Self) extends AnyVal {
    
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
    def setNode(value: js.Any): Self = this.set("node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSection(value: js.Any): Self = this.set("section", value.asInstanceOf[js.Any])
  }
}
