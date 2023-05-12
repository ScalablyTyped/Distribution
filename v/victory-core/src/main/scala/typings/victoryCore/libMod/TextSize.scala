package typings.victoryCore.libMod

import typings.victoryCore.anon.Width
import typings.victoryCore.libVictoryUtilTextsizeMod.TextSizeStyleInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TextSize {
  
  @JSImport("victory-core/lib", "TextSize")
  @js.native
  val ^ : js.Any = js.native
  
  inline def approximateTextSize(text: String): Width = ^.asInstanceOf[js.Dynamic].applyDynamic("approximateTextSize")(text.asInstanceOf[js.Any]).asInstanceOf[Width]
  inline def approximateTextSize(text: String, style: TextSizeStyleInterface): Width = (^.asInstanceOf[js.Dynamic].applyDynamic("approximateTextSize")(text.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Width]
  inline def approximateTextSize(text: js.Array[String]): Width = ^.asInstanceOf[js.Dynamic].applyDynamic("approximateTextSize")(text.asInstanceOf[js.Any]).asInstanceOf[Width]
  inline def approximateTextSize(text: js.Array[String], style: TextSizeStyleInterface): Width = (^.asInstanceOf[js.Dynamic].applyDynamic("approximateTextSize")(text.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Width]
  
  object approximateTextSizeInternal {
    
    @JSImport("victory-core/lib", "TextSize._approximateTextSizeInternal")
    @js.native
    val ^ : js.Any = js.native
    
    inline def impl(text: String): Width = ^.asInstanceOf[js.Dynamic].applyDynamic("impl")(text.asInstanceOf[js.Any]).asInstanceOf[Width]
    inline def impl(text: String, style: Unit, __debugForceApproximate: Boolean): Width = (^.asInstanceOf[js.Dynamic].applyDynamic("impl")(text.asInstanceOf[js.Any], style.asInstanceOf[js.Any], __debugForceApproximate.asInstanceOf[js.Any])).asInstanceOf[Width]
    inline def impl(text: String, style: TextSizeStyleInterface): Width = (^.asInstanceOf[js.Dynamic].applyDynamic("impl")(text.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Width]
    inline def impl(text: String, style: TextSizeStyleInterface, __debugForceApproximate: Boolean): Width = (^.asInstanceOf[js.Dynamic].applyDynamic("impl")(text.asInstanceOf[js.Any], style.asInstanceOf[js.Any], __debugForceApproximate.asInstanceOf[js.Any])).asInstanceOf[Width]
    inline def impl(text: js.Array[String]): Width = ^.asInstanceOf[js.Dynamic].applyDynamic("impl")(text.asInstanceOf[js.Any]).asInstanceOf[Width]
    inline def impl(text: js.Array[String], style: Unit, __debugForceApproximate: Boolean): Width = (^.asInstanceOf[js.Dynamic].applyDynamic("impl")(text.asInstanceOf[js.Any], style.asInstanceOf[js.Any], __debugForceApproximate.asInstanceOf[js.Any])).asInstanceOf[Width]
    inline def impl(text: js.Array[String], style: TextSizeStyleInterface): Width = (^.asInstanceOf[js.Dynamic].applyDynamic("impl")(text.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Width]
    inline def impl(text: js.Array[String], style: TextSizeStyleInterface, __debugForceApproximate: Boolean): Width = (^.asInstanceOf[js.Dynamic].applyDynamic("impl")(text.asInstanceOf[js.Any], style.asInstanceOf[js.Any], __debugForceApproximate.asInstanceOf[js.Any])).asInstanceOf[Width]
  }
  
  inline def convertLengthToPixels(length: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("convertLengthToPixels")(length.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def convertLengthToPixels(length: String, fontSize: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("convertLengthToPixels")(length.asInstanceOf[js.Any], fontSize.asInstanceOf[js.Any])).asInstanceOf[Double]
}
