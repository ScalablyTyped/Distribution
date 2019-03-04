package typings
package atUirouterCoreLib.libUrlInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlSyncApi extends js.Object {
  /** See: [[UrlService.deferIntercept]] */ var deferIntercept: (js.Function1[/* defer */ js.UndefOr[scala.Boolean], scala.Unit]) | (/* import warning: ImportType.apply Failed type conversion: @uirouter/core.@uirouter/core/lib/url/urlService.UrlService['deferIntercept'] */ js.Any)
  /** See: [[UrlService.listen]] */ var listen: (js.Function1[/* enabled */ js.UndefOr[scala.Boolean], js.Function]) | (/* import warning: ImportType.apply Failed type conversion: @uirouter/core.@uirouter/core/lib/url/urlService.UrlService['listen'] */ js.Any)
  /** See: [[UrlService.sync]] */ var sync: (js.Function1[/* evt */ js.UndefOr[js.Any], scala.Unit]) | (/* import warning: ImportType.apply Failed type conversion: @uirouter/core.@uirouter/core/lib/url/urlService.UrlService['sync'] */ js.Any)
}

object UrlSyncApi {
  @scala.inline
  def apply(
    deferIntercept: (js.Function1[/* defer */ js.UndefOr[scala.Boolean], scala.Unit]) | (/* import warning: ImportType.apply Failed type conversion: @uirouter/core.@uirouter/core/lib/url/urlService.UrlService['deferIntercept'] */ js.Any),
    listen: (js.Function1[/* enabled */ js.UndefOr[scala.Boolean], js.Function]) | (/* import warning: ImportType.apply Failed type conversion: @uirouter/core.@uirouter/core/lib/url/urlService.UrlService['listen'] */ js.Any),
    sync: (js.Function1[/* evt */ js.UndefOr[js.Any], scala.Unit]) | (/* import warning: ImportType.apply Failed type conversion: @uirouter/core.@uirouter/core/lib/url/urlService.UrlService['sync'] */ js.Any)
  ): UrlSyncApi = {
    val __obj = js.Dynamic.literal(deferIntercept = deferIntercept.asInstanceOf[js.Any], listen = listen.asInstanceOf[js.Any], sync = sync.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UrlSyncApi]
  }
}

