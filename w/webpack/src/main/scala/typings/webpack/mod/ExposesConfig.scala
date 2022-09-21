package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Advanced configuration for modules that should be exposed by this container.
  */
trait ExposesConfig extends StObject {
  
  /**
  	 * Request to a module that should be exposed by this container.
  	 */
  var `import`: String | js.Array[String]
  
  /**
  	 * Custom chunk name for the exposed module.
  	 */
  var name: js.UndefOr[String] = js.undefined
}
object ExposesConfig {
  
  inline def apply(`import`: String | js.Array[String]): ExposesConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("import")(`import`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExposesConfig]
  }
  
  extension [Self <: ExposesConfig](x: Self) {
    
    inline def setImport(value: String | js.Array[String]): Self = StObject.set(x, "import", value.asInstanceOf[js.Any])
    
    inline def setImportVarargs(value: String*): Self = StObject.set(x, "import", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
