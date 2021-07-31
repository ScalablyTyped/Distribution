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
  
  @scala.inline
  def default(key: String): FnCall = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(key.asInstanceOf[js.Any]).asInstanceOf[FnCall]
  @scala.inline
  def default(key: String, provider: PickStoragegetItemsetItem): FnCall = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(key.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[FnCall]
}
