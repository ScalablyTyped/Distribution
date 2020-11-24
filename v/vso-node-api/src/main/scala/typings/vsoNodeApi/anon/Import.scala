package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Import extends js.Object {
  
  var `import`: scala.Double = js.native
  
  var validate: scala.Double = js.native
}
object Import {
  
  @scala.inline
  def apply(`import`: scala.Double, validate: scala.Double): Import = {
    val __obj = js.Dynamic.literal(validate = validate.asInstanceOf[js.Any])
    __obj.updateDynamic("import")(`import`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Import]
  }
  
  @scala.inline
  implicit class ImportOps[Self <: Import] (val x: Self) extends AnyVal {
    
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
    def setImport(value: scala.Double): Self = this.set("import", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidate(value: scala.Double): Self = this.set("validate", value.asInstanceOf[js.Any])
  }
}
