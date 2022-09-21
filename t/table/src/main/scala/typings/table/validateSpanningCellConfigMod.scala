package typings.table

import typings.table.apiMod.SpanningCellConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validateSpanningCellConfigMod {
  
  @JSImport("table/dist/src/validateSpanningCellConfig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def validateSpanningCellConfig(
    rows: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Row */ Any
    ],
    configs: js.Array[SpanningCellConfig]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateSpanningCellConfig")(rows.asInstanceOf[js.Any], configs.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
