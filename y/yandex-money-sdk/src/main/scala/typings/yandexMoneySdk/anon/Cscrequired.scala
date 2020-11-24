package typings.yandexMoneySdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cscrequired extends js.Object {
  
  var allowed: Boolean = js.native
  
  var csc_required: Boolean = js.native
  
  var items: js.Array[Id] = js.native
}
object Cscrequired {
  
  @scala.inline
  def apply(allowed: Boolean, csc_required: Boolean, items: js.Array[Id]): Cscrequired = {
    val __obj = js.Dynamic.literal(allowed = allowed.asInstanceOf[js.Any], csc_required = csc_required.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cscrequired]
  }
  
  @scala.inline
  implicit class CscrequiredOps[Self <: Cscrequired] (val x: Self) extends AnyVal {
    
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
    def setAllowed(value: Boolean): Self = this.set("allowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCsc_required(value: Boolean): Self = this.set("csc_required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: Id*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[Id]): Self = this.set("items", value.asInstanceOf[js.Any])
  }
}
