package typings.umbraco.umbraco.services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration
  */
trait IConfiguration extends StObject {
  
  var dimensions: IDimension
  
  var maxImageSize: Double
  
  var stylesheets: js.Array[String]
  
  var toolbar: js.Array[String]
}
object IConfiguration {
  
  inline def apply(
    dimensions: IDimension,
    maxImageSize: Double,
    stylesheets: js.Array[String],
    toolbar: js.Array[String]
  ): IConfiguration = {
    val __obj = js.Dynamic.literal(dimensions = dimensions.asInstanceOf[js.Any], maxImageSize = maxImageSize.asInstanceOf[js.Any], stylesheets = stylesheets.asInstanceOf[js.Any], toolbar = toolbar.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConfiguration]
  }
  
  extension [Self <: IConfiguration](x: Self) {
    
    inline def setDimensions(value: IDimension): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setMaxImageSize(value: Double): Self = StObject.set(x, "maxImageSize", value.asInstanceOf[js.Any])
    
    inline def setStylesheets(value: js.Array[String]): Self = StObject.set(x, "stylesheets", value.asInstanceOf[js.Any])
    
    inline def setStylesheetsVarargs(value: String*): Self = StObject.set(x, "stylesheets", js.Array(value*))
    
    inline def setToolbar(value: js.Array[String]): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
    
    inline def setToolbarVarargs(value: String*): Self = StObject.set(x, "toolbar", js.Array(value*))
  }
}
