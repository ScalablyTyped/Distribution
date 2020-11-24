package typings.stylableCore.stylableValueParsersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtendsValue extends js.Object {
  
  var args: js.Array[js.Array[ArgValue]] | Null = js.native
  
  var symbolName: String = js.native
}
object ExtendsValue {
  
  @scala.inline
  def apply(symbolName: String): ExtendsValue = {
    val __obj = js.Dynamic.literal(symbolName = symbolName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendsValue]
  }
  
  @scala.inline
  implicit class ExtendsValueOps[Self <: ExtendsValue] (val x: Self) extends AnyVal {
    
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
    def setSymbolName(value: String): Self = this.set("symbolName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsVarargs(value: js.Array[ArgValue]*): Self = this.set("args", js.Array(value :_*))
    
    @scala.inline
    def setArgs(value: js.Array[js.Array[ArgValue]]): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsNull: Self = this.set("args", null)
  }
}
