package typings.uirouterCore

import typings.uirouterCore.paramsInterfaceMod.ParamTypeDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paramTypesMod {
  
  @JSImport("@uirouter/core/lib/params/paramTypes", "ParamTypes")
  @js.native
  open class ParamTypes () extends StObject {
    
    def _flushTypeQueue(): Unit = js.native
    
    /* private */ var defaultTypes: Any = js.native
    
    def dispose(): Unit = js.native
    
    var enqueue: Boolean = js.native
    
    /**
      * Registers a parameter type
      *
      * End users should call [[UrlMatcherFactory.type]], which delegates to this method.
      */
    def `type`(name: String): Any = js.native
    def `type`(name: String, definition: Unit, definitionFn: js.Function0[ParamTypeDefinition]): Any = js.native
    def `type`(name: String, definition: ParamTypeDefinition): Any = js.native
    def `type`(name: String, definition: ParamTypeDefinition, definitionFn: js.Function0[ParamTypeDefinition]): Any = js.native
    
    var typeQueue: js.Array[Any] = js.native
    
    var types: Any = js.native
  }
  /* static members */
  object ParamTypes {
    
    @JSImport("@uirouter/core/lib/params/paramTypes", "ParamTypes")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Built-in parameter type: `any`
      *
      * This parameter type is used by default for url-less parameters (parameters that do not appear in the URL).
      * This type does not encode or decode.
      * It is compared using a deep `equals` comparison.
      *
      * #### Example:
      * This example defines a non-url parameter on a [[StateDeclaration]].
      * ```js
      * .state({
      *   name: 'new',
      *   url: '/new',
      *   params: {
      *     inrepyto: null
      *   }
      * });
      * ```
      * ```js
      * $state.go('new', { inreplyto: currentMessage });
      * ```
      */
    @JSImport("@uirouter/core/lib/params/paramTypes", "ParamTypes.any")
    @js.native
    def any: ParamTypeDefinition = js.native
    inline def any_=(x: ParamTypeDefinition): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("any")(x.asInstanceOf[js.Any])
    
    /**
      * Built-in parameter type: `bool`
      *
      * This parameter type serializes `true`/`false` as `1`/`0`
      *
      * #### Example:
      * ```js
      * .state({
      *   name: 'inbox',
      *   url: '/inbox?{unread:bool}'
      * });
      * ```
      * ```js
      * $state.go('inbox', { unread: true });
      * ```
      *
      * The URL will serialize to: `/inbox?unread=1`.
      *
      * Conversely, if the url is `/inbox?unread=0`, the value of the `unread` parameter will be a `false`.
      */
    @JSImport("@uirouter/core/lib/params/paramTypes", "ParamTypes.bool")
    @js.native
    def bool: ParamTypeDefinition = js.native
    inline def bool_=(x: ParamTypeDefinition): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bool")(x.asInstanceOf[js.Any])
    
    /**
      * Built-in parameter type: `date`
      *
      * This parameter type can be used to serialize Javascript dates as parameter values.
      *
      * #### Example:
      * ```js
      * .state({
      *   name: 'search',
      *   url: '/search?{start:date}'
      * });
      * ```
      * ```js
      * $state.go('search', { start: new Date(2000, 0, 1) });
      * ```
      *
      * The URL will serialize to: `/search?start=2000-01-01`.
      *
      * Conversely, if the url is `/search?start=2016-12-25`, the value of the `start` parameter will be a `Date` object where:
      *
      * - `date.getFullYear() === 2016`
      * - `date.getMonth() === 11` (month is 0-based)
      * - `date.getDate() === 25`
      */
    @JSImport("@uirouter/core/lib/params/paramTypes", "ParamTypes.date")
    @js.native
    def date: ParamTypeDefinition = js.native
    inline def date_=(x: ParamTypeDefinition): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("date")(x.asInstanceOf[js.Any])
    
    /**
      * Built-in parameter type: `hash`
      *
      * This parameter type is used for the `#` parameter (the hash)
      * It behaves the same as the [[string]] parameter type.
      */
    @JSImport("@uirouter/core/lib/params/paramTypes", "ParamTypes.hash")
    @js.native
    def hash: ParamTypeDefinition = js.native
    inline def hash_=(x: ParamTypeDefinition): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hash")(x.asInstanceOf[js.Any])
    
    /**
      * Built-in parameter type: `int`
      *
      * This parameter type serializes javascript integers (`number`s which represent an integer) to the URL.
      *
      * #### Example:
      * ```js
      * .state({
      *   name: 'user',
      *   url: '/user/{id:int}'
      * });
      * ```
      * ```js
      * $state.go('user', { id: 1298547 });
      * ```
      *
      * The URL will serialize to: `/user/1298547`.
      *
      * When the parameter value is read, it will be the `number` `1298547`, not the string `"1298547"`.
      */
    @JSImport("@uirouter/core/lib/params/paramTypes", "ParamTypes.int")
    @js.native
    def int: ParamTypeDefinition = js.native
    inline def int_=(x: ParamTypeDefinition): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("int")(x.asInstanceOf[js.Any])
    
    /**
      * Built-in parameter type: `json`
      *
      * This parameter type can be used to serialize javascript objects into the URL using JSON serialization.
      *
      * #### Example:
      * This example serializes an plain javascript object to the URL
      * ```js
      * .state({
      *   name: 'map',
      *   url: '/map/{coords:json}'
      * });
      * ```
      * ```js
      * $state.go('map', { coords: { x: 10399.2, y: 49071 });
      * ```
      *
      * The URL will serialize to: `/map/%7B%22x%22%3A10399.2%2C%22y%22%3A49071%7D`
      */
    @JSImport("@uirouter/core/lib/params/paramTypes", "ParamTypes.json")
    @js.native
    def json: ParamTypeDefinition = js.native
    inline def json_=(x: ParamTypeDefinition): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("json")(x.asInstanceOf[js.Any])
    
    /**
      * Built-in parameter type: `path`
      *
      * This parameter type is the default type for path parameters.
      * A path parameter is any parameter declared in the path portion of a url
      *
      * - `/foo/:param1/:param2`: two path parameters
      *
      * This parameter type behaves exactly like the [[string]] type with one exception.
      * When matching parameter values in the URL, the `path` type does not match forward slashes `/`.
      *
      * #### Angular 1 note:
      * In ng1, this type is overridden with one that pre-encodes slashes as `~2F` instead of `%2F`.
      * For more details about this angular 1 behavior, see: https://github.com/angular-ui/ui-router/issues/2598
      */
    @JSImport("@uirouter/core/lib/params/paramTypes", "ParamTypes.path")
    @js.native
    def path: ParamTypeDefinition = js.native
    inline def path_=(x: ParamTypeDefinition): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("path")(x.asInstanceOf[js.Any])
    
    /**
      * Built-in parameter type: `query`
      *
      * This parameter type is the default type for query/search parameters.
      * It behaves the same as the [[string]] parameter type.
      *
      * A query parameter is any parameter declared in the query/search portion of a url
      *
      * - `/bar?param2`: a query parameter
      */
    @JSImport("@uirouter/core/lib/params/paramTypes", "ParamTypes.query")
    @js.native
    def query: ParamTypeDefinition = js.native
    inline def query_=(x: ParamTypeDefinition): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("query")(x.asInstanceOf[js.Any])
    
    /**
      * Built-in parameter type: `string`
      *
      * This parameter type coerces values to strings.
      * It matches anything (`new RegExp(".*")`) in the URL
      */
    @JSImport("@uirouter/core/lib/params/paramTypes", "ParamTypes.string")
    @js.native
    def string: ParamTypeDefinition = js.native
    inline def string_=(x: ParamTypeDefinition): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("string")(x.asInstanceOf[js.Any])
  }
}
