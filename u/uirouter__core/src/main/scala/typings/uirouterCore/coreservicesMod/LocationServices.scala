package typings.uirouterCore.coreservicesMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.EventListener
import typings.uirouterCore.interfaceMod.Disposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationServices extends Disposable {
  
  /** See: [[UrlService.hash]] */ def hash(): String = js.native
  /** See: [[UrlService.hash]] */ @JSName("hash")
  var hash_Original: (/* import warning: importer.ImportType#apply Failed type conversion: @uirouter/core.@uirouter/core/lib/url.UrlService['hash'] */ js.Any) with js.Function0[String] = js.native
  
  /** See: [[UrlService.onChange]] */ def onChange(callback: EventListener): js.Function = js.native
  /** See: [[UrlService.onChange]] */ @JSName("onChange")
  var onChange_Original: (/* import warning: importer.ImportType#apply Failed type conversion: @uirouter/core.@uirouter/core/lib/url.UrlService['onChange'] */ js.Any) with (js.Function1[/* callback */ EventListener, js.Function]) = js.native
  
  /** See: [[UrlService.path]] */ def path(): String = js.native
  /** See: [[UrlService.path]] */ @JSName("path")
  var path_Original: (/* import warning: importer.ImportType#apply Failed type conversion: @uirouter/core.@uirouter/core/lib/url.UrlService['path'] */ js.Any) with js.Function0[String] = js.native
  
  /** See: [[UrlService.search]] */ def search(): StringDictionary[js.Any] = js.native
  /** See: [[UrlService.search]] */ @JSName("search")
  var search_Original: (/* import warning: importer.ImportType#apply Failed type conversion: @uirouter/core.@uirouter/core/lib/url.UrlService['search'] */ js.Any) with js.Function0[StringDictionary[_]] = js.native
  
  /** See: [[UrlService.url]] */ def url(): String = js.native
  def url(newurl: js.UndefOr[scala.Nothing], replace: js.UndefOr[scala.Nothing], state: js.Any): String = js.native
  def url(newurl: js.UndefOr[scala.Nothing], replace: Boolean): String = js.native
  def url(newurl: js.UndefOr[scala.Nothing], replace: Boolean, state: js.Any): String = js.native
  def url(newurl: String): String = js.native
  def url(newurl: String, replace: js.UndefOr[scala.Nothing], state: js.Any): String = js.native
  def url(newurl: String, replace: Boolean): String = js.native
  def url(newurl: String, replace: Boolean, state: js.Any): String = js.native
  /** See: [[UrlService.url]] */ @JSName("url")
  var url_Original: (/* import warning: importer.ImportType#apply Failed type conversion: @uirouter/core.@uirouter/core/lib/url.UrlService['url'] */ js.Any) with (js.Function3[
    /* newurl */ js.UndefOr[String], 
    /* replace */ js.UndefOr[Boolean], 
    /* state */ js.UndefOr[js.Any], 
    String
  ]) = js.native
}
