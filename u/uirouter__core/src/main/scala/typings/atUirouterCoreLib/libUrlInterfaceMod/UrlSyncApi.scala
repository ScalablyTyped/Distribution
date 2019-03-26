package typings
package atUirouterCoreLib.libUrlInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UrlSyncApi extends js.Object {
  /** See: [[UrlService.deferIntercept]] */ @JSName("deferIntercept")
  var deferIntercept_Original: (/* import warning: ImportType.apply Failed type conversion: @uirouter/core.@uirouter/core/lib/url/urlService.UrlService['deferIntercept'] */ js.Any) with (js.Function1[/* defer */ js.UndefOr[scala.Boolean], scala.Unit]) = js.native
  /** See: [[UrlService.listen]] */ @JSName("listen")
  var listen_Original: (/* import warning: ImportType.apply Failed type conversion: @uirouter/core.@uirouter/core/lib/url/urlService.UrlService['listen'] */ js.Any) with (js.Function1[/* enabled */ js.UndefOr[scala.Boolean], js.Function]) = js.native
  /** See: [[UrlService.sync]] */ @JSName("sync")
  var sync_Original: (/* import warning: ImportType.apply Failed type conversion: @uirouter/core.@uirouter/core/lib/url/urlService.UrlService['sync'] */ js.Any) with (js.Function1[/* evt */ js.UndefOr[js.Any], scala.Unit]) = js.native
  /** See: [[UrlService.deferIntercept]] */ def deferIntercept(): scala.Unit = js.native
  def deferIntercept(defer: scala.Boolean): scala.Unit = js.native
  /** See: [[UrlService.listen]] */ def listen(): js.Function = js.native
  def listen(enabled: scala.Boolean): js.Function = js.native
  /** See: [[UrlService.sync]] */ def sync(): scala.Unit = js.native
  def sync(evt: js.Any): scala.Unit = js.native
}

