package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Import extends StObject {
  
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
  implicit class ImportMutableBuilder[Self <: Import] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImport(value: scala.Double): Self = StObject.set(x, "import", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidate(value: scala.Double): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
  }
}
