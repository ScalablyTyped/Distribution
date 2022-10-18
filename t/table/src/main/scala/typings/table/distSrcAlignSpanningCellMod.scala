package typings.table

import typings.table.distSrcSpanningCellManagerMod.SpanningCellContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcAlignSpanningCellMod {
  
  @JSImport("table/dist/src/alignSpanningCell", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def alignVerticalRangeContent(
    range: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RangeConfig */ Any,
    content: js.Array[String],
    context: SpanningCellContext
  ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("alignVerticalRangeContent")(range.asInstanceOf[js.Any], content.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def wrapRangeContent(
    rangeConfig: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RangeConfig */ Any,
    rangeWidth: Double,
    context: SpanningCellContext
  ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapRangeContent")(rangeConfig.asInstanceOf[js.Any], rangeWidth.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
}
