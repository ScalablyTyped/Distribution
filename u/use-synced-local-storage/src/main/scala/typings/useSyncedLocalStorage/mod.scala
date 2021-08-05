package typings.useSyncedLocalStorage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("use-synced-local-storage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useSyncedLocalStorage[T](key: String): js.Tuple2[/* storage */ T, /* setStorage */ js.Function1[/* newValue */ T, Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSyncedLocalStorage")(key.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[/* storage */ T, /* setStorage */ js.Function1[/* newValue */ T, Boolean]]]
  inline def useSyncedLocalStorage[T](key: String, initialValue: T): js.Tuple2[/* storage */ T, /* setStorage */ js.Function1[/* newValue */ T, Boolean]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useSyncedLocalStorage")(key.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[/* storage */ T, /* setStorage */ js.Function1[/* newValue */ T, Boolean]]]
}
