package typings.tabris.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceConfig extends StObject {
  
  var fallbackLanguage: js.UndefOr[String] = js.undefined
  
  var scaleFactor: js.UndefOr[ScaleFactor] = js.undefined
}
object ResourceConfig {
  
  @scala.inline
  def apply(): ResourceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceConfig]
  }
  
  @scala.inline
  implicit class ResourceConfigMutableBuilder[Self <: ResourceConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFallbackLanguage(value: String): Self = StObject.set(x, "fallbackLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFallbackLanguageUndefined: Self = StObject.set(x, "fallbackLanguage", js.undefined)
    
    @scala.inline
    def setScaleFactor(value: ScaleFactor): Self = StObject.set(x, "scaleFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleFactorUndefined: Self = StObject.set(x, "scaleFactor", js.undefined)
  }
}
