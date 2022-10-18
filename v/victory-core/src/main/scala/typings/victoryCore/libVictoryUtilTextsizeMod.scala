package typings.victoryCore

import typings.victoryCore.anon.Width
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libVictoryUtilTextsizeMod {
  
  @JSImport("victory-core/lib/victory-util/textsize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def approximateTextSize(text: String): Width = ^.asInstanceOf[js.Dynamic].applyDynamic("approximateTextSize")(text.asInstanceOf[js.Any]).asInstanceOf[Width]
  inline def approximateTextSize(text: String, style: TextSizeStyleInterface): Width = (^.asInstanceOf[js.Dynamic].applyDynamic("approximateTextSize")(text.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Width]
  inline def approximateTextSize(text: js.Array[String]): Width = ^.asInstanceOf[js.Dynamic].applyDynamic("approximateTextSize")(text.asInstanceOf[js.Any]).asInstanceOf[Width]
  inline def approximateTextSize(text: js.Array[String], style: TextSizeStyleInterface): Width = (^.asInstanceOf[js.Dynamic].applyDynamic("approximateTextSize")(text.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Width]
  
  object approximateTextSizeInternal {
    
    @JSImport("victory-core/lib/victory-util/textsize", "_approximateTextSizeInternal")
    @js.native
    val ^ : js.Any = js.native
    
    inline def impl(text: String): Width = ^.asInstanceOf[js.Dynamic].applyDynamic("impl")(text.asInstanceOf[js.Any]).asInstanceOf[Width]
    inline def impl(text: String, style: TextSizeStyleInterface): Width = (^.asInstanceOf[js.Dynamic].applyDynamic("impl")(text.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Width]
    inline def impl(text: js.Array[String]): Width = ^.asInstanceOf[js.Dynamic].applyDynamic("impl")(text.asInstanceOf[js.Any]).asInstanceOf[Width]
    inline def impl(text: js.Array[String], style: TextSizeStyleInterface): Width = (^.asInstanceOf[js.Dynamic].applyDynamic("impl")(text.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Width]
  }
  
  inline def convertLengthToPixels(length: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("convertLengthToPixels")(length.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def convertLengthToPixels(length: String, fontSize: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("convertLengthToPixels")(length.asInstanceOf[js.Any], fontSize.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  trait TextSizeStyleInterface extends StObject {
    
    var angle: js.UndefOr[Double] = js.undefined
    
    var characterConstant: js.UndefOr[String] = js.undefined
    
    var fontFamily: js.UndefOr[String] = js.undefined
    
    var fontSize: js.UndefOr[Double | String] = js.undefined
    
    var letterSpacing: js.UndefOr[String] = js.undefined
    
    var lineHeight: js.UndefOr[Double] = js.undefined
  }
  object TextSizeStyleInterface {
    
    inline def apply(): TextSizeStyleInterface = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextSizeStyleInterface]
    }
    
    extension [Self <: TextSizeStyleInterface](x: Self) {
      
      inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      inline def setCharacterConstant(value: String): Self = StObject.set(x, "characterConstant", value.asInstanceOf[js.Any])
      
      inline def setCharacterConstantUndefined: Self = StObject.set(x, "characterConstant", js.undefined)
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontSize(value: Double | String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setLetterSpacing(value: String): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
      
      inline def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
      
      inline def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
    }
  }
}
