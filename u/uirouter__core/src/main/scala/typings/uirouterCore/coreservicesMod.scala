package typings.uirouterCore

import org.scalablytyped.runtime.StringDictionary
import typings.std.EventListener
import typings.uirouterCore.commonCommonMod.IInjectable
import typings.uirouterCore.commonCommonMod.Obj
import typings.uirouterCore.interfaceMod.Disposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreservicesMod {
  
  @JSImport("@uirouter/core/lib/common/coreservices", "makeStub")
  @js.native
  def makeStub[T](service: String, methods: js.Array[/* keyof T */ String]): T = js.native
  
  @JSImport("@uirouter/core/lib/common/coreservices", "services")
  @js.native
  val services: CoreServices = js.native
  
  @js.native
  trait CoreServices extends StObject {
    
    @JSName("$injector")
    var $injector: InjectorLike = js.native
    
    @JSName("$q")
    var $q: QLike = js.native
  }
  object CoreServices {
    
    @scala.inline
    def apply($injector: InjectorLike, $q: QLike): CoreServices = {
      val __obj = js.Dynamic.literal($injector = $injector.asInstanceOf[js.Any], $q = $q.asInstanceOf[js.Any])
      __obj.asInstanceOf[CoreServices]
    }
    
    @scala.inline
    implicit class CoreServicesMutableBuilder[Self <: CoreServices] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$injector(value: InjectorLike): Self = StObject.set(x, "$injector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$q(value: QLike): Self = StObject.set(x, "$q", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InjectorLike extends StObject {
    
    def annotate(fn: IInjectable): js.Array[_] = js.native
    def annotate(fn: IInjectable, strictDi: Boolean): js.Array[_] = js.native
    
    def get(token: js.Any): js.Any = js.native
    @JSName("get")
    def get_T_T[T](token: js.Any): T = js.native
    
    def has(token: js.Any): Boolean = js.native
    
    def invoke(fn: IInjectable): js.Any = js.native
    def invoke(fn: IInjectable, context: js.UndefOr[scala.Nothing], locals: Obj): js.Any = js.native
    def invoke(fn: IInjectable, context: js.Any): js.Any = js.native
    def invoke(fn: IInjectable, context: js.Any, locals: Obj): js.Any = js.native
    
    var strictDi: js.UndefOr[Boolean] = js.native
  }
  
  @js.native
  trait LocationConfig extends Disposable {
    
    /** See: [[UrlConfig.baseHref]] */ def baseHref(): String = js.native
    /** See: [[UrlConfig.baseHref]] */ @JSName("baseHref")
    var baseHref_Original: js.Function0[String] = js.native
    
    /** See: [[UrlConfig.hashPrefix]] */ def hashPrefix(): String = js.native
    def hashPrefix(newprefix: String): String = js.native
    /** See: [[UrlConfig.hashPrefix]] */ @JSName("hashPrefix")
    var hashPrefix_Original: js.Function1[/* newprefix */ js.UndefOr[String], String] = js.native
    
    /** See: [[UrlConfig.host]] */ def host(): String = js.native
    /** See: [[UrlConfig.host]] */ @JSName("host")
    var host_Original: js.Function0[String] = js.native
    
    /** See: [[UrlConfig.html5Mode]] */ def html5Mode(): Boolean = js.native
    /** See: [[UrlConfig.html5Mode]] */ @JSName("html5Mode")
    var html5Mode_Original: js.Function0[Boolean] = js.native
    
    /** See: [[UrlConfig.port]] */ def port(): Double = js.native
    /** See: [[UrlConfig.port]] */ @JSName("port")
    var port_Original: js.Function0[Double] = js.native
    
    /** See: [[UrlConfig.protocol]] */ def protocol(): String = js.native
    /** See: [[UrlConfig.protocol]] */ @JSName("protocol")
    var protocol_Original: js.Function0[String] = js.native
  }
  
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
  
  @js.native
  trait QLike extends StObject {
    
    def all(promises: js.Array[js.Promise[_]]): js.Promise[js.Array[_]] = js.native
    def all(promises: StringDictionary[js.Promise[_]]): js.Promise[_] = js.native
    
    def defer(): QLikeDeferred = js.native
    
    def reject[T](reason: js.Any): js.Promise[T] = js.native
    
    def when[T](): js.Promise[T] = js.native
    def when[T](value: T): js.Promise[T] = js.native
    def when[T](value: js.Thenable[T]): js.Promise[T] = js.native
  }
  
  @js.native
  trait QLikeDeferred extends StObject {
    
    var promise: js.Promise[_] = js.native
    
    def reject(): Unit = js.native
    def reject(reason: js.Any): Unit = js.native
    
    def resolve(): Unit = js.native
    def resolve(`val`: js.Any): Unit = js.native
  }
}
