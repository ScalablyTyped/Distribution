package typings.useSyncExternalStore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withSelectorMod {
  
  @JSImport("use-sync-external-store/shim/with-selector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useSyncExternalStoreWithSelector[Snapshot, Selection](
    subscribe: js.Function1[/* onStoreChange */ js.Function0[Unit], js.Function0[Unit]],
    getSnapshot: js.Function0[Snapshot],
    getServerSnapshot: js.Function0[Snapshot],
    selector: js.Function1[/* snapshot */ Snapshot, Selection]
  ): Selection = (^.asInstanceOf[js.Dynamic].applyDynamic("useSyncExternalStoreWithSelector")(subscribe.asInstanceOf[js.Any], getSnapshot.asInstanceOf[js.Any], getServerSnapshot.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Selection]
  inline def useSyncExternalStoreWithSelector[Snapshot, Selection](
    subscribe: js.Function1[/* onStoreChange */ js.Function0[Unit], js.Function0[Unit]],
    getSnapshot: js.Function0[Snapshot],
    getServerSnapshot: js.Function0[Snapshot],
    selector: js.Function1[/* snapshot */ Snapshot, Selection],
    isEqual: js.Function2[/* a */ Selection, /* b */ Selection, Boolean]
  ): Selection = (^.asInstanceOf[js.Dynamic].applyDynamic("useSyncExternalStoreWithSelector")(subscribe.asInstanceOf[js.Any], getSnapshot.asInstanceOf[js.Any], getServerSnapshot.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], isEqual.asInstanceOf[js.Any])).asInstanceOf[Selection]
  inline def useSyncExternalStoreWithSelector[Snapshot, Selection](
    subscribe: js.Function1[/* onStoreChange */ js.Function0[Unit], js.Function0[Unit]],
    getSnapshot: js.Function0[Snapshot],
    getServerSnapshot: Null,
    selector: js.Function1[/* snapshot */ Snapshot, Selection]
  ): Selection = (^.asInstanceOf[js.Dynamic].applyDynamic("useSyncExternalStoreWithSelector")(subscribe.asInstanceOf[js.Any], getSnapshot.asInstanceOf[js.Any], getServerSnapshot.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Selection]
  inline def useSyncExternalStoreWithSelector[Snapshot, Selection](
    subscribe: js.Function1[/* onStoreChange */ js.Function0[Unit], js.Function0[Unit]],
    getSnapshot: js.Function0[Snapshot],
    getServerSnapshot: Null,
    selector: js.Function1[/* snapshot */ Snapshot, Selection],
    isEqual: js.Function2[/* a */ Selection, /* b */ Selection, Boolean]
  ): Selection = (^.asInstanceOf[js.Dynamic].applyDynamic("useSyncExternalStoreWithSelector")(subscribe.asInstanceOf[js.Any], getSnapshot.asInstanceOf[js.Any], getServerSnapshot.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], isEqual.asInstanceOf[js.Any])).asInstanceOf[Selection]
  inline def useSyncExternalStoreWithSelector[Snapshot, Selection](
    subscribe: js.Function1[/* onStoreChange */ js.Function0[Unit], js.Function0[Unit]],
    getSnapshot: js.Function0[Snapshot],
    getServerSnapshot: Unit,
    selector: js.Function1[/* snapshot */ Snapshot, Selection]
  ): Selection = (^.asInstanceOf[js.Dynamic].applyDynamic("useSyncExternalStoreWithSelector")(subscribe.asInstanceOf[js.Any], getSnapshot.asInstanceOf[js.Any], getServerSnapshot.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Selection]
  inline def useSyncExternalStoreWithSelector[Snapshot, Selection](
    subscribe: js.Function1[/* onStoreChange */ js.Function0[Unit], js.Function0[Unit]],
    getSnapshot: js.Function0[Snapshot],
    getServerSnapshot: Unit,
    selector: js.Function1[/* snapshot */ Snapshot, Selection],
    isEqual: js.Function2[/* a */ Selection, /* b */ Selection, Boolean]
  ): Selection = (^.asInstanceOf[js.Dynamic].applyDynamic("useSyncExternalStoreWithSelector")(subscribe.asInstanceOf[js.Any], getSnapshot.asInstanceOf[js.Any], getServerSnapshot.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], isEqual.asInstanceOf[js.Any])).asInstanceOf[Selection]
}
