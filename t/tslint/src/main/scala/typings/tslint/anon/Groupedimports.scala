package typings.tslint.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Groupedimports extends StObject {
  
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
  implicit class GroupedimportsMutableBuilder[Self <: Groupedimports] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setGrouped-imports`(value: Boolean): Self = StObject.set(x, "grouped-imports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setImport-sources-order`(value: String): Self = StObject.set(x, "import-sources-order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setModule-source-path`(value: String): Self = StObject.set(x, "module-source-path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setNamed-imports-order`(value: String): Self = StObject.set(x, "named-imports-order", value.asInstanceOf[js.Any])
  }
}
