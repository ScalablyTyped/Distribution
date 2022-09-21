package typings.table

import typings.table.apiMod.SpanningCellConfig
import typings.table.apiMod.TableUserConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object makeTableConfigMod {
  
  @JSImport("table/dist/src/makeTableConfig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeTableConfig(
    rows: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Row */ Any
    ]
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("makeTableConfig")(rows.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def makeTableConfig(
    rows: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Row */ Any
    ],
    config: Unit,
    injectedSpanningCellConfig: js.Array[SpanningCellConfig]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeTableConfig")(rows.asInstanceOf[js.Any], config.asInstanceOf[js.Any], injectedSpanningCellConfig.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeTableConfig(
    rows: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Row */ Any
    ],
    config: TableUserConfig
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeTableConfig")(rows.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeTableConfig(
    rows: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Row */ Any
    ],
    config: TableUserConfig,
    injectedSpanningCellConfig: js.Array[SpanningCellConfig]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeTableConfig")(rows.asInstanceOf[js.Any], config.asInstanceOf[js.Any], injectedSpanningCellConfig.asInstanceOf[js.Any])).asInstanceOf[Any]
}
