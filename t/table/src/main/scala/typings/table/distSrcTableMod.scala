package typings.table

import typings.table.distSrcTypesApiMod.TableUserConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTableMod {
  
  @JSImport("table/dist/src/table", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def table(data: js.Array[js.Array[Any]]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("table")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def table(data: js.Array[js.Array[Any]], userConfig: TableUserConfig): String = (^.asInstanceOf[js.Dynamic].applyDynamic("table")(data.asInstanceOf[js.Any], userConfig.asInstanceOf[js.Any])).asInstanceOf[String]
}
