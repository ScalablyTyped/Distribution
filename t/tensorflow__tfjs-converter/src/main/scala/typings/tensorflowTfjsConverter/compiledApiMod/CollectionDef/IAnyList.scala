package typings.tensorflowTfjsConverter.compiledApiMod.CollectionDef

import typings.tensorflowTfjsConverter.compiledApiMod.IAny
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an AnyList. */
@js.native
trait IAnyList extends js.Object {
  
  /** AnyList value */
  var value: js.UndefOr[js.Array[IAny] | Null] = js.native
}
object IAnyList {
  
  @scala.inline
  def apply(): IAnyList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAnyList]
  }
  
  @scala.inline
  implicit class IAnyListOps[Self <: IAnyList] (val x: Self) extends AnyVal {
    
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
    def setValueVarargs(value: IAny*): Self = this.set("value", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: js.Array[IAny]): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setValueNull: Self = this.set("value", null)
  }
}
