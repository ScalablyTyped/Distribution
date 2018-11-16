package typings
package atUirouterCoreLib.libVanillaBaseLocationServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/vanilla/baseLocationService", "BaseLocationServices")
@js.native
abstract class BaseLocationServices protected ()
  extends atUirouterCoreLib.libCommonCoreservicesMod.LocationServices {
  def this(router: atUirouterCoreLib.libRouterMod.UIRouter, fireAfterUpdate: scala.Boolean) = this()
  var _history: atUirouterCoreLib.libVanillaInterfaceMod.HistoryLike = js.native
  var _listeners: js.Any = js.native
  var _location: atUirouterCoreLib.libVanillaInterfaceMod.LocationLike = js.native
  var fireAfterUpdate: scala.Boolean = js.native
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
  /* protected */ def _get(): java.lang.String = js.native
  def _listener(evt: js.Any): scala.Unit = js.native
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
  /* protected */ def _set(state: js.Any, title: java.lang.String, url: java.lang.String, replace: scala.Boolean): js.Any = js.native
  @JSName("hash")
  def hash_MBaseLocationServices(): js.Any = js.native
  @JSName("onChange")
  def onChange_MBaseLocationServices(cb: stdLib.EventListener): js.Function0[js.Array[js.Function]] = js.native
  @JSName("path")
  def path_MBaseLocationServices(): js.Any = js.native
  @JSName("search")
  def search_MBaseLocationServices(): js.Any = js.native
  @JSName("url")
  def url_MBaseLocationServices(): java.lang.String = js.native
  @JSName("url")
  def url_MBaseLocationServices(url: java.lang.String): java.lang.String = js.native
  @JSName("url")
  def url_MBaseLocationServices(url: java.lang.String, replace: scala.Boolean): java.lang.String = js.native
}

