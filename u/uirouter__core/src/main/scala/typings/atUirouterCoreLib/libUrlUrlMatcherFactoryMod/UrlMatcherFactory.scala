package typings
package atUirouterCoreLib.libUrlUrlMatcherFactoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/url/urlMatcherFactory", "UrlMatcherFactory")
@js.native
class UrlMatcherFactory protected () extends js.Object {
  def this(/** @hidden */ router: atUirouterCoreLib.libRouterMod.UIRouter) = this()
  /** @internalapi Creates a new [[Param]] for a given location (DefType) */
  var paramFactory: ParamFactory = js.native
  var router: js.Any = js.native
  /** @hidden */
  @JSName("$get")
  def $get(): this.type = js.native
  /** @deprecated use [[UrlConfig.caseInsensitive]] */
  def caseInsensitive(): scala.Boolean = js.native
  /** @deprecated use [[UrlConfig.caseInsensitive]] */
  def caseInsensitive(value: scala.Boolean): scala.Boolean = js.native
  /**
       * Creates a [[UrlMatcher]] for the specified pattern.
       *
       * @param pattern  The URL pattern.
       * @param config  The config object hash.
       * @returns The UrlMatcher.
       */
  def compile(pattern: java.lang.String): atUirouterCoreLib.libUrlUrlMatcherMod.UrlMatcher = js.native
  /**
       * Creates a [[UrlMatcher]] for the specified pattern.
       *
       * @param pattern  The URL pattern.
       * @param config  The config object hash.
       * @returns The UrlMatcher.
       */
  def compile(pattern: java.lang.String, config: atUirouterCoreLib.libUrlInterfaceMod.UrlMatcherCompileConfig): atUirouterCoreLib.libUrlUrlMatcherMod.UrlMatcher = js.native
  /** @deprecated use [[UrlConfig.defaultSquashPolicy]] */
  def defaultSquashPolicy(): java.lang.String | scala.Boolean = js.native
  /** @deprecated use [[UrlConfig.defaultSquashPolicy]] */
  def defaultSquashPolicy(value: java.lang.String): java.lang.String | scala.Boolean = js.native
  /** @deprecated use [[UrlConfig.defaultSquashPolicy]] */
  def defaultSquashPolicy(value: scala.Boolean): java.lang.String | scala.Boolean = js.native
  /**
       * Returns true if the specified object is a [[UrlMatcher]], or false otherwise.
       *
       * @param object  The object to perform the type check against.
       * @returns `true` if the object matches the `UrlMatcher` interface, by
       *          implementing all the same methods.
       */
  def isMatcher(`object`: js.Any): scala.Boolean = js.native
  /** @deprecated use [[UrlConfig.strictMode]] */
  def strictMode(): scala.Boolean = js.native
  /** @deprecated use [[UrlConfig.strictMode]] */
  def strictMode(value: scala.Boolean): scala.Boolean = js.native
  /** @deprecated use [[UrlConfig.type]] */
  def `type`(name: java.lang.String): js.Any = js.native
  /** @deprecated use [[UrlConfig.type]] */
  def `type`(name: java.lang.String, definition: atUirouterCoreLib.libParamsInterfaceMod.ParamTypeDefinition): js.Any = js.native
  /** @deprecated use [[UrlConfig.type]] */
  def `type`(
    name: java.lang.String,
    definition: atUirouterCoreLib.libParamsInterfaceMod.ParamTypeDefinition,
    definitionFn: js.Function0[atUirouterCoreLib.libParamsInterfaceMod.ParamTypeDefinition]
  ): js.Any = js.native
}

