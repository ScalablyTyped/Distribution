package typings.uirouterCore

import typings.uirouterCore.paramMod.Param
import typings.uirouterCore.paramTypesMod.ParamTypes
import typings.uirouterCore.routerMod.UIRouter
import typings.uirouterCore.urlInterfaceMod.UrlMatcherCompileConfig
import typings.uirouterCore.urlInterfaceMod.UrlRuleHandlerFn
import typings.uirouterCore.urlInterfaceMod.UrlRuleMatchFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUrlMod {
  
  @JSImport("@uirouter/core/lib/url", "BaseUrlRule")
  @js.native
  open class BaseUrlRule protected ()
    extends typings.uirouterCore.urlRuleMod.BaseUrlRule {
    def this(`match`: UrlRuleMatchFn) = this()
    def this(`match`: UrlRuleMatchFn, handler: UrlRuleHandlerFn) = this()
  }
  
  @JSImport("@uirouter/core/lib/url", "ParamFactory")
  @js.native
  open class ParamFactory protected ()
    extends typings.uirouterCore.urlMatcherFactoryMod.ParamFactory {
    def this(router: UIRouter) = this()
  }
  
  @JSImport("@uirouter/core/lib/url", "UrlConfig")
  @js.native
  open class UrlConfig protected ()
    extends typings.uirouterCore.urlConfigMod.UrlConfig {
    /** @internal */ def this(/** @internal */ router: UIRouter) = this()
  }
  
  @JSImport("@uirouter/core/lib/url", "UrlMatcher")
  @js.native
  open class UrlMatcher protected ()
    extends typings.uirouterCore.urlMatcherMod.UrlMatcher {
    /**
      * @param pattern The pattern to compile into a matcher.
      * @param paramTypes The [[ParamTypes]] registry
      * @param paramFactory A [[ParamFactory]] object
      * @param config  A [[UrlMatcherCompileConfig]] configuration object
      */
    def this(
      pattern: String,
      paramTypes: ParamTypes,
      paramFactory: typings.uirouterCore.urlMatcherFactoryMod.ParamFactory
    ) = this()
    def this(
      pattern: String,
      paramTypes: ParamTypes,
      paramFactory: typings.uirouterCore.urlMatcherFactoryMod.ParamFactory,
      config: UrlMatcherCompileConfig
    ) = this()
  }
  /* static members */
  object UrlMatcher {
    
    @JSImport("@uirouter/core/lib/url", "UrlMatcher")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Compare two UrlMatchers
      *
      * This comparison function converts a UrlMatcher into static and dynamic path segments.
      * Each static path segment is a static string between a path separator (slash character).
      * Each dynamic segment is a path parameter.
      *
      * The comparison function sorts static segments before dynamic ones.
      */
    inline def compare(a: typings.uirouterCore.urlMatcherMod.UrlMatcher, b: typings.uirouterCore.urlMatcherMod.UrlMatcher): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /** @internal */
    inline def encodeDashes(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDashes")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /** @internal */
    @JSImport("@uirouter/core/lib/url", "UrlMatcher.nameValidator")
    @js.native
    def nameValidator: js.RegExp = js.native
    inline def nameValidator_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nameValidator")(x.asInstanceOf[js.Any])
    
    /** @internal Given a matcher, return an array with the matcher's path segments and path params, in order */
    inline def pathSegmentsAndParams(matcher: typings.uirouterCore.urlMatcherMod.UrlMatcher): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("pathSegmentsAndParams")(matcher.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /** @internal Given a matcher, return an array with the matcher's query params */
    inline def queryParams(matcher: typings.uirouterCore.urlMatcherMod.UrlMatcher): js.Array[Param] = ^.asInstanceOf[js.Dynamic].applyDynamic("queryParams")(matcher.asInstanceOf[js.Any]).asInstanceOf[js.Array[Param]]
  }
  
  @JSImport("@uirouter/core/lib/url", "UrlMatcherFactory")
  @js.native
  open class UrlMatcherFactory protected ()
    extends typings.uirouterCore.urlMatcherFactoryMod.UrlMatcherFactory {
    def this(/** @internal */ router: UIRouter) = this()
  }
  
  @JSImport("@uirouter/core/lib/url", "UrlRouter")
  @js.native
  open class UrlRouter protected ()
    extends typings.uirouterCore.urlRouterMod.UrlRouter {
    /** @internal */
    def this(/** @internal */ router: UIRouter) = this()
  }
  
  @JSImport("@uirouter/core/lib/url", "UrlRuleFactory")
  @js.native
  open class UrlRuleFactory protected ()
    extends typings.uirouterCore.urlRuleMod.UrlRuleFactory {
    def this(router: UIRouter) = this()
  }
  /* static members */
  object UrlRuleFactory {
    
    @JSImport("@uirouter/core/lib/url", "UrlRuleFactory")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isUrlRule(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUrlRule")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @JSImport("@uirouter/core/lib/url", "UrlRules")
  @js.native
  open class UrlRules protected ()
    extends typings.uirouterCore.urlRulesMod.UrlRules {
    /** @internal */
    def this(/** @internal */ router: UIRouter) = this()
  }
  
  @JSImport("@uirouter/core/lib/url", "UrlService")
  @js.native
  open class UrlService protected ()
    extends typings.uirouterCore.urlServiceMod.UrlService {
    /** @internal */
    def this(/** @internal */ router: UIRouter) = this()
  }
}
