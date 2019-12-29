package typings.atUirouterCore

import org.scalablytyped.runtime.StringDictionary
import typings.atUirouterCore.libCommonCommonMod.IInjectable
import typings.atUirouterCore.libCommonCommonMod.Obj
import typings.atUirouterCore.libInterfaceMod.Disposable
import typings.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/common/coreservices", JSImport.Namespace)
@js.native
object libCommonCoreservicesMod extends js.Object {
  @js.native
  trait $InjectorLike extends js.Object {
    var strictDi: js.UndefOr[Boolean] = js.native
    def annotate(fn: IInjectable): js.Array[_] = js.native
    def annotate(fn: IInjectable, strictDi: Boolean): js.Array[_] = js.native
    def get(token: js.Any): js.Any = js.native
    @JSName("get")
    def get_T_T[T](token: js.Any): T = js.native
    def has(token: js.Any): Boolean = js.native
    def invoke(fn: IInjectable): js.Any = js.native
    def invoke(fn: IInjectable, context: js.Any): js.Any = js.native
    def invoke(fn: IInjectable, context: js.Any, locals: Obj): js.Any = js.native
  }
  
  @js.native
  trait $QLike extends js.Object {
    def all(promises: js.Array[js.Promise[_]]): js.Promise[js.Array[_]] = js.native
    def all(promises: StringDictionary[js.Promise[_]]): js.Promise[_] = js.native
    def defer(): $QLikeDeferred = js.native
    def reject[T](reason: js.Any): js.Promise[T] = js.native
    def when[T](): js.Promise[T] = js.native
    def when[T](value: T): js.Promise[T] = js.native
    def when[T](value: js.Thenable[T]): js.Promise[T] = js.native
  }
  
  @js.native
  trait $QLikeDeferred extends js.Object {
    var promise: js.Promise[_] = js.native
    def reject(): Unit = js.native
    def reject(reason: js.Any): Unit = js.native
    def resolve(): Unit = js.native
    def resolve(`val`: js.Any): Unit = js.native
  }
  
  @js.native
  trait CoreServices extends js.Object {
    @JSName("$injector")
    var $injector: $InjectorLike = js.native
    @JSName("$q")
    var $q: $QLike = js.native
  }
  
  @js.native
  trait LocationConfig extends Disposable {
    /** See: [[UrlConfig.baseHref]] */ @JSName("baseHref")
    var baseHref_Original: js.Function0[String] = js.native
    /** See: [[UrlConfig.hashPrefix]] */ @JSName("hashPrefix")
    var hashPrefix_Original: js.Function1[/* newprefix */ js.UndefOr[String], String] = js.native
    /** See: [[UrlConfig.host]] */ @JSName("host")
    var host_Original: js.Function0[String] = js.native
    /** See: [[UrlConfig.html5Mode]] */ @JSName("html5Mode")
    var html5Mode_Original: js.Function0[Boolean] = js.native
    /** See: [[UrlConfig.port]] */ @JSName("port")
    var port_Original: js.Function0[Double] = js.native
    /** See: [[UrlConfig.protocol]] */ @JSName("protocol")
    var protocol_Original: js.Function0[String] = js.native
    /** See: [[UrlConfig.baseHref]] */ def baseHref(): String = js.native
    /** See: [[UrlConfig.hashPrefix]] */ def hashPrefix(): String = js.native
    def hashPrefix(newprefix: String): String = js.native
    /** See: [[UrlConfig.host]] */ def host(): String = js.native
    /** See: [[UrlConfig.html5Mode]] */ def html5Mode(): Boolean = js.native
    /** See: [[UrlConfig.port]] */ def port(): Double = js.native
    /** See: [[UrlConfig.protocol]] */ def protocol(): String = js.native
  }
  
  @js.native
  trait LocationServices extends Disposable {
    /** See: [[UrlService.hash]] */ @JSName("hash")
    var hash_Original: (/* import warning: importer.ImportType#apply Failed type conversion: @uirouter/core.@uirouter/core/lib/url.UrlService['hash'] */ js.Any) with js.Function0[String] = js.native
    /** See: [[UrlService.onChange]] */ @JSName("onChange")
    var onChange_Original: (/* import warning: importer.ImportType#apply Failed type conversion: @uirouter/core.@uirouter/core/lib/url.UrlService['onChange'] */ js.Any) with (js.Function1[/* callback */ EventListener, js.Function]) = js.native
    /** See: [[UrlService.path]] */ @JSName("path")
    var path_Original: (/* import warning: importer.ImportType#apply Failed type conversion: @uirouter/core.@uirouter/core/lib/url.UrlService['path'] */ js.Any) with js.Function0[String] = js.native
    /** See: [[UrlService.search]] */ @JSName("search")
    var search_Original: (/* import warning: importer.ImportType#apply Failed type conversion: @uirouter/core.@uirouter/core/lib/url.UrlService['search'] */ js.Any) with js.Function0[StringDictionary[_]] = js.native
    /** See: [[UrlService.url]] */ @JSName("url")
    var url_Original: (/* import warning: importer.ImportType#apply Failed type conversion: @uirouter/core.@uirouter/core/lib/url.UrlService['url'] */ js.Any) with (js.Function3[
        /* newurl */ js.UndefOr[String], 
        /* replace */ js.UndefOr[Boolean], 
        /* state */ js.UndefOr[js.Any], 
        String
      ]) = js.native
    /** See: [[UrlService.hash]] */ def hash(): String = js.native
    /** See: [[UrlService.onChange]] */ def onChange(callback: EventListener): js.Function = js.native
    /** See: [[UrlService.path]] */ def path(): String = js.native
    /** See: [[UrlService.search]] */ def search(): StringDictionary[js.Any] = js.native
    /** See: [[UrlService.url]] */ def url(): String = js.native
    def url(newurl: String): String = js.native
    def url(newurl: String, replace: Boolean): String = js.native
    def url(newurl: String, replace: Boolean, state: js.Any): String = js.native
  }
  
  val services: CoreServices = js.native
  def makeStub[T](service: String, methods: js.Array[String]): T = js.native
}

