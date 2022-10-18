package typings.table

import typings.table.distSrcTypesApiMod.SpanningCellConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMakeRangeConfigMod {
  
  @JSImport("table/dist/src/makeRangeConfig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeRangeConfig(
    spanningCellConfig: SpanningCellConfig,
    columnsConfig: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColumnConfig */ Any
    ]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRangeConfig")(spanningCellConfig.asInstanceOf[js.Any], columnsConfig.asInstanceOf[js.Any])).asInstanceOf[Any]
}
