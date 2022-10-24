package typings.table

import typings.table.anon.InstancePath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneratedValidatorsMod {
  
  @JSImport("table/dist/src/generated/validators", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def configJson(data: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_config_json")(data.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def configJson(data: Any, param1: InstancePath): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("_config_json")(data.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def streamConfigJson(data: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_streamConfig_json")(data.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def streamConfigJson(data: Any, param1: InstancePath): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("_streamConfig_json")(data.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
