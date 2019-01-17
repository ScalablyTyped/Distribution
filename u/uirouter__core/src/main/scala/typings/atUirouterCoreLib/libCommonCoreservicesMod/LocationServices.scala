package typings
package atUirouterCoreLib.libCommonCoreservicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationServices
  extends atUirouterCoreLib.libInterfaceMod.Disposable {
  /** See: [[UrlService.hash]] */ var hash: (/* import warning: ImportType.apply Failed type conversion: @uirouter/core.@uirouter/core/lib/url.UrlService['hash'] */ js.Any) | js.Function0[java.lang.String] = js.native
  /** See: [[UrlService.onChange]] */ var onChange: (/* import warning: ImportType.apply Failed type conversion: @uirouter/core.@uirouter/core/lib/url.UrlService['onChange'] */ js.Any) | (js.Function1[/* callback */ js.Function, js.Function]) = js.native
  /** See: [[UrlService.path]] */ var path: (/* import warning: ImportType.apply Failed type conversion: @uirouter/core.@uirouter/core/lib/url.UrlService['path'] */ js.Any) | js.Function0[java.lang.String] = js.native
  /** See: [[UrlService.search]] */ var search: (/* import warning: ImportType.apply Failed type conversion: @uirouter/core.@uirouter/core/lib/url.UrlService['search'] */ js.Any) | js.Function0[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  /** See: [[UrlService.url]] */ var url: (/* import warning: ImportType.apply Failed type conversion: @uirouter/core.@uirouter/core/lib/url.UrlService['url'] */ js.Any) | (js.Function3[
    /* newurl */ js.UndefOr[java.lang.String], 
    /* replace */ js.UndefOr[scala.Boolean], 
    /* state */ js.UndefOr[js.Any], 
    java.lang.String
  ]) = js.native
}

