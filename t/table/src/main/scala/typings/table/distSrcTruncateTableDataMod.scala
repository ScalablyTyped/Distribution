package typings.table

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTruncateTableDataMod {
  
  @JSImport("table/dist/src/truncateTableData", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def truncateString(input: String, length: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("truncateString")(input.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def truncateTableData(
    rows: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Row */ Any
    ],
    truncates: js.Array[Double]
  ): js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Row */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("truncateTableData")(rows.asInstanceOf[js.Any], truncates.asInstanceOf[js.Any])).asInstanceOf[js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Row */ Any
  ]]
}
