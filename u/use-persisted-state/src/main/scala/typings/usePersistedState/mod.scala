package typings.usePersistedState

import typings.usePersistedState.anon.FnCall
import typings.usePersistedState.anon.PickStoragegetItemsetItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("use-persisted-state", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[S](key: String): FnCall[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(key.asInstanceOf[js.Any]).asInstanceOf[FnCall[S]]
  inline def default[S](key: String, provider: PickStoragegetItemsetItem): FnCall[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(key.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[FnCall[S]]
}
