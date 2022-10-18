package typings.table

import typings.table.distSrcTypesApiMod.SpanningCellConfig
import typings.table.distSrcTypesApiMod.TableUserConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcInjectHeaderConfigMod {
  
  @JSImport("table/dist/src/injectHeaderConfig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def injectHeaderConfig(
    rows: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Row */ Any
    ],
    config: TableUserConfig
  ): js.Tuple2[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Row */ Any
    ], 
    js.Array[SpanningCellConfig]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("injectHeaderConfig")(rows.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Row */ Any
    ], 
    js.Array[SpanningCellConfig]
  ]]
}
