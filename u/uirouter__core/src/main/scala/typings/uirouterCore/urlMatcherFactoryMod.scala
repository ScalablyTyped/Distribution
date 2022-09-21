package typings.uirouterCore

import typings.uirouterCore.anon.TypeofParam
import typings.uirouterCore.anon.TypeofUrlMatcher
import typings.uirouterCore.paramsInterfaceMod.ParamTypeDefinition
import typings.uirouterCore.paramsMod.Param
import typings.uirouterCore.paramsMod.ParamType
import typings.uirouterCore.routerMod.UIRouter
import typings.uirouterCore.stateInterfaceMod.StateDeclaration
import typings.uirouterCore.urlInterfaceMod.UrlMatcherCompileConfig
import typings.uirouterCore.urlMatcherMod.UrlMatcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object urlMatcherFactoryMod {
  
  @JSImport("@uirouter/core/lib/url/urlMatcherFactory", "ParamFactory")
  @js.native
  open class ParamFactory protected () extends StObject {
    def this(router: UIRouter) = this()
    
    def fromConfig(id: String, `type`: ParamType, state: StateDeclaration): Param = js.native
    
    def fromPath(id: String, `type`: ParamType, state: StateDeclaration): Param = js.native
    
    def fromSearch(id: String, `type`: ParamType, state: StateDeclaration): Param = js.native
    
    /* private */ var router: Any = js.native
  }
  
  @JSImport("@uirouter/core/lib/url/urlMatcherFactory", "UrlMatcherFactory")
  @js.native
  open class UrlMatcherFactory protected () extends StObject {
    def this(/** @internal */ router: UIRouter) = this()
    
    /** @internal */
    @JSName("$get")
    def $get(): this.type = js.native
    
    var Param: TypeofParam = js.native
    
    var UrlMatcher: TypeofUrlMatcher = js.native
    
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
    def isMatcher(`object`: Any): Boolean = js.native
    
    /** Creates a new [[Param]] for a given location (DefType) */
    var paramFactory: ParamFactory = js.native
    
    /* private */ var router: Any = js.native
    
    /** @deprecated use [[UrlConfig.strictMode]] */
    def strictMode(): Boolean = js.native
    def strictMode(value: Boolean): Boolean = js.native
    
    /** @deprecated use [[UrlConfig.type]] */
    def `type`(name: String): Any = js.native
    def `type`(name: String, definition: Unit, definitionFn: js.Function0[ParamTypeDefinition]): Any = js.native
    def `type`(name: String, definition: ParamTypeDefinition): Any = js.native
    def `type`(name: String, definition: ParamTypeDefinition, definitionFn: js.Function0[ParamTypeDefinition]): Any = js.native
  }
}
