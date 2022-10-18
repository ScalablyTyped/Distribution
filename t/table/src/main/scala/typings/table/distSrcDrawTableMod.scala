package typings.table

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcDrawTableMod {
  
  @JSImport("table/dist/src/drawTable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def drawTable(
    rows: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Row */ Any
    ],
    outputColumnWidths: js.Array[Double],
    rowHeights: js.Array[Double],
    config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TableConfig */ Any
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("drawTable")(rows.asInstanceOf[js.Any], outputColumnWidths.asInstanceOf[js.Any], rowHeights.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[String]
}
