package typings.useSyncExternalStore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("use-sync-external-store", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useSyncExternalStore[Snapshot](
    subscribe: js.Function1[/* onStoreChange */ js.Function0[Unit], js.Function0[Unit]],
    getSnapshot: js.Function0[Snapshot]
  ): Snapshot = (^.asInstanceOf[js.Dynamic].applyDynamic("useSyncExternalStore")(subscribe.asInstanceOf[js.Any], getSnapshot.asInstanceOf[js.Any])).asInstanceOf[Snapshot]
  inline def useSyncExternalStore[Snapshot](
    subscribe: js.Function1[/* onStoreChange */ js.Function0[Unit], js.Function0[Unit]],
    getSnapshot: js.Function0[Snapshot],
    getServerSnapshot: js.Function0[Snapshot]
  ): Snapshot = (^.asInstanceOf[js.Dynamic].applyDynamic("useSyncExternalStore")(subscribe.asInstanceOf[js.Any], getSnapshot.asInstanceOf[js.Any], getServerSnapshot.asInstanceOf[js.Any])).asInstanceOf[Snapshot]
}
