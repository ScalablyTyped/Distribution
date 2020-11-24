package typings.vscodeLanguageserverProtocol.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `2` extends js.Object {
  
  /**
    * The code action kind values the client supports. When this
    * property exists the client also guarantees that it will
    * handle values outside its set gracefully and falls back
    * to a default value when unknown.
    */
  var valueSet: js.Array[typings.vscodeLanguageserverTypes.mod.CodeActionKind] = js.native
}
object `2` {
  
  @scala.inline
  def apply(valueSet: js.Array[typings.vscodeLanguageserverTypes.mod.CodeActionKind]): `2` = {
    val __obj = js.Dynamic.literal(valueSet = valueSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`]
  }
  
  @scala.inline
  implicit class `2Ops`[Self <: `2`] (val x: Self) extends AnyVal {
    
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
    def setValueSetVarargs(value: typings.vscodeLanguageserverTypes.mod.CodeActionKind*): Self = this.set("valueSet", js.Array(value :_*))
    
    @scala.inline
    def setValueSet(value: js.Array[typings.vscodeLanguageserverTypes.mod.CodeActionKind]): Self = this.set("valueSet", value.asInstanceOf[js.Any])
  }
}
