package typings.vegaTypings.encodeMod

import typings.vegaTypings.anon.Test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefinedProperty extends js.Object {
  
  var defined: js.UndefOr[ProductionRule[BooleanValueRef]] = js.native
}
object DefinedProperty {
  
  @scala.inline
  def apply(): DefinedProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefinedProperty]
  }
  
  @scala.inline
  implicit class DefinedPropertyOps[Self <: DefinedProperty] (val x: Self) extends AnyVal {
    
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
    def setDefinedVarargs(value: (Test with BooleanValueRef)*): Self = this.set("defined", js.Array(value :_*))
    
    @scala.inline
    def setDefined(value: ProductionRule[BooleanValueRef]): Self = this.set("defined", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefined: Self = this.set("defined", js.undefined)
  }
}
