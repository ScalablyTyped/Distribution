package typings.tslint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Groupedimports extends js.Object {
  
  var `grouped-imports`: Boolean = js.native
  
  var `import-sources-order`: String = js.native
  
  var `module-source-path`: String = js.native
  
  var `named-imports-order`: String = js.native
}
object Groupedimports {
  
  @scala.inline
  def apply(
    `grouped-imports`: Boolean,
    `import-sources-order`: String,
    `module-source-path`: String,
    `named-imports-order`: String
  ): Groupedimports = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("grouped-imports")(`grouped-imports`.asInstanceOf[js.Any])
    __obj.updateDynamic("import-sources-order")(`import-sources-order`.asInstanceOf[js.Any])
    __obj.updateDynamic("module-source-path")(`module-source-path`.asInstanceOf[js.Any])
    __obj.updateDynamic("named-imports-order")(`named-imports-order`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Groupedimports]
  }
  
  @scala.inline
  implicit class GroupedimportsOps[Self <: Groupedimports] (val x: Self) extends AnyVal {
    
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
    def `setGrouped-imports`(value: Boolean): Self = this.set("grouped-imports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setImport-sources-order`(value: String): Self = this.set("import-sources-order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setModule-source-path`(value: String): Self = this.set("module-source-path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setNamed-imports-order`(value: String): Self = this.set("named-imports-order", value.asInstanceOf[js.Any])
  }
}
