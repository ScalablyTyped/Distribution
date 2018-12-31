package typings
package atUirouterCoreLib.libCommonCoreservicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationServices
  extends atUirouterCoreLib.libInterfaceMod.Disposable {
  /** See: [[UrlService.hash]] */ var hash: js.Function0[java.lang.String] | (/* import warning: ImportType.apply Failed type conversion: @uirouter/core.@uirouter/core/lib/url.UrlService['hash'] */ js.Any) = js.native
  /** See: [[UrlService.onChange]] */ var onChange: (js.Function1[/* callback */ js.Function, js.Function]) | (/* import warning: ImportType.apply Failed type conversion: @uirouter/core.@uirouter/core/lib/url.UrlService['onChange'] */ js.Any) = js.native
  /** See: [[UrlService.path]] */ var path: js.Function0[java.lang.String] | (/* import warning: ImportType.apply Failed type conversion: @uirouter/core.@uirouter/core/lib/url.UrlService['path'] */ js.Any) = js.native
  /** See: [[UrlService.search]] */ var search: js.Function0[org.scalablytyped.runtime.StringDictionary[_]] | (/* import warning: ImportType.apply Failed type conversion: @uirouter/core.@uirouter/core/lib/url.UrlService['search'] */ js.Any) = js.native
  /** See: [[UrlService.url]] */ var url: (js.Function3[
    /* newurl */ js.UndefOr[java.lang.String], 
    /* replace */ js.UndefOr[scala.Boolean], 
    /* state */ js.UndefOr[js.Any], 
    java.lang.String
  ]) | (/* import warning: ImportType.apply Failed type conversion: @uirouter/core.@uirouter/core/lib/url.UrlService['url'] */ js.Any) = js.native
}

