package typings.table

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCalculateRowHeightsMod {
  
  @JSImport("table/dist/src/calculateRowHeights", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def calculateRowHeights(
    rows: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Row */ Any
    ],
    config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BaseConfig */ Any
  ): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateRowHeights")(rows.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
}
