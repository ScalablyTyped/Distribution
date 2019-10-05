package typings.atUirouterCore

import typings.atUirouterCore.libParamsParamMod.Param
import typings.atUirouterCore.libParamsParamTypesMod.ParamTypes
import typings.atUirouterCore.libRouterMod.UIRouter
import typings.atUirouterCore.libUrlInterfaceMod.UrlMatcherCompileConfig
import typings.atUirouterCore.libUrlInterfaceMod.UrlRuleHandlerFn
import typings.atUirouterCore.libUrlInterfaceMod.UrlRuleMatchFn
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/url", JSImport.Namespace)
@js.native
object libUrlMod extends js.Object {
  @js.native
  class BaseUrlRule protected ()
    extends typings.atUirouterCore.libUrlUrlRuleMod.BaseUrlRule {
    def this(`match`: UrlRuleMatchFn) = this()
    def this(`match`: UrlRuleMatchFn, handler: UrlRuleHandlerFn) = this()
  }
  
  @js.native
  class ParamFactory protected ()
    extends typings.atUirouterCore.libUrlUrlMatcherFactoryMod.ParamFactory {
    def this(router: UIRouter) = this()
  }
  
  @js.native
  class UrlConfig protected ()
    extends typings.atUirouterCore.libUrlUrlConfigMod.UrlConfig {
    /** @hidden */ def this(/** @hidden */ router: UIRouter) = this()
  }
  
  @js.native
  class UrlMatcher protected ()
    extends typings.atUirouterCore.libUrlUrlMatcherMod.UrlMatcher {
    /**
      * @param pattern The pattern to compile into a matcher.
      * @param paramTypes The [[ParamTypes]] registry
      * @param paramFactory A [[ParamFactory]] object
      * @param config  A [[UrlMatcherCompileConfig]] configuration object
      */
    def this(
      pattern: String,
      paramTypes: ParamTypes,
      paramFactory: typings.atUirouterCore.libUrlUrlMatcherFactoryMod.ParamFactory
    ) = this()
    def this(
      pattern: String,
      paramTypes: ParamTypes,
      paramFactory: typings.atUirouterCore.libUrlUrlMatcherFactoryMod.ParamFactory,
      config: UrlMatcherCompileConfig
    ) = this()
  }
  
  @js.native
  class UrlMatcherFactory protected ()
    extends typings.atUirouterCore.libUrlUrlMatcherFactoryMod.UrlMatcherFactory {
    def this(/** @hidden */ router: UIRouter) = this()
  }
  
  @js.native
  class UrlRouter protected ()
    extends typings.atUirouterCore.libUrlUrlRouterMod.UrlRouter {
    /** @hidden */
    def this(/** @hidden */ router: UIRouter) = this()
  }
  
  @js.native
  class UrlRuleFactory protected ()
    extends typings.atUirouterCore.libUrlUrlRuleMod.UrlRuleFactory {
    def this(router: UIRouter) = this()
  }
  
  @js.native
  class UrlRules protected ()
    extends typings.atUirouterCore.libUrlUrlRulesMod.UrlRules {
    /** @hidden */
    def this(/** @hidden */ router: UIRouter) = this()
  }
  
  @js.native
  class UrlService protected ()
    extends typings.atUirouterCore.libUrlUrlServiceMod.UrlService {
    /** @hidden */
    def this(/** @hidden */ router: UIRouter) = this()
  }
  
  /* static members */
  @js.native
  object UrlMatcher extends js.Object {
    /** @hidden */
    var nameValidator: RegExp = js.native
    /**
      * Compare two UrlMatchers
      *
      * This comparison function converts a UrlMatcher into static and dynamic path segments.
      * Each static path segment is a static string between a path separator (slash character).
      * Each dynamic segment is a path parameter.
      *
      * The comparison function sorts static segments before dynamic ones.
      */
    def compare(
      a: typings.atUirouterCore.libUrlUrlMatcherMod.UrlMatcher,
      b: typings.atUirouterCore.libUrlUrlMatcherMod.UrlMatcher
    ): Double = js.native
    /** @hidden */
    def encodeDashes(str: String): String = js.native
    /** @hidden Given a matcher, return an array with the matcher's path segments and path params, in order */
    def pathSegmentsAndParams(matcher: typings.atUirouterCore.libUrlUrlMatcherMod.UrlMatcher): js.Any = js.native
    /** @hidden Given a matcher, return an array with the matcher's query params */
    def queryParams(matcher: typings.atUirouterCore.libUrlUrlMatcherMod.UrlMatcher): js.Array[Param] = js.native
  }
  
  /* static members */
  @js.native
  object UrlRuleFactory extends js.Object {
    def isUrlRule(obj: js.Any): Boolean = js.native
  }
  
}

