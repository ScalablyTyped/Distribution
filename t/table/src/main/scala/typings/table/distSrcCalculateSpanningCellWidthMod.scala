package typings.table

import typings.table.distSrcSpanningCellManagerMod.SpanningCellParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCalculateSpanningCellWidthMod {
  
  @JSImport("table/dist/src/calculateSpanningCellWidth", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def calculateSpanningCellWidth(
    rangeConfig: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RangeConfig */ Any,
    dependencies: SpanningCellParameters
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateSpanningCellWidth")(rangeConfig.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[Double]
}
