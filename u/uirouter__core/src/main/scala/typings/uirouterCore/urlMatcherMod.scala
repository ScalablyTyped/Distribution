package typings.uirouterCore

import typings.std.RegExp
import typings.uirouterCore.paramMod.Param
import typings.uirouterCore.paramTypesMod.ParamTypes
import typings.uirouterCore.paramsInterfaceMod.RawParams
import typings.uirouterCore.urlInterfaceMod.UrlMatcherCompileConfig
import typings.uirouterCore.urlMatcherFactoryMod.ParamFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object urlMatcherMod {
  
  @JSImport("@uirouter/core/lib/url/urlMatcher", "UrlMatcher")
  @js.native
  class UrlMatcher protected () extends StObject {
    /**
      * @param pattern The pattern to compile into a matcher.
      * @param paramTypes The [[ParamTypes]] registry
      * @param paramFactory A [[ParamFactory]] object
      * @param config  A [[UrlMatcherCompileConfig]] configuration object
      */
    def this(pattern: String, paramTypes: ParamTypes, paramFactory: ParamFactory) = this()
    def this(
      pattern: String,
      paramTypes: ParamTypes,
      paramFactory: ParamFactory,
      config: UrlMatcherCompileConfig
    ) = this()
    
    /** @internal */
    /* private */ var _cache: js.Any = js.native
    
    /** @internal */
    /* private */ var _children: js.Any = js.native
    
    /** @internal */
    /* private */ var _compiled: js.Any = js.native
    
    /* private */ var _getDecodedParamValue: js.Any = js.native
    
    /** @internal */
    /* private */ var _params: js.Any = js.native
    
    /** @internal */
    /* private */ var _segments: js.Any = js.native
    
    /**
      * Creates a new concatenated UrlMatcher
      *
      * Builds a new UrlMatcher by appending another UrlMatcher to this one.
      *
      * @param url A `UrlMatcher` instance to append as a child of the current `UrlMatcher`.
      */
    def append(url: UrlMatcher): UrlMatcher = js.native
    
    /** @internal */
    /* private */ val config: js.Any = js.native
    
    /**
      * Tests the specified url/path against this matcher.
      *
      * Tests if the given url matches this matcher's pattern, and returns an object containing the captured
      * parameter values.  Returns null if the path does not match.
      *
      * The returned object contains the values
      * of any search parameters that are mentioned in the pattern, but their value may be null if
      * they are not present in `search`. This means that search parameters are always treated
      * as optional.
      *
      * #### Example:
      * ```js
      * new UrlMatcher('/user/{id}?q&r').exec('/user/bob', {
      *   x: '1', q: 'hello'
      * });
      * // returns { id: 'bob', q: 'hello', r: null }
      * ```
      *
      * @param path    The URL path to match, e.g. `$location.path()`.
      * @param search  URL search parameters, e.g. `$location.search()`.
      * @param hash    URL hash e.g. `$location.hash()`.
      * @param options
      *
      * @returns The captured parameter values.
      */
    def exec(path: String): RawParams = js.native
    def exec(path: String, search: js.Any): RawParams = js.native
    def exec(path: String, search: js.Any, hash: String): RawParams = js.native
    def exec(path: String, search: js.Any, hash: String, options: js.Any): RawParams = js.native
    def exec(path: String, search: js.Any, hash: Unit, options: js.Any): RawParams = js.native
    def exec(path: String, search: Unit, hash: String): RawParams = js.native
    def exec(path: String, search: Unit, hash: String, options: js.Any): RawParams = js.native
    def exec(path: String, search: Unit, hash: Unit, options: js.Any): RawParams = js.native
    
    /**
      * Given a set of parameter values, creates a URL from this UrlMatcher.
      *
      * Creates a URL that matches this pattern by substituting the specified values
      * for the path and search parameters.
      *
      * #### Example:
      * ```js
      * new UrlMatcher('/user/{id}?q').format({ id:'bob', q:'yes' });
      * // returns '/user/bob?q=yes'
      * ```
      *
      * @param values  the values to substitute for the parameters in this pattern.
      * @returns the formatted URL (path and optionally search part).
      */
    def format(): String = js.native
    def format(values: RawParams): String = js.native
    
    /** @internal */
    def isRoot(): Boolean = js.native
    
    /**
      * @internal
      * Returns a single parameter from this UrlMatcher by id
      *
      * @param id
      * @param opts
      * @returns {T|Param|any|boolean|UrlMatcher|null}
      */
    def parameter(id: String): Param = js.native
    def parameter(id: String, opts: js.Any): Param = js.native
    
    /**
      * @internal
      * Returns all the [[Param]] objects of all path and search parameters of this pattern in order of appearance.
      *
      * @returns {Array.<Param>}  An array of [[Param]] objects. Must be treated as read-only. If the
      *    pattern has no parameters, an empty array is returned.
      */
    def parameters(): js.Array[Param] = js.native
    def parameters(opts: js.Any): js.Array[Param] = js.native
    
    /** The pattern that was passed into the constructor */
    var pattern: String = js.native
    
    /**
      * Validates the input parameter values against this UrlMatcher
      *
      * Checks an object hash of parameters to validate their correctness according to the parameter
      * types of this `UrlMatcher`.
      *
      * @param params The object hash of parameters to validate.
      * @returns Returns `true` if `params` validates, otherwise `false`.
      */
    def validates(params: RawParams): Boolean = js.native
  }
  /* static members */
  object UrlMatcher {
    
    @JSImport("@uirouter/core/lib/url/urlMatcher", "UrlMatcher")
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
    inline def compare(a: UrlMatcher, b: UrlMatcher): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /** @internal */
    inline def encodeDashes(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDashes")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /** @internal */
    @JSImport("@uirouter/core/lib/url/urlMatcher", "UrlMatcher.nameValidator")
    @js.native
    def nameValidator: RegExp = js.native
    inline def nameValidator_=(x: RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nameValidator")(x.asInstanceOf[js.Any])
    
    /** @internal Given a matcher, return an array with the matcher's path segments and path params, in order */
    inline def pathSegmentsAndParams(matcher: UrlMatcher): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("pathSegmentsAndParams")(matcher.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    /** @internal Given a matcher, return an array with the matcher's query params */
    inline def queryParams(matcher: UrlMatcher): js.Array[Param] = ^.asInstanceOf[js.Dynamic].applyDynamic("queryParams")(matcher.asInstanceOf[js.Any]).asInstanceOf[js.Array[Param]]
  }
}
