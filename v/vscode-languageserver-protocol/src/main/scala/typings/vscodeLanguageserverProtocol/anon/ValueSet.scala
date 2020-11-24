package typings.vscodeLanguageserverProtocol.anon

import typings.vscodeLanguageserverTypes.mod.DiagnosticTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValueSet extends js.Object {
  
  /**
    * The tags supported by the client.
    */
  var valueSet: js.Array[DiagnosticTag] = js.native
}
object ValueSet {
  
  @scala.inline
  def apply(valueSet: js.Array[DiagnosticTag]): ValueSet = {
    val __obj = js.Dynamic.literal(valueSet = valueSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueSet]
  }
  
  @scala.inline
  implicit class ValueSetOps[Self <: ValueSet] (val x: Self) extends AnyVal {
    
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
    def setValueSetVarargs(value: DiagnosticTag*): Self = this.set("valueSet", js.Array(value :_*))
    
    @scala.inline
    def setValueSet(value: js.Array[DiagnosticTag]): Self = this.set("valueSet", value.asInstanceOf[js.Any])
  }
}
