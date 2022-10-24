package typings.wixStyleReact

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsNumberFormattersMod {
  
  @JSImport("wix-style-react/dist/types/utils/numberFormatters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def calcPrecision(values: Any): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("calcPrecision")(values.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  inline def calcPrecision(values: Any, maxPrecision: Double): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("calcPrecision")(values.asInstanceOf[js.Any], maxPrecision.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  
  inline def countPercentageFromBase(base: Any, chunk: Any, precision: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("countPercentageFromBase")(base.asInstanceOf[js.Any], chunk.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def formatNumberToPrecision(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("formatNumberToPrecision")().asInstanceOf[Any]
  inline def formatNumberToPrecision(value: Double): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("formatNumberToPrecision")(value.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def formatNumberToPrecision(value: Double, precision: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("formatNumberToPrecision")(value.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def formatNumberToPrecision(value: Unit, precision: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("formatNumberToPrecision")(value.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def formatToCompactNumber(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatToCompactNumber")().asInstanceOf[String]
  inline def formatToCompactNumber(value: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatToCompactNumber")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def formatToCompactNumber(value: Double, precision: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatToCompactNumber")(value.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatToCompactNumber(value: Unit, precision: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatToCompactNumber")(value.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatToPercent(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatToPercent")().asInstanceOf[String]
  inline def formatToPercent(value: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatToPercent")(value.asInstanceOf[js.Any]).asInstanceOf[String]
}
