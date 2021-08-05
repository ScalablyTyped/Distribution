package typings.winrt.Windows.UI.Text

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFontWeightsStatics extends StObject {
  
  var black: FontWeight
  
  var bold: FontWeight
  
  var extraBlack: FontWeight
  
  var extraBold: FontWeight
  
  var extraLight: FontWeight
  
  var light: FontWeight
  
  var medium: FontWeight
  
  var normal: FontWeight
  
  var semiBold: FontWeight
  
  var semiLight: FontWeight
  
  var thin: FontWeight
}
object IFontWeightsStatics {
  
  inline def apply(
    black: FontWeight,
    bold: FontWeight,
    extraBlack: FontWeight,
    extraBold: FontWeight,
    extraLight: FontWeight,
    light: FontWeight,
    medium: FontWeight,
    normal: FontWeight,
    semiBold: FontWeight,
    semiLight: FontWeight,
    thin: FontWeight
  ): IFontWeightsStatics = {
    val __obj = js.Dynamic.literal(black = black.asInstanceOf[js.Any], bold = bold.asInstanceOf[js.Any], extraBlack = extraBlack.asInstanceOf[js.Any], extraBold = extraBold.asInstanceOf[js.Any], extraLight = extraLight.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any], semiBold = semiBold.asInstanceOf[js.Any], semiLight = semiLight.asInstanceOf[js.Any], thin = thin.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFontWeightsStatics]
  }
  
  extension [Self <: IFontWeightsStatics](x: Self) {
    
    inline def setBlack(value: FontWeight): Self = StObject.set(x, "black", value.asInstanceOf[js.Any])
    
    inline def setBold(value: FontWeight): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    inline def setExtraBlack(value: FontWeight): Self = StObject.set(x, "extraBlack", value.asInstanceOf[js.Any])
    
    inline def setExtraBold(value: FontWeight): Self = StObject.set(x, "extraBold", value.asInstanceOf[js.Any])
    
    inline def setExtraLight(value: FontWeight): Self = StObject.set(x, "extraLight", value.asInstanceOf[js.Any])
    
    inline def setLight(value: FontWeight): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
    
    inline def setMedium(value: FontWeight): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
    
    inline def setNormal(value: FontWeight): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
    
    inline def setSemiBold(value: FontWeight): Self = StObject.set(x, "semiBold", value.asInstanceOf[js.Any])
    
    inline def setSemiLight(value: FontWeight): Self = StObject.set(x, "semiLight", value.asInstanceOf[js.Any])
    
    inline def setThin(value: FontWeight): Self = StObject.set(x, "thin", value.asInstanceOf[js.Any])
  }
}
