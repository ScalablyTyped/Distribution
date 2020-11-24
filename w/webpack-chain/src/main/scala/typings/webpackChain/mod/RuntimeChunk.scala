package typings.webpackChain.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuntimeChunk extends js.Object {
  
  var name: String | RuntimeChunkFunction = js.native
}
object RuntimeChunk {
  
  @scala.inline
  def apply(name: String | RuntimeChunkFunction): RuntimeChunk = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuntimeChunk]
  }
  
  @scala.inline
  implicit class RuntimeChunkOps[Self <: RuntimeChunk] (val x: Self) extends AnyVal {
    
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
    def setNameFunction1(value: /* entryPoint */ EntryPoint => String): Self = this.set("name", js.Any.fromFunction1(value))
    
    @scala.inline
    def setName(value: String | RuntimeChunkFunction): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
