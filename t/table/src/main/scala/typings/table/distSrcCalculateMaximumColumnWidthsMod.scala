package typings.table

import typings.table.distSrcTypesApiMod.SpanningCellConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCalculateMaximumColumnWidthsMod {
  
  @JSImport("table/dist/src/calculateMaximumColumnWidths", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def calculateMaximumCellWidth(
    cell: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Cell */ Any
  ): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateMaximumCellWidth")(cell.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def calculateMaximumColumnWidths(
    rows: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Row */ Any
    ]
  ): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateMaximumColumnWidths")(rows.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  inline def calculateMaximumColumnWidths(
    rows: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Row */ Any
    ],
    spanningCellConfigs: js.Array[SpanningCellConfig]
  ): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateMaximumColumnWidths")(rows.asInstanceOf[js.Any], spanningCellConfigs.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
}
