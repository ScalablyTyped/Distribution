package typings.svelte

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spreadMod {
  
  @JSImport("svelte/types/runtime/internal/spread", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSpreadObject(spread_props: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get_spread_object")(spread_props.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getSpreadUpdate(levels: Any, updates: Any): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("get_spread_update")(levels.asInstanceOf[js.Any], updates.asInstanceOf[js.Any])).asInstanceOf[js.Object]
}
