package typings.table

import typings.table.apiMod.TableUserConfig
import typings.table.tableStrings.configDotjson
import typings.table.tableStrings.streamConfigDotjson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validateConfigMod {
  
  @JSImport("table/dist/src/validateConfig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def validateConfig(schemaId: configDotjson | streamConfigDotjson, config: TableUserConfig): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateConfig")(schemaId.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
