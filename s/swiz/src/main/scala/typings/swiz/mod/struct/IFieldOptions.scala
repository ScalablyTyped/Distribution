package typings.swiz.mod.struct

import typings.swiz.mod.IChain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFieldOptions extends js.Object {
  
  var attribute: js.UndefOr[Boolean] = js.native
  
  var coerceTo: js.UndefOr[String] = js.native
  
  var desc: js.UndefOr[String] = js.native
  
  var enumerated: js.UndefOr[js.Any] = js.native
  
  var filterFrom: js.UndefOr[js.Array[String]] = js.native
  
  var ignorePublic: js.UndefOr[Boolean] = js.native
  
  var plural: js.UndefOr[String] = js.native
  
  var singular: js.UndefOr[String] = js.native
  
  var src: js.UndefOr[String] = js.native
  
  var `val`: js.UndefOr[IChain] = js.native
}
object IFieldOptions {
  
  @scala.inline
  def apply(): IFieldOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFieldOptions]
  }
  
  @scala.inline
  implicit class IFieldOptionsOps[Self <: IFieldOptions] (val x: Self) extends AnyVal {
    
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
    def setAttribute(value: Boolean): Self = this.set("attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttribute: Self = this.set("attribute", js.undefined)
    
    @scala.inline
    def setCoerceTo(value: String): Self = this.set("coerceTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoerceTo: Self = this.set("coerceTo", js.undefined)
    
    @scala.inline
    def setDesc(value: String): Self = this.set("desc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDesc: Self = this.set("desc", js.undefined)
    
    @scala.inline
    def setEnumerated(value: js.Any): Self = this.set("enumerated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnumerated: Self = this.set("enumerated", js.undefined)
    
    @scala.inline
    def setFilterFromVarargs(value: String*): Self = this.set("filterFrom", js.Array(value :_*))
    
    @scala.inline
    def setFilterFrom(value: js.Array[String]): Self = this.set("filterFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterFrom: Self = this.set("filterFrom", js.undefined)
    
    @scala.inline
    def setIgnorePublic(value: Boolean): Self = this.set("ignorePublic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnorePublic: Self = this.set("ignorePublic", js.undefined)
    
    @scala.inline
    def setPlural(value: String): Self = this.set("plural", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlural: Self = this.set("plural", js.undefined)
    
    @scala.inline
    def setSingular(value: String): Self = this.set("singular", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingular: Self = this.set("singular", js.undefined)
    
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
    
    @scala.inline
    def setVal(value: IChain): Self = this.set("val", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVal: Self = this.set("val", js.undefined)
  }
}
