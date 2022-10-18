package typings.table

import typings.table.distSrcTypesApiMod.VerticalAlignment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMapDataUsingRowHeightsMod {
  
  @JSImport("table/dist/src/mapDataUsingRowHeights", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mapDataUsingRowHeights(
    unmappedRows: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Row */ Any
    ],
    rowHeights: js.Array[Double],
    config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BaseConfig */ Any
  ): js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Row */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapDataUsingRowHeights")(unmappedRows.asInstanceOf[js.Any], rowHeights.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Row */ Any
  ]]
  
  inline def padCellVertically(lines: js.Array[String], rowHeight: Double, verticalAlignment: VerticalAlignment): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("padCellVertically")(lines.asInstanceOf[js.Any], rowHeight.asInstanceOf[js.Any], verticalAlignment.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
}
