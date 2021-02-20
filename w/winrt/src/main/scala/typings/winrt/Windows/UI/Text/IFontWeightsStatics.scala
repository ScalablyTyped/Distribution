package typings.winrt.Windows.UI.Text

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFontWeightsStatics extends StObject {
  
  var black: FontWeight = js.native
  
  var bold: FontWeight = js.native
  
  var extraBlack: FontWeight = js.native
  
  var extraBold: FontWeight = js.native
  
  var extraLight: FontWeight = js.native
  
  var light: FontWeight = js.native
  
  var medium: FontWeight = js.native
  
  var normal: FontWeight = js.native
  
  var semiBold: FontWeight = js.native
  
  var semiLight: FontWeight = js.native
  
  var thin: FontWeight = js.native
}
object IFontWeightsStatics {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class IFontWeightsStaticsMutableBuilder[Self <: IFontWeightsStatics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlack(value: FontWeight): Self = StObject.set(x, "black", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBold(value: FontWeight): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraBlack(value: FontWeight): Self = StObject.set(x, "extraBlack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraBold(value: FontWeight): Self = StObject.set(x, "extraBold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraLight(value: FontWeight): Self = StObject.set(x, "extraLight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLight(value: FontWeight): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedium(value: FontWeight): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormal(value: FontWeight): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSemiBold(value: FontWeight): Self = StObject.set(x, "semiBold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSemiLight(value: FontWeight): Self = StObject.set(x, "semiLight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThin(value: FontWeight): Self = StObject.set(x, "thin", value.asInstanceOf[js.Any])
  }
}
