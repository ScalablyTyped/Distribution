package typings.table

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCalculateCellHeightMod {
  
  @JSImport("table/dist/src/calculateCellHeight", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def calculateCellHeight(value: String, columnWidth: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateCellHeight")(value.asInstanceOf[js.Any], columnWidth.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def calculateCellHeight(value: String, columnWidth: Double, useWrapWord: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateCellHeight")(value.asInstanceOf[js.Any], columnWidth.asInstanceOf[js.Any], useWrapWord.asInstanceOf[js.Any])).asInstanceOf[Double]
}
