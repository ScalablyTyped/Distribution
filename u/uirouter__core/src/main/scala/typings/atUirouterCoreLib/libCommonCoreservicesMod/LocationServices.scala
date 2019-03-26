package typings
package atUirouterCoreLib.libCommonCoreservicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationServices
  extends atUirouterCoreLib.libInterfaceMod.Disposable {
  /** See: [[UrlService.hash]] */ @JSName("hash")
  var hash_Original: (/* import warning: ImportType.apply Failed type conversion: @uirouter/core.@uirouter/core/lib/url.UrlService['hash'] */ js.Any) with js.Function0[java.lang.String] = js.native
  /** See: [[UrlService.onChange]] */ @JSName("onChange")
  var onChange_Original: (/* import warning: ImportType.apply Failed type conversion: @uirouter/core.@uirouter/core/lib/url.UrlService['onChange'] */ js.Any) with (js.Function1[/* callback */ stdLib.EventListener, js.Function]) = js.native
  /** See: [[UrlService.path]] */ @JSName("path")
  var path_Original: (/* import warning: ImportType.apply Failed type conversion: @uirouter/core.@uirouter/core/lib/url.UrlService['path'] */ js.Any) with js.Function0[java.lang.String] = js.native
  /** See: [[UrlService.search]] */ @JSName("search")
  var search_Original: (/* import warning: ImportType.apply Failed type conversion: @uirouter/core.@uirouter/core/lib/url.UrlService['search'] */ js.Any) with js.Function0[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  /** See: [[UrlService.url]] */ @JSName("url")
  var url_Original: (/* import warning: ImportType.apply Failed type conversion: @uirouter/core.@uirouter/core/lib/url.UrlService['url'] */ js.Any) with (js.Function3[
    /* newurl */ js.UndefOr[java.lang.String], 
    /* replace */ js.UndefOr[scala.Boolean], 
    /* state */ js.UndefOr[js.Any], 
    java.lang.String
  ]) = js.native
  /** See: [[UrlService.hash]] */ def hash(): java.lang.String = js.native
  /** See: [[UrlService.onChange]] */ def onChange(callback: stdLib.EventListener): js.Function = js.native
  /** See: [[UrlService.path]] */ def path(): java.lang.String = js.native
  /** See: [[UrlService.search]] */ def search(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  /** See: [[UrlService.url]] */ def url(): java.lang.String = js.native
  def url(newurl: java.lang.String): java.lang.String = js.native
  def url(newurl: java.lang.String, replace: scala.Boolean): java.lang.String = js.native
  def url(newurl: java.lang.String, replace: scala.Boolean, state: js.Any): java.lang.String = js.native
}

