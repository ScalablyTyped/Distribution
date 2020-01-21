package typings.uirouterCore

import typings.uirouterCore.paramsInterfaceMod.ParamTypeDefinition
import typings.uirouterCore.paramsMod.Param
import typings.uirouterCore.paramsMod.ParamType
import typings.uirouterCore.routerMod.UIRouter
import typings.uirouterCore.stateInterfaceMod.StateDeclaration
import typings.uirouterCore.urlInterfaceMod.UrlMatcherCompileConfig
import typings.uirouterCore.urlMatcherMod.UrlMatcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/url/urlMatcherFactory", JSImport.Namespace)
@js.native
object urlMatcherFactoryMod extends js.Object {
  @js.native
  class ParamFactory protected () extends js.Object {
    def this(router: UIRouter) = this()
    var router: js.Any = js.native
    def fromConfig(id: String, `type`: ParamType, state: StateDeclaration): Param = js.native
    def fromPath(id: String, `type`: ParamType, state: StateDeclaration): Param = js.native
    def fromSearch(id: String, `type`: ParamType, state: StateDeclaration): Param = js.native
  }
  
  @js.native
  class UrlMatcherFactory protected () extends js.Object {
    def this(/** @hidden */ router: UIRouter) = this()
    /** @internalapi Creates a new [[Param]] for a given location (DefType) */
    var paramFactory: ParamFactory = js.native
    var router: js.Any = js.native
    /** @hidden */
    @JSName("$get")
    def $get(): this.type = js.native
    /** @deprecated use [[UrlConfig.caseInsensitive]] */
    def caseInsensitive(): Boolean = js.native
    def caseInsensitive(value: Boolean): Boolean = js.native
    /**
      * Creates a [[UrlMatcher]] for the specified pattern.
      *
      * @param pattern  The URL pattern.
      * @param config  The config object hash.
      * @returns The UrlMatcher.
      */
    def compile(pattern: String): UrlMatcher = js.native
    def compile(pattern: String, config: UrlMatcherCompileConfig): UrlMatcher = js.native
    /** @deprecated use [[UrlConfig.defaultSquashPolicy]] */
    def defaultSquashPolicy(): String | Boolean = js.native
    def defaultSquashPolicy(value: String): String | Boolean = js.native
    def defaultSquashPolicy(value: Boolean): String | Boolean = js.native
    /**
      * Returns true if the specified object is a [[UrlMatcher]], or false otherwise.
      *
      * @param object  The object to perform the type check against.
      * @returns `true` if the object matches the `UrlMatcher` interface, by
      *          implementing all the same methods.
      */
    def isMatcher(`object`: js.Any): Boolean = js.native
    /** @deprecated use [[UrlConfig.strictMode]] */
    def strictMode(): Boolean = js.native
    def strictMode(value: Boolean): Boolean = js.native
    /** @deprecated use [[UrlConfig.type]] */
    def `type`(name: String): js.Any = js.native
    def `type`(name: String, definition: ParamTypeDefinition): js.Any = js.native
    def `type`(name: String, definition: ParamTypeDefinition, definitionFn: js.Function0[ParamTypeDefinition]): js.Any = js.native
  }
  
}

