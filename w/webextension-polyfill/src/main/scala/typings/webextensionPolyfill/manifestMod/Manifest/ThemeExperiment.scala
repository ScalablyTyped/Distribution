package typings.webextensionPolyfill.manifestMod.Manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemeExperiment extends StObject {
  
  /**
    * Optional.
    */
  var colors: js.UndefOr[ThemeExperimentColorsType] = js.undefined
  
  /**
    * Optional.
    */
  var images: js.UndefOr[ThemeExperimentImagesType] = js.undefined
  
  /**
    * Optional.
    */
  var properties: js.UndefOr[ThemeExperimentPropertiesType] = js.undefined
  
  /**
    * Optional.
    */
  var stylesheet: js.UndefOr[ExtensionURL] = js.undefined
}
object ThemeExperiment {
  
  inline def apply(): ThemeExperiment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemeExperiment]
  }
  
  extension [Self <: ThemeExperiment](x: Self) {
    
    inline def setColors(value: ThemeExperimentColorsType): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setImages(value: ThemeExperimentImagesType): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
    
    inline def setProperties(value: ThemeExperimentPropertiesType): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setStylesheet(value: ExtensionURL): Self = StObject.set(x, "stylesheet", value.asInstanceOf[js.Any])
    
    inline def setStylesheetUndefined: Self = StObject.set(x, "stylesheet", js.undefined)
  }
}
