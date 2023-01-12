package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Import extends StObject {
  
  var `import`: scala.Double
  
  var validate: scala.Double
}
object Import {
  
  inline def apply(`import`: scala.Double, validate: scala.Double): Import = {
    val __obj = js.Dynamic.literal(validate = validate.asInstanceOf[js.Any])
    __obj.updateDynamic("import")(`import`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Import]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Import] (val x: Self) extends AnyVal {
    
    inline def setImport(value: scala.Double): Self = StObject.set(x, "import", value.asInstanceOf[js.Any])
    
    inline def setValidate(value: scala.Double): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
  }
}
