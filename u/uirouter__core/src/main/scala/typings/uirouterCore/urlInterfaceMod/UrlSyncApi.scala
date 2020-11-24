package typings.uirouterCore.urlInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UrlSyncApi extends js.Object {
  
  /** See: [[UrlService.deferIntercept]] */ def deferIntercept(): Unit = js.native
  def deferIntercept(defer: Boolean): Unit = js.native
  /** See: [[UrlService.deferIntercept]] */ @JSName("deferIntercept")
  var deferIntercept_Original: (/* import warning: importer.ImportType#apply Failed type conversion: @uirouter/core.@uirouter/core/lib/url/urlService.UrlService['deferIntercept'] */ js.Any) with (js.Function1[/* defer */ js.UndefOr[Boolean], Unit]) = js.native
  
  /** See: [[UrlService.listen]] */ def listen(): js.Function = js.native
  def listen(enabled: Boolean): js.Function = js.native
  /** See: [[UrlService.listen]] */ @JSName("listen")
  var listen_Original: (/* import warning: importer.ImportType#apply Failed type conversion: @uirouter/core.@uirouter/core/lib/url/urlService.UrlService['listen'] */ js.Any) with (js.Function1[/* enabled */ js.UndefOr[Boolean], js.Function]) = js.native
  
  /** See: [[UrlService.sync]] */ def sync(): Unit = js.native
  def sync(evt: js.Any): Unit = js.native
  /** See: [[UrlService.sync]] */ @JSName("sync")
  var sync_Original: (/* import warning: importer.ImportType#apply Failed type conversion: @uirouter/core.@uirouter/core/lib/url/urlService.UrlService['sync'] */ js.Any) with (js.Function1[/* evt */ js.UndefOr[js.Any], Unit]) = js.native
}
