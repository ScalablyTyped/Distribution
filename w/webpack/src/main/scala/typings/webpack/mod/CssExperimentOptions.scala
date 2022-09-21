package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for css handling.
  */
trait CssExperimentOptions extends StObject {
  
  /**
  	 * Avoid generating and loading a stylesheet and only embed exports from css into output javascript files.
  	 */
  var exportsOnly: js.UndefOr[Boolean] = js.undefined
}
object CssExperimentOptions {
  
  inline def apply(): CssExperimentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CssExperimentOptions]
  }
  
  extension [Self <: CssExperimentOptions](x: Self) {
    
    inline def setExportsOnly(value: Boolean): Self = StObject.set(x, "exportsOnly", value.asInstanceOf[js.Any])
    
    inline def setExportsOnlyUndefined: Self = StObject.set(x, "exportsOnly", js.undefined)
  }
}
