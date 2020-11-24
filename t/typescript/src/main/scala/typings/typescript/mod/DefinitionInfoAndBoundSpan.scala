package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefinitionInfoAndBoundSpan extends js.Object {
  
  var definitions: js.UndefOr[js.Array[DefinitionInfo]] = js.native
  
  var textSpan: TextSpan = js.native
}
object DefinitionInfoAndBoundSpan {
  
  @scala.inline
  def apply(textSpan: TextSpan): DefinitionInfoAndBoundSpan = {
    val __obj = js.Dynamic.literal(textSpan = textSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionInfoAndBoundSpan]
  }
  
  @scala.inline
  implicit class DefinitionInfoAndBoundSpanOps[Self <: DefinitionInfoAndBoundSpan] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTextSpan(value: TextSpan): Self = this.set("textSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitionsVarargs(value: DefinitionInfo*): Self = this.set("definitions", js.Array(value :_*))
    
    @scala.inline
    def setDefinitions(value: js.Array[DefinitionInfo]): Self = this.set("definitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefinitions: Self = this.set("definitions", js.undefined)
  }
}
