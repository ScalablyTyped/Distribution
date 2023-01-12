package typings.tabris.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceInlineConfig extends StObject {
  
  @JSName("$fallbackLanguage")
  var $fallbackLanguage: js.UndefOr[String] = js.undefined
  
  @JSName("$scaleFactor")
  var $scaleFactor: js.UndefOr[ScaleFactor] = js.undefined
  
  @JSName("$schema")
  var $schema: js.UndefOr[String] = js.undefined
}
object ResourceInlineConfig {
  
  inline def apply(): ResourceInlineConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceInlineConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceInlineConfig] (val x: Self) extends AnyVal {
    
    inline def set$fallbackLanguage(value: String): Self = StObject.set(x, "$fallbackLanguage", value.asInstanceOf[js.Any])
    
    inline def set$fallbackLanguageUndefined: Self = StObject.set(x, "$fallbackLanguage", js.undefined)
    
    inline def set$scaleFactor(value: ScaleFactor): Self = StObject.set(x, "$scaleFactor", value.asInstanceOf[js.Any])
    
    inline def set$scaleFactorUndefined: Self = StObject.set(x, "$scaleFactor", js.undefined)
    
    inline def set$schema(value: String): Self = StObject.set(x, "$schema", value.asInstanceOf[js.Any])
    
    inline def set$schemaUndefined: Self = StObject.set(x, "$schema", js.undefined)
  }
}
