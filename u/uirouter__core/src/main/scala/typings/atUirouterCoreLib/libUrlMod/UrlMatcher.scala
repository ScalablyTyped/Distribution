package typings
package atUirouterCoreLib.libUrlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/url", "UrlMatcher")
@js.native
class UrlMatcher protected ()
  extends atUirouterCoreLib.libUrlUrlMatcherMod.UrlMatcher {
  /**
    * @param pattern The pattern to compile into a matcher.
    * @param paramTypes The [[ParamTypes]] registry
    * @param paramFactory A [[ParamFactory]] object
    * @param config  A [[UrlMatcherCompileConfig]] configuration object
    */
  def this(pattern: java.lang.String, paramTypes: atUirouterCoreLib.libParamsParamTypesMod.ParamTypes, paramFactory: atUirouterCoreLib.libUrlUrlMatcherFactoryMod.ParamFactory) = this()
  def this(pattern: java.lang.String, paramTypes: atUirouterCoreLib.libParamsParamTypesMod.ParamTypes, paramFactory: atUirouterCoreLib.libUrlUrlMatcherFactoryMod.ParamFactory, config: atUirouterCoreLib.libUrlInterfaceMod.UrlMatcherCompileConfig) = this()
}

@JSImport("@uirouter/core/lib/url", "UrlMatcher")
@js.native
object UrlMatcher extends js.Object {
  /** @hidden */
  var nameValidator: stdLib.RegExp = js.native
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
    a: atUirouterCoreLib.libUrlUrlMatcherMod.UrlMatcher,
    b: atUirouterCoreLib.libUrlUrlMatcherMod.UrlMatcher
  ): scala.Double = js.native
  /** @hidden */
  def encodeDashes(str: java.lang.String): java.lang.String = js.native
  /** @hidden Given a matcher, return an array with the matcher's path segments and path params, in order */
  def pathSegmentsAndParams(matcher: atUirouterCoreLib.libUrlUrlMatcherMod.UrlMatcher): js.Any = js.native
  /** @hidden Given a matcher, return an array with the matcher's query params */
  def queryParams(matcher: atUirouterCoreLib.libUrlUrlMatcherMod.UrlMatcher): js.Array[atUirouterCoreLib.libParamsParamMod.Param] = js.native
}

