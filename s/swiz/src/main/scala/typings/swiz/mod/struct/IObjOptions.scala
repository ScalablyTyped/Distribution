package typings.swiz.mod.struct

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IObjOptions extends js.Object {
  
  var fields: js.UndefOr[js.Array[IField]] = js.native
  
  var plural: js.UndefOr[String] = js.native
  
  var singular: js.UndefOr[String] = js.native
}
object IObjOptions {
  
  @scala.inline
  def apply(): IObjOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IObjOptions]
  }
  
  @scala.inline
  implicit class IObjOptionsOps[Self <: IObjOptions] (val x: Self) extends AnyVal {
    
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
    def setFieldsVarargs(value: IField*): Self = this.set("fields", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: js.Array[IField]): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setPlural(value: String): Self = this.set("plural", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlural: Self = this.set("plural", js.undefined)
    
    @scala.inline
    def setSingular(value: String): Self = this.set("singular", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingular: Self = this.set("singular", js.undefined)
  }
}
