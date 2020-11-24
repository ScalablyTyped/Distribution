package typings.swig.mod.parser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParseReturn extends js.Object {
  
  var blocks: js.Any = js.native
  
  var name: String = js.native
  
  var parent: js.Any = js.native
  
  var tokens: js.Array[_] = js.native
}
object ParseReturn {
  
  @scala.inline
  def apply(blocks: js.Any, name: String, parent: js.Any, tokens: js.Array[_]): ParseReturn = {
    val __obj = js.Dynamic.literal(blocks = blocks.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseReturn]
  }
  
  @scala.inline
  implicit class ParseReturnOps[Self <: ParseReturn] (val x: Self) extends AnyVal {
    
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
    def setBlocks(value: js.Any): Self = this.set("blocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokensVarargs(value: js.Any*): Self = this.set("tokens", js.Array(value :_*))
    
    @scala.inline
    def setTokens(value: js.Array[_]): Self = this.set("tokens", value.asInstanceOf[js.Any])
  }
}
