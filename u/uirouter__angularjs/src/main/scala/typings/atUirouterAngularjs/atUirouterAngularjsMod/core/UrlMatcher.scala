package typings.atUirouterAngularjs.atUirouterAngularjsMod.core

import typings.atUirouterCore.libUrlInterfaceMod.UrlMatcherCompileConfig
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/angularjs", "core.UrlMatcher")
@js.native
class UrlMatcher protected ()
  extends typings.atUirouterCore.atUirouterCoreMod.UrlMatcher {
  /**
    * @param pattern The pattern to compile into a matcher.
    * @param paramTypes The [[ParamTypes]] registry
    * @param paramFactory A [[ParamFactory]] object
    * @param config  A [[UrlMatcherCompileConfig]] configuration object
    */
  def this(
    pattern: String,
    paramTypes: typings.atUirouterCore.libParamsParamTypesMod.ParamTypes,
    paramFactory: typings.atUirouterCore.libUrlUrlMatcherFactoryMod.ParamFactory
  ) = this()
  def this(
    pattern: String,
    paramTypes: typings.atUirouterCore.libParamsParamTypesMod.ParamTypes,
    paramFactory: typings.atUirouterCore.libUrlUrlMatcherFactoryMod.ParamFactory,
    config: UrlMatcherCompileConfig
  ) = this()
}

/* static members */
@JSImport("@uirouter/angularjs", "core.UrlMatcher")
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
  def queryParams(matcher: typings.atUirouterCore.libUrlUrlMatcherMod.UrlMatcher): js.Array[typings.atUirouterCore.libParamsParamMod.Param] = js.native
}

