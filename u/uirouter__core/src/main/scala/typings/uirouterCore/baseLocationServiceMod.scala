package typings.uirouterCore

import typings.uirouterCore.coreservicesMod.LocationServices
import typings.uirouterCore.routerMod.UIRouter
import typings.uirouterCore.vanillaInterfaceMod.HistoryLike
import typings.uirouterCore.vanillaInterfaceMod.LocationLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/vanilla/baseLocationService", JSImport.Namespace)
@js.native
object baseLocationServiceMod extends js.Object {
  @js.native
  abstract class BaseLocationServices protected () extends LocationServices {
    def this(router: UIRouter, fireAfterUpdate: Boolean) = this()
    var _history: HistoryLike = js.native
    var _listeners: js.Any = js.native
    var _location: LocationLike = js.native
    var fireAfterUpdate: Boolean = js.native
    /**
      * This should return the current internal URL representation.
      *
      * The internal URL includes only the portion that UI-Router matches.
      * It does not include:
      * - protocol
      * - server
      * - port
      * - base href or hash
      */
    /* protected */ def _get(): String = js.native
    def _listener(evt: js.Any): Unit = js.native
    /**
      * This should set the current URL.
      *
      * The `url` param should include only the portion that UI-Router matches on.
      * It should not include:
      * - protocol
      * - server
      * - port
      * - base href or hash
      *
      * However, after this function completes, the browser URL should reflect the entire (fully qualified)
      * HREF including those data.
      */
    /* protected */ def _set(state: js.Any, title: String, url: String, replace: Boolean): js.Any = js.native
  }
  
}

